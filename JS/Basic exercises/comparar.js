var numero = prompt("Introduce el primer número:");
var numero2 = prompt("Introduce el segundo número:");
var numero3 = prompt("Introduce el tercer número:");

if(numero == numero2 && numero == numero3){ //3 3 3
    document.write("Los números introducidos son iguales.");
}
else if(numero == numero2 && numero2 > numero3){ //3 3 2
    document.write("número 1 ("+ numero + ") y número 2 (" + numero2 + "), son iguales y son mayores que número 3 (" +numero3+ ").");
}
else if(numero == numero2 && numero2 < numero3){ //3 3 4
    document.write("número 1 ("+ numero + ") y número 2 (" + numero2 + "), son iguales, y son menores que número 3 (" +numero3 + ").");
}
else if(numero < numero2 && numero2 == numero3){ //2 3 3
    document.write("número 2 ("+ numero2 + ") y número 3 (" + numero3 + "), son iguales, y son mayores que número 1 (" +numero+ ").");
}
else if(numero > numero2 && numero2 == numero3){ //4 3 3
    document.write("número 2 ("+ numero2 + ") y número 3 (" + numero3 + "), son iguales, y son menores que número 1 (" +numero+ ").");
}
else if(numero < numero2 && numero == numero3){ //3 4 3
    document.write("número 1 ("+ numero + ") y número 3 (" + numero3 + "), son iguales, y son menores que número 2 (" +numero2+ ").");
}
else if(numero > numero2 && numero == numero3){ //3 2 3
    document.write("número 1 (" + numero + ") y número 3 (" + numero3 + "), son iguales, y son mayores que número 2 (" +numero2 + ").");
}
else if(numero < numero3 && numero2 < numero){ //3 2 4
    document.write("numero 1 =" +numero);
    document.write("<br>numero 2 =" +numero2); 
    document.write("<br>numero 3 =" +numero3);

    document.write("<br>El número mayor es " + numero3); 
    document.write("<br>El número menor es " + numero2);
}
else if(numero < numero2 && numero2 < numero3){ //2 3 4
    document.write("numero 1 =" +numero);
    document.write("<br>numero 2 =" +numero2); 
    document.write("<br>numero 3 =" +numero3);    

    document.write("<br>El número mayor es " + numero3);
    document.write("<br>El número menor es " + numero);
}
else if(numero > numero2 && numero2 > numero3){ //4 3 2
    document.write("numero 1 =" +numero);
    document.write("<br>numero 2 =" +numero2); 
    document.write("<br>numero 3 =" +numero3);    

    document.write("<br>El número mayor es " + numero);
    document.write("<br>El número menor es " + numero3);
}
else if(numero > numero2 && numero2 < numero3 && numero3 < numero){ //4 2 3
    document.write("numero 1 =" +numero);
    document.write("<br>numero 2 =" +numero2); 
    document.write("<br>numero 3 =" +numero3);    

    document.write("<br>El número mayor es " + numero);
    document.write("<br> El número menor es " + numero2);
}

else if(numero < numero2 && numero2 > numero3 && numero3 > numero){ //2 4 3
    document.write("numero 1 =" +numero);
    document.write("<br>numero 2 =" +numero2); 
    document.write("<br>numero 3 =" +numero3);    

    document.write("<br>El número mayor es " + numero2);
    document.write("<br>El número menor es " + numero);
}
else if(numero < numero2 && numero2 > numero3 && numero3 < numero){ //3 4 2
    document.write("numero 1 =" +numero);
    document.write("<br>numero 2 =" +numero2); 
    document.write("<br>numero 3 =" +numero3);    

    document.write("<br>El número mayor es " + numero2);
    document.write("<br>El número menor es " + numero3);

    //comprobar todo
}