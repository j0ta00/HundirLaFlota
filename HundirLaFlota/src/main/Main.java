package main;

import barco.Barco;
import jugador.Jugador;
import partida.Partida;
import tablero.Tablero;

/*
 * CLASES: BARCO: -TAMAÑO: ARRAY DE CHAR -NOMBRE: STRING
 * TABLERO: -CASILLAS: ARRAY BIDIMENSIONAL DE CHAR
 * JUGADOR: -NOMBRE:STRING -NUMERO_DE_BARCOS_VIVOS:INT
 * PARTIDA: -JUGADORES TABLEROS BARCOS   
 * 
 * */
public class Main {

	public static void main(String[] args) {
		Tablero tablero1 = new Tablero();
		tablero1.imprimirTablero();
		Partida partida = new Partida();
		try {
			partida.turno();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}