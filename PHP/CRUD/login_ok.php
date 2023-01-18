<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Inicio correcto</title>
	<!--Página de inicio donde reconoce al usuario y le redirige a tres opciones: Actualizar contraseña, borrar la cuenta o cerrar sesión-->
</head>

<body>
	<?php

	session_start();
	if(isset($_SESSION['nombre'])){
		echo "Felicidades, $_SESSION[nombre], has iniciado sesión correctamente.<br><br>";
		echo '<a href="update.php">Actualizar contraseña</a><br>';
		echo '<a href="delete.php">Borrar cuenta</a>';

		echo '<form method="post">';
        echo '<br><input type="submit" name="close" value="Cerrar sesión">
        </form>';        

        if (isset($_REQUEST["close"])) {
            session_destroy();
            header("location:read.php");
            die;
        }
	}else{
		header("location:read.php");
    	die;
	}	
	?>
  

</body>
</html>