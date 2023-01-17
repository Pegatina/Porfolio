package piedra_papel_tijera;
import java.util.Scanner;
public class Piedra_papel_tijera {

	public static void main(String[] args) {	
		//Piedra 1, papel 2, tijera 3.
		//Papel gana a piedra, piedra gana a tijera, tijera gana a papel.
		//La máquina genera un número aleatorio que va a ser la piedra, el papel o la tijera. Entre 1 2 o 3.
		//Humano: va a introducir por teclado el 1 2 o 3, contra la máquina que generará aleatoriamente 1 2 o 3.
		//Primero empieza el humano introduciendo el número. Luego la máquina.		
		
		boolean continuar = true;				
		
		do { //el do while se ejecuta sí o sí una vez aunque no se cumpla la condición. Se pone como el while pero el while abajo.
			try { //Capturando errores por si se introduce un caracter o un string.

				String resultado =""; 
				String numero = "";	  //Se deben inicializar porque si no se introduce 1 2 o 3 daría error si no.
				int random = (int)(Math.random()*3+1); //Genera un número aleatorio entre 1 y 3 de tipo flotante transformado a entero.
				
				if(random == 1) {
					resultado = "Piedra";			
				}
				else if(random == 2){
					resultado = "Papel";
				}
				else if(random == 3){
					resultado = "Tijeras";
				}
				System.out.print("Introduce un número, 1 para Piedra, 2 para Papel, 3 para Tijeras: ");
				Scanner escaner = new Scanner (System.in);
				int num = escaner.nextInt(); //parece ser que .next() recoge cualquier dato.
				
				if(num == 1) {
					numero = "Piedra";			
				}
				else if(num == 2){
					numero = "Papel";
				}
				else if (num == 3){
					numero = "Tijeras";
				}				
				if(num == 1 || num == 2 || num ==3) {
					System.out.println("Has elegido " + numero + ".");
					System.out.println("La máquina ha sacado " + resultado + ".");
				
					if(num == 1 && random == 3) { //Comparo los enteros y luego muestro el texto asignado para que sea más visual.				
						System.out.println("Piedra gana a Tijeras, ¡has ganado!");
						continuar = false;
					}
					else if(num == 1 && random == 2) {					
						System.out.println("Papel gana a Piedra, has perdido");
						continuar = false;
					}
					else if(num == random ) {
						System.out.println(numero + " empata con " + resultado + ", vuelve a intentarlo.");					
						continuar = true;	//Repetimos el while		
					}
					else if(num == 2 && random == 1) {					
						System.out.println("Papel gana a Piedra, ¡has ganado!");
						continuar = false;
					}
					else if(num == 2 && random == 3) {					
						System.out.println("Tijeras gana a Papel, has perdido");
						continuar = false;
					}
					else if(num == 3 && random == 1) {
						System.out.println("Piedra gana a Tijeras, has perdido");
						continuar = false;
					}
					else if (num == 3 && random == 2){
						System.out.println("Tijeras gana a Papel, ¡has ganado!");
						continuar = false;
					}
				}
				else {
				System.out.println("El número que has introducido no es válido.");
				continuar = true; //Repetimos el while si no introducimos 1 2 o 3.
				}				
			}
			catch(Exception e) { //Capturamos la excepción para que no se cierre el programa y se vuelve a ejecutar el bucle.
				System.out.println("El tipo de dato introducido no es válido.");
			}
		}while(continuar); //Se pone el while abajo cuando se usa un do.
	}
}
