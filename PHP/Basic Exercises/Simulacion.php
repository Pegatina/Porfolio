<!doctype html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Simulación de población</title>
  <!--Tres ciudades a las que se les introduce la población y se va simulando cada año la población de las tres-->
</head>

<body>
  <?php
  session_start();
  if (empty($_SESSION)) { //Si la sesión está vacía
    if (!isset($_REQUEST["init"])) { //Y no se ha pulsado el formulario, lo generamos
      echo  '<form method="post">';
      echo '<h2>Introduce los habitantes:</h2>';
      echo 'Ciudad A: <input type="number" name="A" required><br>';
      echo 'Ciudad B: <input type="number" name="B" required><br>';
      echo 'Ciudad C: <input type="number" name="C" required><br>';
      echo '<input type="submit" name="init" value="Comenzar">';
      echo '</form>';
    } else { //Si se ha pulsado, asignamos los name a variables
      $a = $_REQUEST["A"];
      $b = $_REQUEST["B"];
      $c = $_REQUEST["C"];
      $_SESSION['a'] = $a; //Y estas a sesiones
      $_SESSION['b'] = $b;
      $_SESSION['c'] = $c;
      $cont = 1; //Inicializa en 1;
      $_SESSION['cont'] = $cont; //Variable donde se almacena;
      echo "<h1>Año $_SESSION[cont]:</h1>";
      echo "Población de A: " . round($_SESSION['a'], 0) . " habitantes.<br>"; //Y mostramos el estado inicial
      echo "Población de B: " . round($_SESSION['b'], 0) . " habitantes.<br>"; //Redondeado porque no existen personas a medias, a veces baila el resultado
      echo "Población de C: " . round($_SESSION['c'], 0) . " habitantes.<br>"; //Pero los cálculos se siguen haciendo como el ejercicio, es por claridad.
      echo  '<form method="post">';
      echo '<input type="submit" name="continuar" value="Continuar">';
      echo '<input type="submit" name="del" value="Volver a empezar">';
      echo '</form>';
    }
  } else { //Como la página recarga al pulsar los submit, si pulsamos con la sesión ya iniciada, debería salir lo mismo
    $a = $_SESSION['a']; //Y estas a sesiones
    $b = $_SESSION['b'];
    $c = $_SESSION['c'];
    echo "<h1>Año $_SESSION[cont]:</h1>";
    echo "Población de A: " . round($_SESSION['a'], 0) . " habitantes.<br>";
    echo "Población de B: " . round($_SESSION['b'], 0) . " habitantes.<br>";
    echo "Población de C: " . round($_SESSION['c'], 0) . " habitantes.<br>";
    echo  '<form method="post">';
    echo '<input type="submit" name="continuar" value="Continuar">';
    echo '<input type="submit" name="del" value="Volver a empezar">';
    echo '</form>';
  }

  //****Debería truncar el resultado a dos decimales porque en cierto momento hay tantos decimales que no aumentan, consultar el próximo día. */

  if (isset($_REQUEST['continuar'])) {
    $_SESSION['cont']++; //Se incrementa
    $resuA = $a; //Se guardan los valores originales en otras variables
    $resuB = $b;
    $resuC = $c;
    $a += ($resuB * 0.1) + ($resuC * 0.08); //Que nunca se modifica su valor para así aplicarlo y sumarlo sobre cada ciudad
    $b += ($resuA * 0.05) + ($resuC * 0.06);
    $c += ($resuA * 0.07) + ($resuB * 0.02);

    $a -= ($resuA * 0.05) + ($resuA * 0.07); //Y después se le quita el mismo valor a la correspondiente ciudad
    $b -= ($resuB * 0.1) + ($resuB * 0.02);
    $c -= ($resuC * 0.06) + ($resuC * 0.08);

    $_SESSION['a'] = round($a, 2); //Y se le devuelve a sesión.
    $_SESSION['b'] = round($b, 2);
    $_SESSION['c'] = round($c, 2);
    header("location:Simulacion.php"); //Volvemos a apuntar a la página porque si no hay que pulsar el botón dos veces.
    die;
  }
  if (isset($_REQUEST['del'])) {
    session_destroy(); //Se destruye la sesión y se vuelve a cargar la página
    header("location:Simulacion.php");
    die;
  }

  var_dump($_SESSION['a']);
  var_dump($_SESSION['b']);
  var_dump($_SESSION['c']);

  ?>

</body>

</html>