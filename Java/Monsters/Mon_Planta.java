package monsters;

//herencia de Monster, con tipos mixtos, el segundo tipo de bicho.
public class Mon_Planta extends Monster implements Tipo_planta, Tipo_normal {
	// constructor
	public Mon_Planta(String ataque1, String ataque2) {
		super(ataque1, ataque2);
	}

	@Override
	public void atacar(Jugador jugador2, Monster mon2, Jugador jugador1, Monster mon1) {
		if (mon2.isActivarAtaque1()) {
			// interfaz planta, eclipse obliga a forzar el tipo.
			mon1.setVida(mon1.getVida() - ((Tipo_planta) mon2).efectividadPlanta(mon2, mon1));
			// lo desactivo para seguir jugando
			mon2.setActivarAtaque1(false);
			if (mon1.getVida() <= 0) {
				System.out.println("Ha ganado el jugador/a " + jugador2.getNombre());
			} else {
				System.out.println(
						"La vida del monstruo del jugador " + jugador1.getNombre() + " ha bajado a " + mon1.getVida());
			}
		} else if (mon2.isActivarAtaque2()) {
			// interfaz neutral
			mon1.setVida(mon1.getVida() - ((Tipo_normal) mon2).efectividadNeutral(mon2, mon1));
			// lo desactivo para seguir jugando
			mon2.setActivarAtaque2(false);
			if (mon1.getVida() <= 0) {
				System.out.println(
						"La vida del monstruo del jugador " + jugador1.getNombre() + " ha bajado a " + mon1.getVida());
				System.out.println("Ha ganado el jugador/a " + jugador2.getNombre());
			} else {
				System.out.println(
						"La vida del monstruo del jugador " + jugador1.getNombre() + " ha bajado a " + mon1.getVida());
			}
		}
	}

}
