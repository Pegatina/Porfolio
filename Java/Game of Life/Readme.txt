### Eng:

Game of life, main Simulacion.java, there we can instantiate a simulation object with width and height, as many live cells as desired are created and the print() and continue() methods are accessed until there are no live cells left according to the following rules: 
1. if the cell is alive but has less than 2 live neighbours the cell dies.
2. if it is alive and has 2 or 3 neighbours the cell lives.
3. if the cell is alive and there are more than three neighbours, the cell dies.
4. If the cell is dead and has 3 live neighbours, the cell lives.

PS: The game is without a loop because, in that state, it would never end.
___
### Esp:

Juego de la vida, main Simulacion.java, allí se instancia una simulación con ancho y alto, se crean tantas celdas vivas se quieran y se accede a los métodos de imprimir() y continuar() hasta que no quede ninguna célula viva según las siguientes reglas: 
1. si está viva la celda pero tiene menos de 2 vecinos vivos la celda muere.
2. si está viva y tiene 2 o 3 vecinos la celda vive.
3. si está viva y hay más de tres vecinos, la celda muere.
4. Si la celda está muerta y tiene 3 vecinos vivos, la celda vive.

PD: El juego está sin un bucle ya que, en ese estado, no acabaría nunca.
