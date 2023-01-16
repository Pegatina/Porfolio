package monsters;

public interface Tipo_fuego {
	String ventaja = "Planta"; // reglas de efectividad
	String debilidad = "Agua";
	String neutral = "Normal";

	default int efectividadFuego(Monster mon1, Monster mon2) {
		// hay que pasarle el tipo del otro pokemon y compararlos, si tiene ventaja el daño es mayor
		// si tiene debilidad quita menos que un ataque normal
		// si es neutral, pega igual.
		//si su clase es fuego
		if (mon1 instanceof Mon_Fuego) {			
			//si usa el ataque1 y el otro bicho es del tipo con ventaja
			if (mon1.isActivarAtaque1() && mon2 instanceof Mon_Planta) {
				//se multiplica el daño al doble que un ataque normal
				mon1.setDamage(10 * 2);
				//muestro el ataque
				System.out.println("¡Ha atacado con " + mon1.getAtaque1() + "!");
				//muestro la efectividad
				System.out.println("¡El ataque ha sido muy efectivo, el Fuego tiene ventaja contra " + ventaja);
				//Si usa el ataque 1 y son de la misma clase (por tanto, de los mismos tipos)
			} else if(mon1.isActivarAtaque1() && mon1.getClass() == mon2.getClass()) {
				//ataque normal
				mon1.setDamage(10);				
				//muestro el ataque
				System.out.println("¡Ha atacado con " + mon1.getAtaque1() + "!");
				//muestro la efectividad
				System.out.println("El ataque ha sido " + neutral);				
			}
		} else {
			System.out.println("No se ha usado el ataque correcto.");
		}
		//devuelvo el daño para restar luego a la vida
		return mon1.getDamage();
	}
}
