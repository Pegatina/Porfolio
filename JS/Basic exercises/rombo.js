var n = prompt("Introduzca el valor de N:");

for(var i = 1; i<=n; i++){ //i controla las filas, por eso los 3 for j anidados son iguales en ambos lados. Y solo varían por el for i padre.	    
    for(var j=1; j<=(n-i);j++){ //asteriscos descendentes, partiendo del 1, imprime hasta que se llega a n-1 
        document.write("*");//mayor a menor según crece i.
        }
    
    for (var j=1;j<=i;j++){ //la fila "j" tiene "i" entradas, pirámide de números dobles ascendente.  Cuanto mayor es j, más veces imprimo i hasta que se iguala i a 2n              
        document.write(i,i);
           
        }
    for(var j=1; j<=(n-i);j++){ //asteriscos descendentes
        document.write("*");
        }         
    document.write("<br>");//para pasar a la siguiente fila al acabar cada ciclo for i (for padre).  
}
for (var i=n; i>0; i--) { //invertida            
    for(var j=1; j<=(n-i);j++){ //asteriscos ascendentes, partiendo de 1, al principio no imprime y luego imprime hasta n-1 porque no entra en n
        document.write("*");
        }
    for (var j=1;j<=i;j++){ //la fila "j" tiene "i" entradas                 
        document.write(i);
        document.write(i);       
        }
    for(var j=1; j<=(n-i);j++){ //asteriscos ascendentes
        document.write("*");
        }        
    document.write("<br>");//para pasar a la siguiente fila   
}

