package Televisores;
class Televisor{ // Los nombres de las clases se escriben por defecto con la primera letra mayúscula
    
    // Los atributos se definen por defecto privados
    private int numero; // Se inicia sin valor
    private int canal=1; // Se inicia con valor igual a 1
    private boolean encendido=false; // Se inicia con valor false
    
    //Los métodos se definen por defecto públicos
    // Constructor de la clase. Método con el mismo nombre
    public Televisor(int numero){
        this.numero=numero;
    }
    
    public void encender(){
        this.encendido=true;
        System.out.println("El televisor número " + this.numero + " se ha encendido en el canal " + this.canal);
    }
    
    public void apagar(){
        this.encendido=false;
        System.out.println("El televisor número " + this.numero + " se ha apagado.");
    }
    
    public void subirCanal(){
        if(this.encendido){
            this.canal++;
            System.out.println("El televisor número " + this.numero + " ha cambiado al canal " + this.canal);
        }
        else{
            System.out.println("El televisor no está encendido y no puede cambiar de canal.");
        }
    }
    
    public void bajarCanal(){
        if(this.encendido){
            this.canal--;
            System.out.println("El televisor número " + this.numero + " ha cambiado al canal " + this.canal);
        }
        else{
            System.out.println("El televisor no está encendido y no puede cambiar de canal.");
        }
    }
    
    // Método con argumentos
    public void cambiarCanal(int canal){
        if(this.encendido){
            this.canal=canal;
            System.out.println("El televisor número " + this.numero + " ha cambiado al canal " + this.canal);
        }
        else{
            System.out.println("El televisor no está encendido y no puede cambiar de canal.");
        }
    }
    
    public int getNumero() { //Recuperar el valor de un atributo
    	return numero;
    }
    
    public void setNumero (int numero) { //Cambiar el valor del atributo
    	this.numero = numero; 			 //Parecido a un constructor, pero afecta solo a un atributo.
    }
    
    public int getCanal() {
    	return canal;
    }
    
    public void setCanal (int canal) {
    	this.canal = canal;
    }
    
    public boolean getEncendido(){
    	return this.encendido;
    }
    
}