package banco;
//importaci�n del Scanner
import java.util.Scanner;
//clase que hereda de cuenta con extends 
public class Cuenta_ahorro extends Cuenta {
	// no necesito instanciar los atributos de la anterior clase otra vez. Solo lo nuevo
	private double interes = 0;
	
	//constructor
	public Cuenta_ahorro(double dinero, boolean activa, String num_cuenta, double interes) {
		//recupero el c�digo del constructor anterior
		super(dinero, activa, num_cuenta);
		
		//a�ado lo nuevo
		Scanner escaner = new Scanner(System.in);			
		System.out.println("Introduce el ratio de inter�s de la cuenta, no puedes asignarle un inter�s negativo:");
		interes = escaner.nextDouble();
		//mientras sea un valor negativo
		while(interes <0) {
			System.out.println("El inter�s introducido no es v�lido.\n");
			System.out.println("Introduce el ratio de inter�s de la cuenta, no puedes asignarle un inter�s negativo: ");
			interes = escaner.nextDouble();
		}
		// mensaje de comprobaci�n.
		System.out.println("El inter�s introducido es v�lido.");
		// lo asigno
		this.interes = interes;
	}
	//getters y setters de inter�s
	public double getInteres() {
		return interes;
	}
	//le introduzco el inter�s nuevo por teclado
	public void setInteres() {		
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce el ratio de inter�s de la cuenta, no puedes asignarle un inter�s negativo:");
		//se debe poner con , y no con . porque si no da error.
		double interes = escaner.nextDouble();
		//mientras sea un valor negativo
		while(interes <0) {
			System.out.println("El inter�s introducido no es v�lido.\n");
			System.out.println("Introduce el ratio de inter�s de la cuenta, no puedes asignarle un inter�s negativo: ");
			interes = escaner.nextDouble();
		}
		//comprobaci�n
		System.out.println("El l�mite introducido es v�lido.");
		this.interes = interes;		
		System.out.print("Su inter�s actual es de: " + this.interes + ".\n");
	}
	//m�todo para aplicar el inter�s 
	public void aplicarInteres() {	
		//al ser heredado java me obliga a almacenar el getter de los atributos heredados en una variable
		//ya que los atributos son privados, no salen de la clase Cuenta de otra forma.
		double dinero = this.getDinero();
		//calculo el dinero aumentado por el inter�s	
		double aumento = (dinero * this.interes)/100;
		dinero +=aumento;
		//m�todo sobrecargado de la herencia, solo para usarlo aqu�, explicaci�n en Cuenta
		setDinero(dinero);
		//lo muestro.
		System.out.print("Su saldo actual tras aplicar el inter�s es de: " + this.getDinero() + "�.\n");		
	}	
}
