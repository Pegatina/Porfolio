package monsters;

//clase de la que heredan los bichos
public abstract class Monster {
	// atributos, dos de ellos ya predefinidos
	private int vida = 100;
	private int damage = 10;
	private String ataque1;
	private String ataque2;
	//por defecto desactivados para activarlo después el ataque.
	private boolean activarAtaque1 = false;
	private boolean activarAtaque2 = false;

	// en el constructor solo meto los atributos que van a variar para asignarlos a
	// los bichos.
	public Monster(String ataque1, String ataque2) {
			this.ataque1 = ataque1;
			this.ataque2 = ataque2;
		}

	// setters y getters de cada atributo
	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVida() {
		return vida;
	}

	// de los ataques no necesitamos el setter porque no los vamos a cambiar después
	// de instanciar.
	public String getAtaque1() {
		return ataque1;
	}

	public String getAtaque2() {
		return ataque2;
	}

	public boolean isActivarAtaque1() {
		return activarAtaque1;
	}

	public void setActivarAtaque1(boolean activarAtaque1) {
		this.activarAtaque1 = activarAtaque1;
	}

	public boolean isActivarAtaque2() {
		return activarAtaque2;
	}

	public void setActivarAtaque2(boolean activarAtaque2) {
		this.activarAtaque2 = activarAtaque2;
	}

	//método que luego sobreescribiré en cada herencia
	public void atacar(Jugador jugador1, Monster mon1, Jugador jugador2, Monster mon2) {	
	}
}
