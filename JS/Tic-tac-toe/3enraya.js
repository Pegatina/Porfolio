//variable global para poder enchufarla luego al guardar
var ficha;
//función a la que le pasamos un id, teniendo previamente en el html las fichas del j1 con la función.
function pulsarficha(id){      
    //obtengo la ficha según su id
    ficha = document.getElementById(id);    
    //obtengo los huecos por su clase       
   var huecos= document.getElementsByClassName('hueco');   

   //recorro para mostrar los huecos, para poderlos usar
    for(var i = 0; i< huecos.length; i++){
        huecos[i].setAttribute("style","visibility: visible");
    }
    //devuelvo la ficha que pulso
    return ficha;    
}
//función que permite guardar una ficha dado el id de un hueco, previamente dado en el html en cada uno.
function guardarficha(id){  
    //obtenemos el hueco/posición del que se pulsa    
    var pos = document.getElementById(id);  
    //obtennemos las fichas de cada jugador
    var jugador1 = document.getElementsByClassName("j1");
    var jugador2 = document.getElementsByClassName("j2");
    //obtenemos todos los huecos por la clase
    var huecos= document.getElementsByClassName("hueco");      

    //antes de meter la ficha dentro de un hueco, compruebo los huecos ocupados
    
    if(ficha.parentElement.getAttribute("class")== "ocupado"){  //si el padre de la ficha está ocupado
        ficha.parentElement.setAttribute("class","hueco"); //si lo pincho para sacarlo se pone en hueco
        ficha.parentElement.setAttribute("onclick","guardarficha('"+ficha.parentElement.getAttribute("id")+"')");  //le devuelvo el onclick
    }

	//esto hace que se meta dentro del div del hueco el elemento que queramos, en este caso la ficha que tenemos pulsada.
	pos.appendChild(ficha);
    //recorro los huecos para ocultarlos
	for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
            //pero muestro la ficha que tiene dentro
            ficha.setAttribute("style","visibility: visible");
        }
	
	// y le cambio la clase para que no se remarque al elegir nueva ficha
	pos.setAttribute("class","ocupado");    
    // desactivamos la interacción con el hueco porque ahora está ocupado
	pos.setAttribute("onclick","");        

	//cambio de turnos
	if(ficha.getAttribute("class")=="j1"){
		document.getElementById("h1").innerHTML = "Es el turno del jugador 2";
        //miramos las fichas del jugador 2 y les ponemos la función de pulsar ficha
		for(let i=0;i<jugador2.length;i++){
            //para ello, de cada ficha obtenemos su id en cada iteración, y se lo pasamos como parámetro a la función pulsarficha
			jugador2[i].setAttribute("onclick","pulsarficha('"+jugador2[i].getAttribute("id")+"')");
		}
        //desactivamos las del jugador 1
		for(let i=0;i<jugador1.length;i++){
			jugador1[i].setAttribute("onclick","");
		}
	}
	else{
        //en el siguiente turno, lo invertimos
		document.getElementById("h1").innerHTML = "Es el turno del jugador 1";
		for(let i=0;i<jugador1.length;i++){
			jugador1[i].setAttribute("onclick","pulsarficha('"+jugador1[i].getAttribute("id")+"')");
		}
		for(let i=0;i<jugador2.length;i++){
			jugador2[i].setAttribute("onclick","");
		}
	}    
    comprobar();
}
function comprobar(){
    //almacenamos los id y las clases de todo porque queremos mostrar u ocultar
    var jugador1 = document.getElementsByClassName("j1");
    var jugador2 = document.getElementsByClassName("j2");
    var huecos= document.getElementsByClassName("hueco");
    var pos1 = document.getElementById("pos1");
    var pos2 = document.getElementById("pos2");
    var pos3 = document.getElementById("pos3");
    var pos4 = document.getElementById("pos4");
    var pos5 = document.getElementById("pos5");
    var pos6 = document.getElementById("pos6");
    var pos7 = document.getElementById("pos7");
    var pos8 = document.getElementById("pos8");
    var pos9 = document.getElementById("pos9");
    var win = document.getElementById("win");
    var fondo = document.getElementById("fondo");
    var h1 = document.getElementById("h1");
    //primera fila de verdes arriba, match mira si son de la clase entre comillas
    if(pos1.innerHTML.match("j1") && pos2.innerHTML.match("j1") && pos3.innerHTML.match("j1")){
        
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //segunda fila de verdes
    else if(pos4.innerHTML.match("j1") && pos5.innerHTML.match("j1") && pos6.innerHTML.match("j1")){
        
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //tercera fila de verdes
    else if(pos7.innerHTML.match("j1") && pos8.innerHTML.match("j1") && pos9.innerHTML.match("j1")){
        
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //primera columna verdes
    else if(pos1.innerHTML.match("j1") && pos4.innerHTML.match("j1") && pos7.innerHTML.match("j1")){
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //segunda columna verdes
    else if(pos2.innerHTML.match("j1") && pos5.innerHTML.match("j1") && pos8.innerHTML.match("j1")){
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
     //tercera columna verdes
     else if(pos3.innerHTML.match("j1") && pos6.innerHTML.match("j1") && pos9.innerHTML.match("j1")){
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //diagonal 1 verdes
    else if(pos1.innerHTML.match("j1") && pos5.innerHTML.match("j1") && pos9.innerHTML.match("j1")){
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //diagonal 2 verdes, todos los movimientos de verde hechos
    else if(pos3.innerHTML.match("j1") && pos5.innerHTML.match("j1") && pos7.innerHTML.match("j1")){
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //fila 1 rojos
    if(pos1.innerHTML.match("j2") && pos2.innerHTML.match("j2") && pos3.innerHTML.match("j2")){
        
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //fila 2 rojos
    if(pos4.innerHTML.match("j2") && pos5.innerHTML.match("j2") && pos6.innerHTML.match("j2")){
        
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //fila 3 rojos
    if(pos7.innerHTML.match("j2") && pos8.innerHTML.match("j2") && pos9.innerHTML.match("j2")){
        
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //columna 1 rojos
    else if(pos1.innerHTML.match("j2") && pos4.innerHTML.match("j2") && pos7.innerHTML.match("j2")){
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //columna 2 rojos
    else if(pos2.innerHTML.match("j2") && pos5.innerHTML.match("j2") && pos8.innerHTML.match("j2")){
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //columna 3 rojos
    else if(pos3.innerHTML.match("j2") && pos6.innerHTML.match("j2") && pos9.innerHTML.match("j2")){
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //diagonal 1 rojos
    else if(pos1.innerHTML.match("j2") && pos5.innerHTML.match("j2") && pos9.innerHTML.match("j2")){
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
    //diagonal 2 rojos, todos los movimientos de rojo hechos
    else if(pos3.innerHTML.match("j2") && pos5.innerHTML.match("j2") && pos7.innerHTML.match("j2")){
        for(var i = 0; i< huecos.length; i++){            
            huecos[i].setAttribute("style","visibility: hidden");
        }
        fondo.setAttribute("style","visibility: hidden");     
        for(var i = 0; i< jugador1.length; i++){            
            jugador1[i].setAttribute("style","visibility: hidden");
        }  
        for(var i = 0; i< jugador2.length; i++){            
            jugador2[i].setAttribute("style","visibility: hidden");
        }
        h1.setAttribute("style","visibility: hidden");
        win.setAttribute("style","visibility: visible");
    }
}