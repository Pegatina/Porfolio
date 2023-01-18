<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Borrar cuenta</title>
    <!--Página que permite borrar una cuenta, al borrarla, redirige a read-->
</head>


<body>
    <?php

    session_start();
    if (isset($_SESSION['nombre'])) {
        echo '<form method="post">
    <h2>Borrar cuenta:</h2>';
        echo 'Confirmar contraseña: <input type="password" name="contra" required><br>';
        echo '<input type="submit" name="boton" value="Validar">
    </form>';

        echo '<br><a href="update.php">Actualizar contraseña</a>';
        echo '<form method="post">';
        echo '<br><input type="submit" name="close" value="Cerrar sesión">
    </form>';

        if (isset($_REQUEST["close"])) {
            session_destroy();
            header("location:read.php");
            die;
        }
        if (isset($_REQUEST['boton'])) {

            $nombre = $_SESSION['nombre']; //recojo la session y la request en variables
            $contra = $_REQUEST['contra'];

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
            if ($fila["password"] == $contra) {       //contrastamos aquí, no es seguro hacer condiciones SQL con contraseñas o datos sensibles.              

                mysqli_query($conexion, "delete from usuarios
                                         where nombre = '$nombre'")
                    or die('Problemas al insertar: ' . mysqli_error($conexion));
                mysqli_close($conexion); //importante     
                header("location:read.php");
                die;
            } else {
                echo "<p style= 'color:red;'>La contraseña introducida no es válida</p>";
                mysqli_close($conexion); //importante
            }
        }
    } else {
        header("location:read.php");
        die;
    }

    ?>
</body>

</html>