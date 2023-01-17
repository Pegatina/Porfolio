package practica1;
import java.util.ArrayList;
import java.util.Scanner;
public class practica1 {

	public static void main(String[] args) {			
		/* Oculto los ejercicios 1 y 2 para no mezclar resultados
		//Al resultado del ejercicio1 (un arrayList de números determinados) lo recogemos en un nuevo ArrayList 
		
		//para poder utilizarlo en el siguiente ejercicio.
		
		//Para ello instanciamos un nuevo ArrayList
		ArrayList<Integer> ejercicio1 = new ArrayList<>();
		//y le añadimos el resultado, así podemos ejecutar el primer ejercicio y seguir trabajando con él en el segundo.
		ejercicio1 = ejercicios.ejercicio1();
		//esta función coge el arraylist del primer ejercicio y devuelve el número máximo, el mínimo y la media.
		ejercicios.ejercicio2(ejercicio1);
		*/
		//ejercicios.ejercicio3();
		//ejercicios.ejercicio4();
		//ejercicios.ejercicio5();
		//ejercicios.ejercicio6();
		//ejercicios.ejercicio7();
		//ejercicios.ejercicio8();
		
		// creamos un objeto Scanner para introducir datos por teclado para los ejercicios 9 y 10
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para determinar si es primo o no: ");
		//Asigno el dato a una variable.
		int num = sc.nextInt();
		//ejercicios.ejercicio9(num);
		
		// como en el segundo ejercicio, declaro una variable que recoja el resultado del ejercicio 9 para usarlo en el 10.
		boolean ejercicio9 = ejercicios.ejercicio9(num);
		ejercicios.ejercicio10(ejercicio9, num);		
	}
}
