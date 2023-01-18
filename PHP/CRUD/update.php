<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Actualizar contraseña</title>
    <!--Página donde se comprueba que la contraseña coincide con la de la BBDD, si coincide y la nueva contraseña es válida, la modifica-->
    <!--También permite cerrar sesión y volver a read, o borrar la cuenta-->
</head>

<body>

    <?php

    session_start();
    if (isset($_SESSION['nombre'])) {   

        echo '<form method="post">
        <h2>Actualizar contraseña:</h2>';
        echo 'Contraseña actual: <input type="password" name="contraold" required><br>';
        echo 'Contraseña nueva: <input type="password" name="contra" required><br>';
        echo 'Repite contraseña: <input type="password" name="contra2" required><br>';
        echo '<input type="submit" name="boton" value="Validar">
        </form>';

        echo '<br><a href="delete.php">Borrar cuenta</a>';
        echo '<form method="post">';
        echo '<br><input type="submit" name="close" value="Cerrar sesión">
        </form>';        

        if (isset($_REQUEST["close"])) {
            session_destroy();
            header("location:read.php");
            die;
        }

        if (isset($_REQUEST['boton'])) {

            $nombre = $_SESSION['nombre'];
            $contraold = $_REQUEST['contraold'];
            $contra = $_REQUEST['contra'];
            $contra2 = $_REQUEST['contra2'];
            $valid = false; //verificar longitud contraseña
            $contador1 = 0; //verificar caracteres
            $contador2 = 0;
            $contador3 = 0;
            $contador4 = 0;
            $contfinal = 0; //verificar que esté todo     

            for ($i = 0; $i < strlen($contra); $i++) {   //recorro la string     

                if (ctype_upper($contra[$i])) { //compruebo cada caracter si es mayúscula
                    $contador1++;
                } elseif (ctype_lower($contra[$i])) { //compruebo cada caracter si es minúscula
                    $contador2++;
                } elseif (ctype_digit($contra[$i])) { //compruebo cada caracter si es un número
                    $contador3++;
                } elseif (ctype_punct($contra[$i])) { //compruebo cada caracter si es un símbolo no alfanumérico ni espacio
                    $contador4++;
                }
            }
            if (strlen($contra) >= 8 && strlen($contra) <= 16) { //longitud permitida
                $valid = true;
            }
            if (!($valid && ($contador1 > 0 && $contador2 > 0 && $contador3 > 0 && $contador4 > 0))) {
                echo "<p style= 'color:red;'>La nueva contraseña introducida no es válida. Debe contener al menos una mayúscula, una minúscula, un número y un símbolo,
        y su longitud debe estar comprendida entre 8 y 16 caracteres.</p>";
            } else {
                $contfinal++;
            }

            if (!($contra === $contra2)) {
                echo "<p style= 'color:red;'>Las contraseñas no coinciden.</p>";
            } else {
                $contfinal++;
            }
            if ($contfinal >= 2) {

                $host = 'localhost'; //variables para introducir todo en la BBDD
                $usuario = 'root';
                $contraseña = '';
                $bd = 'registro';

                $conexion = mysqli_connect($host, $usuario, $contraseña, $bd)
                    or die('Problemas con la conexión'); // Si no puede conectarse deja de ejecutar código
                // mysqli_connect devuelve un objeto mysqli, que controla las consultas a la base de datos especificada

                $datos = mysqli_query($conexion, "select nombre, password 
                                              from usuarios
                                              where nombre='$nombre'")
                    //importante: no cotejar datos sensibles en la consulta SQL, pueden poner 'or'1'='1 y acceder, o peor.
                    or die('Problemas al seleccionar: ' . mysqli_error($conexion));

                $fila = mysqli_fetch_array($datos); //revisamos el array de datos que le hemos pedido en la query
                if ($fila["password"] == $contraold) {       //contrastamos aquí, no es seguro hacer condiciones SQL con contraseñas o datos sensibles.              

                    mysqli_query($conexion, "update usuarios
                                         set password = '$contra'
                                         where nombre = '$nombre'")
                        or die('Problemas al insertar: ' . mysqli_error($conexion));

                    echo "<p style= 'color:blue;'>Se ha actualizado la contraseña.</p>";

                    mysqli_close($conexion); //importante                
                } else {
                    echo "<p style= 'color:red;'>La contraseña introducida no es válida</p>";
                    mysqli_close($conexion); //importante
                }
            }
        }
    } else {
        header("location:read.php");
        die;
    }
    ?>

</body>

</html>