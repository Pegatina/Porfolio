<!doctype html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Faltas</title>
</head>

<body>
	<form method="post">
		Grupo: <select name="g" required>
			<option value="2DAW">2DAW</option>
			<option value="1DAW">1DAW</option>
			<option value="2ASIR">2ASIR</option>
			<option value="1ASIR">1ASIR</option>
			<option value="2SMR">2SMR</option>
			<option value="1SMR">1SMR</option>
			<input type="submit" name="ok" value="Enviar">
		</select><br>
	</form>

	<?php

	if (isset($_REQUEST['ok'])) {
		$str_conex = 'mysql:dbname=ex1;host=localhost';
		$usuario = 'root';
		$clave = '';
		$bd = new PDO($str_conex, $usuario, $clave);

		$grupo = $_REQUEST["g"];

		$sql = 'select * from ej1alumnos where grupo =?';
		$preparada = $bd->prepare($sql);    //la flecha es como en java el punto para acceder a otro método ej: persona.hablar() // persona->hablar()
		// Ejecutamos la sentencia dándole los parámetros, hay que hacerlo en forma de array                  
		$preparada->execute(array($grupo));  //hay que darle sí o sí un array al método

		foreach ($preparada as $fila) {
			$sql2 = 'select count(*) from ej1faltas where cod_alumno =?';
			$preparada2 = $bd->prepare($sql2);
			$preparada2->execute(array($fila['cod_alumno']));
			$fila2 = $preparada2->fetch();
			$faltas =$fila2['count(*)'];
			echo "$fila[nombre]: $faltas<br>";
		}
	}

	?>
</body>

</html>
