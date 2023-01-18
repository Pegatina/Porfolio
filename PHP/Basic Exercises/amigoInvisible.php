<!doctype html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Amigo invisible</title>
  <!--Sorteo del amigo invisible, con un input de texto y dos botones para añadir gente y generar las parejas, 
  no se puede regalar a sí mismo y no deberían quedarse personas sin regalo, la persona que regala genera un archivo 
  de texto con la información de a quién regala-->
</head>

<body>
  <form method="post">
    <h2>Introduce los nombres:</h2>
    <input type="text" name="nombre"><br>
    <input type="submit" name="add" value="Añadir">
    <input type="submit" name="sort" value="Sortear">
    <input type="submit" name="del" value="Volver a empezar">
  </form>

  <?php
  session_start();
  if (!isset($_SESSION['emisor'])) { //Si es la primera vez que entramos en la página o hemos pulsado volver a empezar
    $_SESSION['emisor'] = array(); //Definimos que la variable de sesión es un array
  }
  $emisor = $_SESSION['emisor']; //Y se lo asignamos a una variable
  $receptor = array(); //Array que recibirá después los datos del primero

  if (isset($_REQUEST["add"])) { //Si se ha pulsado añadir
    $emisor[] = $_REQUEST['nombre']; //Añadimos el nombre al array    
    $_SESSION["emisor"] = $emisor; //Y se lo volvemos a añadir a la sesión
  }
  /* echo "Primer:<br>";
  print_r($emisor);
  echo "<br>";
  */
  if (isset($_REQUEST["sort"])) { //Si se pulsa sortear
    if (count($emisor) <= 1) { //Si no hay personas o solo hay una
      echo "<p style= 'color:red;'>Debes introducir varias personas para sortear.</p>";
    } else {
      sort($emisor); //Se sortea el contenido.
      /*
      echo "Segundo:<br>";
      print_r($emisor);
      echo "<br>";
      */
      $_SESSION["emisor"] = $emisor; //Vuelve a añadírsele a la sesión
      for ($i = 0; $i < count($emisor); $i++) {
        if ($i == count($emisor) - 1) { //En la última posición meto la primera de emisor
          $receptor[$i] = $emisor[0];
        } else { //En el resto añado la siguiente de emisor.
          $receptor[$i] = $emisor[$i + 1];
        }
      }
      echo "<p>Comprobad vuestro documento en la carpeta para ver a quién le habéis tocado.</p>";
      for ($i = 0; $i < count($receptor); $i++) {
        $archivo = fopen($emisor[$i] . ".txt", 'a');
        fputs($archivo, "Tienes que regalar a " . $receptor[$i] . ".");
        fclose($archivo);
      }
    }
  }
  if (isset($_REQUEST["del"])) { //Si se pulsa volver a empezar
    session_destroy(); //Se destruye la sesión y se vuelve a cargar la página
    header("location:amigoInvisible.php");
    die;
  }
  /*
  echo "Tercero:<br>";
  print_r($emisor);
  echo "<br>";
  print_r($receptor);
  */
  ?>

</body>

</html>