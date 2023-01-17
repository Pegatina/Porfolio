<?php
$dianow = 10;
//$dia = 1;
$diasem = 'Viernes';
$mes = 'Febrero';
//$contador = 0; //1 - cantidad de desplazamiento, iniciar en -1 por ejemplo si empieza en jueves (1-2 = -1). el for que pinte solo si el contador es > 0
//si el contador es mayor que la cantidad máxima dentro del for comprobarlo para que las pinte también.

$meses=array(
	'Enero' => 1,
	'Febrero' => 2,
	'Marzo' => 3,
	'Abril' => 4,
	'Mayo' => 5,
	'Junio' => 6,
	'Julio' => 7,
	'Agosto' => 8,
	'Septiembre' => 9,
	'Obtubre' => 10,
	'Noviembre' => 11,
	'Diciembre' => 12
);

$semana = array(
    'Lunes' => 0,
    'Martes' => 1,
    'Miércoles' => 2,
    'Jueves' => 3,
    'Viernes' => 4,
    'Sábado' => 5,
    'Domingo' => 6
);

$dias=array(
	1 => 31,
	2 => 28,
	3 => 31,
	4 => 30,
	5 => 31,
	6 => 30,
	7 => 31,
	8 => 31,
	9 => 30,
	10=> 31,
	11=> 30,
	12=> 31
);

$diasem=$semana[$diasem];

//asignar el día al número del día (lunes = 1...)
//hacer que el día elegido - día actual % 7

/*$huecos = ($diassem[$diasem] - ($dianow % 7));

if($huecos <0){
    $huecos = 7 - abs($huecos);
}
*/
echo "<table border = '2'>
<thead><caption><h2>$mes</h2></caption></thead>
<tr>
    <th>Lunes</th>
    <th>Martes</th>
    <th>Miércoles</th>
    <th>Jueves</th>
    <th>Viernes</th>
    <th>Sábado</th>
    <th>Domingo</th></tr>";
//lo pongo debajo para que coja el string en la tabla, luego ya opero con números
$mes=$meses[$mes];
//$totaldias = $dias[$mes];

/*for($i=0;$i<6;$i++){
    echo '<tr>';
    for($j=0;$j<7;$j++){      
        //hacer el calendario aquí, día <= dia del mes mes - desviacion                 
        if($j==5){ //sábado
            echo "<td bgcolor='red'>$dia</td>";
        }
        elseif($j==6){ //domingo
            echo "<td bgcolor='red'>$dia</td>";
        }
        //restar días hasta día actual según el día de la semana para poner dónde empieza el mes             
        elseif($dia == $dianow){
            echo "<td bgcolor='blue'>$dia</td>";
        }
        else{
            echo "<td>$dia</td>";
        }                
        $dia++;
        $contador++; 

        if($contador == $totaldias){
            break;               
        }
                
    }
    echo '</tr>';
    if($contador == $totaldias){
        break;                   
    }
 }
        //dia de inicio, dia de final y estilos
    echo '</table>';
    */
function pintar_mes($diasem,$dianow,$dias){
	$inicio = ($dianow-$diasem)%7; //me busca cuál es el primer "jueves", día de la semana convertido a numérico
	$contador = $inicio-7; //iniciamos en el primer "jueves", día 0
	$color = 'white';	
		while($contador<=$dias){ //mientras queden días por poner pinta, filas indeterminadas
			echo '<tr>';
			for($j=0;$j<7;$j++){
				if($contador>0 and $contador<=$dias){ //pinto el 1 hasta los días, los anteriores no llevan número, no entran
					if($j==5 or $j==6){ //sábado o domingo
						$color='red';
					}
					if($contador==$dianow){ //día now
						$color='blue';
					}
					echo '<td style="background-color: '.$color.';">'.$contador.'</td>';
                }
				else{
					echo '<td></td>'; //para los días anteriores y posteriores, celda/columna vacía
                }
				$contador++; //se va pintando la tabla vacía hasta que el contador cumple el if
				$color='white'; //se reinicia el color con cada iteración
            }
			echo '</tr>'; //se cierra la fila cada 7
        }
	echo '</table>'; //se cierra la tabla
}

pintar_mes($diasem,$dianow,$dias[$mes]); 

?>
