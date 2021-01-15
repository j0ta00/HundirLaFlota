package jugador;

import barco.Barco;
import tablero.Tablero;

public class Jugador {
	//Atributos
	protected Tablero tableroPropio;
	protected Tablero tableroEnemigo;
	protected int numeroDeBarcos;
	protected String nombre;
	protected Barco portaAviones;//5
	protected Barco buque;//4
	protected Barco navio;//3
	protected Barco velero;//3
	protected Barco pesquero;//2
	//Métodos constructores
	//constructor por defecto
	public Jugador(){
		tableroPropio=new Tablero();
		tableroEnemigo=new Tablero();
		numeroDeBarcos=4;
		nombre="";
		portaAviones=new Barco(5,"PortaAviones");
		buque=new Barco(4,"Buque");
		navio=new Barco(3,"Navio");
		velero=new Barco(3,"Velero");
		pesquero=new Barco(2,"Pesquero");
	}
	//Métodos fundamentales
	//get de tablero propio
	public Tablero getTableroPropio(){
		return tableroPropio;
	}
	//get de tablero enemigo
	public Tablero getTableroEnemigo(){
		return tableroEnemigo;
	}
	//get numero de barcos
	public int getNumeroDeBarcos(){
		return numeroDeBarcos;	
	} 
	//get de nombre
	public String getNombre(){
		return nombre; 
	}
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
	public Barco getPortaAviones() {
		return portaAviones;
	}
	//set de tablero propio
	public void setTableroPropio(Tablero tableroPropio){
		
		this.tableroPropio=tableroPropio;
		
	}
	//set de tablero enemigo
	public void setTableroEnemigo(Tablero tableroEnemigo){
		
		this.tableroEnemigo=tableroEnemigo;
		
	}
	//set de número de barcos
	public void setNumeroDeBarcos(int numeroDeBarcos){
		this.numeroDeBarcos=numeroDeBarcos;	
	} 
	//set del nombre
	public void setNombre(String nombre){
		this.nombre=nombre;
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
}  