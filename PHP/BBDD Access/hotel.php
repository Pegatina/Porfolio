<!doctype html>
<html>

<head>
    <meta charset='utf-8'>
    <title>Hotel</title>
    <!--Página que permite modificar los ocupantes y el estado de las habitaciones y te muestra cuántas hay de los 3 tipos-->
</head>

<body>
    <form method="post">
        <h2>Modificar ocupación de la habitación:</h2>
        Nombre: <input type="text" name="nombre"><br>
        Habitación: <input type="number" name="habitacion" required><br>
        Estado de la habitación: <select name="estado" required>
            <option value="libre">libre</option>
            <option value="ocupada">ocupada</option>
            <option value="reservada">reservada</option>
        </select><br>
        <input type="submit" name="boton" value="Validar">
    </form>
    <?php
    if (isset($_REQUEST['boton'])) {
        /* Comandos PDO (PHP Data Objects)

        Objeto PDO: se encarga de manejar el acceso a la base de datos
        $bd = new PDO($str_conex,$usuario,$clave);
        $str_conex depende de la base de datos. Para MySQL se utiliza
        $str_conex='mysql:dbname=<nombre de la base de datos>;host=<host>
        Por ejemplo, para conectarnos a la base de datos del ejercicio 8: */
        $str_conex = 'mysql:dbname=ejercicio10;host=localhost';
        $usuario = 'root';
        $clave = '';
        $bd = new PDO($str_conex, $usuario, $clave);

        $nombre = $_REQUEST["nombre"];
        $habitacion = $_REQUEST["habitacion"];
        $estado = $_REQUEST["estado"];

        if ($nombre != "") { //si no lo dejamos en blanco
            /* Instrucciones preparadas
            Utilizamos el método prepare() y añadimos una interrogación donde necesitemos rellenar un valor en la sentencia SQL*/

            $sql = 'select estado from habitaciones where num=?'; //esto desconecta al usuario de sql
            $preparada = $bd->prepare($sql);    //la flecha es como en java el punto para acceder a otro método ej: persona.hablar() // persona->hablar()
            // Ejecutamos la sentencia dándole los parámetros, hay que hacerlo en forma de array                  
            $preparada->execute(array($habitacion));  //hay que darle sí o sí un array al método

            if ($fila = $preparada->fetch()) { //si tiene registros

                if ($fila["estado"] == "libre" && $estado != "libre") { //si está libre y elegimos reservado u ocupado
                    $sql = 'update habitaciones set estado=?, ocupante=? where num=?';
                    $preparada = $bd->prepare($sql);                    
                    $preparada->execute(array($estado, $nombre, $habitacion));
                } elseif($fila["estado"] != "libre" && $estado != "libre") { //si no está libre y elegimos un estado que no sea libre
                    $sql = 'update habitaciones set estado=?, ocupante=? where num=?';
                    $preparada = $bd->prepare($sql);
                    $preparada->execute(array($estado, $nombre, $habitacion));
                }

                echo "Los cambios se han efectuado correctamente.<br>";
            } else {
                echo "El número de habitación no es válido.<br>";
            }
        } elseif($nombre =="" && $estado = "libre") { //si queremos quitar el ocupante
            $sql = 'select estado from habitaciones where num=?';
            $preparada = $bd->prepare($sql);
            $preparada->execute(array($habitacion));
            if ($fila = $preparada->fetch()) { //si tiene registros

                $sql = 'update habitaciones set estado=?, ocupante="" where num=?';
                $preparada = $bd->prepare($sql);                
                $preparada->execute(array($estado, $habitacion));

                echo "Los cambios se han efectuado correctamente.<br>";
            } else {
                echo "El número de habitación no es válido.<br>";
            }
        }

        //Siempre que recarga la página con el botón se actualiza.

        $contador1 = 0;
        $contador2 = 0;
        $contador3 = 0;

        $sql = 'select num, ocupante from habitaciones where estado=?';
        $preparada = $bd->prepare($sql);
        $estado = "ocupada";
        $preparada->execute(array($estado));
        echo '<br>Habitaciones ocupadas:<br>';
        foreach ($preparada as $fila) {
            echo "Número: $fila[num], ocupante: $fila[ocupante].<br>";
            $contador1++;
        }
        echo "<br>";
        echo "Cantidad: $contador1<br>";
        
        $sql = 'select num, ocupante from habitaciones where estado=?';
        $preparada = $bd->prepare($sql);
        $estado = "reservada";
        $preparada->execute(array($estado));
        echo '<br>Habitaciones reservadas:<br>';
        foreach ($preparada as $fila) {
            echo "Número: $fila[num], reserva: $fila[ocupante].<br>";
            $contador2++;
        }
        echo "<br>";
        echo "Cantidad: $contador2<br>";
        

        $sql = 'select num from habitaciones where estado=?';
        $preparada = $bd->prepare($sql);
        $estado = "libre";
        $preparada->execute(array($estado));
        echo '<br>Habitaciones libres:<br>';
        foreach ($preparada as $fila) {
            echo "Número: $fila[num]<br>";
            $contador3++;
        }
        echo "<br>";
        echo "Cantidad: $contador3";
    }

    ?>

</body>

</html>