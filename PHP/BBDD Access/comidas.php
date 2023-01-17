<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Menú</title>
    <!--Página que permite a los dueños añadir, eliminar y modificar platos de su menú, conectado con una BBDD y con un registro de modificaciones.-->
</head>

<body>
    <form method="post">
        <h2>Plato:</h2>
        Nombre: <input type="text" name="nombre" required><br>
        Comentario:<br> <textarea name="comentario" cols="40" rows="5"></textarea><br>
        Precio: <input type="number" name="precio" step="0.01" min=0 required><br>
        <input type="submit" name="add" value="Añadir plato"><br>
        <input type="submit" name="del" value="Borrar plato"><br>
        <input type="submit" name="upd" value="Modificar plato"><br>
    </form>
    <?php

    if (isset($_REQUEST['add'])) {

        $nombre = $_REQUEST['nombre'];
        $comentario = $_REQUEST['comentario'];
        $precio = $_REQUEST['precio'];

        $host = 'localhost'; //variables para introducir todo en la BBDD
        $usuario = 'root';
        $contraseña = '';
        $bd = 'ejercicio8';

        $conexion = mysqli_connect($host, $usuario, $contraseña, $bd)
            or die('Problemas con la conexión'); // Si no puede conectarse deja de ejecutar código
        // mysqli_connect devuelve un objeto mysqli, que controla las consultas a la base de datos especificada

        $archivo = fopen("modificaciones.txt", 'a');

        $datos = mysqli_query($conexion, "insert into comidas(nombre,comentario,precio)
                                          values ('$nombre','$comentario','$precio')")
            or die('Problemas al seleccionar: ' . mysqli_error($conexion));

        mysqli_close($conexion); //importante

        echo 'El nuevo plato ha sido registrado.';

        fputs($archivo, "insert into comidas(nombre,comentario,precio)");
        fputs($archivo, "\n"); //salto de línea
        fputs($archivo, "values ('$nombre','$comentario','$precio')");
        fputs($archivo, "\n");
        fputs($archivo, '----------------------------------------');
        fputs($archivo, "\n");
        echo "<br><a href='modificaciones.txt' download= 'modificaciones.txt'>Ver modificaciones</a>"; //enlace de descarga del archivo.
    }
    if (isset($_REQUEST['del'])) {

        $nombre = $_REQUEST['nombre'];
        $comentario = $_REQUEST['comentario'];
        $precio = $_REQUEST['precio'];

        $host = 'localhost'; //variables para introducir todo en la BBDD
        $usuario = 'root';
        $contraseña = '';
        $bd = 'ejercicio8';

        $conexion = mysqli_connect($host, $usuario, $contraseña, $bd)
            or die('Problemas con la conexión'); // Si no puede conectarse deja de ejecutar código
        // mysqli_connect devuelve un objeto mysqli, que controla las consultas a la base de datos especificada

        $archivo = fopen("modificaciones.txt", 'a');

        $datos = mysqli_query($conexion, "select nombre 
                                          from comidas
                                          where nombre='$nombre'") //primero compruebo si contiene esos datos
            or die('Problemas al seleccionar: ' . mysqli_error($conexion));

        if (mysqli_num_rows($datos) > 0) { //si contiene al usuario

            $datos = mysqli_query($conexion, "delete from comidas
                                              where nombre = '$nombre'")
                or die('Problemas al seleccionar: ' . mysqli_error($conexion));

            mysqli_close($conexion); //importante

            echo 'El plato/platos ha/n sido borrado/s.';

            fputs($archivo, "delete from comidas");
            fputs($archivo, "\n"); //salto de línea
            fputs($archivo, "where nombre = '$nombre'");
            fputs($archivo, "\n");
            fputs($archivo, '----------------------------------------');
            fputs($archivo, "\n");
            echo "<br><a href='modificaciones.txt' download= 'modificaciones.txt'>Ver modificaciones</a>"; //enlace de descarga del archivo.
        } else {
            echo "<p style= 'color:red;'>El plato introducido no existe</p>";
            mysqli_close($conexion); //importante
        }
    }
    if (isset($_REQUEST['upd'])) {

        $nombre = $_REQUEST['nombre'];
        $comentario = $_REQUEST['comentario'];
        $precio = $_REQUEST['precio'];

        $host = 'localhost'; //variables para introducir todo en la BBDD
        $usuario = 'root';
        $contraseña = '';
        $bd = 'ejercicio8';

        $conexion = mysqli_connect($host, $usuario, $contraseña, $bd)
            or die('Problemas con la conexión'); // Si no puede conectarse deja de ejecutar código
        // mysqli_connect devuelve un objeto mysqli, que controla las consultas a la base de datos especificada

        $archivo = fopen("modificaciones.txt", 'a');

        $datos = mysqli_query($conexion, "select nombre 
                                          from comidas
                                          where nombre='$nombre'") //primero compruebo si contiene esos datos
            or die('Problemas al seleccionar: ' . mysqli_error($conexion));

        if (mysqli_num_rows($datos) > 0) { //si contiene al usuario

            $datos = mysqli_query($conexion, "update comidas
                                              set nombre = '$nombre', 
                                                  comentario = '$comentario', 
                                                  precio = '$precio'
                                              where nombre = '$nombre'")
                or die('Problemas al seleccionar: ' . mysqli_error($conexion));

            mysqli_close($conexion); //importante

            echo 'El plato/platos ha/n sido actualizado/s.';

            fputs($archivo, "update comidas");
            fputs($archivo, "\n"); //salto de línea
            fputs($archivo, "set nombre = '$nombre',");
            fputs($archivo, "\n");
            fputs($archivo, "    comentario = '$comentario'");
            fputs($archivo, "\n");
            fputs($archivo, "    precio = '$precio'");
            fputs($archivo, "\n");
            fputs($archivo, "where nombre = '$nombre'");
            fputs($archivo, "\n");
            fputs($archivo, '----------------------------------------');
            fputs($archivo, "\n");
            echo "<br><a href='modificaciones.txt' download= 'modificaciones.txt'>Ver modificaciones</a>"; //enlace de descarga del archivo.
        } else {
            echo "<p style= 'color:red;'>El plato introducido no existe</p>";
            mysqli_close($conexion); //importante
        }
    }
    ?>

</body>

</html>