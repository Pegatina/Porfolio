function comprar(){    
    var butacas = parseInt(prompt("Introduce el numero de entradas a reservar"));
    var fondo = document.getElementById("fondo");
    var boton = document.getElementById("boton");
    var tabla = document.getElementById("tabla");
    var texto = document.getElementById("texto");
    var contador = document.getElementById("contador");       
    if(butacas > 10){
        alert("No puedes reservar mas de 10 butacas de una vez.");
    }
    else if (butacas != 0){   
        //ocultamos lo visible y mostramos lo invisible para dar el efecto de cambiar de pantalla         
        fondo.setAttribute("style","visibility: hidden");
        boton.setAttribute("style","visibility: hidden");
        tabla.setAttribute("style", "visibility: visible");
        texto.setAttribute("style", "visibility: visible");
        contador.setAttribute("style", "visibility: visible");   
        //asignamos al contenido de la etiqueta el número que hemos pedido 
        contador.innerHTML = butacas;        
    }
    else{        
    }
}
function cambiar1(){
    //con esta línea cuando clickas la imagen la cambia por otra
    var butaca = document.getElementById("butaca1").src="./Multimedia_cine/butaca_negra.png";   
    //rescatamos el texto interno del contador, previamente cambiado con la función comprar 
    var contador = document.getElementById("contador").innerHTML;    
    //le restamos uno por cada click
    contador = contador-1;    
    //creamos otra variable que contenga el mismo id
    var contador2 = document.getElementById("contador");
    //para asignarle el contenido de la anterior variable.
    contador2.innerHTML = contador;
    //si el contador llega a 0, revertimos la visibilidad de la página.
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    //como antes, declaramos otra variable con el mismo id de un elemento para actuar en su propiedad.
    //así, no seguirá descontando aunque pinchemos en la butaca ya cambiada.
    var butaca2 = document.getElementById("butaca1").removeAttribute("onclick");    
}
function cambiar2(){
    var butaca = document.getElementById("butaca2").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca2").removeAttribute("onclick");    
}
function cambiar3(){
    var butaca = document.getElementById("butaca3").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca3").removeAttribute("onclick");    
}
function cambiar4(){
    var butaca = document.getElementById("butaca4").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca4").removeAttribute("onclick");    
}
function cambiar5(){
    var butaca = document.getElementById("butaca5").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca5").removeAttribute("onclick");    
}
function cambiar6(){
    var butaca = document.getElementById("butaca6").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca6").removeAttribute("onclick");    
}
function cambiar7(){
    var butaca = document.getElementById("butaca7").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca7").removeAttribute("onclick");    
}
function cambiar8(){
    var butaca = document.getElementById("butaca8").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca8").removeAttribute("onclick");    
}
function cambiar9(){
    var butaca = document.getElementById("butaca9").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca9").removeAttribute("onclick");    
}
function cambiar10(){
    var butaca = document.getElementById("butaca10").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca10").removeAttribute("onclick");    
}
function cambiar11(){
    var butaca = document.getElementById("butaca11").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca11").removeAttribute("onclick");    
}
function cambiar12(){
    var butaca = document.getElementById("butaca12").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca12").removeAttribute("onclick");    
}
function cambiar13(){
    var butaca = document.getElementById("butaca13").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca13").removeAttribute("onclick");    
}
function cambiar14(){
    var butaca = document.getElementById("butaca14").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca14").removeAttribute("onclick");    
}
function cambiar15(){
    var butaca = document.getElementById("butaca15").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca15").removeAttribute("onclick");    
}
function cambiar16(){
    var butaca = document.getElementById("butaca16").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca16").removeAttribute("onclick");    
}
function cambiar17(){
    var butaca = document.getElementById("butaca17").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca17").removeAttribute("onclick");    
}
function cambiar18(){
    var butaca = document.getElementById("butaca18").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca18").removeAttribute("onclick");    
}
function cambiar19(){
    var butaca = document.getElementById("butaca19").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca19").removeAttribute("onclick");    
}
function cambiar20(){
    var butaca = document.getElementById("butaca20").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca20").removeAttribute("onclick");    
}
function cambiar21(){
    var butaca = document.getElementById("butaca21").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca21").removeAttribute("onclick");    
}
function cambiar22(){
    var butaca = document.getElementById("butaca22").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca22").removeAttribute("onclick");    
}
function cambiar23(){
    var butaca = document.getElementById("butaca23").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca23").removeAttribute("onclick");    
}
function cambiar24(){
    var butaca = document.getElementById("butaca24").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca24").removeAttribute("onclick");    
}
function cambiar25(){
    var butaca = document.getElementById("butaca25").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca25").removeAttribute("onclick");    
}
function cambiar26(){
    var butaca = document.getElementById("butaca26").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca26").removeAttribute("onclick");    
}
function cambiar27(){
    var butaca = document.getElementById("butaca27").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca27").removeAttribute("onclick");    
}
function cambiar28(){
    var butaca = document.getElementById("butaca28").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca28").removeAttribute("onclick");    
}
function cambiar29(){
    var butaca = document.getElementById("butaca29").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca29").removeAttribute("onclick");    
}
function cambiar30(){
    var butaca = document.getElementById("butaca30").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca30").removeAttribute("onclick");    
}
function cambiar31(){
    var butaca = document.getElementById("butaca31").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca31").removeAttribute("onclick");    
}
function cambiar32(){
    var butaca = document.getElementById("butaca32").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca32").removeAttribute("onclick");    
}
function cambiar33(){
    var butaca = document.getElementById("butaca33").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca33").removeAttribute("onclick");    
}
function cambiar34(){
    var butaca = document.getElementById("butaca34").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca34").removeAttribute("onclick");    
}
function cambiar35(){
    var butaca = document.getElementById("butaca35").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca35").removeAttribute("onclick");    
}
function cambiar36(){
    var butaca = document.getElementById("butaca36").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca36").removeAttribute("onclick");    
}
function cambiar37(){
    var butaca = document.getElementById("butaca37").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca37").removeAttribute("onclick");    
}
function cambiar38(){
    var butaca = document.getElementById("butaca38").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca38").removeAttribute("onclick");    
}
function cambiar39(){
    var butaca = document.getElementById("butaca39").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca39").removeAttribute("onclick");    
}
function cambiar40(){
    var butaca = document.getElementById("butaca40").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca40").removeAttribute("onclick");    
}
function cambiar41(){
    var butaca = document.getElementById("butaca41").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca41").removeAttribute("onclick");    
}
function cambiar42(){
    var butaca = document.getElementById("butaca42").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca42").removeAttribute("onclick");    
}
function cambiar43(){
    var butaca = document.getElementById("butaca43").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca43").removeAttribute("onclick");    
}
function cambiar44(){
    var butaca = document.getElementById("butaca44").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca44").removeAttribute("onclick");    
}
function cambiar45(){
    var butaca = document.getElementById("butaca45").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca45").removeAttribute("onclick");    
}
function cambiar46(){
    var butaca = document.getElementById("butaca46").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca46").removeAttribute("onclick");    
}
function cambiar47(){
    var butaca = document.getElementById("butaca47").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca47").removeAttribute("onclick");    
}
function cambiar48(){
    var butaca = document.getElementById("butaca48").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca48").removeAttribute("onclick");    
}
function cambiar49(){
    var butaca = document.getElementById("butaca49").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca49").removeAttribute("onclick");    
}
function cambiar50(){
    var butaca = document.getElementById("butaca50").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca50").removeAttribute("onclick");    
}
function cambiar51(){
    var butaca = document.getElementById("butaca51").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca51").removeAttribute("onclick");    
}
function cambiar52(){
    var butaca = document.getElementById("butaca52").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca52").removeAttribute("onclick");    
}
function cambiar53(){
    var butaca = document.getElementById("butaca53").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca53").removeAttribute("onclick");    
}
function cambiar54(){
    var butaca = document.getElementById("butaca54").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca54").removeAttribute("onclick");    
}
function cambiar55(){
    var butaca = document.getElementById("butaca55").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca55").removeAttribute("onclick");    
}
function cambiar56(){
    var butaca = document.getElementById("butaca56").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca56").removeAttribute("onclick");    
}
function cambiar57(){
    var butaca = document.getElementById("butaca57").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca57").removeAttribute("onclick");    
}
function cambiar58(){
    var butaca = document.getElementById("butaca58").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca58").removeAttribute("onclick");    
}
function cambiar59(){
    var butaca = document.getElementById("butaca59").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca59").removeAttribute("onclick");    
}
function cambiar60(){
    var butaca = document.getElementById("butaca60").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca60").removeAttribute("onclick");    
}
function cambiar61(){
    var butaca = document.getElementById("butaca61").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca61").removeAttribute("onclick");    
}
function cambiar62(){
    var butaca = document.getElementById("butaca62").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca62").removeAttribute("onclick");    
}
function cambiar63(){
    var butaca = document.getElementById("butaca63").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca63").removeAttribute("onclick");    
}
function cambiar64(){
    var butaca = document.getElementById("butaca64").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca64").removeAttribute("onclick");    
}
function cambiar65(){
    var butaca = document.getElementById("butaca65").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca65").removeAttribute("onclick");    
}
function cambiar66(){
    var butaca = document.getElementById("butaca66").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca66").removeAttribute("onclick");    
}
function cambiar67(){
    var butaca = document.getElementById("butaca67").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca67").removeAttribute("onclick");    
}
function cambiar68(){
    var butaca = document.getElementById("butaca68").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca68").removeAttribute("onclick");    
}
function cambiar69(){
    var butaca = document.getElementById("butaca69").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca69").removeAttribute("onclick");    
}
function cambiar70(){
    var butaca = document.getElementById("butaca70").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca70").removeAttribute("onclick");    
}
function cambiar71(){
    var butaca = document.getElementById("butaca71").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca71").removeAttribute("onclick");    
}
function cambiar72(){
    var butaca = document.getElementById("butaca72").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca72").removeAttribute("onclick");    
}
function cambiar73(){
    var butaca = document.getElementById("butaca73").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca73").removeAttribute("onclick");    
}
function cambiar74(){
    var butaca = document.getElementById("butaca74").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca74").removeAttribute("onclick");    
}
function cambiar75(){
    var butaca = document.getElementById("butaca75").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca75").removeAttribute("onclick");    
}
function cambiar76(){
    var butaca = document.getElementById("butaca76").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca76").removeAttribute("onclick");    
}
function cambiar77(){
    var butaca = document.getElementById("butaca77").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca77").removeAttribute("onclick");    
}
function cambiar78(){
    var butaca = document.getElementById("butaca78").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca78").removeAttribute("onclick");    
}
function cambiar79(){
    var butaca = document.getElementById("butaca79").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca79").removeAttribute("onclick");    
}
function cambiar80(){
    var butaca = document.getElementById("butaca80").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca80").removeAttribute("onclick");    
}
function cambiar81(){
    var butaca = document.getElementById("butaca81").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca81").removeAttribute("onclick");    
}
function cambiar82(){
    var butaca = document.getElementById("butaca82").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca82").removeAttribute("onclick");    
}
function cambiar83(){
    var butaca = document.getElementById("butaca83").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca83").removeAttribute("onclick");    
}
function cambiar84(){
    var butaca = document.getElementById("butaca84").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca84").removeAttribute("onclick");    
}
function cambiar85(){
    var butaca = document.getElementById("butaca85").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca85").removeAttribute("onclick");    
}
function cambiar86(){
    var butaca = document.getElementById("butaca86").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca86").removeAttribute("onclick");    
}
function cambiar87(){
    var butaca = document.getElementById("butaca87").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca87").removeAttribute("onclick");    
}
function cambiar88(){
    var butaca = document.getElementById("butaca88").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca88").removeAttribute("onclick");    
}
function cambiar89(){
    var butaca = document.getElementById("butaca89").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca89").removeAttribute("onclick");    
}
function cambiar90(){
    var butaca = document.getElementById("butaca90").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca90").removeAttribute("onclick");    
}
function cambiar91(){
    var butaca = document.getElementById("butaca91").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca91").removeAttribute("onclick");    
}
function cambiar92(){
    var butaca = document.getElementById("butaca92").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca92").removeAttribute("onclick");    
}
function cambiar93(){
    var butaca = document.getElementById("butaca93").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca93").removeAttribute("onclick");    
}
function cambiar94(){
    var butaca = document.getElementById("butaca94").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca94").removeAttribute("onclick");    
}
function cambiar95(){
    var butaca = document.getElementById("butaca95").src="./Multimedia_cine/butaca_negra.png";    
    var contador = document.getElementById("contador").innerHTML;    
    contador = contador-1;    
    var contador2 = document.getElementById("contador");
    contador2.innerHTML = contador;
    if(contador2.innerHTML == 0){
        var fondo = document.getElementById("fondo");
        var boton = document.getElementById("boton");
        var tabla = document.getElementById("tabla");
        var texto = document.getElementById("texto");
        var contador = document.getElementById("contador");
        fondo.setAttribute("style","visibility: visible");
        boton.setAttribute("style","visibility: visible");
        tabla.setAttribute("style", "visibility: hidden");
        texto.setAttribute("style", "visibility: hidden");
        contador.setAttribute("style", "visibility: hidden");       
    }
    var butaca2 = document.getElementById("butaca95").removeAttribute("onclick");    
}