package banco;
//importación del Scanner
import java.util.Scanner;
//clase que hereda de cuenta con extends 
public class Cuenta_ahorro extends Cuenta {
	// no necesito instanciar los atributos de la anterior clase otra vez. Solo lo nuevo
	private double interes = 0;
	
	//constructor
	public Cuenta_ahorro(double dinero, boolean activa, String num_cuenta, double interes) {
		//recupero el código del constructor anterior
		super(dinero, activa, num_cuenta);
		
		//añado lo nuevo
		Scanner escaner = new Scanner(System.in);			
		System.out.println("Introduce el ratio de interés de la cuenta, no puedes asignarle un interés negativo:");
		interes = escaner.nextDouble();
		//mientras sea un valor negativo
		while(interes <0) {
			System.out.println("El interés introducido no es válido.\n");
			System.out.println("Introduce el ratio de interés de la cuenta, no puedes asignarle un interés negativo: ");
			interes = escaner.nextDouble();
		}
		// mensaje de comprobación.
		System.out.println("El interés introducido es válido.");
		// lo asigno
		this.interes = interes;
	}
	//getters y setters de interés
	public double getInteres() {
		return interes;
	}
	//le introduzco el interés nuevo por teclado
	public void setInteres() {		
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce el ratio de interés de la cuenta, no puedes asignarle un interés negativo:");
		//se debe poner con , y no con . porque si no da error.
		double interes = escaner.nextDouble();
		//mientras sea un valor negativo
		while(interes <0) {
			System.out.println("El interés introducido no es válido.\n");
			System.out.println("Introduce el ratio de interés de la cuenta, no puedes asignarle un interés negativo: ");
			interes = escaner.nextDouble();
		}
		//comprobación
		System.out.println("El límite introducido es válido.");
		this.interes = interes;		
		System.out.print("Su interés actual es de: " + this.interes + ".\n");
	}
	//método para aplicar el interés 
	public void aplicarInteres() {	
		//al ser heredado java me obliga a almacenar el getter de los atributos heredados en una variable
		//ya que los atributos son privados, no salen de la clase Cuenta de otra forma.
		double dinero = this.getDinero();
		//calculo el dinero aumentado por el interés	
		double aumento = (dinero * this.interes)/100;
		dinero +=aumento;
		//método sobrecargado de la herencia, solo para usarlo aquí, explicación en Cuenta
		setDinero(dinero);
		//lo muestro.
		System.out.print("Su saldo actual tras aplicar el interés es de: " + this.getDinero() + "€.\n");		
	}	
}
