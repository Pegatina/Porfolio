<!doctype html>

<head>
    <meta charset="UTF-8">
    <title>Cursos</title>
</head>

<body>

    <form method="post">
        Asignar clase:<br>
        Nombre:<input type="text" name="nombre" required><br>
        Curso:<select name="curso" required>
            <option value="SMR">SMR</option>
            <option value="DAW">DAW</option>
            <option value="ASIR">ASIR</option>
        </select><br>
        <input type="submit" name="boton" value="Asignar">
    </form>
    <br><br>

    <?php

    if (isset($_REQUEST['boton'])) {
        $host = 'localhost';
        $usuario = 'root';
        $contraseña = '';
        $bd = 'centro';

        $conexion = mysqli_connect($host, $usuario, $contraseña, $bd)
            or die('Problemas con la conexión');

        $datos = mysqli_query($conexion, "select codigo, nombre from alumnos
                                where nombre='$_REQUEST[nombre]'")
            or die('Problemas al seleccionar: ' . mysqli_error($conexion));
        // mysqli_query devolverá un objeto mysqli con los datos filtrados cuando le damos un select

        if (mysqli_num_rows($datos) > 0) {
            $fila = mysqli_fetch_array($datos);
            if ($_REQUEST['curso'] == "SMR") {
                mysqli_query($conexion, "insert into smr(cod_alumno, nom_alumno) 
                                        values ('$fila[codigo]','$fila[nombre]')") //tabla smr
                    or die('Problemas al insertar: ' . mysqli_error($conexion));
                mysqli_query($conexion, "delete from alumnos
                                        where nombre='$fila[nombre]'") //borro la fila existente en alumnos para no tener duplicados
                    or die('Problemas al insertar: ' . mysqli_error($conexion));
                // El primer argumento debe ser un objeto mysqli, el segundo cualquier consulta SQL

            } elseif ($_REQUEST['curso'] == "DAW") {
                mysqli_query($conexion, "insert into daw(cod_alumno, nom_alumno) 
                                        values ('$fila[codigo]','$fila[nombre]')") //tabla daw
                    or die('Problemas al insertar: ' . mysqli_error($conexion));
                    mysqli_query($conexion, "delete from alumnos
                                        where nombre='$fila[nombre]'")  //borro la fila existente en alumnos para no tener duplicados
                    or die('Problemas al insertar: ' . mysqli_error($conexion));
                // El primer argumento debe ser un objeto mysqli, el segundo cualquier consulta SQL

            } elseif ($_REQUEST['curso'] == "DAM") {
                mysqli_query($conexion, "insert into dam(cod_alumno, nom_alumno) 
                                        values ('$fila[codigo]','$fila[nombre]')") //tabla dam
                    or die('Problemas al insertar: ' . mysqli_error($conexion));
                    mysqli_query($conexion, "delete from alumnos
                                        where nombre='$fila[nombre]'")  //borro la fila existente en alumnos para no tener duplicados
                    or die('Problemas al insertar: ' . mysqli_error($conexion));
                // El primer argumento debe ser un objeto mysqli, el segundo cualquier consulta SQL

            }

            echo "El alumno $_REQUEST[nombre] ha sido matriculado en $_REQUEST[curso]";
        } else {
            echo 'El alumno introducido no existe'; //Si el usuario no es válido

        }

        mysqli_close($conexion);
    }

    ?>

</body>

</html>