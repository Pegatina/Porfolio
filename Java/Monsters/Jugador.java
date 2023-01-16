package monsters;

public class Jugador {
	// atributos
	private String nombre;
	private Monster mon;

	// constructor
	public Jugador(String nombre, Monster mon) {
		this.nombre = nombre;
		this.mon = mon;
	}

	// setters y getters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	// el bicho ya está asignado en el constructor.
	public Monster getMon() {
		return mon;
	}

	// método con el cual se juega, pido un numero (string para evitar problemas), con los dos jugadores, sus dos
	// bichos y sus dos ataques.
	public void luchar(String num, Jugador jugador1, Monster mon1, Jugador jugador2, Monster mon2) {
		// métodos del bicho dentro del jugador
		if (num.equals("1")) {
			//le doy true al ataque que quiero.
			mon1.setActivarAtaque1(true);		
			mon1.atacar(jugador1, mon1, jugador2, mon2);
			//lo deshabilito
			mon1.setActivarAtaque1(false);		
		} else if (num.equals("2")) {
			mon1.setActivarAtaque2(true);		
			mon1.atacar(jugador1, mon1, jugador2, mon2);
			mon1.setActivarAtaque2(false);		
		} else if (num.equals("3")) {
			mon2.setActivarAtaque1(true);		
			mon2.atacar(jugador2, mon2, jugador1, mon1);
			mon2.setActivarAtaque1(false);		
		} else if (num.equals("4")) {
			mon2.setActivarAtaque2(true);		
			mon2.atacar(jugador2, mon2, jugador1, mon1);
			mon2.setActivarAtaque1(false);		
		}
		else {
			System.out.println("El número introducido no es válido.");
		}
	}
}
