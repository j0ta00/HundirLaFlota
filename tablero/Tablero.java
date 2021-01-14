package tablero;

import barco.Barco;

public class Tablero {

	//Atributos
	private char[][] casilla;
	private Barco portaAviones;//5
	private Barco buque;//4
	private Barco navio;//3
	private Barco velero;//3
	private Barco pesquero;//2
	//Métodos constructores
	//constructor por defecto
	public Tablero(){
		casilla=new char[10][10];
		for(int i=0;i<casilla.length;i++){
			for(int j=0;j<casilla.length;j++){
				casilla.clone()[i][j]='~';
			}
		}
		setCasilla(casilla.clone());
		portaAviones=new Barco(5,"PortaAviones");
		buque=new Barco(4,"Buque");
		navio=new Barco(3,"Navio");
		velero=new Barco(3,"Velero");
		pesquero=new Barco(2,"Pesquero");
	}
	//Métodos fundamentales
	//gets de los barcos
	public Barco getPesquero() {
		return pesquero;
	}
	public Barco getVelero() {
		return velero;
	}
	public Barco getNavio() {
		return navio;
	}
	public Barco getBuque() {
		return buque;
	}
	public Barco getPortaaviones() {
		return portaAviones;
	}
	//get de casilla
	public char[][] getCasilla() {
		return casilla;
	}
	//sets de los barcos
	public void setPortaAviones(Barco portaAviones){
		this.portaAviones=portaAviones;
	}
	public void setPortaPesquero(Barco pesquero){
		this.pesquero=pesquero;
	}
	public void setPortaBuque(Barco buque){
		this.buque=buque;
	}
	public void setPortaNavio(Barco navio){
		this.navio=navio;
	}
	public void setVelero(Barco velero){
		this.velero=velero;
	}
	//set de casilla
	public void setCasilla(char[][] casilla) {
		this.casilla = casilla;
	}
	//Métodos adicionales
	public void imprimirTablero(){
		System.out.println("-----------------------------------------");//Imprime cr�cteres que formar�n el tablero
        for (int i=0; i<casilla.length; i++) {//for para recorrer las filas del array
            System.out.print("| ");//Imprime cr�cteres que formar�n el tablero
            for (int j=0; j<casilla.length; j++) {//for para recorrer las columnas del array
            	System.out.print(getCasilla()[i][j]);//Imprime lo que hay en cada casilla del array
                System.out.print(" | ");//Imprime cr�cteres que formar�n el tablero
            }
            System.out.println();//Salto de l�nea
            System.out.println("-----------------------------------------");//Imprime cr�cteres que formar�n el tablero
        }
        System.out.println();//Salto de l�nea
    }
}
