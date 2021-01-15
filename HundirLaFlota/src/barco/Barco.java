package barco;

public class Barco {
	//Declaraci�n de variables locales
	private int tamano;
	private String nombre;
	private String[] posicion;
	//M�todos constructores
	//Constructor por defecto
	public Barco(){
		tamano=4;
		nombre="Barco";
		posicion=new String[4];
		
	}
	//Constructor por par�metros
	public Barco(int tamano,String nombre){
		this.tamano=tamano;
		this.nombre=nombre;
		posicion=new String[tamano];
	}
	//M�todos fundamentales
	
	//getNombre
	public String getNombre(){
		return nombre;
	}
	//getTamano
	public int getTamano(){
		return tamano;
		
	}
	public String[] getPosicion() {
		return posicion;
	}
	//setNombre
	public void setNombre(String nombre){
		this.nombre=nombre;
		
	}
	//setTamano
	public void setTamano(int tamano){
		this.tamano=tamano;
	}
	public void setPosicion(String[] posicion) {
		this.posicion = posicion;
	}
	/*
	 * Cabecera:public void perderTrozoDeBarco()
	 * Proposito:Este m�todo hace que el parco cuando es da�ado pierda parte de su tama�o
	 * Entrada:Ninguna
	 * Salidad:Ninguna
	 * Precondici�n:Este m�todo no deber� ser llamado si el tama�o del barco ya es inferior a 0
	 * Postcondici�n:Se trata de un procedimiento que resta el tama�o del atributo barco
	 * */

	public void perderTrozoDeBarco(){
		setTamano(tamano--);
	}

}
