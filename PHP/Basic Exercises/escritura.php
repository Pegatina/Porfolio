<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Escritura de documentos</title>
</head>

<body>

<form method="post">
	Tu nombre: <input type="text" name="nombre" required><br>
	Tu comentario: <br>
	<textarea rows="10" cols="40" name="comentario" required></textarea><br>
	<input type="submit" name="ok" value="Enviar">
</form>

<?php

if(isset($_REQUEST['ok'])){
	echo 'Gracias por enviar tu comentario.';
	
	// Con fopen podemos abrir un archivo, el segundo argumento especifica el tipo de acceso:
	//	con 'a' se abre para escritura con el puntero al final, si no existe se crea. ADD
	//	con 'w' se borra el contenido y se abre para escritura, si no existe se crea. WRITE
	//	con 'r' se abre para lectura con el puntero al principio. READ
	$archivo = fopen('datos.txt','a');

	// Con fputs escribimos en el archivo donde esté el puntero
	fputs($archivo,$_REQUEST['nombre']);
	fputs($archivo,"\n"); //o después de archivo, PHP_EOL
	fputs($archivo,$_REQUEST['comentario']);
	fputs($archivo,"\n");
	fputs($archivo,'-------------------------------------');
	fputs($archivo,"\n");
}

?>


</body>
</html>