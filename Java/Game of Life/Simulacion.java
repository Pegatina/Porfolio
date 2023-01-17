package vida;

public class Simulacion {
	int ancho;
	int largo;
	int [][] tablero;
	public Simulacion(int ancho, int largo) {		
		this.ancho = ancho;
		this.largo = largo;
		//le damos al tablero un tamaño
		this.tablero = new int [ancho][largo];
	}
	
	public void imprimirTablero() {
		System.out.println("__________");
		for (int y = 0; y < largo; y++) {
			String linea = "|";
			for (int x = 0; x < ancho; x++) {
				//si está muerta la celda
				if(this.tablero[x][y] == 0) {
					linea += ".";
				}else {
					linea +="*";
				}
			}
			linea += "|";
			System.out.println(linea); //imprime cada línea por ciclo
		}
		System.out.println("----------\n");
	}
	
	public void setVivo(int x, int y) {
		this.tablero[x][y] = 1;
	}
	public void setMuerto(int x, int y) {
		this.tablero[x][y] = 0;
	}
	
	/* Esto da error porque al leerlo como array no puedes darle un index negativo.
	 public int contarVecinosVivos(int x, int y) {
		int contador = 0;
		contador += this.tablero[x-1][y-1];
		contador += this.tablero[x][y-1];
		contador += this.tablero[x+1][y-1];
		
		contador += this.tablero[x-1][y];
		//aquí estaría la celda de la que partimos
		contador += this.tablero[x+1][y];
		
		contador += this.tablero[x-1][y+1];
		contador += this.tablero[x][y+1];
		contador += this.tablero[x+1][y+1];
		
		return contador;
	}
	*/
	public int contarVecinosVivos(int x, int y) {
		int contador = 0;
		contador += getEstado(x-1, y-1);
		contador += getEstado(x, y-1);
		contador += getEstado(x+1, y-1);
		
		contador += getEstado(x-1,y);
		//aquí estaría la celda de la que partimos
		contador += getEstado(x+1, y);
		
		contador += getEstado(x-1, y+1);
		contador += getEstado(x, y+1);
		contador += getEstado(x+1, y+1);
		
		return contador;
	}
	//esto hace que las celdas de fuera del array sean índice 0 para que no dé error.
	public int getEstado(int x, int y) {
		if(x < 0 || x >= ancho) {
			return 0;
		}
		if(y < 0 || y >= largo){
			return 0;			
		}
		return this.tablero[x][y];
	}
	
	public void continuar() {
		//hace falta crear un nuevo tablero
		int [][] tableroNuevo = new int[ancho][largo];
		for (int y = 0; y < largo; y++) {
			for (int x = 0; x < ancho; x++) {
				//variable que coge la función de contador en todo el tablero.
				int vecinosVivos = contarVecinosVivos(x,y);
				//si está viva la celda
				if(getEstado(x, y) == 1) {
					//pero tiene menos de 2 vecinos vivos
					if(vecinosVivos < 2) {
						//muere la celda
						tableroNuevo[x][y] = 0;
						//si tiene 2 o 3 vecinos
					}else if(vecinosVivos == 2 || vecinosVivos == 3){
						//vive
						tableroNuevo[x][y] = 1;
						//si hay más de 3
					}else if(vecinosVivos > 3) {
						//muere
						tableroNuevo[x][y] = 0;
					}
					//si la celda está muerta
				}else {
					//y tiene justo 3 vecinos vivos
					if(vecinosVivos == 3) {
						//nace/vive
						tableroNuevo[x][y] = 1;
					}					
				}
			}
		}
		//se le enchufa el nuevo tablero al tablero para actualizarlo
		this.tablero = tableroNuevo;
	}
	
	public static void main(String[] args) {
		//objeto simulacion con ancho y alto
		Simulacion simulacion = new Simulacion(8, 5);
		
		//por defecto todas están muertas, le damos vivas
		simulacion.setVivo(2, 2);
		simulacion.setVivo(3, 2);
		simulacion.setVivo(4, 2);
		
		//imprimimos el estado inicial
		simulacion.imprimirTablero();
		//lo actualizamos
		simulacion.continuar();
		//imprimimos...
		simulacion.imprimirTablero();
		simulacion.continuar();
		simulacion.imprimirTablero();		
	}
}
