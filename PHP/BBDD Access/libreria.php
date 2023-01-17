<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Librería</title>
</head>

<body>
    <form method="post">
        Introduce el libro:<br>
        ISBN: <input type='number' name='isbn' required></td><br>
        Título: <input type='text' name='nombre'></td><br>
        Existencias: <input type='number' name='existencias'><br>
        <input type='submit' name='boton' value='Validar'>
    </form>
    <!--Acabamos el formulario después del botón-->

    <?php
    $str_conex = 'mysql:dbname=ejercicio12;host=localhost';
    $usuario = 'root';
    $clave = '';
    $bd = new PDO($str_conex, $usuario, $clave);

    if (isset($_REQUEST["boton"])) {
        $isbn = $_REQUEST["isbn"];
        $nombre = $_REQUEST["nombre"];
        $existencias = $_REQUEST["existencias"];        
        $sumaimpar = 0;
        $sumapar = 0;

        $sql = 'select * from libros where isbn=?';
        $preparada = $bd->prepare($sql);
        $preparada->execute(array($isbn));
        if ($fila = $preparada->fetch()) { //si ese isbn existe
            $sql = 'update libros
                    set existencias = existencias + 1
                    where isbn=?';
            $preparada = $bd->prepare($sql);
            $preparada->execute(array($isbn));
            echo "<p>El libro con ISBN: $isbn se ha actualizado correctamente.</p>";
        } else {
            for ($i = 0; $i < strlen($isbn); $i++) {   //recorro la string     
                if ($i % 2 == 0) { //si son pares, ya que empieza en 0, que sería nuestro 1 impar.
                    $sumaimpar = $sumaimpar + $isbn[$i];
                } else {
                    $sumapar = $sumapar + $isbn[$i];
                }
            }
            $sumapar = $sumapar * 3;
            $suma = $sumaimpar + $sumapar;

            if ($suma % 10 == 0 && strlen($isbn) == 13) {
                $sql = 'insert into libros
                    set isbn=?, nombre=?, existencias=?';
                $preparada = $bd->prepare($sql);
                $preparada->execute(array($isbn,$nombre,$existencias));
                echo "<p>El libro con ISBN: $isbn se ha insertado correctamente.</p>"; //****me lo ha insertado y me ha dado error harry potter */
            }else{
                echo "<p style= 'color:red;'>El isbn introducido no es válido. Su longitud debe ser 13 y 
                la suma de los dígitos impares mas el triple de los dígitos pares debe ser divisible por 10.</p>";
            }
        }


        /*$sql = 'insert into alumnos
				set nombre=?, grupo=?, calificacion=?';
		$preparada = $bd->prepare($sql);
		$preparada->execute(array($nombre, $grupo, $calificacion));
		*/
    }



    ?>


</body>

</html>