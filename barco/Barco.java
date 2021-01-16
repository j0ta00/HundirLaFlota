package barco;

public class Barco {
	//Declaración de variables locales
	private int tamano;
	private String nombre;
	//Métodos constructores
	//Constructor por defecto
	public Barco(){
		tamano=4;
		nombre="Barco";
		
	}
	//Constructor por parámetros
	public Barco(int tamano,String nombre){
		this.tamano=tamano;
		this.nombre=nombre;
	}
	//Métodos fundamentales
	
	//getNombre
	public String getNombre(){
		return nombre;
	}
	//getTamano
	public int getTamano(){
		return tamano;
		
	}
	//setNombre
	public void setNombre(String nombre){
		this.nombre=nombre;
		
	}
	//setTamano
	public void setTamano(int tamano){
		this.tamano=tamano;
	}
	/*
	 * Cabecera:public void perderTrozoDeBarco()
	 * Proposito:Este método hace que el parco cuando es dañado pierda parte de su tamaño
	 * Entrada:Ninguna
	 * Salidad:Ninguna
	 * Precondición:Este método no deberá ser llamado si el tamaño del barco ya es inferior a 0
	 * Postcondición:Se trata de un procedimiento que resta el tamaño del atributo barco
	 * */
	public void perderTrozoDeBarco(){
		setTamano(tamano--);
	}

}
