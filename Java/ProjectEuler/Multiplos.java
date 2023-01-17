package projectEuler;

public class Multiplos {	
	//Busca números hasta N  (1000)
	//si es múltiplo de 3 o 5 lo suma.

	public static void main(String[] args) {
		//determinamos el máximo de múltiplos a calcular.
		int N = 1000;
		//variable que sume
		int suma = 0;		
		//bucle por todos los números hasta N
		
		for(int i=0; i<N; i++) {
			//si es múltiplo de 3 o 5, sumo en suma
			if((i%3 ==0) || (i%5==0)) {				
				suma = suma+i;
			}		
		}
		//mostrar la suma
		System.out.println(suma); //23
	}

}
