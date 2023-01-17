//MENU TOP
//do while 
//Crear un menú con 3 opciones, cada una de ellas es un submenu
//de cada menu se sale con la opción 0

//1. Calculadora normal
    //1. Sumar
    //2. Restar
    //3.Multiplicar
    //4.Dividir
    //0. Salir
//2. Calculadora especial
    //1. Calcular el factorial
    //2. Pasar decimal a binario
    //0. Salir
//3. Registro de clientes
    //1. Pedir (nombre, apellidos, dni, dirección)
    //2. Mostrar
    //0. Salir
//0. Salir

//declaro las funciones fuera para que funcionen, en el caso de las funciones 
//del factorial y de conversión de decimal a binario no es necesario, puesto que inician y terminan en el mismo sitio.

function pedirDatos(){
    //declaro el array contenedor
    var datos = new Array();
    var nombre = prompt("Introduce un nombre: ");
    //le añado cada dato con push.
    datos.push(nombre);
    var apellidos = prompt("Introduce sus apellidos: ");
    datos.push(apellidos);
    var dni = prompt("Introduce su DNI: ");
    datos.push(dni);
    var direccion = prompt("Introduce su dirección: ");
    datos.push(direccion);
    //como necesito los datos tanto para el array de datos totales como para la función de mostrarlos,
    // lo devuelvo con return
    return datos;
}
//creo un array que contenga cada registro de datos
var datosTotales = new Array();

function mostrarDatos(){                    
    //hay que recorrer el array de todos los datos aquí                    
    for(var i = 0; i<datosTotales.length;i++){ //hasta el final del array.
        alert(datosTotales[i]); //recorremos cada índice y lo mostramos en un alert.
    }
}

do{
    alert("Menú TOP\n\n 1. Calculadora normal\n 2. Calculadora especial\n 3. Registro de clientes\n 0. Salir\n\n");    
    var numero = parseInt(prompt("Introduce un número para acceder a uno de los menús o 0 para salir")); 
    do{
        if(numero == 1){
            alert("Menú Calculadora normal\n\n 1. Sumar\n 2. Restar\n 3. Multiplicar\n 4. Dividir \n 0. Salir\n\n");            
            var numero2 = parseInt(prompt("Introduce un número para acceder a uno de los menús o 0 para volver al anterior menú")); 
            if(numero2 == 0){
                break;
            }       
            else if(numero2 == 1){
                function sumar(){
                    var num1 = parseInt(prompt("Introduce el primer número: "));
                    var num2 = parseInt(prompt("Introduce el segundo número: "));
                    return num1+num2;             
                }
                alert("El resultado es: "+ sumar());
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú")); 
            }
            else if (numero2 == 2){
                function restar(){
                    var num1 = parseInt(prompt("Introduce el primer número: "));
                    var num2 = parseInt(prompt("Introduce el segundo número: "));
                    return num1-num2;             
                }
                alert("El resultado es: "+ restar());
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú")); 
            }
            else if(numero2 == 3){
                function multiplicar(){
                    var num1 = parseInt(prompt("Introduce el primer número: "));
                    var num2 = parseInt(prompt("Introduce el segundo número: "));
                    return num1*num2;             
                }
                alert("El resultado es: "+ multiplicar());
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú")); 
            }
            else if(numero2 == 4){
                function dividir(){
                    var num1 = parseInt(prompt("Introduce el primer número: "));
                    var num2 = parseInt(prompt("Introduce el segundo número: "));
                    return num1/num2;             
                }
                alert("El resultado es: "+ dividir());
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú")); 
            }
            else{
                alert("¿Dónde vas, pistolero?");
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú")); 
            }                        
        }
        else if(numero == 2){
            alert("Menú Calculadora especial\n\n 1. Calcular el factorial de un número\n 2. Pasar un número decimal a binario\n 0. Salir\n\n");            
            var numero2 = parseInt(prompt("Introduce un número para acceder a uno de los menús o 0 para volver al anterior menú")); 
            if(numero2 == 0){
                break;
            }       
            else if(numero2 == 1){
                function factorial(){
                    var num = parseInt(prompt("Introduce el número del que quieres saber su factorial: "));  
                    var factorial = 1;
                    for(var i=1; i<=num; i++) {
                        //el número factorial de un número es el que multiplica ese número por todos los anteriores
                        //o, lo que es lo mismo, multiplica números hasta el número dado.
                          factorial *= i;
                    }                                            
                    return factorial;             
                }
                alert("El resultado es: "+ factorial());
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú")); 
            }
            else if (numero2 == 2){
                function dec_binario(){
                    var num = parseInt(prompt("Introduce el número decimal para la conversión a binario: "));  
                    var binario = 0;
                    var contador = 1;
                    //mientras que el cociente a dividir no sea 0
                    while(num!=0){
                        //almacenamos el resto de dividir entre 2 (binario, potencias de 2)
                        var resto = num%2;
                        //convertimos a int el resultado de la división para no tener decimales y lo almacenamos
                        num = parseInt(num/2);
                        //el binario almacena su anterior resultado más la multiplicación del resto por el contador                        
                        binario += resto * contador;
                        //que es en realidad un decimal (potencias de 10), así, cada número irá contando una posición a la izq más que el anterior, al irse sumando.
                        contador *=10;                    
                    }                                           
                    return binario;             
                }
                alert("El resultado es: "+ dec_binario());
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú")); 
            }
            else{
                alert("¿Dónde vas, pistolero?");
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú")); 
            }      
        }
        else if(numero == 3){
            alert("Menú Registro de clientes\n\n 1. Pedir datos\n 2. Mostrar datos\n 0. Salir\n\n");            
            var numero2 = parseInt(prompt("Introduce un número para acceder a uno de los menús o 0 para volver al anterior menú"));             
            if(numero2 == 0){
                break;
            }       
            else if(numero2 == 1){
                //se declaran las funciones primero fuera, le añadimos al array el resultado de la función.
                //cada vez que entra va añadiendo hasta que acaba el programa total.                  
                    datosTotales.push(pedirDatos());
                    alert("Los datos han sido almacenados.");                    
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú")); 
            }
            else if (numero2 == 2){   
                //como muestra los datos mediante alerts, se invoca tal cual.                      
                mostrarDatos();
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú"));                 
            }
            else{
                alert("¿Dónde vas, pistolero?");
                numero2 =  parseInt(prompt("Introduce 0 para volver al anterior menú")); 
            }                       
        }                     
    }while(numero!=0);    
}while(numero!=0);