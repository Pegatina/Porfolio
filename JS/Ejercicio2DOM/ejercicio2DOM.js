function cogeValor(){
    //todas las funciones reciben la validación
    validacion();
}
function cogeValor2(){
   validacion();
}
function cogeValor3(){
    validacion();
}
function cogeValor4(){
   validacion();      
}
function validacion(){   
    // establezco 4 comprobaciones para que puedan introducirse los datos en cualquier orden. 
    var ok = false;
    var ok2 = false;
    var ok3 = false;
    var ok4 = false;
    //obtengo el contenido escrito de cada elemento
    var valor = document.getElementById("nombre").value;    
    var valor2 = document.getElementById("email").value;  
    //inicializo un contador para comprobar el email 
    var contador=0;
    var valor3 = document.getElementById("pass").value;
    var valor4 = document.getElementById("pass2").value;
    //si el nombre no contiene nada mandará un error.
    if(valor.length == 0){       
        ok = false;
    }
    else{
        ok = true;
    }  
    //recorro el email caracter a caracter
	for (var i = 0; i < valor2.length; i++) { 
	    if(valor2[i] == "@"){
	    contador++;
        }
	}
    //si no se encuentra @ no es válido.
    if(contador == 0){	       
        ok2 = false;
	}else{
        ok2 = true;
    }
    //lo mismo que con el nombre
    if(valor3.length == 0){        
        ok3 = false;
    }
    else{
        ok3 = true;
    }
    //si no contiene nada o el valor que contiene es distinto del de la contraseña, no es válido.
    if(valor4.length == 0 || valor4 != valor3){
        ok4 = false;        
    }else{
        ok4 = true;
    }

    //primera comprobación: falta el nombre
    if (ok == false && ok2 && ok3 && ok4){
        var texto = document.getElementById("error");
        //cambiamos el contenido del párrafo
        texto.textContent = "Debes introducir un nombre.";
        //le damos un color
        texto.setAttribute("style","color:red");
        //y lo mostramos
        error.removeAttribute("hidden");        
    }
    //lo mismo con el email
    else if(ok2 == false && ok && ok3 && ok4){
        var texto = document.getElementById("error");
        texto.textContent = "Debes introducir un correo válido.";
        texto.setAttribute("style","color:red");
        error.removeAttribute("hidden");        
    }
    //y con la contraseña
    else if(ok3 == false && ok && ok2 && ok4){
        var texto = document.getElementById("error");
        texto.textContent = "Debes introducir una contraseña.";
        texto.setAttribute("style","color:red");
        error.removeAttribute("hidden");        
    }
    //y con la repetición de la contraseña, 
    //principalmente va a salir este mensaje y no el otro porque vacío sigue siendo contenido a comparar.
    else if(ok4 == false && ok && ok2 && ok3){
        var texto = document.getElementById("error");
        texto.textContent = "La contraseña introducida no es válida.";
        texto.setAttribute("style","color:red");
        error.removeAttribute("hidden");        
    }
    //si todo está bien activamos el botón y borramos el contenido del texto de error,
    //he intentado volverlo a ocultar pero al navegador no le gusta.
    else if(ok && ok2 && ok3 & ok4){
        var boton = document.getElementById("boton");
        boton.removeAttribute("disabled");            
        error.textContent = ""; 
    }
    //mensaje que saldrá al principio hasta que todo esté correctamente o falte solo un apartado.   
    else{
        var texto = document.getElementById("error");
        texto.textContent = "No puedes dejar ningún apartado vacío.";
        texto.setAttribute("style","color:red");
        error.removeAttribute("hidden");        
    }
}