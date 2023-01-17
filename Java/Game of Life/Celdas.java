package vida;

import java.util.ArrayList;

public class Celdas {
	private boolean viva = false;
	private int x;
	private int y;
	private boolean viva_next_gen = false;
	private int contador = 0;

	public Celdas(boolean viva, int x, int y) {
		this.viva = viva;
		this.x = x;
		this.y = y;
	}

	public boolean isViva() {
		return viva;
	}

	public void setViva(boolean viva) {
		this.viva = viva;
	}

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

	public boolean isViva_next_gen() {
		return viva_next_gen;
	}

	public void setViva_next_gen(boolean viva_next_gen) {
		this.viva_next_gen = viva_next_gen;
	}

	// recorro los vecinos (el cuadrado alrededor de la celda) pasándole todo el
	// tablero con sus celdas.
	public int mirarVecinos(ArrayList<ArrayList<Celdas>> tablero) {
		for (int n = -1; n <= 1; n++) {
			for (int m = -1; m <= 1; m++) {
				// si no es la celda a la que apuntamos
				if (!(n == 0 && m == 0)) {
					// si alguna celda alrededor está viva, aumento el contador.
					if (tablero.get(x + n).get(y + m).isViva()) {
						contador++;
					}
				}
			}
		} // obtengo el número para metérselo a otra función
		return contador;
	}
	//pasarle el mirar vecinos y el tablero otra vez, actualizar celdas, mirarlo bien.
	public void actualizarse(int contador, ArrayList<ArrayList<Celdas>> tablero, int ancho, int largo) {
		int [][] tableroNuevo = new int[ancho][largo];
		for (int n = -1; n <= 1; n++) {
			for (int m = -1; m <= 1; m++) {			
					// reglas
					//if (contador) {
						//viva_next_gen.
						
					
				}
			}

		}
		// actualizarse ¿reglas?
	
}
