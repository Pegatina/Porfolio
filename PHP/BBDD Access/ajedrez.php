<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Torneo</title>
    <!--Página que actualiza los índices de los jugadores de una partida de ajedrez-->
</head>

<body>
    <form method="post">
        <h2>Ganador:</h2>
        <input type="radio" name="ganador" value="j1">
        Nombre: <input type="text" name="j1nom" required><br>
        <input type="radio" name="ganador" value="j2">
        Nombre: <input type="text" name="j2nom" required><br>
        <input type="submit" name="boton" value="Validar">
    </form>
    <form method="post">
        <input type="submit" name="calcular" value="Próximos a enfrentarse">
    </form>
    <?php

    if (isset($_REQUEST['boton'])) {

        $j1nom = $_REQUEST['j1nom'];
        $j2nom = $_REQUEST['j2nom'];

        if (isset($_REQUEST['ganador'])) {
            $ganador = $_REQUEST['ganador'];
        } else {
            echo "<p style= 'color:red;'>¡Debes elegir un ganador!</p>";
        }

        $host = 'localhost'; //variables para introducir todo en la BBDD
        $usuario = 'root';
        $contraseña = '';
        $bd = 'ejercicio9';

        $contador = 0;

        $conexion = mysqli_connect($host, $usuario, $contraseña, $bd)
            or die('Problemas con la conexión'); // Si no puede conectarse deja de ejecutar código
        // mysqli_connect devuelve un objeto mysqli, que controla las consultas a la base de datos especificada

        $datos = mysqli_query($conexion, "select indice
                                                from ajedrez
                                                where jugador='$j1nom'")
            or die('Problemas al seleccionar: ' . mysqli_error($conexion));

        if (mysqli_num_rows($datos) > 0) {

            //miramos si existe el 2 dentro del 1 válido porque si no cerramos la conexión y da error
            $fila = mysqli_fetch_array($datos); //revisamos el array de datos que le hemos pedido en la query
            $indicej1 = $fila["indice"]; //recogemos el índice
            $contador++;

            $datos = mysqli_query($conexion, "select indice
                                                    from ajedrez
                                                    where jugador='$j2nom'")
                or die('Problemas al seleccionar: ' . mysqli_error($conexion));

            if (mysqli_num_rows($datos) > 0) {

                $fila = mysqli_fetch_array($datos); //revisamos el array de datos que le hemos pedido en la query
                $indicej2 = $fila["indice"]; //recogemos el índice
                $contador++;
            } else {
                echo "<p style= 'color:red;'>El nombre del jugador introducido no es válido.</p><br>"; //segundo jugador
                mysqli_close($conexion);
            }
        } else {
            echo "<p style= 'color:red;'>El nombre del jugador introducido no es válido.</p><br>"; //primer jugador
            mysqli_close($conexion);
        }

        if ($contador == 2) { //si ambos existen
            if ($ganador == "j1") { //si ha ganado el 1
                $indicetotal1 = $indicej1 + (40 * $indicej2 / $indicej1);
                $indicetotal2 = $indicej2 - (40 * $indicej2 / $indicej1);

                mysqli_query($conexion, "update ajedrez
                                                set indice = '$indicetotal1'
                                                where jugador = '$j1nom'")
                    or die('Problemas al insertar: ' . mysqli_error($conexion));

                mysqli_query($conexion, "update ajedrez
                                                set indice = '$indicetotal2'
                                                where jugador = '$j2nom'")
                    or die('Problemas al insertar: ' . mysqli_error($conexion));

                echo "<p style= 'color:blue;'>Se han actualizado los índices.</p>";
            }


            /* echo $indicetotal1;
                    echo "<br>";
                    echo $indicetotal2;
                    */
            mysqli_close($conexion);
        } elseif ($ganador == "j2") {

            $indicetotal1 = $indicej1 - (40 * $indicej1 / $indicej2);
            $indicetotal2 = $indicej2 + (40 * $indicej1 / $indicej2);

            mysqli_query($conexion, "update ajedrez
                                                set indice = '$indicetotal1'
                                                where jugador = '$j1nom'")
                or die('Problemas al insertar: ' . mysqli_error($conexion));

            mysqli_query($conexion, "update ajedrez
                                                set indice = '$indicetotal2'
                                                where jugador = '$j2nom'")
                or die('Problemas al insertar: ' . mysqli_error($conexion));

            echo "<p style= 'color:blue;'>Se han actualizado los índices.</p>";

            /*
                    echo $indicetotal1;
                    echo "<br>";
                    echo $indicetotal2;
                    */
            mysqli_close($conexion);
        }
    }
    if (isset($_REQUEST['calcular'])) {
        $host = 'localhost'; //variables para introducir todo en la BBDD
        $usuario = 'root';
        $contraseña = '';
        $bd = 'ejercicio9';

        $conexion = mysqli_connect($host, $usuario, $contraseña, $bd)
            or die('Problemas con la conexión'); // Si no puede conectarse deja de ejecutar código

        $datos = mysqli_query($conexion, "select indice
                                                    from ajedrez")
            or die('Problemas al seleccionar: ' . mysqli_error($conexion)); //almacenamos los índices en un array

        $indices = array();

        while ($fila = mysqli_fetch_array($datos)) {

            $indices[] = $fila["indice"];
        }
        sort($indices); //los ordena pero de menor a mayor

        //***también vale rsort($indices)

        $ordenado = array_reverse($indices); //invertimos el orden en un nuevo array

        //var_dump($ordenado);
        //echo "<br>";

        $jugadores = array(); //creamos otro array para meterle las claves como jugadores y los valores de índices del anterior array

        foreach ($ordenado as $clave => $valor) { //recorremos el de los índices
            $datos = mysqli_query($conexion, "select jugador
                                                    from ajedrez
                                                    where indice = '$valor'")
                or die('Problemas al seleccionar: ' . mysqli_error($conexion));

            $fila = mysqli_fetch_array($datos);

            $jugadores[$fila["jugador"]] = $valor; //así añadimos la clave de los jugadores junto a su índice
        }

        /* var_dump($jugadores);
        echo "<br>";
        */

        foreach ($jugadores as $clave => $valor) {
            echo "Jugador/a: $clave, Índice: $valor<br>";
        }

        //***enfrentar al primero con el segundo, etc en una parte, y en otra primero contra el último, segundo contra el penúltimo y tal. */

        echo "<br>";

        $indice_jugadores = array_values($jugadores); //convertimos las keys de jugadores en numéricas (eran los nombres) para recorrerlo

        echo "Jugadores del torneo en orden:<br>";

        for ($i = 0; $i < count($indice_jugadores); $i++) {
            echo "Los jugadores con índice:<br>";
            if ($i + 1 > count($indice_jugadores)) { //si nos pasamos del length
                break;
            } else {
                

                echo "$indice_jugadores[$i] vs " . $indice_jugadores[$i + 1] . "<br>";

                $i++; //para que vayan de 2 en 2
            }
        }

        
        echo "<br>";
        echo "Jugadores del torneo sembrado<br>";

        
        for ($i = 0; $i < count($indice_jugadores); $i++) {

            if($i > (count($indice_jugadores)/2)-1){ //paramos en la mitad menos uno, porque ahí se duplica
                break;
            }else{

                echo "Los jugadores con índice:<br>";

                echo "$indice_jugadores[$i] vs " . $indice_jugadores[count($indice_jugadores)-$i-1] . "<br>"; //length - i -1 para que se inviertan

            }  
        }

        mysqli_close($conexion);
    }

    ?>

</body>

</html>
