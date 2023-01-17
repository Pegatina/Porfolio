package pregunta1;
public class Granjeros {
	private String nombre;
	private Granjas granja;
	
	public Granjeros(String nombre, Granjas granja) {
		this.nombre = nombre;
		this.granja = granja;
	}	
	
	public void plantar(Plantas planta) {		
		System.out.println("El granjero " + this.nombre + " ha plantado una planta de " + planta.getEspecie());
		planta.plantar(this.granja);
	}
	public void regar(Plantas planta) {		
		System.out.println("El granjero " + this.nombre + " ha regado una planta de " + planta.getEspecie());
		planta.regar();
	}
}
