var numeros = new Array();
var cantidad = parseInt(prompt("Introduce cuantos numeros quieres introducir: "));
for(i=0; i<cantidad; i++){
numeros[i] = parseInt(Math.random()*100); //genero números aleatorios entre 0 y 99 incluídos.
}
//enseño los números
for(var i = 0; i<numeros.length;i++){ //hasta el final del array.
    document.write(numeros[i]+ " "); //recorremos cada índice.
}
//los ordenamos y mostramos
document.write("<br>");
for(var i = 0; i<numeros.length;i++){ //hasta el final del array.
    //la función sort ordena arrays, por tanto, si tienes un 2 50 80 47  8, el 8 lo pone el tercero en vez del segundo: 2 50 8 80 47
    //porque coge el primer número y es mayor del 5 de 50
    //para evitar eso, hacemos una función comparativa para que nos devuelva los números ordenados
    //function(a,b) compara a los dos números, si es a menor que b lo coloca al principio, si es igual lo deja al lado, si es mayor lo coloca delante de b.
    numeros.sort(function(a , b) {return a - b}); 
    document.write(numeros[i]+ " "); //recorremos cada índice.
}