package Televisores;

public class Uso_Televisores {

    public static void main(String[] args) {
    	 // Ejercicio para clase: Instanciar más televisores y mandos y usar sus métodos.
        // Buscar una forma de reconfigurar mandos para que funcionen con un televisor distinto.         
       
        //Clase persona: nombre(String), edad(int), Despierto(bool), altura(double). Constructor, métodos get y set para cada atributo.
        //Métodos:  Levantar a encender televisor, coger el mando y cambiar canal.

        //Instanciar 4 personas, 3 televisores y 7 mandos. Hacer que una persona utilice todos los mandos.
        
        Televisor mi_tv=new Televisor(1);
        Televisor mi_tv2 = new Televisor(2);
        Televisor mi_tv3 = new Televisor(3);
        
        Mando mi_mando=new Mando(mi_tv);
        Mando mi_mando2 = new Mando(mi_tv);
        Mando mi_mando3 = new Mando(mi_tv2);
        Mando mi_mando4 = new Mando(mi_tv3);
        Mando mi_mando5 = new Mando(mi_tv);
        Mando mi_mando6 = new Mando(mi_tv2);
        Mando mi_mando7 = new Mando(mi_tv3);
        
        mi_tv.encender(); //Canal 1
        mi_mando.botonSubirCanal(); //2
        mi_mando.botonNumero(5); //5
        mi_mando.botonBajarCanal(); //4
        
        
        Persona mi_persona = new Persona("Gloria", 24, true, 1.65, mi_tv, mi_mando);
        Persona mi_persona2 = new Persona("Pepe", 35, false, 1.65, mi_tv, mi_mando2);
        Persona mi_persona3 = new Persona("María", 72, true, 1.53, mi_tv2, mi_mando3);
        Persona mi_persona4 = new Persona("Juan", 37, true, 1.75, mi_tv3, mi_mando4);
        
        mi_persona.LevantarseAEncender();
        mi_persona.cogerMandoYSubirCanal();
        mi_persona.cogerMandoYBajarCanal(); 
        mi_persona.cambiarACanal10();
        mi_persona.asignarMandoEncender(mi_mando2); //Apaga la tv porque ya estaba encendida.        
        
        mi_persona2.LevantarseAEncender();
        mi_persona2.cogerMandoYBajarCanal(); //Se puede con distinto mando cambiar el mismo televisor 
        									 //y con distinto televisor usar el mismo mando. 
        //Si queremos cambiar de canal con un mando a otra televisión, si no encendimos la televisión no va a poder cambiar de canal.
        
        mi_persona2.asignarMandoEncender(mi_persona.getMando()); //Le asignamos el mando de la otra persona.
        mi_persona3.asignarMandoEncender(mi_mando);
        mi_persona3.asignarMandoEncender(mi_mando2);
        mi_persona3.LevantarseAEncender();
        mi_persona3.asignarMandoEncender(mi_mando4);
        mi_persona3.asignarMandoEncender(mi_mando5);
        mi_persona3.asignarMandoEncender(mi_mando6);
        mi_persona3.asignarMandoEncender(mi_mando7);    
          
    }
}
