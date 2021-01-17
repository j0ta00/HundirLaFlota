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
		try{
			System.out.println("Va a colocar los barcos "+jugador1.getNombre()+", "+jugador2.getNombre()+" tapate los ojos, ¡No mires!");
			Thread.sleep(5000);
			System.out.println("Vas a colocar el "+jugador1.getBuque().getNombre());jugador1.getTableroPropio().colocarBarco(jugador1.getBuque());
			jugador1.getTableroPropio().imprimirTablero();
			System.out.println("Vas a colocar el "+jugador1.getNavio().getNombre());jugador1.getTableroPropio().colocarBarco(jugador1.getNavio());
			jugador1.getTableroPropio().imprimirTablero();
			System.out.println("Vas a colocar el "+jugador1.getVelero().getNombre());jugador1.getTableroPropio().colocarBarco(jugador1.getVelero());
			jugador1.getTableroPropio().imprimirTablero();
			System.out.println("Vas a colocar el "+jugador1.getPortaAviones().getNombre());jugador1.getTableroPropio().colocarBarco(jugador1.getPortaAviones());
			jugador1.getTableroPropio().imprimirTablero();
			System.out.println("Vas a colocar el "+jugador1.getPesquero().getNombre());jugador1.getTableroPropio().colocarBarco(jugador1.getPesquero());
			jugador1.getTableroPropio().imprimirTablero();
			System.out.println("Tu turno "+jugador1.getNombre()+" de colocar ha terminado espera a ver el mensaje de que es el turno de "+jugador2.getNombre()+" para colocar y en ese punto date la vuelta y que coloque él.");
			Thread.sleep(8000);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Va a colocar los barcos "+jugador2.getNombre()+", "+jugador1.getNombre()+" tapate los ojos, ¡No mires!");
			Thread.sleep(5000);
			System.out.println("Vas a colocar el "+jugador2.getBuque().getNombre());jugador2.getTableroPropio().colocarBarco(jugador2.getBuque());
			jugador2.getTableroPropio().imprimirTablero();
			System.out.println("Vas a colocar el "+jugador2.getNavio().getNombre());jugador2.getTableroPropio().colocarBarco(jugador2.getNavio());
			jugador2.getTableroPropio().imprimirTablero();
			System.out.println("Vas a colocar el "+jugador2.getVelero().getNombre());jugador2.getTableroPropio().colocarBarco(jugador2.getVelero());
			jugador2.getTableroPropio().imprimirTablero();
			System.out.println("Vas a colocar el "+jugador2.getPortaAviones().getNombre());jugador2.getTableroPropio().colocarBarco(jugador2.getPortaAviones());
			jugador2.getTableroPropio().imprimirTablero();
			System.out.println("Vas a colocar el "+jugador2.getPesquero().getNombre());jugador2.getTableroPropio().colocarBarco(jugador2.getPesquero());
			jugador2.getTableroPropio().imprimirTablero();
			System.out.println("Tu turno "+jugador2.getNombre()+" de colocar ha terminado espera a ver el mensaje de que es el turno de "+jugador1.getNombre()+" para lanzar una bomba.");
			Thread.sleep(8000);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			while(jugador1.getNumeroDeBarcos()!=0 && jugador2.getNumeroDeBarcos()!=0){
				System.out.println("Es el turno de atacar de "+jugador1.getNombre()+", "+jugador2.getNombre()+" tapate los ojos si "+jugador1.getNombre()+" sube para revisar su tablero");
				Thread.sleep(5000);
				jugador1.getTableroPropio().imprimirTablero();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				jugador1.getTableroEnemigo().imprimirTablero();
				atacar(jugador1,jugador2);
				Thread.sleep(5000);
				if(jugador2.getNumeroDeBarcos()!=0){
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Es el turno de atacar de "+jugador2.getNombre()+", "+jugador1.getNombre()+" tapate los ojos si "+jugador2.getNombre()+" sube para revisar su tablero");
					Thread.sleep(5000);
					jugador2.getTableroPropio().imprimirTablero();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					jugador2.getTableroEnemigo().imprimirTablero();
					atacar(jugador2,jugador1);
					Thread.sleep(5000);
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				}
			}
		}catch(InterruptedException e){System.out.println("Ha sucedido un error");}
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
