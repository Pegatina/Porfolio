function abajoAficiones(){
    var futbol = document.getElementById("futbol").checked;
    var baloncesto = document.getElementById("baloncesto").checked;
    var mma = document.getElementById("mma").checked;
    var futbol2 = document.getElementById("futbol2");
    var baloncesto2 = document.getElementById("baloncesto2");
    var mma2 = document.getElementById("mma2");
    if(futbol == true){        
        futbol2.checked = true;
    }else{
        futbol2.checked = false;
    } 
    if(baloncesto == true){        
        baloncesto2.checked = true;
    }else{
        baloncesto2.checked = false;
    }
    if(mma == true){        
        mma2.checked = true;
    }else{
        mma2.checked = false;
    }
    
}
function abajoEscribirAlgo(){
    var escritura = document.getElementById("escritura");
    var escritura2 = document.getElementById("escritura2");
    escritura2.value = escritura.value;
}
function abajoCategoria(){
    var categoria1 = document.getElementById("categoria1").checked;
    var categoria2 = document.getElementById("categoria2").checked;
    var categoria3 = document.getElementById("categoria3").checked;
   if(categoria1 == true){
        var categoria1_2 = document.getElementById("categoria1_2");
        categoria1_2.setAttribute("checked", "true");
    }
    else if(categoria2 == true){
        var categoria2_2 = document.getElementById("categoria2_2");
        categoria2_2.setAttribute("checked", "true");
    }
    else if(categoria3 == true){
        var categoria3_2 = document.getElementById("categoria3_2");
        categoria3_2.setAttribute("checked", "true");
    }
}
function abajoOpcion(){
    var opcion = document.getElementById("opciones").value;
    if(opcion == "opcion1"){
        document.getElementById("opciones2").value = "opcion1";
    }else if(opcion == "opcion2"){
        document.getElementById("opciones2").value = "opcion2";
    }else if(opcion == "opcion3"){
        document.getElementById("opciones2").value = "opcion3";
    }else if(opcion == "opcion4"){
        document.getElementById("opciones2").value = "opcion4";
    }   
}
function abajoPreferencia(){
    var preferencia = document.getElementById("preferencia").value;
    document.getElementById("preferencia2").value= preferencia; 
}
function abajoSuge(){
    var sugerencias = document.getElementById("sugerencias").value;
    document.getElementById("sugerencias2").value = sugerencias;
}
function enciendeAmbos(){
    var encender = document.getElementById("encender");  
    var circulo = document.getElementById("circulo");
    var circulo2 = document.getElementById("circulo2");
    circulo.setAttribute("style", "background-color: red");
    circulo2.setAttribute("style", "background-color: red");
    encender.innerHTML = "Apagar";
    encender.setAttribute("onclick", "apagar()");
}
function apagar(){
    var encender = document.getElementById("encender");  
    var circulo = document.getElementById("circulo");
    var circulo2 = document.getElementById("circulo2");
    circulo.setAttribute("style", "background-color: white");
    circulo2.setAttribute("style", "background-color: white");
    encender.innerHTML = "Encender";
    encender.setAttribute("onclick", "enciendeAmbos()");
}