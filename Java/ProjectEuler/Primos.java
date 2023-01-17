package projectEuler;
import java.util.ArrayList;
public class Primos {
	
	public static void main(String[] args) {
		//número del que voy a sacar factores primos
		//primo es el número solo divisible entre sí mismo y 1.
		long N = 600851475143L; 
		
		//para la práctica dividimos a N%j== para saber que es un factor.
		
		//calcular primos
		//aquí guardo los primos hasta Math.sqrt(N);
		ArrayList<Integer> primos = new ArrayList<>();
		int raizN = (int)Math.sqrt(N);
		//System.out.println(raizN);
		
		//calculo primos hasta sqrt(N)
		for(int i=2;i<=raizN;i++) {
			//por defecto todos son primos hasta que sean divisibles.
			boolean esprimo = true;
			//esto ve si i es primo
			for(int j=2; j<=(int)Math.sqrt(i);j++) {				
				if(i%j==0) {
					esprimo = false;
				}
			}
			//si es primo y divide a N lo añado al array
			//así sacamos los factores(divisores) primos de N.
			if(esprimo && N%i ==0) {
				primos.add(i);							
			}
		}
		System.out.println(primos);	
	}

}
