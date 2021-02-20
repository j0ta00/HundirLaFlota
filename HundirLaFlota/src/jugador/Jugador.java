package jugador;

import barco.Barco;
import tablero.Tablero;

public class Jugador {
	//Atributos
	protected Tablero tableroPropio;
	protected Tablero tableroEnemigo;
	protected int numeroDeBarcos;
	protected String nombre;
	protected Barco[] barcos;
	//Métodos constructores
	//constructor por defecto
	public Jugador(String nombre){
		tableroPropio=new Tablero();
		tableroEnemigo=new Tablero();
		numeroDeBarcos=1;
		this.nombre=nombre;
		barcos=new Barco[]{new Barco(5,"Portaviones"),new Barco(4,"Buque"),new Barco(3,"Navio"),new Barco(3,"Velero"),new Barco(2,"Pesquero")};
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
	public Barco[] getBarcos(){
		return barcos;
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