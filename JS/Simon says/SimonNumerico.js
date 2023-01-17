function pulsar1(){    
    var button2 = document.getElementById("Boton2");    
    button2.disabled = false; // habilitamos
    //button2.removeAttribute("disabled"); //Otra forma de hacerlo
    var button1 = document.getElementById("Boton1");
    button1.disabled = true; //y viceversa   
    //button1.setAttribute("disabled","");
}
function pulsar2(){    
    var button3 = document.getElementById("Boton3");    
    button3.disabled = false; // habilitamos
    var button2 = document.getElementById("Boton2");
    button2.disabled = true; //y viceversa   
}
function pulsar3(){    
    var button4 = document.getElementById("Boton4");    
    button4.disabled = false; // habilitamos
    var button3 = document.getElementById("Boton3");
    button3.disabled = true; //y viceversa   
}
function pulsar4(){    
    var button5 = document.getElementById("Boton5");    
    button5.disabled = false; // habilitamos
    var button4 = document.getElementById("Boton4");
    button4.disabled = true; //y viceversa   
}
function pulsar5(){    
    var button6 = document.getElementById("Boton6");    
    button6.disabled = false; // habilitamos
    var button5 = document.getElementById("Boton5");
    button5.disabled = true; //y viceversa   
}
function pulsar6(){    
    var button7 = document.getElementById("Boton7");    
    button7.disabled = false; // habilitamos
    var button6 = document.getElementById("Boton6");
    button6.disabled = true; //y viceversa   
}
function pulsar7(){    
    var button8 = document.getElementById("Boton8");    
    button8.disabled = false; // habilitamos
    
    var button7 = document.getElementById("Boton7");
    button7.disabled = true; //y viceversa     
}
function pulsar8(){    
    var button9 = document.getElementById("Boton9");    
    button9.disabled = false; // habilitamos
    var button8 = document.getElementById("Boton8");
    button8.disabled = true; //y viceversa   
}
function pulsar9(){    
    var button9 = document.getElementById("Boton9");    
    button9.innerHTML="Felicidades!";    
    button9.setAttribute("style","color: blueviolet");
}

