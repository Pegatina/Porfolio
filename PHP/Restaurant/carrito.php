<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Carrito de compra</title>
    <!--La página del carrito del pedido de nuestro restaurante-->
</head>

<body>

    <a href="./">Volver</a>
    <section>
        <?php
        $base = 'restaurante';
        $tabla = 'platos';
        $str_conex = "mysql:dbname=$base;host=localhost";
        $usuario = 'root';
        $clave = '';
        $bd = new PDO($str_conex, $usuario, $clave); //Conexión a la base correspondiente

        $total = 0; //Variable para calcular luego el total.

        session_start();
        if (empty($_SESSION)) {
            echo '<p>Para ver el carrito tienes que iniciar sesión.</p>';
        } else {
            if (empty($_SESSION['carrito'])) { //Si no hay carrito iniciado
                echo '<p>Tu carrito está vacío.</p>';
            } else {
                echo 'Los siguientes platos han sido añadidos al carrito: <br>';

                $platos = ""; //Variable para almacenar los platos. 
                $cont = 1; //Por defecto uno, si hay más se va sumando para que no se repita el número.

                $clv = array_keys($_SESSION['carrito']);
                $val = array_values($_SESSION['carrito']);

                for ($i = 0; $i < count($_SESSION['carrito']); $i++) {
                    $plato = $clv[$i];
                    $cantidad = $val[$i];
                    echo "-$plato ($cantidad unidades): ";

                    $sql = 'select Precio from platos where Nombre=?';
                    $preparada = $bd->prepare($sql);
                    $preparada->execute(array($plato));
                    $fila = $preparada->fetch();
                    $precio = $fila["Precio"]; //Declaramos la variable precio y le añadimos el valor del precio de la BBDD             
                    if ($cantidad > 1) {
                        $precio *= $cantidad; //Multiplicamos el precio por la cantidad tantas veces se pida
                        echo $precio . "€<br>";
                        $total += $precio; //Recogemos el valor

                        $platos .= $plato . " ($cantidad unidades): " . $precio . "€\n"; //Concatenamos los platos con las unidades, precio y un salto de línea
                    } else { //Si solo hay uno
                        echo $precio . "€<br>";
                        $total += $precio;
                        $platos .= $plato . " ($cantidad unidades): " . $precio . "€\n";
                    }
                }
                echo "Precio total: $total" . "€<br>";

                echo '<form method="post">';
                if (!isset($_REQUEST["pagar"])) { //El botón solo aparece si no se ha pulsado previamente, esto evita duplicar los pedidos.
                echo '<input type="submit" name="pagar" value="Pagar">';
                }
                echo '<input type="submit" name="eliminar" value="Eliminar pedido">';

                if (isset($_REQUEST["pagar"])) {
                    $sql = 'select * from pedidos';
                    $preparada = $bd->prepare($sql);
                    $preparada->execute();
                    if ($preparada->rowCount() > 0) { //Si existen pedidos
                        foreach ($preparada as $fila) {
                            if ($fila['usuario'] == $_SESSION["nombre"]) { //Si el usuario ha pedido más veces
                                $cont++; //Aumentamos el número
                            } else {
                                $documento = $cont . "_" . $_SESSION['nombre']; //Si es el primer pedido de este usuario, el nombre lo creamos a partir de un contador 
                                //y el nombre del usuario que lo pide.
                            }
                            $documento = $cont . "_" . $_SESSION['nombre']; //Si ha pedido más veces, el número cambia. 
                        }
                    } else { //Si no hay pedidos almacenados
                        $documento = $cont . "_" . $_SESSION['nombre'];
                    }
                    $archivo = fopen("$documento" . ".txt", 'a');
                    fputs($archivo, $platos);
                    fclose($archivo); //Un documento únicamente con los platos del pedido, así evitamos reservar mucha memoria en la tabla de pedido de la BBDD.

                    /*para leerlo:
                    select fopen($fila['pedido'], "r")
                    */

                    $fecha = date("Y-m-d");
                    $sql = "insert into pedidos(usuario,fecha,platos,precio_total) 
                            values(?,?,?,?)";

                    //echo $sql;

                    $preparada = $bd->prepare($sql);
                    $preparada->execute(array($_SESSION["nombre"], $fecha, $documento . ".txt", $total));

                    echo "<p>Su pedido se ha efectuado correctamente.</p>";

                    unset($_SESSION['carrito']); //Borramos el carrito. Si vuelve a index, y después vuelve a comprobar el carrito, le aparecerá vacío. 
                    //Mientras no se sale de la página actual le sigue apareciendo el pedido que hizo y el mensaje de confirmación.                     
                }
                if (isset($_REQUEST["eliminar"])) {
                    unset($_SESSION['carrito']); //Borramos el carrito
                    header("location:carrito.php"); //Volvemos a apuntar a la página porque si no hay que pulsar el botón dos veces.
                    die;
                }
            }
        }

        ?>
    </section>

</body>

</html>