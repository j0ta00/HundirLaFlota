package tablero;

import barco.Barco;

public class Tablero {

	//Atributos
	private char[][] casilla;
	private Barco barco;
	//Métodos fundamentales
	//get de barco
	public Barco getBarco() {
		return barco;
	}
	//get de casilla
	public char[][] getCasilla() {
		return casilla;
	}
	//set de barco
	public void setBarco(Barco barco) {
		this.barco = barco;
	}
	//set de casilla
	public void setCasilla(char[][] casilla) {
		this.casilla = casilla;
	}
}
