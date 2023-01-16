package banco;
// import super necesario
import java.util.Scanner;
//clase que hereda de cuenta
public class Cuenta_Credito extends Cuenta {
	// añado el límite
	private double limite = 0;
	
	//constructor 
	public Cuenta_Credito(double dinero, boolean activa, String num_cuenta, double limite) {
		// recupero el código del constructor anterior
		super(dinero, activa, num_cuenta);
		//añado lo nuevo
		Scanner escaner = new Scanner(System.in);			
		System.out.println("Introduce el límite de la cuenta, no puedes asignarle un límite negativo:");
		limite = escaner.nextDouble();
		//mientras sea un valor negativo
		while(limite <0) {
			System.out.println("El límite introducido no es válido.\n");
			System.out.println("Introduce el límite de interés de la cuenta, no puedes asignarle un límite negativo: ");
			limite = escaner.nextDouble();
		}
		// mensaje de comprobación.
		System.out.println("El límite introducido es válido.");
		// lo asigno
		this.limite = limite;
	}
	//getters y setters de límite
	public double getLimite() {
		return limite;
	}
	// setter con paso de parámetro por escáner
	public void setLimite() {
		Scanner escaner = new Scanner(System.in);			
		System.out.println("Introduce el límite de la cuenta, no puedes asignarle un límite negativo:");
		double limite = escaner.nextDouble();
		//mientras sea un valor negativo
		while(limite <0) {
			System.out.println("El límite introducido no es válido.\n");
			System.out.println("Introduce el límite de interés de la cuenta, no puedes asignarle un límite negativo: ");
			limite = escaner.nextDouble();
		}
		// mensaje de comprobación.
		System.out.println("El límite introducido es válido.");
		//asignación
		this.limite = limite;
	}
	// método de sacar dinero sobrecargado, también devuelve para las transferencias.
		public double sacarDinero() {
			// creamos una variable local que almacene el dinero que tiene.
			double dineroPrevio = this.getDinero();
			Scanner escaner = new Scanner(System.in);
			System.out.println("Introduce el dinero que quieres sacar de la cuenta, no puedes sacar más dinero "
					+ "del límite que tienes\nni dinero negativo: ");
			double dinero = escaner.nextDouble();
			// si introduces un número en negativo se repite y, si el dinero introducido es
			// mayor que el límite de la cuenta, se repite también, así,
			// siempre comprueba ambos casos.
			while (dinero < 0 || dinero > this.limite) {
				System.out.println("El dinero introducido no es válido.");
				System.out.println("Introduce el dinero que quieres sacar de la cuenta, no puedes sacar más dinero "
						+ "del límite que tienes\nni dinero negativo: ");
				dinero = escaner.nextDouble();
			}
			// mensaje de comprobación.
			System.out.println("El dinero introducido es válido.");

			// devolvemos la resta del dinero previo menos el dinero que introduzcamos.
			dinero = dineroPrevio - dinero;
			//método sobrecargado de la herencia, solo para usarlo aquí, explicación en Cuenta
			setDinero(dinero);
			System.out.print("El saldo de la cuenta " + this.getNum_cuenta() + " es de: " + this.getDinero() + "€.\n");
			//recupero el dinero para dárselo en un futuro a otra cuenta.
			return dinero;
		}	
}
