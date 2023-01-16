package adivina_numero;
import java.util.Scanner;

public class Adivina_numero {
	
	public static void main(String[]args) {
		
		System.out.print("Introduce un número entre 1 y 10: ");
		Scanner escaner = new Scanner (System.in);
		int numero = escaner.nextInt();
		
		int random = (int)(Math.random()*10+1);		
		int contador = 1;		
		while (numero !=random) { //Mientras que no aciertes se ejecuta el bucle.
			contador++;
			if(numero<random) {
				System.out.print(numero + ", el número a adivinar es más grande,");
				System.out.println(" estás en el intento: " + (contador-1));				
			}
			else if (numero>random) {
				System.out.print(numero + ", el número a adivinar es más pequeño,");
				System.out.println(" estás en el intento: " + (contador-1));
			}
			System.out.print("Introduce otro número (entre 1 y 10): ");
			numero = escaner.nextInt();
		}
		System.out.print("Felicidades, ganaste el juego");
		System.out.println(" en el intento: " + contador);
		
		System.out.println("Presione cualquier tecla para finalizar y luego enter\n");
		Scanner s = new Scanner(System.in);
		s.next();
			
	}		
}
