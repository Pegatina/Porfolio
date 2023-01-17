package oca;
public class Jugador {
	private String nombre;
	private Ficha ficha;
	
	public Jugador(String nombre, Ficha ficha) {
		this.nombre = nombre;
		this.ficha = ficha;
	}
	
	public int lanzarDado(Dado dado) {
		System.out.println(this.nombre + " ha lanzado un dado de " + dado.getCaras());
		int resultado = dado.lanzar();		
		return resultado;
	}
	
	public void moverFicha(int numero) {		
		this.ficha.mover(numero);
	}
	
	// el siguiente m�todo junta los dos anteriores
    public void lanzarMover(Dado dado){
        int resultado=this.lanzarDado(dado);
        this.moverFicha(resultado);
    //  this.moverficha(this.lanzarDado(dado)); //Si quisi�ramos hacerlo en una sola l�nea
    }
	
	public String getNombre() {
		return nombre;
	}	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
}
	