<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Registro</title>
</head>
<!--un registro que comprueba que los nombres de usuario y contraseña sean válidos y, en caso de serlo, los almacena en una BBDD-->

<body>

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
    -contraseña: obligado a usar mínimo 1 de cada mayúsculas, minúsculas, número, símbolo, entre 8 y 16 caracteres
    -repite contraseña: debe coincidir
    -correo: que contenga la @
    */
     
        $nombre = $_REQUEST['nombre']; //recojo cada request en una variable
        $contra = $_REQUEST['contra'];
        $contra2 = $_REQUEST['contra2'];
        $correo = $_REQUEST['correo'];
        $valid = false; //verificar longitud contraseña
        $contador1 = 0; //verificar caracteres
        $contador2 = 0;
        $contador3 = 0;
        $contador4 = 0;
        $contfinal = 0; //verificar que esté todo        

        if (!(ctype_alnum($nombre) && (strlen($nombre) >= 5 && strlen($nombre) <= 10))) { //si el nombre no es alfanumérico y no está entre 5 y 10 caracteres, error.
            echo "<p style= 'color:red;'>El nombre de usuario introducido no es válido. 
            Solo admite caracteres alfanuméricos y su longitud debe estar comprendida entre 5 y 10 caracteres</p>";
        } else {
            $contfinal++;            
         }

        for ($i = 0; $i < strlen($contra); $i++) {   //recorro la string     

            if (ctype_upper($contra[$i])) { //compruebo cada caracter si es mayúscula
                $contador1++;
            } elseif (ctype_lower($contra[$i])) { //compruebo cada caracter si es minúscula
                $contador2++;
            } elseif (ctype_digit($contra[$i])) { //compruebo cada caracter si es un número
                $contador3++;
            } elseif (ctype_punct($contra[$i])) { //compruebo cada caracter si es un símbolo no alfanumérico ni espacio
                $contador4++;
            }
        }
        if (strlen($contra) >= 8 && strlen($contra) <= 16) { //longitud permitida
            $valid = true;
        }
        if (!($valid && ($contador1 > 0 && $contador2 > 0 && $contador3 > 0 && $contador4 > 0))) {
            echo "<p style= 'color:red;'>La contraseña introducida no es válida. Debe contener al menos una mayúscula, una minúscula, un número y un símbolo,
        y su longitud debe estar comprendida entre 8 y 16 caracteres.</p>";
        } else {
            $contfinal++;            
        }

        if (!($contra === $contra2)) {
            echo "<p style= 'color:red;'>Las contraseñas no coinciden.</p>";
        } else {
            $contfinal++;
        }

        if (str_contains($correo, '@')) { //email comprueba y requiere si contiene o no @, excepto si no escribes nada, lo pongo por si acaso y para que sume el contador.
            $contfinal++;               //aunque con required y la caja tipo email, no debería poderse enviar vacío ni de forma incorrecta.
        } else {
            echo "<p style= 'color:red;'>El correo introducido no es válido. Debe contener solo una @</p>";
        }

        if ($contfinal >= 4) {

            $host = 'localhost'; //variables para introducir todo en la BBDD
            $usuario = 'root';
            $contraseña = '';
            $bd = 'registro';

            $conexion = mysqli_connect($host, $usuario, $contraseña, $bd)
                or die('Problemas con la conexión'); // Si no puede conectarse deja de ejecutar código
            // mysqli_connect devuelve un objeto mysqli, que controla las consultas a la base de datos especificada

            $datos = mysqli_query($conexion, "select nombre from usuarios
                                where nombre='$_REQUEST[nombre]'");
            if (mysqli_num_rows($datos) > 0) {
                echo "<p style= 'color:red;'>El usuario introducido ya existe.</p>";
                mysqli_close($conexion); //importante
            } else {
                mysqli_query($conexion, "insert into usuarios(nombre,password,correo) 
                values ('$_REQUEST[nombre]','$_REQUEST[contra]','$_REQUEST[correo]')") //tabla usuarios
                    or die('Problemas al insertar: ' . mysqli_error($conexion));
                // El primer argumento debe ser un objeto mysqli, el segundo cualquier consulta SQL
                mysqli_close($conexion);   //importante 
                //echo 'Datos insertados con éxito';
                header("location:read.php"); //redirijo a una nueva página si el usuario se ha podido almacenar en la BBDD.
                die; //para evitar que siga procesando información.

            }
        }
    }

    ?>
</body>

</html>
