package banco;
// los mejores imports del mundo
import java.util.ArrayList;
import java.util.Scanner;
public class Banco {
	// creo los atributos, dos arraylist que contienen cuentas
	private ArrayList<Cuenta> cuentas = new ArrayList<>();
	// una id constante
	private final String id;
	// este arraylist acaba conteniendo cuentas que tambi�n pertenecen al arraylist de cuentas
	private ArrayList<Cuenta> morosos = new ArrayList<>();
	//constructor
	public Banco(ArrayList<Cuenta> cuentas, String id, ArrayList<Cuenta> morosos) {
		this.cuentas = cuentas;
		// condiciones para hacer el id, muy similar a las condiciones del n�mero de la cuenta.
		Scanner escaner = new Scanner (System.in);		
		System.out.println("Introduce el n�mero del banco, debe ser de 4 cifras:");
		//almaceno el resultado en la variable
		id = escaner.next();	
		//dos comprobaciones, una para acabar el bucle y otra para que todo est� bien.
		boolean comprobacion = true;
		boolean correcto = true;
		while (comprobacion) {
			// recorremos toda la cuenta
			for (int i = 0; i < id.length(); i++) {
				// creamos una variable de tipo char para almacenar los elementos que recorre i
				char elemento = id.charAt(i);
				// el dato tipo char lo pasamos a string con esta funci�n.
				String valorElemento = String.valueOf(elemento);				
				// si el valor introducido no es un n�mero, lo pongo en falso
				if (!valorElemento.matches("[0-9]")) {
					// conseguimos que, con que haya un caracter que no corresponda, luego lo
					// podamos descartar
					correcto = false;
				}
			} // cuando acaba de recorrer la cuenta...
				// si el largo del id no es 4 o utiliza otros caracteres, aqu� lo rechazamos.
			if (id.length() != 4 || !correcto) {
				System.out.println("El id que has introducido no es v�lido.");
				System.out.println("Introduce el n�mero del banco, debe ser de 4 cifras:");
				id = escaner.next();
			} else {
				comprobacion = false;
			}
		}
		// comprobaci�n
		System.out.println("El id del banco es v�lido.");
		//asignamos
		this.id = id;		
		this.morosos = morosos;
	}	
	public void setInteres(Cuenta_ahorro cuentaAhorro) {
		//si introducimos una cuenta ahorro podemos utilizar su m�todo ya creado.
		cuentaAhorro.setInteres();
	}
	//actualizar es tanto setter positivo (a�ade de uno en uno) como negativo (resta de uno en uno) de Morosos
	//solo las cuentas de cr�dito pueden quedarse en negativo, ergo, solo las cuentas de Cr�dito pueden ser morosos.
	public void actualizarMorosos(Cuenta_Credito cuenta) {
		if (cuenta.getDinero()<0) {
			this.morosos.add(cuenta);
			System.out.println("Se ha a�adido la cuenta " + cuenta.getNum_cuenta() + " al registro de morosos.");
		}
		//si est� dentro de morosos
		if (this.morosos.contains(cuenta)) {
			//y su dinero es positivo
			if(cuenta.getDinero()>=0) {
			//se borra del registro
			this.morosos.remove(cuenta);
			System.out.println("La cuenta " + cuenta.getNum_cuenta() + " ha salido del registro de morosos.");
			}
		}
	}	
	// dejamos el array vac�o
	public void eliminarMorosos() {		
		this.morosos.clear();
		System.out.println("Se ha vaciado el registro de morosos.");		
	}
	//getters y setters de los atributos
	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}
	//para un arraylist, a�adimos cosas con los setters
	public void setCuentas(Cuenta cuenta) {
		this.cuentas.add(cuenta);
		//comprobaci�n
		System.out.println("Se ha a�adido la cuenta " + cuenta.getNum_cuenta() + " al registro de cuentas");
	}
	public ArrayList<Cuenta> getMorosos() {
		return morosos;
	}	
	public String getId() {
		return id;
	}	
}