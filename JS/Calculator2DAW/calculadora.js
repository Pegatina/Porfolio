function numero() {
  return Number(document.getElementById("pantalla").value); //Aunque el input sea number, en las operaciones lo convierte a string, así se evita.
}
function numeros() {
  return document.getElementById("pantalla").value.split(",").map(Number);
  //Separa por comas cada elemento del array y luego convierte cada elemento a number.
}
//Dos formas de hacer funciones:
function rellenar(v) {
  document.getElementById("pantalla").value = v;
}

const vaciar = () => {
  //document.getElementById("pantalla").value = "";
  rellenar(""); //lo deja a 0 cuando pulsemos
};
//Info
function rellenar_info() {
  let num = numero();
  let info = "";
  if (Number.isNaN(num)) {
    info = "No es un número.";
  } else {
    if (num < 100) {
      info = "Info: El resultado es menor que 100.";
    } else if (num >= 100 && num <= 200) {
      info = "Info: El resultado está entre 100 y 200.";
    } else {
      info = "Info: El resultado es superior a 200.";
    }
  }
  document.getElementById("info").innerHTML = info; //Se modifica el elemento info con la string correspondiente.
}
//Operaciones unitarias
function cuadrado() {
  let num = numero();
  //num.value = num.value * num.value;
  rellenar(num * num);
  rellenar_info();
}

function mod() {
  let num = numero();
  if (num < 0) {
    //si es negativo
    rellenar(Math.abs(num));
  }
  rellenar_info();
}

function fact() {
  let num = numero();
  let resultado = 1;
  for (let i = num; i > 1; i--) {
    resultado *= i;
  }
  rellenar(resultado);
  rellenar_info();
}

//Operaciones binarias

let acumulador = 0;
let operador = "";

function acumula(n) {
  switch (operador) {
    case "":
      acumulador = n;
      break;
    case "+":
      acumulador += n;
      break;
    case "-":
      acumulador -= n;
      break;
    case "*":
      acumulador *= n;
      break;
    case "/":
      acumulador /= n;
      break;
  }
}

function add() {
  acumula(numero()); //recoge lo que está en pantalla en acumula
  operador = "+";
  vaciar(); //limpia la pantalla
}
function res() {
  acumula(numero());
  operador = "-";
  vaciar();
}
function mul() {
  acumula(numero());
  operador = "*";
  vaciar();
}
function div() {
  acumula(numero());
  operador = "/";
  vaciar();
}

function eq() {
  acumula(numero());
  operador = ""; //Para hacer más operaciones.
  rellenar(acumulador);
  rellenar_info();
}

//Operaciones CSV
function sumatorio() {
  let array = numeros();
  let res = 0;
  /*for(let i = array.length -1; i>=0; i--){
        res += array[i];
    }*/
  for (let n of array) {
    //parecido a un foreach
    res += n;
  }
  rellenar(res);
  rellenar_info();
}
function ordenar() {
  let array = numeros();
  //Sortear con una función de comparación regex
  array.sort(function (a, b) {
    return a - b;
  });
  //let res = numeros().sort((a,b) => a-b);

  
  rellenar(array);
  rellenar_info();
}
function revertir() {
  let array = numeros();
  let res = [];
  for (let i = array.length - 1; i >= 0; i--) {
    res[array.length - 1 - i] = array[i]; //De la posición más grande a la más pequeña, metemos la posición más grande en la posición 0 de res (-i)
  }
  rellenar(res);
  rellenar_info();
}
function quitar() {
  let array = numeros();
  array.pop(); //Quita el último elemento del array
  /* let res = [];
  for (let i = array.length - 2; i >= 0; i--) {
    res[i] = array[i]; //Restar con un for
  }
   rellenar(res);
  */  
  rellenar(array);
  rellenar_info();
}
//Extra, conversiones de bases
function dec_binario() {
  let num = numero();
  let binario = 0;
  let contador = 1;
  //Mientras que el cociente a dividir no sea 0
  while (num != 0) {
    //Almacenamos el resto de dividir entre 2 (binario, potencias de 2)
    let resto = num % 2;
    //Convertimos a int el resultado de la división para no tener decimales y lo almacenamos
    num = parseInt(num / 2);
    //El binario almacena su anterior resultado más la multiplicación del resto por el contador
    binario += resto * contador;
    //Que es en realidad un decimal (potencias de 10), así, cada número irá contando una posición a la izq más que el anterior, al irse sumando.
    contador *= 10;
  }
  rellenar(binario);
}
function bi_decimal() {
  let num = numero();

  if (Number.isNaN(num)) {
    rellenar_info(); //Devuelve que no es un número apto.
  } else {
    let decimal = parseInt(num, 2); //Calcula cuando el número es base 2 (binario)
    rellenar(decimal);
    rellenar_info();
  }
}

function dec_hex() {
  let num = numero();
  if (Number.isNaN(num)) {
    rellenar_info(); //Devuelve que no es un número apto.
  } else {
    let hex = num.toString(16).toUpperCase(); //Convierte num decimal a hexadecimal (base 16) y pone las letras en mayúsculas
    rellenar(hex);
    rellenar_info();
  }
}
function bi_hex() {
  //Mezclando las anteriores
  let num = numero();
  if (Number.isNaN(num)) {
    rellenar_info(); //Devuelve que no es un número apto.
  } else {
    let hex = parseInt(num, 2).toString(16).toUpperCase(); //Convierte el número a binario y después lo convierte a hexadecimal en mayúsculas.
    rellenar(hex);
    rellenar_info();
  }
}
//Funciones para mostrar y ocultar los diferentes divs y modificar las imágenes según su estado.
function mostrar1() {
  let div = document.getElementById('cont1');
  if (div.style.display == "none") {
    div.style.display = "";
    let img = document.getElementById('img1-1');
    img.src = "triangulo2.png";
  } else {
    div.style.display = "none";
    let img = document.getElementById('img1-1');
    img.src = "triangulo1.png";
  }
}
function mostrar2() {
  let div = document.getElementById('cont2');
  if (div.style.display == "none") {
    div.style.display = "";
    let img = document.getElementById('img1-2');
    img.src = "triangulo2.png";
  } else {
    div.style.display = "none";
    let img = document.getElementById('img1-2');
    img.src = "triangulo1.png";
  }
}
function mostrar3() {
  let div = document.getElementById('cont3');
  if (div.style.display == "none") {
    div.style.display = "";
    let img = document.getElementById('img1-3');
    img.src = "triangulo2.png";
  } else {
    div.style.display = "none";
    let img = document.getElementById('img1-3');
    img.src = "triangulo1.png";
  }
}
function mostrar4() {
  let div = document.getElementById('cont4');
  if (div.style.display == "none") {
    div.style.display = "";
    let img = document.getElementById('img1-4');
    img.src = "triangulo2.png";
  } else {
    div.style.display = "none";
    let img = document.getElementById('img1-4');
    img.src = "triangulo1.png";
  }
}
