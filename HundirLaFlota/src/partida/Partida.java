package partida;

public class Partida {
	//Atributos
	private Jugador jugador1;
	private Bot ia;
	private Jugador jugador2;
	private int turno;
	 //Métodos constructores
	
	//Constructor por defecto
	public Partida(){
		jugador1 = new Jugador();
		jugador2 = new Jugador();
		ia = new Bot();
		turno=1;
	}
	//Constructor por parámetros
	public Partida(Jugador jugador1,Jugador jugador2,Bot ia,int turno){
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.ia = ia;
		this.turno=turno;
	}
	
}
