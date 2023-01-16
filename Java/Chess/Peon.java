package ajedrez;

public class Peon extends Pieza {
	// instancio un booleano para el m�todo de moverse pero no se lo meto al constructor.
	private boolean moverse = true;

	// constructor de pe�n, no a�ade nada
	public Peon(boolean comida, boolean blanco) {
		super(comida, blanco);
	}

	// getter de moverse.
	public boolean isMoverse() {
		return moverse;
	}

	// sobreescribiendo el m�todo abstracto
	public boolean movimiento(int x1, int y1, int x2, int y2) {
		// comprobamos si la pieza es o no blanca porque cambian las reglas
		if (this.isBlanco()) {
			// luego el movimiento
			if (x1 == x2 && y2 - y1 == 1) {
				moverse = true;
			} else {
				moverse = false;
			}
		} else {
			if (x1 == x2 && y1 - y2 == 1) {
				moverse = true;
			} else {
				moverse = false;
			}
		}
		// comprobaci�n
		System.out.println(moverse);
		return moverse;
	}
}
