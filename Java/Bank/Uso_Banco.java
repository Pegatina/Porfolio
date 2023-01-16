package banco;
// imports de la ArrayList y Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class Uso_Banco {
	// no deja hacerlo fuera de una clase, así que lo he puesto en la clase que contiene el main.
	// método estático que permite la tranferencia entre dos cuentas entre uno o dos bancos diferentes.
	public static void transferencia(Banco banco1, Cuenta cuenta, Banco banco2, Cuenta cuenta2) {
		// si la cuenta que le pasamos (asumimos que del banco que queremos transferir), coincide
		// con la cuenta a transferir, no se efectúa la transferencia.		
		// si son del mismo banco y si son la misma cuenta
		if (banco1.getId() == banco2.getId() && cuenta.getNum_cuenta() == cuenta2.getNum_cuenta()) {
			System.out.println("¡No puedes transferir dinero a la misma cuenta!");
			// si es de distinto banco, es decir, si contiene otro id.
		} else if (banco1.getId() != banco2.getId()) {
			// Se aplica el 5.5%
			double comision = 5.5;
			// de la cuenta sale con la comisión, a la cuenta 2 le llega el dinero íntegro
			cuenta2.setDinero(cuenta.sacarDinero() + cuenta2.getDinero());
			// almaceno en el recargo el resultado de aplicar la comisión
			double recargo = (cuenta.getDinero() * comision) / 100;
			// y se lo resto al dinero que le queda a la cuenta tras sacar
			cuenta.setDinero(cuenta.getDinero() - recargo);
			// muestro el saldo real que contiene la cuenta tras aplicar la comisión.
			System.out.println(
					"Rectificación: El saldo de la cuenta " + cuenta.getNum_cuenta() + " es de " + cuenta.getDinero()
							+ ", se le ha aplicado una comisión del 5,5% a la cuenta por realizarse la transferencia "
							+ "desde otro banco.");
			System.out.println("La transferencia ha tenido éxito, ahora el saldo de la cuenta "
					+ cuenta2.getNum_cuenta() + " es de " + cuenta2.getDinero() + "€.");
		} else {
			// mediante el método de sacarDinero, pide cuánta cantidad y lo añade a lo que tenía previamente.
			cuenta2.setDinero(cuenta.sacarDinero() + cuenta2.getDinero());
			System.out.println("La transferencia ha tenido éxito, ahora el saldo de la cuenta "
					+ cuenta2.getNum_cuenta() + " es de " + cuenta2.getDinero() + "€.");
		}
	}

	// método que devuelve la probabilidad según un porcentaje introducido.
	public static boolean probabilidad(double porcentaje) {
		boolean resultado;
		resultado = Math.random() < porcentaje;
		return resultado;
	}

	public static void main(String[] args) {
		/*
		//para instanciar cuentas le puedo poner cualquier valor porque luego me los
		// va a preguntar y corregir, no puedo dejarlo vacío. 
		 Cuenta cuenta1 = new Cuenta(0, true, "0000000000"); 
		 System.out.println("Nueva cuenta: \nDinero: " + cuenta1.getDinero()+ "€\nActiva: "+ 
		 cuenta1.isActiva() + "\nNum_cuenta: "+ cuenta1.getNum_cuenta()); 
		 //probando el setter/meter dinero
		 cuenta1.setDinero(); 
		 //probando a sacar dinero. 
		 cuenta1.sacarDinero();
		 */
		/*
		 Cuenta_ahorro cuentaAhorro1 = new Cuenta_ahorro(0, true, "0000000000", 0);
		 System.out.println("Nueva cuenta ahorro: \nDinero: " +
		 cuentaAhorro1.getDinero()+ "€\nActiva: " + cuentaAhorro1.isActiva() +
		 "\nNum_cuenta: "+ cuentaAhorro1.getNum_cuenta() + "\nRatio de interés: " +
		 cuentaAhorro1.getInteres()); cuentaAhorro1.setDinero();
		 cuentaAhorro1.getDinero(); cuentaAhorro1.setInteres();
		 cuentaAhorro1.aplicarInteres();
		 System.out.println(cuentaAhorro1.getDinero()); cuentaAhorro1.sacarDinero();
		 */
		/*
		 Cuenta_Credito cuentaCredito1 = new Cuenta_Credito(0, true, "0000000000", 0);
		 System.out.println("Nueva cuenta de crédito: \nDinero: " +	 cuentaCredito1.getDinero() + "€\nActiva: " + 
		 cuentaCredito1.isActiva() + "\nNum_cuenta: " + cuentaCredito1.getNum_cuenta() + "\nLímite: " +
		 cuentaCredito1.getLimite());
		  
		 cuentaCredito1.setDinero(); cuentaCredito1.getDinero();
		  
		 cuentaCredito1.setLimite(); cuentaCredito1.getLimite();
		 cuentaCredito1.sacarDinero();
		 */
		/*
		 //comprobación de morosos, las únicas cuentas que pueden quedarse en negativo son las de crédito.
		  
		 Cuenta_Credito credito1 = new Cuenta_Credito(0, true, "0000000000", 0);
		 ArrayList<Cuenta> cuentas0 = new ArrayList<>(); cuentas0.add(credito1);
		 ArrayList<Cuenta> morosos0 = new ArrayList<>(); 
		 Banco prueba = new Banco(cuentas0, 000, morosos0); credito1.sacarDinero();
		 prueba.actualizarMorosos(credito1); credito1.setDinero();
		 //prueba.actualizarMorosos(credito1); 
		 //prueba.eliminarMorosos();
		 //comprobación de si se han añadido/borrado en el array de morosos
		 //System.out.println(morosos0);
		 */

		// Para crear un banco primero tengo que crear sus cuentas y tengo que meterlas en un ArrayList.
		// como van todas por teclado inician con datos por defecto
		Cuenta cuenta1 = new Cuenta(0, true, "0000000000");
		Cuenta_ahorro cuentaAhorro1 = new Cuenta_ahorro(0, true, "0000000000", 0);
		Cuenta_Credito cuentaCredito1 = new Cuenta_Credito(0, true, "0000000000", 0);
		// creamos el arraylist que las contendrá
		ArrayList<Cuenta> cuentas1 = new ArrayList<>();
		// se las añadimos
		cuentas1.add(cuenta1);
		cuentas1.add(cuentaAhorro1);
		cuentas1.add(cuentaCredito1);
		// comprobación, muestro los números de cuenta para ver que se han añadido bien.
		// System.out.println(cuentas1.get(0).getNum_cuenta() +" "+
		// cuentas1.get(1).getNum_cuenta() + " " +
		// cuentas1.get(2).getNum_cuenta());

		// partimos de la base de que los bancos no empiezan con morosos, que los añadimos después.
		// ya que los morosos vienen de las propias cuentas.
		ArrayList<Cuenta> morosos1 = new ArrayList<>();
		// Ahora sí, me permito la licencia de dar un id a mano
		Banco Santander = new Banco(cuentas1, "001", morosos1);
		// así, 2 bancos más.

		Cuenta cuenta2 = new Cuenta(0, true, "0000000000");
		Cuenta_ahorro cuentaAhorro2 = new Cuenta_ahorro(0, true, "0000000000", 0);
		Cuenta_Credito cuentaCredito2 = new Cuenta_Credito(0, true, "0000000000", 0);
		ArrayList<Cuenta> cuentas2 = new ArrayList<>();
		cuentas2.add(cuenta2);
		cuentas2.add(cuentaAhorro2);
		cuentas2.add(cuentaCredito2);
		// comprobación
		// System.out.println(cuentas2.get(0).getNum_cuenta() +" "+
		// cuentas2.get(1).getNum_cuenta() + " " +
		// cuentas2.get(2).getNum_cuenta());

		ArrayList<Cuenta> morosos2 = new ArrayList<>();
		Banco BBVA = new Banco(cuentas2, "002", morosos2);

		Cuenta cuenta3 = new Cuenta(0, true, "0000000000");
		Cuenta_ahorro cuentaAhorro3 = new Cuenta_ahorro(0, true, "0000000000", 0);
		Cuenta_Credito cuentaCredito3 = new Cuenta_Credito(0, true, "0000000000", 0);
		ArrayList<Cuenta> cuentas3 = new ArrayList<>();
		cuentas3.add(cuenta3);
		cuentas3.add(cuentaAhorro3);
		cuentas3.add(cuentaCredito3);
		// comprobación
		// System.out.println(cuentas3.get(0).getNum_cuenta() +" "+
		// cuentas3.get(1).getNum_cuenta() + " " +
		// cuentas3.get(2).getNum_cuenta());

		ArrayList<Cuenta> morosos3 = new ArrayList<>();
		Banco ING = new Banco(cuentas3, "003", morosos3);

		// probamos las transferencias.
		/*
		 Uso_Banco.transferencia(Santander, cuentaAhorro1, Santander, cuentaAhorro1);
		 Uso_Banco.transferencia(Santander, cuenta1, Santander, cuentaAhorro1);
		 //¡cuidado, que el dinero de la cuenta ahorro no es el mismo con el que empieza! 
		 Uso_Banco.transferencia(Santander, cuentaAhorro1, ING, cuenta3);
		 */
		// creo un arrayList de Bancos para poderlos recorrer y aplicar las probabilidades
		ArrayList<Banco> Bancos = new ArrayList<>();
		Bancos.add(Santander);
		Bancos.add(BBVA);
		Bancos.add(ING);
	
		// creamos un booleano para tener una condición para el while
		boolean continuar = true;
		while (continuar) {
			//creamos un objeto escáner para decirle cuándo parar al while
			Scanner escaner = new Scanner(System.in);
			System.out.println("Para parar introduce 0.");
			int parar = escaner.nextInt();
			if (parar == 0) {
				continuar = false;
			} else {
				// por cada banco en bancos
				for (Banco banco : Bancos) {
					// opción a dejar las cuentas de crédito en negativo para actualizar el registro
					// de morosos en alguna.
					Santander.getCuentas().get(2).sacarDinero();
					BBVA.getCuentas().get(2).sacarDinero();
					ING.getCuentas().get(2).sacarDinero();
					// opción para añadirle dinero a alguna cuenta
					// banco.getCuentas().get(0).setDinero();
					// si con esta probabilidad 1/4 acierta
					if (Uso_Banco.probabilidad(0.25)) {
						// hay que recorrer el array de cuentas y sacar las cuentas ahorro
						System.out.println("La probabilidad fue true");
						
						// comprobación de que está cogiendo una cuenta del arraylist de un banco.
						// System.out.println(banco.getCuentas().get(0).getDinero());
						// por cada cuenta que hay en el arraylist de cuentas del banco
						for (Cuenta cuentas : banco.getCuentas()) {
							// comprobar si es del tipo que quiero (si es una instancia de Cuenta_ahorro)
							// al parecer también sirve: cuenta.getClass() == Cuenta_ahorro.class
							// System.out.println("He entrado en el for");
							if (cuentas instanceof Cuenta_ahorro) {
								// System.out.println("he entrado en el if");
								// eclipse me genera automáticamente una obligación a que sea cuenta_ahorro.
								System.out.println("El banco" + banco.getId()
										+ " aplica el interés a la cuenta con número " + cuentas.getNum_cuenta());
								((Cuenta_ahorro) cuentas).aplicarInteres();
							}
						}
					}
					// probabilidad 5/6
					if (Uso_Banco.probabilidad(0.83)) {
						System.out.println("La probabilidad 2 fue true");
						for (Cuenta cuentas : banco.getCuentas()) {
							// solo las cuentas de crédito pueden quedarse en negativo, ergo, solo ellas pueden
							// contener morosos
							if (cuentas instanceof Cuenta_Credito) {
								System.out.println("El banco" + banco.getId()
										+ " actualiza su registro de morosos con la cuenta " + cuentas.getNum_cuenta());
								banco.actualizarMorosos((Cuenta_Credito) cuentas);
							}
						}
					} // probabilidad 3/7
					if (Uso_Banco.probabilidad(0.43)) {
						System.out.println("La probabilidad 3 fue true");
						System.out.println("El banco" + banco.getId() + " elimina su registro de morosos");
						banco.eliminarMorosos();
					}					
					if (Uso_Banco.probabilidad(0.5)) {
						System.out.println("La probabilidad 4 fue true");
						// creo dos números aleatorios para determinar los bancos en cada iteración,
						// multiplicados por la cantidad de bancos que contiene el ArrayList de Bancos.
						int random = (int)(Math.random() * Bancos.size());
						int random2 = (int)(Math.random() * Bancos.size());
						// instancio el primer banco aleatorio
						Banco banco1 = Bancos.get(random);
						// instancio el otro banco aleatorio
						Banco banco2 = Bancos.get(random2);

						// otros dos aleatorios para las cuentas
						int random3 = (int)(Math.random() * banco1.getCuentas().size());
						int random4 = (int)(Math.random() * banco2.getCuentas().size());
						//las instancio
						Cuenta cuentas = banco1.getCuentas().get(random3);
						Cuenta cuentass2 = banco2.getCuentas().get(random4);
						Uso_Banco.transferencia(banco1, cuentas, banco2, cuentass2);
					}
				}
			}
		}
	}
}
