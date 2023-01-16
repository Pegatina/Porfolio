package banco;
// import super necesario
import java.util.Scanner;
//clase que hereda de cuenta
public class Cuenta_Credito extends Cuenta {
	// a�ado el l�mite
	private double limite = 0;
	
	//constructor 
	public Cuenta_Credito(double dinero, boolean activa, String num_cuenta, double limite) {
		// recupero el c�digo del constructor anterior
		super(dinero, activa, num_cuenta);
		//a�ado lo nuevo
		Scanner escaner = new Scanner(System.in);			
		System.out.println("Introduce el l�mite de la cuenta, no puedes asignarle un l�mite negativo:");
		limite = escaner.nextDouble();
		//mientras sea un valor negativo
		while(limite <0) {
			System.out.println("El l�mite introducido no es v�lido.\n");
			System.out.println("Introduce el l�mite de inter�s de la cuenta, no puedes asignarle un l�mite negativo: ");
			limite = escaner.nextDouble();
		}
		// mensaje de comprobaci�n.
		System.out.println("El l�mite introducido es v�lido.");
		// lo asigno
		this.limite = limite;
	}
	//getters y setters de l�mite
	public double getLimite() {
		return limite;
	}
	// setter con paso de par�metro por esc�ner
	public void setLimite() {
		Scanner escaner = new Scanner(System.in);			
		System.out.println("Introduce el l�mite de la cuenta, no puedes asignarle un l�mite negativo:");
		double limite = escaner.nextDouble();
		//mientras sea un valor negativo
		while(limite <0) {
			System.out.println("El l�mite introducido no es v�lido.\n");
			System.out.println("Introduce el l�mite de inter�s de la cuenta, no puedes asignarle un l�mite negativo: ");
			limite = escaner.nextDouble();
		}
		// mensaje de comprobaci�n.
		System.out.println("El l�mite introducido es v�lido.");
		//asignaci�n
		this.limite = limite;
	}
	// m�todo de sacar dinero sobrecargado, tambi�n devuelve para las transferencias.
		public double sacarDinero() {
			// creamos una variable local que almacene el dinero que tiene.
			double dineroPrevio = this.getDinero();
			Scanner escaner = new Scanner(System.in);
			System.out.println("Introduce el dinero que quieres sacar de la cuenta, no puedes sacar m�s dinero "
					+ "del l�mite que tienes\nni dinero negativo: ");
			double dinero = escaner.nextDouble();
			// si introduces un n�mero en negativo se repite y, si el dinero introducido es
			// mayor que el l�mite de la cuenta, se repite tambi�n, as�,
			// siempre comprueba ambos casos.
			while (dinero < 0 || dinero > this.limite) {
				System.out.println("El dinero introducido no es v�lido.");
				System.out.println("Introduce el dinero que quieres sacar de la cuenta, no puedes sacar m�s dinero "
						+ "del l�mite que tienes\nni dinero negativo: ");
				dinero = escaner.nextDouble();
			}
			// mensaje de comprobaci�n.
			System.out.println("El dinero introducido es v�lido.");

			// devolvemos la resta del dinero previo menos el dinero que introduzcamos.
			dinero = dineroPrevio - dinero;
			//m�todo sobrecargado de la herencia, solo para usarlo aqu�, explicaci�n en Cuenta
			setDinero(dinero);
			System.out.print("El saldo de la cuenta " + this.getNum_cuenta() + " es de: " + this.getDinero() + "�.\n");
			//recupero el dinero para d�rselo en un futuro a otra cuenta.
			return dinero;
		}	
}
