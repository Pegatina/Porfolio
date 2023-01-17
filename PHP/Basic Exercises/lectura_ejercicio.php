<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Lectura del archivo de comentarios</title>
    <!--página que lee los comentarios escritos mediante la página escritura.php y los filtra por nombre del comentarista--->
</head>

<body>
    Introduce el nombre del usuario del/os comentario/s a leer:<br>
    <form method="post">
        <input type="text" name="nombre"><br>
        <input type="submit" value="Leer">
    </form>
    <br><br>

    <?php

    if (!isset($_REQUEST['nombre'])) { //verificando que se haya rellenado o no el input en vez de comprobar el botón
        die;
    }

    $archivo = fopen('./apuntes/datos.txt', 'r') or die("No existe el archivo.");
    // 'r' abre el archivo para lectura con el cursor al principio

    // feof comprueba si el cursor está al final del archivo,  file end of file
    while (!feof($archivo)) {
        $linea = fgets($archivo); //leemos la primera línea

        if ($linea == $_REQUEST['nombre']."\n") { //hay que coger el salto de línea, lee el nombre y solo imprime las siguientes líneas
            //echo "hola"; 
            $linea = fgets($archivo); //leemos la siguiente, que es la que nos interesa, y la imprimimos
            echo $linea . '<br>';
        }
        // fgets avanza el cursor hasta el siguiente salto de línea
        //  y devuelve como cadena lo que haya atravesado, sin incluir el salto de línea

    }
    //al leerlo, transforma las etiquetas a html

    fclose($archivo);



    ?>

</body>

</html>


</body>

</html>