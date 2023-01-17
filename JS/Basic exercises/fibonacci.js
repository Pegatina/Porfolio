var i = 0; //contador
var a = 0;
var b = 1;
var sum = 0;
var serie = prompt("Introduce un numero total de la serie de Fibonacci: ");
		
		while(i<serie) { //hay que cogerlo sobre a y no sobre b porque si no coge uno más.
            
			sum = a+b; //se suma el siguiente más el anterior   
            document.write(sum + " ");         
			b = a; //b siempre recibe el número anterior (a es igual que la suma anterior y mayor que b siempre)
			a= sum; //al siguiente se le asigna el resultado de la suma del siguiente más el anterior.		
            i++; //lo incrementamos para que muestre exáctamente hasta el largo que queremos, de 0 a 10 si introducimos 11.	
		}		