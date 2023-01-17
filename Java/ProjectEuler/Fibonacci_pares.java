package projectEuler;

public class Fibonacci_pares {
	//Cada número de fibonacci se genera sumando los dos anteriores.
	//necesitamos los valores hasta 4.000.000
	//necesitamos sumar solo los pares en total.

	public static void main(String[] args) {
		/* Mi solución
		int num1=1; //número al que le vamos añadiendo el siguiente.
		int num2=2;	//número al que se suma a sí mismo y al anterior.
		int suma=2; //suma de los dos valores.
		int largo = 32; //he calculado el fibonacci máximo antes de 4.000.000, aunque no hacía falta.
		int sumapares = num2;
		
		//valor inicial
		//System.out.println(num1);
		
		for(int i=1; i<largo; i++) {	
			// muestro la suma
            //System.out.println(suma);
            //sumamos
			suma = num1 + num2;
			if(suma<= 4000000) {
				if(suma%2==0) { //si el resto de la división entre pares es 0 se suma.
					sumapares+=suma;
				}
				//cambiamos la segunda variable por la primera
				num1 = num2;
				//cambiamos la suma por la segunda variable
				num2 = suma;
			}
			
		}
		System.out.println(sumapares); //4613732
		*/
		//Otra solución interesante
		int a = 0; //se puede empezar directamente en 2, 1 y 2 como el anterior.
		int b = 1;
		int sum = 0;
		int sumpares = 0;
		
		while(b<4000000) {
			sum = a+b; //se suma el siguiente más el anterior
			b = a; //b siempre recibe el número anterior (a es igual que la suma anterior y mayor que b siempre)
			a= sum; //al siguiente se le asigna el resultado de la suma del siguiente más el anterior.
			if(a%2==0) {
				sumpares+=a; //sumamos los pares de a a sumpares
			}
		}
		System.out.println(sumpares); //imprimimos el total
		 
	}

}
