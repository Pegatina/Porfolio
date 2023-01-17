package practica1;
//importamos las clases necesarias para el ejercicio
//la clase para introducir por teclado
import java.util.Scanner;
//la clase para crear ArrayList
import java.util.ArrayList;
//la clase para el máximo y el mínimo
import java.util.Collections;
//dos clases para la fecha en el ejercicio 8
//la clase fecha
import java.util.Date;
//la clase que formatea la fecha en un formato más legible
import java.text.SimpleDateFormat;

//en esta clase vamos a almacenar todos los ejercicios para luego solo ejecutarlos en el main y dejar el código principal limpio.
public class ejercicios {
	// creamos el método del primer ejercicio fuera del main (practica1)
	public static ArrayList<Integer> ejercicio1() {
		// este ejercicio consiste en introducir en un ArrayList de Integer tantos números como queramos.

		// creamos un objeto Scanner para introducir datos por teclado
		Scanner sc = new Scanner(System.in);
		// creamos un ArrayList de tipo entero donde engancharemos los números que introduzcamos por pantalla
		ArrayList<Integer> numeros = new ArrayList<>();
		// guiamos al usuario sobre lo que debe introducir
		System.out.println("Introduce tantos números como quieras, para parar introduce 0");
		// en esta variable los almacenamos
		int N = sc.nextInt();
		// mientras que no se introduzca 0, el bucle sigue añadiendo números al arraylist.
		while (N != 0) {
			// le añadimos cada número al ArrayList.
			numeros.add(N);
			// volvemos a guiar al usuario
			System.out.println("Introduce tantos números como quieras, para parar introduce 0");
			// volvemos a introducir y se repite hasta 0.
			N = sc.nextInt();
		}
		// imprime el arraylist con cada número que contiene, como al introducir 0 no entra en el bucle, nunca lo añade.
		System.out.println(numeros);
		return numeros;
	}

	// para el segundo ejercicio necesitamos los datos del anterior, por eso le colocamos un return y aquí le pedimos un parámetro.
	public static void ejercicio2(ArrayList<Integer> ejercicio1) {
		// este ejercicio calcula el máximo, el mínimo y la media de los números de un ArrayList introducido.

		// media
		// inicializamos un número con decimales
		float total = 0;
		// al que le vamos sumando cada elemento del ArrayList que contiene.
		for (int num : ejercicio1) {
			// sumamos cada índice al total, esto sería igual que poner total = total+i;
			total += num;
		}

		// con este método calcula el número máximo de un ArrayList dado.
		float maximo = Collections.max(ejercicio1);
		// lo mostramos por pantalla
		System.out.println("El número máximo introducido es: " + maximo);

		// con este método calcula el número mínimo de un ArrayList dado.
		float minimo = Collections.min(ejercicio1);
		// lo mostramos por pantalla
		System.out.println("El número mínimo introducido es: " + minimo);

		// determinamos la media dividiendo la suma de los números entre la cantidad de números.
		float media = total / (ejercicio1.size());
		// la mostramos por pantalla
		System.out.println("La media es " + media);
	}

	public static void ejercicio3() {
		// este ejercicio enseña el carácter (o caracteres si es de letras pares) del medio de un String.

		// creamos un objeto Scanner para introducir datos por teclado
		Scanner sc = new Scanner(System.in);
		// guiamos al usuario
		System.out.println("Introduce una frase: ");
		// recogemos la frase en una variable String
		String frase = sc.nextLine();
		// instanciamos dos int, que nos van a servir para determinar la posición inicial y el largo de la misma para el substring
		int posicion, largo;

		// si la frase tiene caracteres pares (es decir, el resto de la división entre 2 es 0)
		if (frase.length() % 2 == 0) {
			// el medio empieza en la mitad menos 1, por ejemplo en "Mano" sería en "a"
			posicion = frase.length() / 2 - 1;
			// y termina en "n", la mitad de "Mano" es "an"
			largo = 2;
		}
		// si es impar
		else {
			// recoge el carácter del medio, por ejemplo en "Manta" sería "n"
			posicion = frase.length() / 2;
			// solo necesitamos coger 1 letra.
			largo = 1;
		}
		// declaramos e instanciamos la variable medio que recoge mediante substring
		// unas posiciones de la frase, que buscamos que sean las de en medio.
		// introducimos enteros y nos devuelve la parte de String correspondiente.
		String medio = frase.substring(posicion, posicion + largo);
		// devolvemos el resultado
		System.out.println("El medio de la frase es: " + medio + ".");
	}

