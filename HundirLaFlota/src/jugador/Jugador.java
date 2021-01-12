package jugador;

import tablero.Tablero;

public class Jugador {
	//Atributos
	protected Tablero tableroPropio;
	protected Tablero tableroEnemigo;
	protected int numeroDeBarcos;
	protected String nombre;
	//Métodos constructores
	//constructor por defecto
	public Jugador(){
		tableroPropio=new Tablero();
		tableroEnemigo=new Tablero();
		numeroDeBarcos=4;
		nombre="";
	}
	//constructor por parámetros
	public Jugador(Tablero tableroPropio,Tablero tableroEnemigo,int numeroDeBarcos,String nombre){
		this.tableroPropio=tableroPropio;
		this.tableroEnemigo=tableroEnemigo;
		this.numeroDeBarcos=numeroDeBarcos;
		this.nombre=nombre;
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


}

