package monsters;

//herencia de Monster, con tipos mixtos, el primer tipo de bicho.
public class Mon_Fuego extends Monster implements Tipo_fuego, Tipo_normal {

	// su constructor
	public Mon_Fuego(String ataque1, String ataque2) {
		super(ataque1, ataque2);
	}

	@Override
	public void atacar(Jugador jugador1, Monster mon1, Jugador jugador2, Monster mon2) {
		// si el bicho usa el primer ataque
		if (mon1.isActivarAtaque1()) {
			// reduzco la vida del segundo en base a la efectividad del ataque, definido en
			// la interfaz correspondiente, eclipse obliga a forzar el tipo
			mon2.setVida(mon2.getVida() - ((Tipo_fuego) mon1).efectividadFuego(mon1, mon2));
			// lo desactivo para seguir jugando
			mon1.setActivarAtaque1(false);
			// si fallece
			if (mon2.getVida() <= 0) {
				// gana el otro
				System.out.println("Ha ganado el jugador/a " + jugador1.getNombre());
			}
			// si todavía sigue vivo, muestro la vida restante.
			else {
				System.out.println(
						"La vida del monstruo del jugador " + jugador2.getNombre() + " ha bajado a " + mon2.getVida());
			}
		}
		// si usa el otro ataque
		else if (mon1.isActivarAtaque2()) {
			// lo mismo que en el anterior, pero con la otra interfaz.
			mon2.setVida(mon2.getVida() - ((Tipo_normal) mon1).efectividadNeutral(mon1, mon2));
			// lo desactivo para seguir jugando
			mon1.setActivarAtaque2(false);
			if (mon2.getVida() <= 0) {
				System.out.println("La vida del monstruo del jugador " + jugador2.getNombre() + " ha bajado a " + mon2.getVida());
				System.out.println("Ha ganado el jugador/a " + jugador1.getNombre());
			} else {
				System.out.println(
						"La vida del monstruo del jugador " + jugador2.getNombre() + " ha bajado a " + mon2.getVida());
			}
		}
	}
}
