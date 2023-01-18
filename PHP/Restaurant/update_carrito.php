<?php
//Página de actualizar el carrito, no visible para el usuario
if (empty($_REQUEST)) { //si no se viene del formulario, no debe poder accederse a esta página
    header("location:carrito.php");
    die;
}

session_start(); //Para acceder a las variables de sesión

$clv = array_keys($_REQUEST); //Se recojen los datos del request
$val = array_values($_REQUEST);

if(!isset($_SESSION['carrito'])){ //Si no está creado
    $carrito = array(); //Creamos el array de carrito y se lo añado a la variable de sesión.
    $_SESSION['carrito'] = $carrito;            
}

for ($i = 0; $i < count($clv); $i++) { //Se recorren las claves
    if (!empty($val[$i])) { //Si la clave tiene valor 0
        $clave = $clv[$i]; //El nombre del plato pasa a ser el de la clave
        $clave = str_replace("_", " ", $clave); //Esto hace que los nombres se almacenen con espacios y no entre _.
        if (isset($_SESSION['carrito'][$clave])) { //Si ya está el plato guardado          
            $_SESSION['carrito'][$clave] += $val[$i];  //Le suma la nueva cantidad a la clave del array de sesión
        } 
        else {           
            $carrito[$clave] = $val[$i]; //Si no está guardado, le añade al array su clave junto a su cantidad
            $_SESSION['carrito'][$clave] = $carrito[$clave]; //Creamos una variable de sesión dentro del array del pedido, a la que le añade el valor de la clave del array
        }
    }
}

header("location:carrito.php");
die;
?>
