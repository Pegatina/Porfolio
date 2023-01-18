<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Restaurante</title>
</head>
<!--Página principal de un restaurante de pedidos a domicilio, si queremos hacer un pedido se exige el inicio de sesión-->

<body>
    <table border='2'>
        <thead>
            <caption>
                <h2>Menú</h2>
            </caption>
        </thead>
        <tr>
            <?php
            $base = 'restaurante';
            $tabla = 'platos';
            $str_conex = "mysql:dbname=$base;host=localhost";
            $usuario = 'root';
            $clave = '';
            $bd = new PDO($str_conex, $usuario, $clave); //Conectamos a la base correspondiente


            $bd = new PDO("mysql:dbname=$base;host=localhost", 'root', '');
            $preparada = $bd->prepare("select COLUMN_NAME from INFORMATION_SCHEMA.COLUMNS
                        where TABLE_SCHEMA=N'$base' and TABLE_NAME = N'$tabla'"); //Para columnas de datos se pone N
            $preparada->execute();

            $cols = array(); //Almacenamos los nombres de las columnas en un array

            foreach ($preparada as $fila) {
                echo "<th name=" . $fila['COLUMN_NAME'] . ">$fila[COLUMN_NAME]</th>"; //Imprimimos los nombres de las columnas de la tabla generica
                $cols[] = $fila['COLUMN_NAME']; //Le asignamos al array cada columna
            }
            echo "</tr><tr>";

            $sql = 'select * from platos';
            $preparada2 = $bd->prepare($sql);
            $preparada2->execute();

            foreach ($preparada2 as $fila) {
                for ($i = 0; $i < count($cols); $i++) {
                    echo "<td>" . $fila[$cols[$i]] . "</td>";
                }
                echo "<tr>"; //Imprimimos cada fila, cada dato en su correspondiente celda
            }
            ?>
    </table>
    <?php    
  
    session_start();
    if (isset($_SESSION['nombre'])) {//Tras iniciar sesión
        echo "<p>Bienvenida/o, $_SESSION[nombre].</p>"; //Saludo y formulario con las acciones disponibles
        echo '<form method="post">';
        if(isset($_SESSION['carrito'])){ //Si ya hemos ido al carrito y hemos vuelto para seguir pidiendo, cambia el nombre del botón por claridad.
            echo '<input type="submit" name="pedido" value="Continuar pedido">';
        }else{
            echo '<input type="submit" name="pedido" value="Iniciar pedido">';           
        }
        echo '<input type="submit" name="carrito" value="Ver carrito">';       
        echo '<input type="submit" name="close" value="Cerrar sesión"></form>';

        if (isset($_REQUEST["close"])) { //Cerrar sesión
            session_destroy();
            header("location:read.php");
            die;
        }
        if (isset($_REQUEST["carrito"])) { //Para ir al carrito en cualquier momento si hemos iniciado sesión           
            header("location:carrito.php");
            die;
        }
        if (isset($_REQUEST["pedido"])) {            
            echo '<form method="post">';
            echo "Categoría: <select name='cate' required>";

            $sql = 'select distinct Categoría from platos'; //Descartamos las repetidas
            $preparada = $bd->prepare($sql);
            $preparada->execute();
            foreach ($preparada as $fila) {
                echo "<option value='$fila[0]'>$fila[0]</option>"; //Generamos tantas opciones como categorías distintas haya
            }
            echo "</select>";
            echo '<input type="submit" name="pedir" value="Pedir"></form>';
        }
        if (isset($_REQUEST["pedir"])) {
            echo '<form method="post" action="update_carrito.php">'; //Actualizamos el carrito desde este formulario.

            $sql = 'select Nombre from platos where Categoría =?';
            $preparada = $bd->prepare($sql);
            $preparada->execute(array($_REQUEST["cate"]));

            if ($preparada->rowCount() > 0) { //Si hay platos en esa categoría.
                echo "<h3>$_REQUEST[cate]</h3>"; //Nombre de la categoría
                foreach ($preparada as $fila) {
                    echo $fila[0] . ": <input type='number' name='$fila[0]' min='0'><br>"; //Tantos platos haya en esa categoría               
                }
            }
            echo '<br><input type="submit" value="Añadir al carrito"></form>';
        }
        echo '</form>';           

    } else {
        //Si no hay sesión iniciada
        echo '<form method="post">'; //Acciones disponibles
        echo '<br><input type="submit" name="init" value="Iniciar sesión">';
        echo '<input type="submit" name="pedido" value="Iniciar pedido">';
        echo '<input type="submit" name="create" value="Crear cuenta"></form>';
        if (isset($_REQUEST["init"])) {
            header("location:read.php");
            die;
        }
        if (isset($_REQUEST["create"])) {
            header("location:create.php");
            die;
        }
        if (isset($_REQUEST["pedido"])) {
            echo "<p style= 'color:red;'>Debes iniciar sesión para iniciar un pedido.</p>";
        }
    }
    ?>
</body>

</html>
