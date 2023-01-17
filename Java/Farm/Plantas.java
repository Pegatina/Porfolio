package pregunta1;
public class Plantas {
	private String especie;	
	private String estado = "semilla";
	
	public Plantas(String especie) {
		this.especie = especie;			
	}
	
	public String getEspecie() {
		return especie;
	}
	public void plantar(Granjas granja){
        if(this.estado=="semilla"){
            if(granja.getEspecie()==this.especie){
                this.estado="plantada";
                System.out.println("Se ha plantado la semilla");
            }
            else{
                System.out.println("Esa granja no admite esa especie");
            }
        }
        else{
            System.out.println("Esa planta no se puede plantar");
        }
    }
    
    public void regar(){
        if(this.estado=="plantada"){
            this.estado="brote";
            System.out.println("La planta ha crecido a brote");
        }
        else if(this.estado=="brote"){
            this.estado="madura";
            System.out.println("La planta ha madurado");
        }
        else if(this.estado=="semilla"){
            System.out.println("Hay que plantar la semilla antes");
        }
        else{
            System.out.println("Esa planta no puede crecer más");
        }         
	}
}
