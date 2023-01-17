package Televisores;

class Mando{
    
    private Televisor tv; //objeto televisor, atributo tv
    /*
    public void botonEncender(){
        if(this.tv.encendido){  // Vamos a tener un error porque encendido es privado de Televisor, necesitamos un método get en Televisor
        						//o cambiarlo a atributo público.
            this.tv.apagar();
        }
        else{
            this.tv.encender();
        }
    }*/    
    public void botonEncender(){
        if(this.tv.getEncendido()){  
            this.tv.apagar();
        }
        else{
            this.tv.encender();
        }
    }
    
    public Mando(Televisor tv){ //Constructor, tiene el mismo nombre de la clase y no tiene void.
        this.tv=tv;
    }
    
    public void botonSubirCanal(){
        this.tv.subirCanal();
    }
    
    public void botonBajarCanal(){
        this.tv.bajarCanal();
    }
    
    public void botonNumero(int numero){
        this.tv.cambiarCanal(numero);
    }    
}
