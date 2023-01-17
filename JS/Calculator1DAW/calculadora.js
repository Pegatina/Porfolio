function pulsar1(){  
    //llamamos directamente al valor y le sumamos 1 cada vez que se pulse, como no tenía ningún valor, parte de 1.     
   document.getElementById("pantalla").value += 1;   
}
function pulsar2(){       
    document.getElementById("pantalla").value += 2;   
 }
 function pulsar3(){       
    document.getElementById("pantalla").value += 3;   
 }
 function pulsar4(){       
    document.getElementById("pantalla").value += 4;   
 }
 function pulsar5(){       
    document.getElementById("pantalla").value += 5;   
 }
 function pulsar6(){       
    document.getElementById("pantalla").value += 6;   
 }
 function pulsar7(){       
    document.getElementById("pantalla").value += 7;   
 }
 function pulsar8(){       
    document.getElementById("pantalla").value += 8;   
 }
 function pulsar9(){       
    document.getElementById("pantalla").value += 9;   
 }
 function pulsar0(){       
    document.getElementById("pantalla").value += 0;   
 }
 function reset(){
     //null hace que se borre todo lo que hubiera
    document.getElementById("pantalla").value = null;   
 }
 function borrar(){
    var pantalla = document.getElementById("pantalla").value;
    //los valores que contiene un input son una string
    //substring permite cortar trozos de una string a ambos lados, como solo quiero cortar al final, el primer valor es 0
    //el segundo valor es length -1, lo almaceno en una variable
    var borrar = pantalla.substring(0, pantalla.length -1);
    //porque para cambiarlo tengo que volver a llamar al valor de la id y asignarle el nuevo valor
    document.getElementById("pantalla").value = borrar;
 }
 function cambiarSigno(){
    var pantalla = document.getElementById("pantalla").value
    //variable que invierte el signo cogiendo la string de la pantalla
    var signo = - pantalla;
    //volvemos a llamarlo y se lo añadimos
    document.getElementById("pantalla").value = signo;
 }
 function pulsarComa(){
   var pantalla = document.getElementById("pantalla").value;  
    if(!pantalla.includes(".")){
        document.getElementById("pantalla").value +=".";
    }
 }
 function pulsarIgual(){    
     var pantalla = document.getElementById("pantalla").value;
     //si la pantalla no contiene "=", añade uno, así evito que añada más.
    /*if(!pantalla.includes("=")){
        document.getElementById("pantalla").value +="=";
    }*/
    if(pantalla.includes("%")){
        var pantalla = document.getElementById("pantalla").value;       
        //devuelve  la posición del carácter indicado
        var operacion = pantalla.indexOf("*");
        //para sacar un porcentaje los números deben estar tal que "5*5%="
        //primero cogemos el primer valor hasta antes de *, y lo multiplicamos por el segundo valor entre * y % dividido entre 100
       var resultado = parseFloat(pantalla.substring(0, operacion) * (pantalla.substring(operacion + 1, pantalla.length-1) /100));
       //le cambiamos el valor a la pantalla por el del resultado
       document.getElementById("pantalla").value = resultado;           
    }  
    else if(pantalla.includes("*") && !pantalla.includes("%")){
      var operacion = pantalla.indexOf("*");
      var resultado = parseFloat(pantalla.substring(0, operacion) * pantalla.substring(operacion + 1, pantalla.length));
      document.getElementById("pantalla").value = resultado;      
   }
   else if(pantalla.includes("/") && !pantalla.includes("%")){
      var operacion = pantalla.indexOf("/");
      //float porque es posible que dé decimales
      var resultado = parseFloat(pantalla.substring(0, operacion) / pantalla.substring(operacion + 1, pantalla.length));
      document.getElementById("pantalla").value = resultado;      
   }
   else if(pantalla.includes("+")){
      var operacion = pantalla.indexOf("+");
      //float porque es posible que dé decimales, float internos porque si no lo concatena en vez de sumarlo
      var resultado = parseFloat(parseFloat(pantalla.substring(0, operacion)) + parseFloat(pantalla.substring(operacion + 1, pantalla.length)));
      document.getElementById("pantalla").value = resultado;      
   }
   else if(pantalla.includes("-")){
      var operacion = pantalla.indexOf("-");
      //float porque es posible que dé decimales, float internos para que reste bien
      var resultado = parseFloat(parseFloat(pantalla.substring(0, operacion)) - parseFloat(pantalla.substring(operacion + 1, pantalla.length)));
      document.getElementById("pantalla").value = resultado;      
   }
 } 
 function porciento(){
    var pantalla = document.getElementById("pantalla").value;  
    if(!pantalla.includes("%")){
        document.getElementById("pantalla").value +="%";
    }     
 }
 function dividir(){
   var pantalla = document.getElementById("pantalla").value;  
   if(!pantalla.includes("/")){
       document.getElementById("pantalla").value +="/";
   }
 }
 function multiplicar(){
    var pantalla = document.getElementById("pantalla").value;  
    if(!pantalla.includes("*")){
        document.getElementById("pantalla").value +="*";
    }     
 }
 function restar(){
   var pantalla = document.getElementById("pantalla").value;  
   if(!pantalla.includes("-")){
       document.getElementById("pantalla").value +="-";
   }
 }
 function sumar(){
   var pantalla = document.getElementById("pantalla").value;  
   if(!pantalla.includes("+")){
       document.getElementById("pantalla").value +="+";
   }
 }
