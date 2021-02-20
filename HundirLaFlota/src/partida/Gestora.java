package partida;

import java.util.Scanner;

import jugador.Bot;
import jugador.Jugador;
import menu.Menu;

public class Gestora{
	static Scanner teclado= new Scanner(System.in);
	
	public static void Partida2Jugadores() throws InterruptedException{
		String nombre="";
		Menu.imprimirNombreJugador("1");
		nombre=teclado.next();
		Jugador jugador1 = new Jugador(teclado.next()); 
		Menu.imprimirNombreJugador("2");
		Jugador jugador2 = new Jugador(teclado.next()); 
		Menu.imprimirVaAColocar(jugador1.getNombre(), jugador2.getNombre());
		Thread.sleep(5000);
		turnoColocar(jugador1);
		Menu.imprimirVaAColocar(jugador2.getNombre(), jugador1.getNombre());
		Thread.sleep(8000);
		turnoColocar(jugador2);
		while(jugador1.getNumeroDeBarcos()!=0 && jugador2.getNumeroDeBarcos()!=0){
			Menu.imprimirVaAAtacar(jugador2.getNombre());
			Thread.sleep(5000);
			jugador1.getTableroPropio().imprimirTablero();
			jugador1.getTableroEnemigo().imprimirTablero();
			atacar(jugador1,jugador2);
			Thread.sleep(5000);
			if(jugador2.getNumeroDeBarcos()!=0){
				Menu.imprimirVaAAtacar(jugador2.getNombre());
				Thread.sleep(5000);
				jugador2.getTableroPropio().imprimirTablero();
				jugador2.getTableroEnemigo().imprimirTablero();
				atacar(jugador2,jugador1);
				Thread.sleep(5000);
			}
		}
		if(comprobarGanador(jugador2, jugador2)==1){
			System.out.println("Enhorabuena "+jugador1.getNombre()+" eres el ganador");
		}else{
			System.out.println("Enhorabuena "+jugador2.getNombre()+" eres el ganador");
		}
	}
	private static int comprobarGanador(Jugador jugador1,Jugador jugador2){
		int ganador=0;
		if(jugador2.getNumeroDeBarcos()==0){
			ganador=1;
		}else if(jugador1.getNumeroDeBarcos()==0){
			ganador=2;
		}
		return ganador;
	}
	public static void atacar(Jugador jugador,Jugador enemigo){
		jugador.getTableroEnemigo().colocarBomba(enemigo);
	}
	private static void turnoColocar(Jugador jugador){
		Menu.imprimirColocarBarco("Buque");
		jugador.getTableroPropio().colocarBarco(jugador.getBarcos()[1]);
		jugador.getTableroPropio().imprimirTablero();
		Menu.imprimirColocarBarco("Navio");
		jugador.getTableroPropio().colocarBarco(jugador.getBarcos()[2]);
		jugador.getTableroPropio().imprimirTablero();
		Menu.imprimirColocarBarco("Velero");
	    jugador.getTableroPropio().colocarBarco(jugador.getBarcos()[3]);
		jugador.getTableroPropio().imprimirTablero();
		Menu.imprimirColocarBarco("Portaviones");
		jugador.getTableroPropio().colocarBarco(jugador.getBarcos()[0]);
		jugador.getTableroPropio().imprimirTablero();
		Menu.imprimirColocarBarco("Pesquero");
		jugador.getTableroPropio().colocarBarco(jugador.getBarcos()[4]);
		jugador.getTableroPropio().imprimirTablero();
	}
}
