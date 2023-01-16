package ajedrez;
public class Tablero {
	public static void main(String[] args) {
		/*
		 //instancio un peón 
		 Peon peon1 = new Peon(false,true); 
		 //lo instancio en la primera casilla. 
		 Casilla c1 = new Casilla(0,0,peon1);
		 */
		/*
		// instancio un caballo
		Caballo caballo1 = new Caballo(false, true);
		//lo instancio en la primera casilla.
		Casilla c1 = new Casilla(0, 0, caballo1);
		*/
		/*
		// instancio una torre
		Torre torre1 = new Torre(false, false);
		//lo instancio en la primera casilla.
		Casilla c1 = new Casilla(0, 0, torre1);
		*/
		/*
		// instancio un alfil
		Alfil alfil1 = new Alfil(false, false);
		//lo instancio en la primera casilla.
		Casilla c1 = new Casilla(0, 0, alfil1);
		*/
		/*
		// instancio una reina
		Reina reina1 = new Reina(false, false);
		//lo instancio en la primera casilla.
		Casilla c1 = new Casilla(0, 0, reina1);
		*/
		//instancio un rey
		Rey rey1 = new Rey(false, false);
		//lo instancio en la primera casilla.
		Casilla c1 = new Casilla(0, 0, rey1);
		//demás casillas.
		Casilla c2 = new Casilla(0, 1);
		Casilla c3 = new Casilla(0, 2);
		Casilla c4 = new Casilla(0, 3);
		Casilla c5 = new Casilla(0, 4);
		Casilla c6 = new Casilla(0, 5);
		Casilla c7 = new Casilla(0, 6);
		Casilla c8 = new Casilla(0, 7);
		Casilla c9 = new Casilla(1, 0);
		Casilla c10 = new Casilla(1, 1);
		Casilla c11 = new Casilla(1, 2);
		Casilla c12 = new Casilla(1, 3);
		Casilla c13 = new Casilla(1, 4);
		Casilla c14 = new Casilla(1, 5);
		Casilla c15 = new Casilla(1, 6);
		Casilla c16 = new Casilla(1, 7);
		Casilla c17 = new Casilla(2, 0);
		Casilla c18 = new Casilla(2, 1);
		Casilla c19 = new Casilla(2, 2);
		Casilla c20 = new Casilla(2, 3);
		Casilla c21 = new Casilla(2, 4);
		Casilla c22 = new Casilla(2, 5);
		Casilla c23 = new Casilla(2, 6);
		Casilla c24 = new Casilla(2, 7);
		Casilla c25 = new Casilla(3, 0);
		Casilla c26 = new Casilla(3, 1);
		Casilla c27 = new Casilla(3, 2);
		Casilla c28 = new Casilla(3, 3);
		Casilla c29 = new Casilla(3, 4);
		Casilla c30 = new Casilla(3, 5);
		Casilla c31 = new Casilla(3, 6);
		Casilla c32 = new Casilla(3, 7);
		Casilla c33 = new Casilla(4, 0);
		Casilla c34 = new Casilla(4, 1);
		Casilla c35 = new Casilla(4, 2);
		Casilla c36 = new Casilla(4, 3);
		Casilla c37 = new Casilla(4, 4);
		Casilla c38 = new Casilla(4, 5);
		Casilla c39 = new Casilla(4, 6);
		Casilla c40 = new Casilla(4, 7);
		Casilla c41 = new Casilla(5, 0);
		Casilla c42 = new Casilla(5, 1);
		Casilla c43 = new Casilla(5, 2);
		Casilla c44 = new Casilla(5, 3);
		Casilla c45 = new Casilla(5, 4);
		Casilla c46 = new Casilla(5, 5);
		Casilla c47 = new Casilla(5, 6);
		Casilla c48 = new Casilla(5, 7);
		Casilla c49 = new Casilla(6, 0);
		Casilla c50 = new Casilla(6, 1);
		Casilla c51 = new Casilla(6, 2);
		Casilla c52 = new Casilla(6, 3);
		Casilla c53 = new Casilla(6, 4);
		Casilla c54 = new Casilla(6, 5);
		Casilla c55 = new Casilla(6, 6);
		Casilla c56 = new Casilla(6, 7);
		Casilla c57 = new Casilla(7, 0);
		Casilla c58 = new Casilla(7, 1);
		Casilla c59 = new Casilla(7, 2);
		Casilla c60 = new Casilla(7, 3);
		Casilla c61 = new Casilla(7, 4);
		Casilla c62 = new Casilla(7, 5);
		Casilla c63 = new Casilla(7, 6);
		Casilla c64 = new Casilla(7, 7);

		/*
		//probando que no se pueden hacer casillas raras 
		Casilla c65 = new Casilla(0,8); //da error en y, correcto. 
		Casilla c66 = new Casilla(-1,0);//da error en x, correcto. 
		Casilla c67 = new Casilla(-2, 17); //me da error en ambos, correcto. 
		Casilla c68 = new Casilla(-2,17,peon1); //me dan los errores anteriores más el error final, correcto.
		*/
		/*
		//pruebas de peón 
		//instancio un movimiento. 
		Movimiento mov3 = new Movimiento(c4, c5); //me tiene que decir que no hay pieza. Correcto. 
		Movimiento mov1 = new Movimiento(c1,c9); //falso, correcto. 
		Movimiento mov2 = new Movimiento(c1,c2); //correcto. 		
		System.out.println(c2.getPieza().getClass()); //comprobamos si tiene pieza y de qué clase es. Correcto. 
		System.out.println(c1.getPieza()); //No tiene pieza, correcto. 
		
		Movimiento mov4 = new Movimiento(c2,c3); //me tiene que dar verdadero. Correcto
		*/
		/*
		// pruebas de caballo
		// instancio un movimiento.
		Movimiento mov1 = new Movimiento(c1, c2); // falso. Correcto
		Movimiento mov2 = new Movimiento(c1, c11); // verdader. correcto.
		// comprobamos si tiene pieza y de qué clase es. Correcto.
		System.out.println(c11.getPieza().getClass());
		System.out.println(c1.getPieza()); // No tiene pieza, correcto.		
		Movimiento mov4 = new Movimiento(c11, c1); // me tiene que dar verdadero. Correcto.
		Movimiento mov5 = new Movimiento(c1,c18); //me tiene que dar verdadero. Correcto.
		*/
		/*
		// pruebas de torre
		// instancio un movimiento.
		Movimiento mov1 = new Movimiento(c1, c11); // falso. Correcto
		Movimiento mov2 = new Movimiento(c1, c4); // verdadero.	Correcto		
		// comprobamos si tiene pieza y de qué clase es. Correcto
		System.out.println(c4.getPieza().getClass());
		System.out.println(c1.getPieza()); // No tiene pieza. Correcto		
		Movimiento mov4 = new Movimiento(c4, c36); // me tiene que dar verdadero. Correcto.
		*/
		/*
		// pruebas de alfil
		// instancio un movimiento.
		Movimiento mov1 = new Movimiento(c1, c2); // falso. Correcto
		Movimiento mov2 = new Movimiento(c1, c19); // verdadero. Correcto		
		// comprobamos si tiene pieza y de qué clase es. Correcto
		System.out.println(c19.getPieza().getClass());
		System.out.println(c1.getPieza()); // No tiene pieza. Correcto
		Movimiento mov4 = new Movimiento(c19, c10); // me tiene que dar verdadero. Correcto
		*/
		/*
		 // pruebas de reina
		// instancio un movimiento.
		Movimiento mov1 = new Movimiento(c1, c11); // falso. Correcto
		Movimiento mov2 = new Movimiento(c1, c4); // verdadero. Correcto
		// comprobamos si tiene pieza y de qué clase es. Correcto
		System.out.println(c4.getPieza().getClass());
		System.out.println(c1.getPieza()); // No tiene pieza. Correcto
		Movimiento mov4 = new Movimiento(c4, c28); // me tiene que dar verdadero. Correcto
		*/
		
		// pruebas de rey 
		// instancio un movimiento.
		Movimiento mov1 = new Movimiento(c1, c11); // falso. Correcto
		Movimiento mov2 = new Movimiento(c1, c10); // verdadero. Correcto	
		// comprobamos si tiene pieza y de qué clase es. Correcto
		System.out.println(c10.getPieza().getClass());
		System.out.println(c1.getPieza()); // No tiene pieza. Correcto
		Movimiento mov4 = new Movimiento(c10, c19); // me tiene que dar verdadero. Correcto.		 
	}
}
