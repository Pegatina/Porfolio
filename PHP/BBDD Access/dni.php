<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>DNI</title>
    <!--Página que completa y almacena DNIS en una BBDD, el usuario escribe su dni sin letra y la letra es calculada mediante una 
    tabla SQL y registrada en otra tabla SQL-->
</head>

<body>
    <form method="post">
        <h2>Introduzca sus datos:</h2>
        Nombre: <input type="text" name="nombre" required><br>
        Dni (sin letra): <input type="number" name="dni" required><br>
        <input type="submit" name="boton" value="Validar">
    </form>
    <?php

    if (isset($_REQUEST['boton'])) {

        $nombre = $_REQUEST['nombre'];
        $dni = $_REQUEST['dni'];

        if (strlen($dni) == 8) { //evito que metan una longitud inválida.
            $resto = $dni % 23;

            //echo $resto;

            $host = 'localhost'; //variables para introducir todo en la BBDD
            $usuario = 'root';
            $contraseña = '';
            $bd = 'ejercicio7';

            $conexion = mysqli_connect($host, $usuario, $contraseña, $bd)
                or die('Problemas con la conexión'); // Si no puede conectarse deja de ejecutar código
            // mysqli_connect devuelve un objeto mysqli, que controla las consultas a la base de datos especificada

            $datos = mysqli_query($conexion, "select letra
                                            from letradni
                                            where resto='$resto'")
                or die('Problemas al seleccionar: ' . mysqli_error($conexion));

            $fila = mysqli_fetch_array($datos); //revisamos el array de datos que le hemos pedido en la query
            $letra = $fila["letra"]; //recogemos la letra asociada

            //echo $letra;

            $dnifinal = $dni . $letra;
            //echo $dnifinal;

            $datos = mysqli_query($conexion, "select dni from dnis
                                           where dni='$dnifinal'");
            if (mysqli_num_rows($datos) > 0) {
                echo "<p style= 'color:red;'>El dni introducido ya existe.</p>";
                mysqli_close($conexion); //importante
            } else {
                mysqli_query($conexion, "insert into dnis(dni,nombre) 
                values ('$dnifinal','$nombre')")
                    or die('Problemas al insertar: ' . mysqli_error($conexion));
                mysqli_close($conexion); //importante  

                echo 'Sus credenciales han sido registradas.';
            }
        }else{
            echo "<p style= 'color:red;'>El dni introducido no es válido, debe ser de 8 dígitos.</p>";
        }
    }

    ?>

</body>

</html>