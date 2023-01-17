package rombo;
import java.util.Scanner;
public class Rombo {
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduzca el valor de N:");
		int n = escaner.nextInt();
		for(int i = 1; i<=n; i++){ //i controla las filas, por eso los 3 for j anidados son iguales en ambos lados. Y solo varían por el for i padre.	    
		   for (int j=1; j<=(n-i);j++){ //asteriscos descendentes, partiendo del 1, imprime hasta que se llega a n-1
		        System.out.print("*");//mayor a menor según crece i.
				}
		    for (int j=1;j<=i;j++){ //la fila "j" tiene "i" entradas, pirámide de números dobles ascendente.  Cuanto mayor es j, más veces imprimo i hasta que se iguala i a 2n;              
		        System.out.print(i);
		        System.out.print(i);
		           		        }
		    for (int j=1; j<=(n-i);j++){ //asteriscos descendentes.
		    	System.out.print("*");
				}         
		    System.out.println();//para pasar a la siguiente fila al acabar cada ciclo for i (for padre).  
		}
		for (int i=n; i>0; i--) { //invertida                 
		    for (int j=1; j<=(n-i);j++){ //asteriscos ascendentes, partiendo de 1, al principio no imprime y luego imprime hasta n-1 porque no entra en n
		    	System.out.print("*");
				}
		    for (int j=1;j<=i;j++){ //la fila "j" tiene "i" entradas                 
		    	System.out.print(i);
		        System.out.print(i);      
		        }
		    for (int j=1; j<=(n-i);j++){ //asteriscos ascendentes.
		    	System.out.print("*");
				}         
		    System.out.println();//para pasar a la siguiente fila 
		}
	}

}
