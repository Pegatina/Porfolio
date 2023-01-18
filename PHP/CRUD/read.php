<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<!--Una página de login que compruebe que los nombres de usuario y contraseña sean válidos, si lo son, redirige a una página de ok, si no, a la misma-->

<body>

    <form method="post">
        <h2>Inicio de sesión:</h2>
        Nombre: <input type="text" name="nombre" required><br>
        Contraseña: <input type="password" name="contra" required><br>
        <input type="submit" name="boton" value="Validar">
    </form>

    <?php
    if (isset($_REQUEST['boton'])) {

        $nombre = $_REQUEST['nombre']; //recojo cada request en una variable
        $contra = $_REQUEST['contra'];

        $host = 'localhost'; //variables para introducir todo en la BBDD
        $usuario = 'root';
        $contraseña = '';
        $bd = 'registro';

        $conexion = mysqli_connect($host, $usuario, $contraseña, $bd)
            or die('Problemas con la conexión'); // Si no puede conectarse deja de ejecutar código
        // mysqli_connect devuelve un objeto mysqli, que controla las consultas a la base de datos especificada

        $datos = mysqli_query($conexion, "select nombre, password from usuarios
                                where nombre='$_REQUEST[nombre]'") //importante: no cotejar datos sensibles en la consulta SQL, pueden poner 'or'1'='1 y acceder, o peor.
            or die('Problemas al seleccionar: ' . mysqli_error($conexion));

        //también puedo iniciar fila aquí y en el if poner fila, en vez del num_rows >0, si no tiene datos, es bool false.

        if (mysqli_num_rows($datos) > 0) { //si contiene el usuario (nombre) en la BBDD (es primary key, solo puede haber uno).
            $fila = mysqli_fetch_array($datos); //revisamos el array de datos que le hemos pedido en la query
            if ($fila["password"] == $contra) {       //contrastamos aquí, no es seguro hacer condiciones SQL con contraseñas o datos sensibles.          
                mysqli_close($conexion); //importante

                session_start(); //iniciamos la sesión solo cuando comprobamos que es un usuario válido
                if (isset($nombre) or isset($_SESSION['nombre'])) { //generamos la sesión de nombre
                    $_SESSION['nombre'] = $nombre ?? $_SESSION['nombre']; //las dos interrogaciones cogen el primer dato que no sea nulo                
                }

                header("location:login_ok.php"); //redirijo a una nueva página si el usuario es válido
                die; //para evitar que siga procesando información.
            } else {
                echo "<p style= 'color:red;'>El nombre y la contraseña introducidos no son válidos.</p><br>"; //Si la contraseña no es válida
                mysqli_close($conexion); //importante
                echo '<a href="create.php">Crear usuario</a>';
            }
        } else {
            echo "<p style= 'color:red;'>El nombre y la contraseña introducidos no son válidos.</p><br>"; //Si el usuario no es válido
            mysqli_close($conexion);
            echo '<a href="create.php">Crear usuario</a>';
        }
    }

    ?>
</body>

</html>