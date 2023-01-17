package oca;
import java.io.IOException;
import java.util.Scanner;
public class Oca {
	
	public static void main(String[] args) {		
		
		Ficha ficha1 = new Ficha("");
		Ficha ficha2 = new Ficha ("");
		Ficha ficha3 = new Ficha("");
		Ficha ficha4 = new Ficha("");
		
		Jugador jugador1 = new Jugador("", ficha1); //Instanciamos objetos de las clases creadas
		Jugador jugador2 = new Jugador("", ficha2);
		Jugador jugador3 = new Jugador("", ficha3);
		Jugador jugador4 = new Jugador("", ficha4);
		
		Dado dado1 = new Dado(1);
		Dado dado2 = new Dado(2);
		
		System.out.println("¡Bienvenido/a, jugador/a 1! por favor, introduzca su nombre: ");		
		Scanner escaner = new Scanner(System.in);
		jugador1.setNombre(escaner.nextLine());			
		System.out.println("Ahora, introduzca el color de su ficha: ");
		jugador1.getFicha().setColor(escaner.nextLine());					
		
		System.out.println("¡Bienvenido/a, jugador/a 2! por favor, introduzca su nombre: ");		
		jugador2.setNombre(escaner.nextLine());			
		System.out.println("Ahora, introduzca el color de su ficha: ");
		jugador2.getFicha().setColor(escaner.nextLine());
		
		System.out.println("¡Bienvenido/a, jugador/a 3! por favor, introduzca su nombre: ");		
		jugador3.setNombre(escaner.nextLine());			
		System.out.println("Ahora, introduzca el color de su ficha: ");
		jugador3.getFicha().setColor(escaner.nextLine());
		
		System.out.println("¡Bienvenido/a, jugador/a 4! por favor, introduzca su nombre: ");		
		jugador4.setNombre(escaner.nextLine());			
		System.out.println("Ahora, introduzca el color de su ficha: ");
		jugador4.getFicha().setColor(escaner.nextLine());
		
		System.out.println("Ahora, introducid el número de caras del primer dado con el que vais a jugar: ");
		dado1.setCaras(escaner.nextInt());
		
		System.out.println("Ahora, introducid el número de caras del segundo dado con el que vais a jugar: ");
		dado2.setCaras(escaner.nextInt());
		
		System.out.println("Jugador/a: " + jugador1.getNombre() + " con ficha color: " + jugador1.getFicha().getColor());
		System.out.println("Jugador/a: " + jugador2.getNombre() + " con ficha color: " + jugador2.getFicha().getColor());
		System.out.println("Jugador/a: " + jugador3.getNombre() + " con ficha color: " + jugador3.getFicha().getColor());
		System.out.println("Jugador/a: " + jugador4.getNombre() + " con ficha color: " + jugador4.getFicha().getColor());	
		System.out.println();	
		
		 escaner.nextLine(); // Para forzar a Java a leer la línea que hemos escrito para el int
		
		System.out.println("¡Comienza la partida!\n");	
		boolean continuar = true;	
		Jugador jugador= jugador4; //asignamos el turno para que al iniciar comience por el 1 al invertirlo.
		
		while(continuar) {			
            if(jugador == jugador1){ //comparamos
                jugador = jugador2; //asignamos
            }
            else if (jugador == jugador2){
                jugador = jugador3;
            }
            else if (jugador == jugador3) {
            	jugador = jugador4;
            }
            else{
            	jugador = jugador1;
            }
            
            System.out.println("Es el turno de " + jugador.getNombre());
            System.out.println("Presiona enter para jugar el turno.");
            
            escaner.nextLine(); // Esta línea detiene la ejecución cada turno, sin ella se juegan todos de golpe
            
			if(jugador == jugador1) {
				
            int resultado1= jugador1.lanzarDado(dado1) + jugador1.lanzarDado(dado2);
			jugador1.moverFicha(resultado1);
			}
			else if(jugador == jugador2) {
				int resultado2= jugador2.lanzarDado(dado1) + jugador2.lanzarDado(dado2);	
				jugador2.moverFicha(resultado2);	//preparamos el movimiento del juego de cara al rebote.
			}
			else if(jugador == jugador3) {
				int resultado3= jugador3.lanzarDado(dado1) + jugador3.lanzarDado(dado2);	
				jugador3.moverFicha(resultado3);	//preparamos el movimiento del juego de cara al rebote.
			}
			else {							
				int resultado4= jugador4.lanzarDado(dado1) + jugador4.lanzarDado(dado2);	
				jugador4.moverFicha(resultado4);
			}            
			
			if(jugador1.getFicha().getCasilla()==63) {
				System.out.println("Jugador/a " + jugador1.getNombre() + " con ficha " + jugador1.getFicha().getColor()
						+ " ha ganado ¡felicidades!\n");
				continuar = false;
			}
			else if(jugador2.getFicha().getCasilla()==63) {
				System.out.println("Jugador/a " + jugador2.getNombre() + " con ficha " + jugador2.getFicha().getColor()
				+ " ha ganado ¡felicidades!\n");
				continuar = false;
			}
			else if(jugador3.getFicha().getCasilla()==63) {
				System.out.println("Jugador/a " + jugador3.getNombre() + " con ficha " + jugador3.getFicha().getColor()
				+ " ha ganado ¡felicidades!\n");
				continuar = false;
			}
			else if(jugador4.getFicha().getCasilla()==63) {
				System.out.println("Jugador/a " + jugador4.getNombre() + " con ficha " + jugador4.getFicha().getColor()
				+ " ha ganado ¡felicidades!\n");
				continuar = false;
			}
			else if ((jugador1.getFicha().getCasilla() > 63) && (jugador2.getFicha().getCasilla() > 63) && 
					(jugador3.getFicha().getCasilla() > 63) && (jugador4.getFicha().getCasilla() > 63)) {
				int resto1 = jugador1.getFicha().getCasilla() - 63; //63 es la meta. Rebotamos si nos pasamos.
				int CF1 = 63 - resto1;
				jugador1.getFicha().setCasilla(CF1);
				System.out.println("\n¡No puedes pasarte! "+ jugador1.getFicha().getColor() +" vuelve a "
				+ jugador1.getFicha().getCasilla());
				System.out.println();
				
				int resto2 = jugador2.getFicha().getCasilla() - 63; //63 es la meta. Rebotamos si nos pasamos.
				int CF2 = 63 - resto2; //Casilla final es la casilla 63 - lo que sobra de la tirada.
				jugador2.getFicha().setCasilla(CF2);
				System.out.println("\n¡No puedes pasarte! " + jugador2.getFicha().getColor() + " vuelve a "
				+ jugador2.getFicha().getCasilla());
				System.out.println();	
				
				int resto3 = jugador3.getFicha().getCasilla() - 63; //63 es la meta. Rebotamos si nos pasamos.
				int CF3 = 63 - resto3; //Casilla final es la casilla 63 - lo que sobra de la tirada.
				jugador3.getFicha().setCasilla(CF3);
				System.out.println("\n¡No puedes pasarte! " + jugador3.getFicha().getColor() + " vuelve a "
				+ jugador3.getFicha().getCasilla());
				System.out.println();	
				
				int resto4 = jugador4.getFicha().getCasilla() - 63; //63 es la meta. Rebotamos si nos pasamos.
				int CF4 = 63 - resto4; //Casilla final es la casilla 63 - lo que sobra de la tirada.
				jugador4.getFicha().setCasilla(CF4);
				System.out.println("\n¡No puedes pasarte! " + jugador4.getFicha().getColor() + " vuelve a "
				+ jugador4.getFicha().getCasilla());
				System.out.println();	
			}
			else if(jugador1.getFicha().getCasilla() > 63) {
				int resto1 = jugador1.getFicha().getCasilla() - 63; //63 es la meta. Rebotamos si nos pasamos.
				int CF1 = 63 - resto1;
				jugador1.getFicha().setCasilla(CF1);
				System.out.println("\n¡No puedes pasarte! "+ jugador1.getFicha().getColor() +" vuelve a "
				+ jugador1.getFicha().getCasilla());
				System.out.println();
			}
			else if(jugador2.getFicha().getCasilla() > 63) {
				int resto2 = jugador2.getFicha().getCasilla() - 63; //63 es la meta. Rebotamos si nos pasamos.
				int CF2 = 63 - resto2;
				jugador2.getFicha().setCasilla(CF2);
				System.out.println("\n¡No puedes pasarte! " + jugador2.getFicha().getColor() + " vuelve a "
				+ jugador2.getFicha().getCasilla());
				System.out.println();
			}	
			else if(jugador3.getFicha().getCasilla() > 63) {
				int resto3 = jugador3.getFicha().getCasilla() - 63; //63 es la meta. Rebotamos si nos pasamos.
				int CF3 = 63 - resto3;
				jugador3.getFicha().setCasilla(CF3);
				System.out.println("\n¡No puedes pasarte! " + jugador3.getFicha().getColor() + " vuelve a "
				+ jugador3.getFicha().getCasilla());
				System.out.println();
			}
			else if(jugador4.getFicha().getCasilla() > 63) {
				int resto4 = jugador4.getFicha().getCasilla() - 63; //63 es la meta. Rebotamos si nos pasamos.
				int CF4 = 63 - resto4;
				jugador4.getFicha().setCasilla(CF4);
				System.out.println("\n¡No puedes pasarte! " + jugador4.getFicha().getColor() + " vuelve a "
				+ jugador4.getFicha().getCasilla());
				System.out.println();
			}
			
			System.out.println();
		}
		
		System.out.println("Presione enter para finalizar"); 
	    try {
	    	System.in.read();      //Ahora se cierra pulsando enter. Necesita una importación del try catch
		}catch (IOException e) {  //Eclipse lo genera automáticamente tanto el try catch como la importación.	
			e.printStackTrace();
		}
	}
}
