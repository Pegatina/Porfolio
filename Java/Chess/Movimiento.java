package ajedrez;

public class Movimiento {
	//casilla de inicio y final (que tienen sus coordenadas)
	private Casilla casillaini;	
	private Casilla casillafin;
	
	//constructor con sus condiciones.
	public Movimiento(Casilla casillaini, Casilla casillafin) {	
		//se asignan normal
		this.casillaini = casillafin;
		this.casillafin = casillafin;		
		// si la casilla no tiene pieza
		if(casillaini.getPieza() == null) {			
			System.out.println("No hay pieza en la casilla inicial.");
		}
		else{
			//obtenemos la pieza de la casilla y usamos su método movimiento que devuelve un booleano true o false.
			if(casillaini.getPieza().movimiento(casillaini.getX(), casillaini.getY(), casillafin.getX(), casillafin.getY())
					== true) {								
				System.out.println("Se ha movido la pieza de la casilla (" + casillaini.getX() + "," + casillaini.getY() +
						") a la casilla (" + casillafin.getX() + "," + casillafin.getY() + ")");
				//le paso la pieza a la casilla final.
				casillafin.setPieza(casillaini.getPieza());
				//le quito la pieza a la casilla inicial.
				casillaini.setPieza(null);				
			}
			else {
				System.out.println("La pieza no puede moverse a esa casilla.");				
			}
		}	
	}	
	//getters y setters
	public Casilla getCasillaini() {
		return casillaini;
	}
	public void setCasillaini(Casilla casillaini) {
		this.casillaini = casillaini;
	}
	public Casilla getCasillafin() {
		return casillafin;
	}
	public void setCasillafin(Casilla casillafin) {
		this.casillafin = casillafin;
	}	
}
