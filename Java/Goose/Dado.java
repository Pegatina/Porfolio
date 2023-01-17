package oca;
public class Dado {
	private int caras;
	
	public Dado(int caras) {
		this.caras = caras;
	}	
	public int lanzar() {
		int resultado = (int)(Math.random()*(this.caras)+1);
		System.out.println("Ha salido un " + resultado + " en el dado.");
		return resultado;
	}
	
	public int getCaras() {
		return caras;
	}
	public void setCaras(int caras) {
		this.caras = caras;
	}
}
	
