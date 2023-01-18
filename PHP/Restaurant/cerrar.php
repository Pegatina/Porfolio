<?php
	session_start(); //Página que solo sirve para cerrar sesión en caso de que el usuario introduzca read.php de forma manual en el navegador
	if (isset($_REQUEST["close"])) {
		session_destroy();
		header("location:read.php"); //Redirigimos a read.php de nuevo si se pulsa el botón de cerrar de read.php
		die; //Para evitar que siga procesando información.			
	}
    header("location:read.php"); //El usuario no debe poder acceder a esta página en ningún momento.
	die;
	?>