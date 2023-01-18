<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Ej2Nacimientos</title>
</head>

<body>
    <form method="post">
        <h1>Introduzca el nacimiento:</h1>
        Nombre:<input type='text' name='nombre' required><br>
        Padre:<input type='text' name='padre' required><br>
        Madre:<input type='text' name='madre' required><br>
        Día: <input type="date" name="dia" value="2022-11-18" required><br>
        <input type='submit' name='boton' value='Validar'>
    </form>

    <?php

    if (isset($_REQUEST['boton'])) { //Si se ha generado el array de request para el botón, es decir, si se ha pulsado el botón de submit.	        
        $str_conex = 'mysql:dbname=ex1;host=localhost';
        $usuario = 'root';
        $clave = '';
        $bd = new PDO($str_conex, $usuario, $clave); //conecto a la base correspondiente

        $nombre = $_REQUEST["nombre"]; //recojo las variables necesarias
        $padre = $_REQUEST["padre"];
        $madre = $_REQUEST["madre"];
        $dia = $_REQUEST["dia"];
        $contador = 0;

        $preparada = $bd->prepare('insert into ej2nacimientos (nombre,padre,madre,dia) 
                                        values (?,?,?,?)');
        $preparada->execute(array($nombre, $padre, $madre, $dia)); //los inserto según los input

        echo '<p>Se ha registrado con éxito.</p>';

        $sql = 'select * from ej2nacimientos where nombre=? and padre=? and madre=?'; //primero compruebo si los datos están repetidos
        $preparada = $bd->prepare($sql);
        $preparada->execute(array($nombre, $padre, $madre));


        foreach ($preparada as $fila) {
            $documento = $fila["codigo"]; //así el documento va a ser siempre distinto porque el código es algo generado en la bbdd cuando insertas  
        }

        $archivo = fopen("$documento" . ".txt", 'a'); 
        //*****no le pongo la fecha por si da error en la conversión de tipos), pero simplemente sería añadir otra condición and dia=? al where y añadir la variable $dia.
        //en el array de ejecución.
        fputs($archivo, "Nombre: $nombre");
        fputs($archivo, "\n"); //salto de línea
        fputs($archivo, "Padre: $padre");
        fputs($archivo, "\n");
        fputs($archivo, "Madre: $madre");
        fputs($archivo, "\n");
        fputs($archivo, "Día: $dia");
        fclose($archivo);

        echo "<a href='$documento.txt' download= '$documento.txt'>Descargar informe</a>"; //enlace de descarga del archivo.   
    }
    ?>
</body>

</html>