package banco;
//importaci�n del Scanner
import java.util.Scanner;

public class Cuenta {
	// instancio los atributos de la clase
	// dinero inicializa en 0;
	private double dinero = 0.0;
	// inicializo una cadena de texto en final para que luego no se pueda modificar
	// sin declararle ning�n valor
	private final String num_cuenta;
	// por defecto consideramos que todas son activas.
	private boolean activa = true;

	// constructor con condiciones
	public Cuenta(double dinero, boolean activa, String num_cuenta) {
		// creamos un esc�ner para leer los datos.
		Scanner escaner = new Scanner(System.in);		
		System.out.println("Introduce el dinero con el que inicias la cuenta, no puedes asignarle dinero negativo: ");
		dinero = escaner.nextDouble();
		// si el dinero introducido es negativo, es decir, menor que 0, se repite el bucle.
		while (dinero < 0) {
			System.out.println("El dinero introducido no es v�lido.");
			System.out.println("Introduce el dinero con el que inicias la cuenta, no puedes asignarle dinero negativo: ");
			dinero = escaner.nextDouble();
		}
		// mensaje de comprobaci�n.
		System.out.println("El dinero introducido es v�lido.");
		this.dinero = dinero;

		System.out.println("Introduce el estado de la cuenta (true o false): ");
		// forzamos al esc�ner a que solo pueda obtener un dato booleano
		activa = escaner.nextBoolean();
		this.activa = activa;
		
		System.out.println("Introduce el n�mero de la cuenta, debe tener 10 d�gitos de n�meros y letras: ");
		num_cuenta = escaner.next();
		boolean correcto = true;
		boolean comprobacion = true;
		while (comprobacion) {
			// recorremos toda la cuenta
			for (int i = 0; i < num_cuenta.length(); i++) {
				// creamos una variable de tipo char para almacenar los elementos que recorre i
				char elemento = num_cuenta.charAt(i);
				// el dato tipo char lo pasamos a string con esta funci�n.
				String valorElemento = String.valueOf(elemento);

				// para introducir un rango se utilizan los corchetes y un gui�n, y la funci�n
				// matches busca coincidencias
				// entre un String, similar a equals pero eval�a el rango, no capta el String
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
				// si el largo de la cuenta no es 10 o utiliza otros caracteres, aqu� lo
				// rechazamos.
			if (num_cuenta.length() != 10 || !correcto) {
				System.out.println("El n�mero de cuenta que has introducido no es v�lido.");

				System.out.println("Introduce el n�mero de la cuenta, debe tener 10 d�gitos de n�meros y letras: ");
				num_cuenta = escaner.next();
			} else {
				comprobacion = false;
			}
		}
		// comprobaci�n
		System.out.println("El n�mero de cuenta es v�lido.");
		this.num_cuenta = num_cuenta;
	}

	// m�todos de los atributos
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
			System.out.println("El dinero introducido no es v�lido.");
			System.out.println("Introduce el dinero que quieres meter a la cuenta, no puedes introducir dinero negativo: ");
			dinero = escaner.nextDouble();
		}
		// mensaje de comprobaci�n.
		System.out.println("El dinero introducido es v�lido.\n");

		// devolvemos la suma del dinero previo m�s el dinero que introduzcamos.
		this.dinero += dinero;
		System.out.print("Su saldo actual es de: " + this.dinero + "�.\n");
	}
	//sobrecargo el m�todo para poder usarlo en en el inter�s de la herencia, ya que no necesito pedirle
	//de nuevo el dato, solo cambiar el interior de la variable para que se actualice el getter.
	//no puedo hacer la asignaci�n de this.dinero = dinero directamente, porque el atributo es privado en Cuenta.
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	// m�todo de sacar dinero, le he a�adido un return para la transferencia entre bancos.
	public double sacarDinero() {
		// creamos una variable local que almacene el dinero que tiene.
		double dineroPrevio = this.dinero;
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce el dinero que quieres sacar de la cuenta, no puedes sacar m�s dinero "
				+ "del que tienes\nni dinero negativo: ");
		double dinero = escaner.nextDouble();
		// si introduces un n�mero en negativo se repite y, si el dinero introducido es negativo,
		// es decir, menor que lo que contiene la cuenta, se repite tambi�n, as�,
		// siempre comprueba ambos casos.
		while (dinero < 0 || dinero > dineroPrevio) {
			System.out.println("El dinero introducido no es v�lido.");
			System.out.println("Introduce el dinero que quieres sacar de la cuenta, no puedes sacar m�s dinero "
					+ "del que tienes\nni dinero negativo: ");
			dinero = escaner.nextDouble();
		}
		// mensaje de comprobaci�n.
		System.out.println("El dinero introducido es v�lido.");

		// devolvemos la resta del dinero previo menos el dinero que introduzcamos.
		this.dinero = dineroPrevio - dinero;
		System.out.print("El saldo de la cuenta " + this.num_cuenta + " es de: " + this.dinero + "�.\n");
		//recupero el dinero para d�rselo en un futuro a otra cuenta.
		return this.dinero;
	}

	// comprobaci�n del booleano, su "getter"
	public boolean isActiva() {
		return activa;
	}

	// setter de activa
	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	// getter de num_cuenta, como es un dato final, no tiene m�todo setter porque podr�a intentar
	// modificarse una vez asignado un valor y dar�a error.
	public String getNum_cuenta() {
		return num_cuenta;
	}
}