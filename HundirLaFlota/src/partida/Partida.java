package partida;

import java.util.Scanner;

import jugador.Bot;
import jugador.Jugador;

public class Partida {
	Scanner teclado= new Scanner(System.in);
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
		String nombre="";
		System.out.println("Introduce tu nombre Jugador 1");
		nombre=teclado.next();
		jugador1.setNombre(nombre);
		System.out.println("Introduce tu nombre Jugador 2");
		nombre=teclado.next();
		jugador2.setNombre(nombre);
		jugador1.getTableroPropio().colocarBarco(jugador1.getBuque());
		jugador1.getTableroPropio().colocarBarco(jugador1.getNavio());
		jugador1.getTableroPropio().colocarBarco(jugador1.getVelero());
		jugador1.getTableroPropio().colocarBarco(jugador1.getPortaAviones());
		jugador1.getTableroPropio().colocarBarco(jugador1.getPesquero());
		jugador2.getTableroPropio().colocarBarco(jugador2.getBuque());
		jugador2.getTableroPropio().colocarBarco(jugador2.getBuque());
		jugador2.getTableroPropio().colocarBarco(jugador2.getNavio());
		jugador2.getTableroPropio().colocarBarco(jugador2.getVelero());
		jugador2.getTableroPropio().colocarBarco(jugador2.getPortaAviones());
		jugador2.getTableroPropio().colocarBarco(jugador2.getPesquero());
		while(jugador1.getNumeroDeBarcos()!=0 && jugador2.getNumeroDeBarcos()!=0){
			jugador1.getTableroPropio().imprimirTablero();
			jugador1.getTableroEnemigo().imprimirTablero();
			atacar(jugador1,jugador2);
			if(jugador2.getNumeroDeBarcos()!=0){
				jugador2.getTableroPropio().imprimirTablero();
				jugador2.getTableroEnemigo().imprimirTablero();
				atacar(jugador2,jugador1);
			}
		}
		if(comprobarGanador()==1){
			System.out.println("Enhorabuena "+jugador1.getNombre()+" eres el ganador");
		}else{
			System.out.println("Enhorabuena "+jugador2.getNombre()+" eres el ganador");
		}
	}
	private int comprobarGanador(){
		int ganador=0;
		if(jugador2.getNumeroDeBarcos()==0){
			ganador=1;
		}else if(jugador1.getNumeroDeBarcos()==0){
			ganador=2;
		}
		return ganador;
	}
	public void atacar(Jugador jugador,Jugador enemigo){
		jugador.getTableroEnemigo().colocarBomba(enemigo);
	}
	
}
