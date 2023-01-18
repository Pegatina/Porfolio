<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Registro</title>
</head>
<!--Un registro que comprueba que los nombres de usuario y contraseña sean válidos para introducir y, en caso de serlo, los almacena en una BBDD-->

<body>
    <a href="./">Volver</a>
    <form method="post">
        <h2>Registro:</h2>
        Nombre: <input type="text" name="nombre" required><br>
        Contraseña: <input type="password" name="contra" required><br>
        Repite contraseña: <input type="password" name="contra2" required><br>
        Correo: <input type="email" name="correo" required><br>
        <!--Comprueba y avisa si no contiene @ por sí mismo-->
        <input type="submit" name="boton" value="Validar">
    </form>

    <?php
    if (isset($_REQUEST['boton'])) {
        /*Condiciones: 
    -Nombre: solo letras y números de 5 a 10 caracteres
    -Contraseña: obligado a usar mínimo 1 de cada mayúsculas, minúsculas, número, símbolo, entre 8 y 16 caracteres
    -Repite contraseña: debe coincidir
    -Correo: que contenga la @
    */
        $nombre = $_REQUEST['nombre']; //Recogemos cada request en una variable
        $contra = $_REQUEST['contra'];
        $contra2 = $_REQUEST['contra2'];
        $correo = $_REQUEST['correo'];
        $valid = false; //Variable para verificar la longitud de la contraseña
        $contador1 = 0; //Variables para verificar caracteres
        $contador2 = 0;
        $contador3 = 0;
        $contador4 = 0;
        $contfinal = 0; //Variable para verificar que esté todo        

        if (!(ctype_alnum($nombre) && (strlen($nombre) >= 5 && strlen($nombre) <= 10))) { //Si el nombre no es alfanumérico y no está entre 5 y 10 caracteres, error.
            echo "<p style= 'color:red;'>El nombre de usuario introducido no es válido. 
            Solo admite caracteres alfanuméricos y su longitud debe estar comprendida entre 5 y 10 caracteres</p>";
        } else {
            $contfinal++;
        }

        for ($i = 0; $i < strlen($contra); $i++) {   //Recorremos la string     

            if (ctype_upper($contra[$i])) { //Comprobamos cada caracter si es mayúscula
                $contador1++;
            } elseif (ctype_lower($contra[$i])) { //Comprobamos cada caracter si es minúscula
                $contador2++;
            } elseif (ctype_digit($contra[$i])) { //Comprobamos cada caracter si es un número
                $contador3++;
            } elseif (ctype_punct($contra[$i])) { //Comprobamos cada caracter si es un símbolo no alfanumérico ni espacio
                $contador4++;
            }
        }
        if (strlen($contra) >= 8 && strlen($contra) <= 16) { //Comprobamos la longitud permitida
            $valid = true;
        }
        if (!($valid && ($contador1 > 0 && $contador2 > 0 && $contador3 > 0 && $contador4 > 0))) { //Si no tiene una longitud válida ni ha pasado por los 4 contadores.
            echo "<p style= 'color:red;'>La contraseña introducida no es válida. Debe contener al menos una mayúscula, una minúscula, un número y un símbolo,
        y su longitud debe estar comprendida entre 8 y 16 caracteres.</p>";
        } else { //Aumentamos el contador final
            $contfinal++;
        }

        if (!($contra === $contra2)) { //Comprobamos ambas contraseñas
            echo "<p style= 'color:red;'>Las contraseñas no coinciden.</p>";
        } else { //Aumentamos el contador final
            $contfinal++;
        }

        if (str_contains($correo, '@')) { //Email comprueba y requiere si contiene o no @, excepto si no escribes nada, está puesto por si acaso y para que sume el contador.
            $contfinal++;               //aunque con required y la caja tipo email, no debería poderse enviar vacío ni de forma incorrecta.
        } else {
            echo "<p style= 'color:red;'>El correo introducido no es válido. Debe contener solo una @</p>";
        }

        if ($contfinal >= 4) { //Solo si la verificación está correcta en todos los pasos conectamos a la BBDD.

            $str_conex = 'mysql:dbname=restaurante;host=localhost';
            $usuario = 'root';
            $clave = '';
            $bd = new PDO($str_conex, $usuario, $clave);

            $sql = 'select nombre from usuarios where nombre=?';
            $preparada = $bd->prepare($sql);    //La flecha es como en java el punto para acceder a otro método ej: persona.hablar() // persona->hablar()
            //Se ejecuta la sentencia dándole los parámetros, hay que hacerlo en forma de array       

            if ($preparada->rowCount() > 0) {
                echo "<p style= 'color:red;'>El usuario introducido ya existe.</p>";
            } else {
                $preparada = $bd->prepare('insert into usuarios(nombre,password,correo) 
                values (?,?,?)');
                $preparada->execute(array($nombre, $contra, $correo)); //Los insertamos según los input

                header("location:index.php"); //Redirigimos a una nueva página si el usuario se ha podido almacenar en la BBDD.
                die; //Para evitar que siga procesando información.
            }
        }
    }
     //Damos opción a iniciar sesión por si se han equivocado de botón y no quieren volver al index.
     echo '<form method="post">';
     echo '<br><input type="submit" name="init" value="Iniciar sesión">';
     if (isset($_REQUEST["init"])) {
        header("location:read.php");
        die;
    }

    ?>
</body>

</html>