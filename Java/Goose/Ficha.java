package oca;
public class Ficha {
	private String color;
	private int casilla = 0;	
	
	public Ficha(String color) {
		this.color = color;
	}
	
	public void mover(int numero) {
		//le tenemos que dar un número para que avance, queremos que dé el resultado de lanzar el dado + casilla.	
		
		this.casilla+=numero;
		System.out.println("La ficha de color " + this.color + " se ha desplazado a la casilla " + this.casilla + ".");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCasilla() {
		return casilla;
	}
	public void setCasilla(int casilla) {
		this.casilla = casilla;
	}
}