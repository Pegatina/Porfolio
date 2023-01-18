<!doctype html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Login</title>
</head>
<!--Una página de login que comprueba que los nombres de usuario y contraseña sean válidos, si lo son, redirige a la página principal-->

<body>
	<a href="./">Volver</a>
	<?php
	session_start(); //Iniciamos la sesión al principio para comprobar si la sesión ya está iniciada, por si el usuario escribe manualmente el enlace de la página.	
	if (isset($_SESSION['nombre'])) { //Una vez iniciada la sesión, solo debe poderse cerrar la sesión en esta página.
		echo '<form method="post" action="cerrar.php">'; //La lógica la ejecutamos en cerrar.php
		echo '<input type="submit" name="close" value="Cerrar sesión"></form>';
	} else { //Si no hay sesión iniciada, aparece el formulario para iniciar sesión
		echo '<form method="post">';
		echo '<h2>Inicio de sesión:</h2>';
		echo 'Nombre: <input type="text" name="nombre" required><br>';
		echo 'Contraseña: <input type="password" name="contra" required><br>';
		echo '<input type="submit" name="boton" value="Validar"></form>';

		if (isset($_REQUEST['boton'])) { //Si pulsamos el botón de validar, se conecta a la base de datos para verificar los datos del usuario.

			$str_conex = 'mysql:dbname=restaurante;host=localhost';
			$usuario = 'root';
			$clave = '';
			$bd = new PDO($str_conex, $usuario, $clave);

			$nombre = $_REQUEST['nombre']; //Recogemos cada request en una variable
			$contra = $_REQUEST['contra'];

			$sql = 'select nombre, password from usuarios where nombre=?';
			$preparada = $bd->prepare($sql);    //La flecha es como en java el punto para acceder a otro método ej: persona.hablar() // persona->hablar()
			//Ejecutamos la sentencia dándole los parámetros, hay que hacerlo en forma de array       

			$preparada->execute(array($nombre));  //Hay que darle sí o sí un array al método

			if ($preparada->rowCount() > 0) { //Si hay resultados
				$fila = $preparada->fetch();
				if ($fila["password"] == $contra) { //Contrastamos aquí, no es seguro hacer condiciones SQL con contraseñas o datos sensibles.          

					//Cuando el usuario es válido
					if (isset($nombre) or isset($_SESSION['nombre'])) { //Generamos la sesión de nombre
						$_SESSION['nombre'] = $nombre ?? $_SESSION['nombre']; //Las dos interrogaciones cogen el primer dato que no sea nulo                
					}
					header("location:index.php"); //Redirigimos a index de nuevo si el usuario es válido
					die; //Para evitar que siga procesando información.							
				} else {
					echo "<p style= 'color:red;'>El nombre y la contraseña introducidos no son válidos.</p>"; //Si la contraseña no es válida
					echo '<form method="post">';
					echo '<input type="submit" name="create" value="Crear cuenta"></form>'; //Damos la opción de ir a crear cuenta.
				}
			} else {
				echo "<p style= 'color:red;'>El nombre y la contraseña introducidos no son válidos.</p>"; //Si el usuario no es válido	
				echo '<form method="post">';
				echo '<input type="submit" name="create" value="Crear cuenta"></form>'; //Damos la opción de ir a crear cuenta.
			}
		}
		//En iniciar sesión solo sale la opción de redirigirse a crear cuenta si las credenciales no son válidas.
		if (isset($_REQUEST["create"])) {
			header("location:create.php");
			die;
		}
	}
	?>
</body>

</html>