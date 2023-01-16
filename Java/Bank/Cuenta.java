package banco;
//importación del Scanner
import java.util.Scanner;

public class Cuenta {
	// instancio los atributos de la clase
	// dinero inicializa en 0;
	private double dinero = 0.0;
	// inicializo una cadena de texto en final para que luego no se pueda modificar
	// sin declararle ningún valor
	private final String num_cuenta;
	// por defecto consideramos que todas son activas.
	private boolean activa = true;

	// constructor con condiciones
	public Cuenta(double dinero, boolean activa, String num_cuenta) {
		// creamos un escáner para leer los datos.
		Scanner escaner = new Scanner(System.in);		
		System.out.println("Introduce el dinero con el que inicias la cuenta, no puedes asignarle dinero negativo: ");
		dinero = escaner.nextDouble();
		// si el dinero introducido es negativo, es decir, menor que 0, se repite el bucle.
		while (dinero < 0) {
			System.out.println("El dinero introducido no es válido.");
			System.out.println("Introduce el dinero con el que inicias la cuenta, no puedes asignarle dinero negativo: ");
			dinero = escaner.nextDouble();
		}
		// mensaje de comprobación.
		System.out.println("El dinero introducido es válido.");
		this.dinero = dinero;

		System.out.println("Introduce el estado de la cuenta (true o false): ");
		// forzamos al escáner a que solo pueda obtener un dato booleano
		activa = escaner.nextBoolean();
		this.activa = activa;
		
		System.out.println("Introduce el número de la cuenta, debe tener 10 dígitos de números y letras: ");
		num_cuenta = escaner.next();
		boolean correcto = true;
		boolean comprobacion = true;
		while (comprobacion) {
			// recorremos toda la cuenta
			for (int i = 0; i < num_cuenta.length(); i++) {
				// creamos una variable de tipo char para almacenar los elementos que recorre i
				char elemento = num_cuenta.charAt(i);
				// el dato tipo char lo pasamos a string con esta función.
				String valorElemento = String.valueOf(elemento);

				// para introducir un rango se utilizan los corchetes y un guión, y la función
				// matches busca coincidencias
				// entre un String, similar a equals pero evalúa el rango, no capta el String
				// literalmente.
				// si el valor introducido no es ninguno de los 3 rangos que me interesa, lo
				// pongo en falso
				if (!(valorElemento.matches("[A-Z]") || valorElemento.matches("[a-z]")
						|| valorElemento.matches("[0-9]"))) {
					// conseguimos que, con que haya un caracter que no corresponda, luego lo
					// podamos descartar
					correcto = false;
				}
			} // cuando acaba de recorrer la cuenta...
				// si el largo de la cuenta no es 10 o utiliza otros caracteres, aquí lo
				// rechazamos.
			if (num_cuenta.length() != 10 || !correcto) {
				System.out.println("El número de cuenta que has introducido no es válido.");

				System.out.println("Introduce el número de la cuenta, debe tener 10 dígitos de números y letras: ");
				num_cuenta = escaner.next();
			} else {
				comprobacion = false;
			}
		}
		// comprobación
		System.out.println("El número de cuenta es válido.");
		this.num_cuenta = num_cuenta;
	}

	// métodos de los atributos
	// getter de dinero, devuelve el dinero que contiene el atributo.
	public double getDinero() {
		return dinero;
	}

	// este setter es especial, porque el dato se lo introducimos por teclado.
	public void setDinero() {		
		Scanner escaner = new Scanner(System.in);		
		System.out.println("Introduce el dinero que quieres meter a la cuenta, no puedes introducir dinero negativo: ");
		double dinero = escaner.nextDouble();
		// si el dinero introducido es negativo, es decir, menor que 0, se repite el bucle.
		while (dinero < 0) {
			System.out.println("El dinero introducido no es válido.");
			System.out.println("Introduce el dinero que quieres meter a la cuenta, no puedes introducir dinero negativo: ");
			dinero = escaner.nextDouble();
		}
		// mensaje de comprobación.
		System.out.println("El dinero introducido es válido.\n");

		// devolvemos la suma del dinero previo más el dinero que introduzcamos.
		this.dinero += dinero;
		System.out.print("Su saldo actual es de: " + this.dinero + "€.\n");
	}
	//sobrecargo el método para poder usarlo en en el interés de la herencia, ya que no necesito pedirle
	//de nuevo el dato, solo cambiar el interior de la variable para que se actualice el getter.
	//no puedo hacer la asignación de this.dinero = dinero directamente, porque el atributo es privado en Cuenta.
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	// método de sacar dinero, le he añadido un return para la transferencia entre bancos.
	public double sacarDinero() {
		// creamos una variable local que almacene el dinero que tiene.
		double dineroPrevio = this.dinero;
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce el dinero que quieres sacar de la cuenta, no puedes sacar más dinero "
				+ "del que tienes\nni dinero negativo: ");
		double dinero = escaner.nextDouble();
		// si introduces un número en negativo se repite y, si el dinero introducido es negativo,
		// es decir, menor que lo que contiene la cuenta, se repite también, así,
		// siempre comprueba ambos casos.
		while (dinero < 0 || dinero > dineroPrevio) {
			System.out.println("El dinero introducido no es válido.");
			System.out.println("Introduce el dinero que quieres sacar de la cuenta, no puedes sacar más dinero "
					+ "del que tienes\nni dinero negativo: ");
			dinero = escaner.nextDouble();
		}
		// mensaje de comprobación.
		System.out.println("El dinero introducido es válido.");

		// devolvemos la resta del dinero previo menos el dinero que introduzcamos.
		this.dinero = dineroPrevio - dinero;
		System.out.print("El saldo de la cuenta " + this.num_cuenta + " es de: " + this.dinero + "€.\n");
		//recupero el dinero para dárselo en un futuro a otra cuenta.
		return this.dinero;
	}

	// comprobación del booleano, su "getter"
	public boolean isActiva() {
		return activa;
	}

	// setter de activa
	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	// getter de num_cuenta, como es un dato final, no tiene método setter porque podría intentar
	// modificarse una vez asignado un valor y daría error.
	public String getNum_cuenta() {
		return num_cuenta;
	}
}