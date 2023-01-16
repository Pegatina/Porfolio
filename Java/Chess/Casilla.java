package ajedrez;

public class Casilla {
	// atributos
	private int x;
	private int y;
	private Pieza pieza;

	// constructor
	public Casilla(int x, int y, Pieza pieza) {
		// comprobamos con booleanos que los números estén dentro del rango necesario.
		boolean correctox = true;
		boolean correctoy = true;
		if ((x < 0 || x > 7) && (y < 0 || y > 7)) {
			correctox = false;
			correctoy = false;
			System.out.println("Los valores introducidos en x e y no son correctos.");
		} else if (x < 0 || x > 7) {
			correctox = false;
			System.out.println("El valor introducido en x no es correcto.");
		} else if (y < 0 || y > 7) {
			correctoy = false;
			System.out.println("El valor introducido en y no es correcto.");
			// si son correctos, asigno las coordenadas
		} else {
			if (correctox) {
				this.x = x;
			}
			if (correctoy) {
				this.y = y;
			}
		}
		// si ambos son correctos, asigno la pieza.
		if (correctox && correctoy) {
			this.pieza = pieza;
		} else {
			System.out.println("No se ha podido asignar la pieza a una casilla no válida.");
		}
	}
	// otro constructor para casilla ya que podemos instanciar casillas sin pieza en
	// ellas.
	public Casilla(int x, int y) {
		// comprobamos con un booleano que los números estén dentro del rango necesario.
		boolean correctox = true;
		boolean correctoy = true;
		if ((x < 0 || x > 7) && (y < 0 || y > 7)) {
			correctox = false;
			correctoy = false;
			System.out.println("Los valores introducidos en x e y no son correctos.");
		} else if (x < 0 || x > 7) {
			correctox = false;
			System.out.println("El valor introducido en x no es correcto.");
		} else if (y < 0 || y > 7) {
			correctoy = false;
			System.out.println("El valor introducido en y no es correcto.");
		} else {
			if (correctox) {
				this.x = x;
			}
			if (correctoy) {
				this.y = y;
			}
		}
	}
	// getters y setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}
}
