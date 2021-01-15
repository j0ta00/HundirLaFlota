package partida;

import jugador.Bot;
import jugador.Jugador;
import tablero.Tablero;

public class Partida {
	//Atributos
	private Jugador jugador1;
	private Bot ia;
	private Jugador jugador2;
	private int ronda;
	private boolean turno;
	 //Métodos constructores
	
	//Constructor por defecto
	public Partida(){
		jugador1=new Jugador();
		jugador2=new Jugador();
		ia=new Bot();
		ronda=1;
		turno=true;
		
	}
	//Constructor por parámetros
	public Partida(Jugador jugador1,Jugador jugador2,Bot ia,int ronda,boolean turno){
		this.jugador1=jugador1;
		this.jugador2=jugador2;
		this.ia=ia;
		this.ronda=ronda;
		this.turno=turno;
	}
	//Métodos fundamentales
	//get de turno
	public boolean getTurno() {
		return turno;
	}
	//get de ronda
	public int getRonda() {
		return ronda;
	}
	//get de jugador2
	public Jugador getJugador2() {
		return jugador2;
	}
	//get de ia
	public Bot getIa() {
		return ia;
	}
	//get de jugador1
	public Jugador getJugador1() {
		return jugador1;
	}
	//set de jugador1
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}
	//set de ia
	public void setIa(Bot ia) {
		this.ia = ia;
	}
	//set de jugador2
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	//set de ronda
	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
	//set de turno
	public void setTurno(boolean turno) {
		this.turno = turno;
	}
	public void turno(){
		
		jugador2.getTableroPropio().colocarBarco(jugador2.getBuque());
		atacar();
	}
	public void atacar(){
		jugador1.getTableroEnemigo().colocarBomba(jugador2);
	}
	
}
