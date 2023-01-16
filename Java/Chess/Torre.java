package ajedrez;

public class Torre extends Pieza {
	// instancio un booleano para el método de moverse pero no se lo meto al constructor.
	private boolean moverse = true;

	// constructor de Torre, no añade nada
	public Torre(boolean comida, boolean blanco) {
		super(comida, blanco);
	}

	// getter de moverse.
	public boolean isMoverse() {
		return moverse;
	}

	// sobreescribiendo el método abstracto
	public boolean movimiento(int x1, int y1, int x2, int y2) {
		// dos tipos de movimiento.
		if (x1 == x2 || y1 == y2) {
			moverse = true;
		} else {
			moverse = false;
		}
		// comprobación
		System.out.println(moverse);
		return moverse;
	}
}
