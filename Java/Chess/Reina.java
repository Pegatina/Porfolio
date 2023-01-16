package ajedrez;

public class Reina extends Pieza {
	// instancio un booleano para el método de moverse pero no se lo meto al constructor.
	private boolean moverse = true;

	// constructor de la Reina, no añade nada
	public Reina(boolean comida, boolean blanco) {
		super(comida, blanco);
	}

	// getter de moverse.
	public boolean isMoverse() {
		return moverse;
	}
	// sobreescribiendo el método abstracto
	public boolean movimiento(int x1, int y1, int x2, int y2) {
		// Math.abs devuelve el valor absoluto.
		// Tres movimientos distintos.
		if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
			moverse = true;
		} else {
			moverse = false;
		}
		// comprobación
		System.out.println(moverse);
		return moverse;
	}
}
