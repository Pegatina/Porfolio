package ajedrez;
//instancio la clase abstracta
public abstract class Pieza {
	//declaro sus dos booleanos
	private boolean comida;
	private boolean blanco;	
	//constructor
	public Pieza(boolean comida, boolean blanco) {
		this.comida = comida;
		this.blanco = blanco;		
	}
	
	//instancio los getters y setters correspondientes	
	public boolean isComida() {
		return comida;
	}
	public void setComida(boolean comida) {
		this.comida = comida;
	}
	public boolean isBlanco() {
		return blanco;
	}
	public void setBlanco(boolean blanco) {
		this.blanco = blanco;
	}	

	//método booleano que heredará y definirá cada clase que herede de pieza.
	public abstract boolean movimiento(int x1, int y1, int x2, int y2);
	//se define en cada pieza porque se sobreescribe.
}
