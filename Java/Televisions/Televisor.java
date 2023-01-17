package Televisores;
class Televisor{ // Los nombres de las clases se escriben por defecto con la primera letra may�scula
    
    // Los atributos se definen por defecto privados
    private int numero; // Se inicia sin valor
    private int canal=1; // Se inicia con valor igual a 1
    private boolean encendido=false; // Se inicia con valor false
    
    //Los m�todos se definen por defecto p�blicos
    // Constructor de la clase. M�todo con el mismo nombre
    public Televisor(int numero){
        this.numero=numero;
    }
    
    public void encender(){
        this.encendido=true;
        System.out.println("El televisor n�mero " + this.numero + " se ha encendido en el canal " + this.canal);
    }
    
    public void apagar(){
        this.encendido=false;
        System.out.println("El televisor n�mero " + this.numero + " se ha apagado.");
    }
    
    public void subirCanal(){
        if(this.encendido){
            this.canal++;
            System.out.println("El televisor n�mero " + this.numero + " ha cambiado al canal " + this.canal);
        }
        else{
            System.out.println("El televisor no est� encendido y no puede cambiar de canal.");
        }
    }
    
    public void bajarCanal(){
        if(this.encendido){
            this.canal--;
            System.out.println("El televisor n�mero " + this.numero + " ha cambiado al canal " + this.canal);
        }
        else{
            System.out.println("El televisor no est� encendido y no puede cambiar de canal.");
        }
    }
    
    // M�todo con argumentos
    public void cambiarCanal(int canal){
        if(this.encendido){
            this.canal=canal;
            System.out.println("El televisor n�mero " + this.numero + " ha cambiado al canal " + this.canal);
        }
        else{
            System.out.println("El televisor no est� encendido y no puede cambiar de canal.");
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