	public static void ejercicio4() {
		// este ejercicio cuenta las vocales de un String.

		// creamos un objeto Scanner para introducir datos por teclado
		Scanner sc = new Scanner(System.in);
		// guiamos al usuario
		System.out.println("Introduce una frase: ");
		// recogemos la frase en una variable String
		String frase = sc.nextLine();
		// instanciamos un contador para que determine cuántas veces se repiten las vocales
		int vocales = 0;
		// recorremos la frase entera
		for (int i = 0; i < frase.length(); i++) {
			// si encontramos alguno de estos caracteres (vocales en minúsculas y mayúsculas para no obviar nada)
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
					|| frase.charAt(i) == 'u' || frase.charAt(i) == 'A' || frase.charAt(i) == 'E'
					|| frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U') {
				// vamos añadiendo las vocales
				vocales++;
			}
		}
		System.out.println("La frase: '" + frase + "' tiene " + vocales + " vocales");
	}

	public static void ejercicio5() {
		// este ejercicio determina si un año es o no bisiesto

		// creamos un objeto Scanner para introducir datos por teclado
		Scanner sc = new Scanner(System.in);
		// guiamos al usuario
		System.out.println("Introduce un año: ");
		// lo almacenamos en una variable int
		int anio = sc.nextInt();

		// para calcular un número bisiesto tenemos que comprobar que, o bien el número
		// dividido entre 4 dé 0, pero entre 100 no (porque cada 100 años tenemos un año no bisiesto),
		// o bien que dividido entre 400 dé 0.
		if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0)) {
			System.out.println("El año " + anio + " es bisiesto");
		} else {
			System.out.println("El año " + anio + " no es bisiesto");
		}
	}

	public static void ejercicio6() {
		// este ejercicio determina si una contraseña que le pasa el usuario es válida
			// las reglas para crear una contraseña son:
			// tiene que tener una longitud mínima de 8 caracteres
			// solo pueden ser letras y números (no puede haber símbolos como #%@)
			// tiene que tener al menos 3 letras

		// creamos un objeto Scanner para introducir datos por teclado
		Scanner sc = new Scanner(System.in);
		// guiamos al usuario
		System.out.println("Introduce tu contraseña, mínimo 8 caracteres de letras y números, cuyos caracteres sean mínimo 3 letras: ");
		// lo almacenamos en una variable (sin determinar el tipo en la entrada, luego discriminamos);
		String pass = sc.next();
		// creamos un contador de letras
		int letras = 0;
		// booleano para comprobar después los elementos, por defecto la contraseña es correcta
		boolean correcto = true;
		// recorremos toda la contraseña
		for (int i = 0; i < pass.length(); i++) {
			// creamos una variable de tipo char para almacenar los elementos que recorre i
			char elemento = pass.charAt(i);
			// el dato tipo char lo pasamos a string con esta función.
			String valorElemento = String.valueOf(elemento);

			// para introducir un rango se utilizan los corchetes y un guión, y la función matches busca coincidencias 
			//entre un String, similar a equals pero evalúa el rango, no capta el String literalmente.
			// queremos que nuestra contraseña solo contenga letras y números, por tanto el condicional solo debe permitir estos.
			if (valorElemento.matches("[A-Z]") || valorElemento.matches("[a-z]")) {
				letras++;							
			} //si el valor introducido no es ninguno de los 3 rangos que me interesa, lo pongo en falso			
			else if(!(valorElemento.matches("[A-Z]") || valorElemento.matches("[a-z]") || valorElemento.matches("[0-9]")) ){
				//conseguimos que, con que haya un caracter que no corresponda, luego lo podamos descartar
				correcto = false;
			}
		} //cuando acaba de recorrer la contraseña...
		// si el largo de la contraseña es menor o utiliza otros caracteres, aquí lo rechazamos.			
		if (pass.length() < 8 || !correcto){
			System.out.println("La contraseña que has introducido no es válida.");
		} //si la contraseña introducida es mayor o igual de 8 y ningún carácter es falso,		
		  //y, además, cumple la condición de las letras.		
		else if (letras >= 3) {			
			System.out.println("La contraseña introducida es válida");				
		} //aquí recogemos contraseñas mayores de 8 sin 3 letras.
		else {
			System.out.println("La contraseña que has introducido no es válida.");
		}		
	}
	public static void ejercicio7() {
		//este ejercicio calcula el área de un triángulo dados los lados
		
		// creamos un objeto Scanner para introducir datos por teclado
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer lado del triángulo: ");
		//declaro e inicializo todos los lados.
		int lado1 = sc.nextInt();
		System.out.println("Introduce el segundo lado del triángulo: ");
		int lado2 = sc.nextInt();
		System.out.println("Introduce el tercer lado del triángulo: ");
		int lado3 = sc.nextInt();	
		//declaro dos variables con decimales porque al dividir números es bastante probable que aparezcan
		double semiperimetro,area; 				
		
		//compruebo si todos los lados tienen un valor que no sea 0
		if(lado1>0){
			if(lado2>0){
				if(lado3>0){
					// sumo los lados y los divido entre 2 para encontrar el semiperimetro (la mitad del perímetro).
					semiperimetro=(lado1+lado2+lado3)/2; 
					//el área en la fórmula de Herón es la raíz cuadrada del semiperímetro multiplicado por la resta del semiperímetro en cada lado
					area=(Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));
					System.out.println("El área del triángulo es: " + area);
				}else{
					System.out.println("El valor del tercer lado no puede dejarse en blanco");
				}
			}else{
				System.out.println("El valor del segundo lado no puede dejarse en blanco");	
			}
			//si no se ha introducido ningún número válido enviamos un mensaje avisando del error
		}else{
			System.out.println("El valor del primer lado no puede dejarse en blanco");		
		}			
	}
	
	public static void ejercicio8() {
		//este ejercicio dice la fecha y hora actuales		
		
		System.out.println("La fecha y hora actuales son:");
		//esto imprime en este estilo: Thu Mar 10 21:54:07 CET 2022, lo cual es un poco ilegible, así que lo formateamos para mostrarlo mejor.
		Date fecha = new Date();		
		//System.out.println(fecha);
		
		SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(fechaFormateada.format(fecha));
		}
	public static boolean ejercicio9(int num) {
		//este ejercicio calcula números primos según un número dado
		
		// declaramos un booleano en el que suponemos que el número es primo hasta que se descarta
		boolean primo = true;
		//recorremos el número dividiéndolo del 2 hasta el número anterior.

		for(int i=2; i<num;i++){
			// si se divide entre otro número que no sea él mismo o 1 es falso.
			if(num%i==0){
				primo = false;
			}			 			
		}// imprimimos el resultado final
		if(primo){
			//System.out.println("El número es primo.");
			return true;
		}else {
			//System.out.println("El número no es primo.");
			return false;
		}		
	}
	public static void ejercicio10(boolean ejercicio9, int num) {
		//este ejercicio recibe un número y en base a él, si es primo en el anterior ejercicio lo determina y 
		//calcula las parejas de números primos gemelos que contiene.
			//los primos gemelos son 2 números que son primos y están tan cerca que solo hay otro número entre ellos:
			//3 y 5, 5 y 7, 11 y 13, 17,19, 29,31... 
			//Los primos 2 y 3 no cumplen el patrón, así que no deben aparecer como pareja.
			
		//Como dejar el resultado ensuciaba la salida de este código, quise rescatarlo y dejarlo aquí, 
		//ya que están pensados para que funcionen juntos.
			if(ejercicio9) {
				System.out.println("El número "+ num+ " es primo.\n");
			}
			else {
				System.out.println("El número "+ num+ " no es primo.\n");
			}
		
		// creamos dos int partiendo de 3 para mostrar más adelante los números primos gemelos. 
		//Empiezan en 3 porque es el número desde el que queremos partir, ya que [2,3] no son primos gemelos.
		int num1=3, num2 =3;
		
		//Doy esta salida antes de que inicie el bucle por claridad en el resultado.
		System.out.println("Los primos gemelos de " + num + " son:");
		
		//calculo primos gemelos hasta el número dado, empezando en 3 porque no queremos que salga el 2.
		for(int i=3;i<num;i++) {
			//por defecto todos son primos hasta que sean divisibles.
			//para determinar los primos gemelos, utilizamos la comprobación del anterior ejercicio, evaluando siempre el número que contenga i.
			//así, ese numero se somete al criterio del anterior ejercicio y lo devuelve. Brutal.
			boolean primo = ejercicio9(i);
			//comprobamos si i es primo.
			if(primo == true) {
				//asignamos al número 2 el valor del número 1, por lo que siempre será más pequeño que num1 al final del if.
				
				num2 = num1;
				//asignamos al número 1 el valor de i
				num1= i;
				//En matemáticas, dos números primos son gemelos si siendo num1 > num2, num1-num2 = 2.
				//Como en la primera vuelta vale siempre 3 todo, no imprime nada
				//en la segunda vuelta num1 acaba valiendo 5 y num2 vale 3, así que se imprimen
				//(porque 5-3 = 2).
				if(num1-num2==2) {					
					// buscando cómo imprimirlos adecuadamente, aprendí que java tiene un print con formato,
					//%d corresponde a los decimales, \n al salto de línea, y así me deja darle los dos números cada vez que itera el for.
					System.out.printf("%d %d\n", num2, num1);
				}		
			}		
		}
	}
}
