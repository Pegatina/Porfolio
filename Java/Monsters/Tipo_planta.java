package monsters;

public interface Tipo_planta {
	String ventaja = "Agua"; // reglas de efectividad
	String debilidad = "Fuego";
	String neutral = "Normal";

	//método para ver la efectividad de este tipo, le paso los dos bichos.
	default int efectividadPlanta(Monster mon2, Monster mon1) {
		// hay que pasarle el tipo del otro pokemon y compararlos, si tiene ventaja el daño es mayor
		// si tiene debilidad quita menos que un ataque normal
		// si es neutral, pega igual.
		//si su clase es planta
		if (mon2 instanceof Mon_Planta) {			
			//si usa el ataque1 y el otro bicho es del tipo con desventaja
			if (mon2.isActivarAtaque1() && mon1 instanceof Mon_Fuego) {
				//el daño es la mitad de efectivo que el daño normal
				mon2.setDamage(10 / 2);
				//muestro el ataque
				System.out.println("¡Ha atacado con " + mon2.getAtaque1()+"!");
				//muestro la efectividad
				System.out.println("El ataque ha sido poco efectivo, la Planta tiene debilidad contra " + debilidad);
				//Si usa el ataque 1 y son de la misma clase (por tanto, de los mismos tipos)
			} else if(mon2.isActivarAtaque1() && mon2.getClass() == mon1.getClass()) {
				//ataque normal
				mon2.setDamage(10);				
				//muestro el ataque
				System.out.println("¡Ha atacado con " + mon2.getAtaque1() + "!");
				//muestro la efectividad
				System.out.println("El ataque ha sido " + neutral);				
			}
		} else {
			System.out.println("No se ha usado el ataque correcto.");
		}
		//devuelvo el daño para restar luego a la vida
		return mon2.getDamage();
	}
}
