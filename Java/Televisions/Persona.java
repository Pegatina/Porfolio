package Televisores;
//Clase persona: nombre(String), edad(int), Despierto(bool), altura(double). Constructor, métodos get y set para cada atributo.
//Métodos:  Levantar a encender televisor, coger el mando y cambiar canal.

class Persona{	
	private String nombre;
	private int edad;
	private boolean despierto = true;
	private double altura; //Primero definimos los atributos, luego los asignamos en el constructor de la clase.
	
	private Televisor tv;
	private Mando mando; //Arraylist de mandos, le puedes poner tantos mandos como quieras.
	
	public Persona(String nombre, int edad, boolean despierto, double altura, Televisor tv, Mando mando) {
		this.nombre = nombre;
		this.edad = edad;
		this.despierto = despierto;
		this.altura = altura;
		this.tv = tv;
		this.mando = mando;
	}
	public String getNombre() { //Método get necesita el tipo de dato a devolver, invoca el atributo privado para poder usarlo.
		return nombre;
  	}  
	public void setNombre (String nombre) { //Método set necesita llamarse void porque no devuelve nada, solo asigna el atributo al objeto.
		this.nombre = nombre; 				//Necesita el tipo de dato pero en el paréntesis.
  }
  
  public int getEdad() {
  	return edad;
  }
  
  public void setEdad (int edad) {
  	this.edad = edad;
  }
  public boolean getDespierto() {
  	return despierto;
  }
  
  public void setDespierto (boolean despierto) {
  	this.despierto = despierto;
  }
  public double getAltura() {
  	return altura;
  }
  
  public void setAltura (double altura) {
  	this.altura = altura;
  }
  
  public void LevantarseAEncender() {
  	if(despierto) { 
  		System.out.println("La persona " + this.nombre + " se ha levantado a encender el televisor.");
  		this.tv.encender();
  	}
      else{
              System.out.println("La persona "+ this.nombre + " dormida no puede encender el televisor.");
      }
  }
  
  public void cogerMandoYSubirCanal() {    	
  	this.mando.botonSubirCanal();   
  }
  public void cogerMandoYBajarCanal() {    	
  	this.mando.botonBajarCanal();  	//miramos la lista de mandos y cogemos uno.
  }
  
  public void cambiarACanal10() {    	
  	this.tv.setCanal(10);
  	System.out.println("El televisor número " + this.tv.getNumero() + " ha cambiado al canal " + this.tv.getCanal());
  }
  public void asignarMandoEncender(Mando mandoNuevo) { //void porque no devuelve nada, solo ejecuta.
  	this.mando = mandoNuevo;  	
  	this.mando.botonEncender();
  	
  	//Para asignarle un mando distinto no podemos usar this porque es el propio de cada uno.
  }
  public Mando getMando() {
  	return mando;
  }
  
  public void setMando (Mando mando) {
  	this.mando = mando;
  }
}
