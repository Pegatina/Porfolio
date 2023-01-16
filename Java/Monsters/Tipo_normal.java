package monsters;

public interface Tipo_normal {	
	//este tipo no tiene ventaja sobre ninguno
	String debilidad = "Roca";
	String neutral = "Normal";
	
	//m�todo para ver la efectividad de este tipo, le paso los dos bichos.
	default int efectividadNeutral(Monster mon1, Monster mon2) { 
		//hay que pasarle el tipo del otro pokemon y compararlos, si tiene ventaja el da�o es mayor
		//si tiene debilidad quita menos que un ataque normal
		//si es neutral, pega igual.	
		//si pertenecen a un bicho o al otro, porque en este caso es una interfaz en com�n
		if(mon1 instanceof Mon_Fuego || mon1 instanceof Mon_Planta) {			
			//usa este ataque (el segundo en ambos casos) como aqu� no var�a el resultado entre tipos los omito
			if(mon1.isActivarAtaque2()) {		
				//da�o por defecto
				mon1.setDamage(10); 
				//muestro el nombre del ataque
				System.out.println("�Ha atacado con " + mon1.getAtaque2()+"!");
				//muestro la efectividad
				System.out.println("El ataque ha sido " + neutral);
			}
			else {
				System.out.println("El ataque elegido no se ha efectuado.");
			}			
		}
		//si no es de la interfaz normal, no puede usar ese ataque.
		else {
			System.out.println("El ataque elegido no es v�lido.");
		}
		//devuelvo el da�o para restar luego a la vida
		return mon1.getDamage();
	}		
}
