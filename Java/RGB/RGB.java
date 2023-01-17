package RGB;
import java.io.IOException; //Para el método de cierre.
import java.util.Scanner;	
public class RGB {
	public static void main(String[] args) {
		Scanner SC= new Scanner (System.in);
	    String L; 
	    String palabra;
	    do {
	    	System.out.print("***********\n");
	       	System.out.print("R. Rojo\n");
	       	System.out.print("G. Verde\n");
	       	System.out.print("B. Azul\n");
	       	System.out.print("***********\n\n");
	        	
	       	L = SC.nextLine(); //La consola coge los números como String así que no va a saltar nunca una excepción de ese tipo.
	        	
	       	if( L.equalsIgnoreCase("R")){ //Para que acepte tanto R y r. Es el == (comparador booleano) de los Strings.
	       		palabra = "Rojo";
	        	System.out.println("Has pulsado " + palabra);	        		
	        }
	        else if( L.equalsIgnoreCase("G")){
	        	palabra = "Verde";
	        	System.out.println("Has pulsado " + palabra);
	        }
	        else if( L.equalsIgnoreCase("B")){
	        	palabra = "Azul";
	        	System.out.println("Has pulsado " + palabra);
	        }
	        else {
	        	System.out.println("El dato introducido no es válido");
	        	System.out.println();
	        }
	    } while(!L.equalsIgnoreCase("R") && !L.equalsIgnoreCase("G") && !L.equalsIgnoreCase("B"));   	         
	       
	     /*System.out.println("Presione cualquier tecla para finalizar y luego enter");   
	     Scanner s = new Scanner(System.in);
	     s.next();*/
	    
	    System.out.println("Presione enter para finalizar"); 
	    try {
	    	System.in.read();      //Ahora se cierra pulsando enter Necesita una importación del try catch
		}catch (IOException e) {  //Eclipse lo genera automáticamente tanto el try catch como la importación.	
			e.printStackTrace();
		}
	}
}
