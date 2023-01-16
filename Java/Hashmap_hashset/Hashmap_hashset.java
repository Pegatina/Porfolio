package hashmap_hashset;

//importo los paquetes que necesito

//import java.util.Arrays;
import java.util.HashSet;
//import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class hashmap_hashset {

	public static void main(String[] args) {
		// 1: Un método que le pasas una string y dice el numero de caracteres únicos
		// (letras que no se repiten) en esa string.
		// Si le paso la misma string 2 veces, ha guardado la info y no vuelve a hacer
		// el conteo. set y map

		/*
		 * Método boceto (no es el final)
		 * // buscando, encontré que se puede hacer separando las letras del string con comas, de esta forma: 
		 * // primero instancio las strings.
		 * String nombre1 = "J,u,a,n,i,t,o"; 
		 * String nombre2 = "M,a,r,í,a"; 
		 * String nombre3 = "M,a,n,o,l,o"; 
		 * // luego las separo con split desde las comas y lo almaceno en un array de String 
		 * String[] partes2 = nombre2.split(","); 
		 * //convierto el array a una lista usando el método asList 
		 * List<String> parteslista2 = Arrays.asList(partes2); 
		 * // declaro el HashSet desde la lista al instanciarlo 
		 * HashSet<String> hashset2 = new HashSet<String>(parteslista2);
		 * 
		 * //muestro lo que contiene 
		 * //System.out.println("El Set contiene: " + hashset2);
		 * //primera parte, muestro la cantidad de caracteres con size, 
		 * //al haber cogido María, perdería un caracter. 4. 
		 * System.out.println(hashset2.size());
		 * 
		 * //declaro el hashmap cuya key sean los hashset y la segunda parte su tamaño
		 * HashMap<HashSet, Integer> hashmap = new HashMap<>(); 
		 * //le instancio el hashset anterior 
		 * hashmap.put(hashset2, hashset2.size()); 
		 * //si quiero pasarle lo mismo otra vez a un hashset, y luego añadirlo.... 
		 * String[] partes2_2 = nombre2.split(","); 
		 * // convierto el array a una lista usando el método asList 
		 * List<String> parteslista2_2 = Arrays.asList(partes2_2); 
		 * // instancio el HashSet desde la lista al declararlo 
		 * HashSet<String> hashset2_2 = new HashSet<String>(parteslista2_2); 
		 * //Si el valor no es el mismo, lo mete al hashmap		 * 
		 * if(!hashset2.equals(hashset2_2)) { 
		 * hashmap.put(hashset2_2, hashset2_2.size()); 
		 * //compruebo si entra
		 * System.out.println(hashmap); 
		 * };
		 * System.out.println(hashmap);
		 */
		
		
		//Ejercicio 1 resuelto
		// instancio un objeto Scanner para pedir las palabras
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce un nombre, 0 para parar:");
		// almaceno el resultado en la variable
		String nombre = escaner.nextLine();
		// declaro el hashmap que contendrá todos los hashset
		HashMap<HashSet, Integer> hashmap = new HashMap<>();
		// mientras no ponga un 0, funciona el while
		while (!nombre.equals("0")) {
			// declaro el hashset contenedor de caracteres
			HashSet<Character> hashset = new HashSet<>();
			// recorro el nombre para para ir a cada elemento del string
			for (int i = 0; i < nombre.length(); i++) {
				char elemento = nombre.charAt(i);
				// convierto el char a string
				hashset.add(elemento);				
			}
			// comprobación
			// System.out.println(hashset);

			// Si el valor contenido en los pares del hashmap no está contenido en el hashmap lo añade
			if (!hashmap.keySet().contains(hashmap)) {
				// le añadimos el hashset con su conteo de caracteres
				hashmap.put(hashset, hashset.size());
			}
			System.out.println("Introduce un nombre, 0 para parar:");
			nombre = escaner.nextLine();
		}
		// comprobación
		// System.out.println(hashmap);
		// recorro todas las claves dentro del conjunto de valores del HashMap y las imprimo junto al valor.
		for (HashSet key : hashmap.keySet()) {
			System.out.println("El número de caracteres únicos de " + key + " es " + hashmap.get(key));
		}
		
		/*
		//Ejercicio 2: un programa que diga en que posición aparece cada letra de una string. Si
		//una letra aparece en varias posiciones, me dice todas esas posiciones.
		//Ejemplo: Aserejé --> {a-->0, s--> 1, e --> [2,4,6] ...} con hashmap
		
		//instancio la palabra a evaluar
		String palabra= "asereje";	
		
		//declaro un HashMap de char y de arraylist de integer para contener los índices por caracter.		
		HashMap<Character, ArrayList<Integer>> hashMap = new HashMap<>();
		//recorro la palabra
		for(int i = 0; i <palabra.length(); i++) {
			//busco el caracter que hay en cada índice
			char caracter = palabra.charAt(i);
			//si ya existe el caracter dentro del hashmap
			if(hashMap.containsKey(caracter)) {								
				//le añado el índice al arraylist de los índices, que es el valor contenido en la key caracter.
				hashMap.get(caracter).add(i);				
			}
			else {	
				//instancio el arrayList de los índices dentro del else, porque si no se guardan todas las posiciones en
				//todas las letras, así funciona correctamente (aunque sin un orden real porque es un hashMap)
				ArrayList<Integer> indices = new ArrayList<>();
				//le añado el índice
				indices.add(i);
				//se lo enchufo y creo cada keyset del hashmap.
				hashMap.put(caracter, indices);
			}				
		}
		//muestro el resultado final.
		System.out.println(hashMap);
		*/
	}
}
