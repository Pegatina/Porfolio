<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Práctica 1</title>
</head>

<body>
    <!--Esta página consiste en un formulario que recoge un nombre de cliente y las cantidades de unas prendas en concreto y genera un ticket de compra
con sus subtotales y el total, y permite descargar la factura.-->

    <form method="post">
        <!--formulario que se carga en la propia página-->
        <div style="background-color: #9CCAD4; width:500px;">
            <h1 style="color: #214249; font-family: Garamond;">
                <center>Tu tienda eCommerce de confianza</center>
            </h1>
            <div style="padding-left: 100px; padding-bottom: 10px; margin-top: -15px;">
                <b>Nombre:</b> <input type="text" name="nombre" required><br>
                <!--campos, solo el nombre es requerido, ya que no tienen por qué comprar todo.-->
                <b>Prendas:</b> <br>
                ·Pantalón: <input type="number" name="cant1" min=0 placeholder="Cantidad" style="width:68px; margin-left: 4px;"><br>
                <!--con min evito negativos-->
                ·Camiseta: <input type="number" name="cant2" min=0 placeholder="Cantidad" style="width:68px;"><br>
                ·Zapatos: <input type="number" name="cant3" min=0 placeholder="Cantidad" style="width:68px; margin-left: 9px;"><br>

                <input type="submit" name="ok" value="Enviar" style="margin-left: 85px;">
                <br>

                <div>
                </div>
    </form>

    <?php

    if (isset($_REQUEST['ok'])) { //Si se ha generado el array de request para el botón, es decir, si se ha pulsado el botón de submit.	

        if ($_REQUEST["cant1"] > 0 || $_REQUEST["cant2"] > 0 || $_REQUEST["cant1"] > 0) { //si no se ha seleccionado ningún artículo no creo el documento

            $nombre = $_REQUEST["nombre"]; //le asigno el nombre recogido en la cajita de texto a una variable para usarlo después
            $totalsuma = 0; //inicializo fuera para irle añadiendo, es un contador a 0    

            $archivo = fopen("$nombre" . ".txt", 'a'); //a una variable archivo le asignamos la creación de un nuevo documento txt, cuyo nombre consiste en el del usuario
            //es tipo ADD, lo que significa que va añadiendo información en la siguiente línea que se encuentre

            // Con fputs escribimos en el archivo donde esté el puntero
            fputs($archivo, "-Tu tienda eCommerce de confianza-"); //nombre de la tienda
            fputs($archivo, "\n"); //salto de línea
            fputs($archivo, "[$nombre]"); //nombre del usuario
            fputs($archivo, "\n\n");

            if ($_REQUEST["cant1"] > 0) { //si han añadido algún pantalón
                fputs($archivo, "Pantalón: ");
                fputs($archivo, "$_REQUEST[cant1] x 10.49€-------------"); //cantidad x precio individual

                $precio = 10.49;
                $total = $precio * $_REQUEST["cant1"]; //precio x cantidad

                fputs($archivo, $total . "€"); //subtotal
                fputs($archivo, "\n");
                $totalsuma += $total; //se lo añadimos al total

            }
            if ($_REQUEST["cant2"] > 0) { //si han añadido alguna camiseta
                fputs($archivo, "Camiseta: ");
                fputs($archivo, "$_REQUEST[cant2] x 4.99€-------------");

                $precio = 4.99;
                $total = $precio * $_REQUEST["cant2"];

                fputs($archivo, $total . "€");
                fputs($archivo, "\n");
                $totalsuma += $total;
            }

            if ($_REQUEST["cant3"] > 0) { //si han añadido algunos zapatos
                fputs($archivo, "Zapatos: ");
                fputs($archivo, "$_REQUEST[cant3] x 12.99€-------------");

                $precio = 12.99;
                $total = $precio * $_REQUEST["cant3"];

                fputs($archivo, $total . "€");
                fputs($archivo, "\n");
                $totalsuma += $total;
            }
            fputs($archivo, "\n\n");
            fputs($archivo, "Total: " . $totalsuma . "€");
            fputs($archivo, "\n");
            fputs($archivo, '----------------------------------------');
            fputs($archivo, "\n");

            echo 'Tu compra se ha efectuado correctamente. <br>Gracias por confiar en nuestra tienda.'; //mensaje de confirmación y agradecimiento.
            echo "<br>";
            echo "<a href='$nombre.txt' download= '$nombre.txt'>Descargar factura</a>"; //enlace de descarga del archivo.

        }else{
            echo "<p style= 'color:red'>No se ha comprado nada.</p>";
        }
    }
    ?>

</body>

</html>