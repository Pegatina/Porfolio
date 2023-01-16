package monsters;

//import para hacer las cosas más jugables
import java.util.Scanner;

//main del juego
public class Arena {

	public static void main(String[] args) {
		Mon_Planta mon1 = new Mon_Planta("hoja afilada", "placaje");
		//para probar lo del mismo tipo
		//Mon_Fuego mon1 = new Mon_Fuego("ascuas", "arañazo");
		Mon_Fuego mon2 = new Mon_Fuego("ascuas", "arañazo");
		Jugador jugador1 = new Jugador("", mon1);
		Jugador jugador2 = new Jugador("", mon2);

		// Para elegir el nombre por consola
		System.out.println("¡Bienvenido/a, jugador/a 1! por favor, introduzca su nombre: ");
		// objeto escáner
		Scanner escaner = new Scanner(System.in);
		// asigno el nombre escrito por teclado.
		jugador1.setNombre(escaner.nextLine());
		// lo mismo con el 2
		System.out.println("¡Bienvenido/a, jugador/a 2! por favor, introduzca su nombre: ");
		Scanner escaner2 = new Scanner(System.in);
		jugador2.setNombre(escaner2.nextLine());

		System.out.println("¡Comienza la partida!\n");
		// booleano para el while, por defecto se juega.
		boolean continuar = true;

		// asigno el turno para que al iniciar comience por el 1 al invertirlo.
		Jugador jugador = jugador2;

		while (continuar) {

			if (jugador == jugador1) { // comparo
				jugador = jugador2; // asigno
			} else {
				jugador = jugador1;
			}

			System.out.println("Es el turno de " + jugador.getNombre());
			System.out.println("Presione enter para jugar el turno.");
			escaner.nextLine(); // Esta línea detiene la ejecución cada turno, sin ella se juegan todos de golpe

			// si el jugador es el 1
			if (jugador == jugador1) {
				// menú de elegir ataque
				System.out.println("Elija un ataque:\n1 para " + jugador1.getMon().getAtaque1() + "\n2 para "
						+ jugador1.getMon().getAtaque2());
				//lo hago como cadena para que no dé problemas de tipos.
				String ataque = escaner2.nextLine();
				boolean continuar2 = true;
				// fuerzo a usar estos números porque el método engloba los 4 movimientos.
				while (continuar2) {
					//para comparar una string se usa equals, == no funciona bien.
					if (ataque.equals("1") || ataque.equals("2")) {
						// pelean
						jugador1.luchar(ataque, jugador1, mon1, jugador2, mon2);
						continuar2 = false;

					} else {
						// repito el ciclo para asegurar que no sale del camino.

						System.out.println("Elija un ataque válido:\n1 para " + jugador1.getMon().getAtaque1()
								+ "\n2 para " + jugador1.getMon().getAtaque2());
						ataque = escaner2.nextLine();
					}
				}
				// jugador 2
			} else {
				// menú de elegir ataque
				System.out.println("Elija un ataque:\n3 para " + jugador2.getMon().getAtaque1() + "\n4 para "
						+ jugador2.getMon().getAtaque2());
				String ataque = escaner2.nextLine();
				boolean continuar3 = true;
				// fuerzo a usar estos números porque el método engloba los 4 movimientos.
				while (continuar3) {
					if (ataque.equals("3") || ataque.equals("4")) {
						// pelean
						jugador2.luchar(ataque, jugador1, mon1, jugador2, mon2);
						continuar3 = false;
					} else {
						// repito el ciclo para asegurar que no sale del camino.

						System.out.println("Elija un ataque válido:\n3 para " + jugador2.getMon().getAtaque1()
								+ "\n4 para " + jugador2.getMon().getAtaque2());
						ataque = escaner2.nextLine();
					}
				}
			}
			// si alguno de los bichos llega a 0, se acaba el juego.
			if (jugador1.getMon().getVida() <= 0 || jugador2.getMon().getVida() <= 0) {
				continuar = false;
			}
		}
	}

}
