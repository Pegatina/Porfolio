package vida;
import java.util.ArrayList;
public class Tablero {
	private int ancho; //N
	private int largo; //M
	private ArrayList<Celdas> celdas;
	private int [][] tablero;
	
	public Tablero(int ancho, int largo, ArrayList<Celdas> celdas) {
		this.ancho = ancho;
		this.largo = largo;
		this.celdas = celdas;
		this.tablero = new int[ancho][largo];
	}
	

}
