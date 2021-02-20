package tablero;

import barco.Barco;
import jugador.Jugador;

import java.util.Scanner;

public class Tablero {
Scanner teclado=new Scanner(System.in);
	//Atributos
	private char[][] casilla;
	//Métodos constructores
	//constructor por defecto
	public Tablero(){
		casilla=new char[10][10];
		for(int i=0;i<casilla.length;i++){
			for(int j=0;j<casilla.length;j++){
				casilla.clone()[i][j]=' ';
			}
		}
		setCasilla(casilla.clone());
	}
	//Métodos fundamentales
	//get de casilla
	public char[][] getCasilla() {
		return casilla;
	}
	//set de casilla
	public void setCasilla(char[][] casilla) {
		this.casilla = casilla;
	}
	//Métodos adicionales
	
	public void imprimirTablero(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
	
	public void colocarBarco(Barco barco){
		int posicionX=-1, posicionY=-1;
		while(posicionX<0 || posicionX>9 || posicionY<0 || posicionY>9 || casilla[posicionX][posicionY]=='X'){
			System.out.println("Introduce la fila en la que quieres colocar el barco, recuerda que debe ser una válida");
			posicionX=teclado.nextInt();
			System.out.println("Introduce la columna en la que quieres colocar el barco, recuerda que debe ser una válida");
			posicionY=teclado.nextInt();
		}
		OrientarBarco(barco,posicionX,posicionY);
	}
	public void OrientarBarco(Barco barco,int posicionX, int posicionY){
		char ladoDeOrientacionDelBarco=' ';
		boolean barcoOrientado=false;
		while(barcoOrientado==false) {
			System.out.println("Selecciona hacia donde quieres orientar el barco, introduce A para orientarlo hacia arriba,B para orientarlo hacia abajo, D para orientarlo hacia la derecha e I para orientarlo a la izquiera");
			ladoDeOrientacionDelBarco=Character.toUpperCase(teclado.next().charAt(0));
			switch(ladoDeOrientacionDelBarco){
				case 'A'->barcoOrientado=permitirOrientarBarco(barco,ladoDeOrientacionDelBarco,posicionX,posicionY);
				case 'B'->barcoOrientado=permitirOrientarBarco(barco,ladoDeOrientacionDelBarco,posicionX,posicionY);
				case 'I'->barcoOrientado=permitirOrientarBarco(barco,ladoDeOrientacionDelBarco,posicionX,posicionY);
				case 'D'->barcoOrientado=permitirOrientarBarco(barco,ladoDeOrientacionDelBarco,posicionX,posicionY);
				default->System.out.println("Caracter erróneo, introduce uno permitido");
			}
		}
		colocarBarcoDeFormaOrientada(barco,ladoDeOrientacionDelBarco,posicionX,posicionY);
	}
	public boolean permitirOrientarBarco(Barco barco,char ladoDeOrientacionDelBarco,int posicionX, int posicionY){
		int contador=1;
		boolean permitirOrientacion=false;
		for(int i=1;i<barco.getTamano();i++){
			switch(ladoDeOrientacionDelBarco){
			case 'A'->posicionX--;
			case 'B'->posicionX++;
			case 'I'->posicionY--;
			case 'D'->posicionY++;
			}
			if(posicionX>=0 && posicionX<=9 && posicionY>=0 && posicionY<=9 && casilla[posicionX][posicionY]!='X'){
				contador++;
			}
			if(contador==barco.getTamano()){
				permitirOrientacion=true;
			}
		}
		return permitirOrientacion;
	}
	public void colocarBarcoDeFormaOrientada(Barco barco,char ladoDeOrientacionDelBarco,int posicionX, int posicionY){
		String[] posicionBarco= new String[barco.getTamano()];
		for(int i=0;i<barco.getTamano();i++){
			switch(ladoDeOrientacionDelBarco){
				case 'A'->{posicionBarco[i]=""+posicionX+posicionY;casilla[posicionX--][posicionY]='X';}
				case 'B'->{posicionBarco[i]=""+posicionX+posicionY;casilla[posicionX++][posicionY]='X';}
				case 'I'->{posicionBarco[i]=""+posicionX+posicionY;casilla[posicionX][posicionY--]='X';}
				case 'D'->{;posicionBarco[i]=""+posicionX+posicionY;casilla[posicionX][posicionY++]='X';}
			}
		}
		barco.setPosicion(posicionBarco);	
	}
	public void colocarBomba(Jugador jugador){
		int posicionX=-1, posicionY=-1;
		while(posicionX<0 || posicionX>9 || posicionY<0 || posicionY>9 || casilla[posicionX][ posicionY]!=' '){
			System.out.println("Introduce la fila en la que quieres tirar la bomba, recuerda que debe ser una válida");
			posicionX=teclado.nextInt();
			System.out.println("Introduce la columna en la que quieres tirar la bomba, recuerda que debe ser una válida");
			posicionY=teclado.nextInt();
		}
		if(jugador.getTableroPropio().getCasilla()[posicionX][posicionY]!=' ' && jugador.getTableroPropio().getCasilla()[posicionX][posicionY]!='#'){
			System.out.println("¡BOOM! has acertado al parecer ahí había un barco");
			casilla[posicionX][posicionY]='#';
			jugador.getTableroPropio().casilla[posicionX][posicionY]='#';
			averiguarQueBarcoHaSidoAtacado(jugador,posicionX,posicionY);
		}else if(jugador.getTableroPropio().getCasilla()[posicionX][posicionY]=='#'){
			System.out.println("Solo quedan los restos de un barco");
		}else{
			System.out.println("¡Agua!,en esa casilla es lo único que hay");
			casilla[posicionX][posicionY]='~';
			jugador.getTableroPropio().casilla[posicionX][posicionY]='~';
		}	
	}
	
	public void BarcoAtacado(Jugador jugador,int posicionX,int posicionY){
		String posicionDeLaBomba=""+posicionX+posicionY;
		for(int i=0;i<jugador.getBarcos().length;i++){
			jugador.getBarcos()[i].getPosicion()==;
		}
		
	}
	@Deprecated
	public void averiguarQueBarcoHaSidoAtacado(Jugador jugador,int posicionX,int posicionY){
		/*
		String posicionDeLaBomba=""+posicionX+posicionY;
		boolean barcoYaAveriguado=false;
		for(int i=0;i<4 && jugador.getBuque().getTamano()>0 && barcoYaAveriguado==false;i++){
			if(jugador.getBuque().getPosicion()[i].equals(posicionDeLaBomba)){
				barcoYaAveriguado=true;
				if(jugador.getBuque().perderTrozoDeBarco()){
					jugador.setNumeroDeBarcos(jugador.getNumeroDeBarcos()-1);
				}
			}
		}
		for(int i=0;i<5 && jugador.getPortaAviones().getTamano()>0 && barcoYaAveriguado==false;i++){
			if(jugador.getPortaAviones().getPosicion()[i].equals(posicionDeLaBomba)){
				barcoYaAveriguado=true;
				if(jugador.getPortaAviones().perderTrozoDeBarco()){
					jugador.setNumeroDeBarcos(jugador.getNumeroDeBarcos()-1);
				}
			}
		}
		for(int i=0;i<3 && jugador.getNavio().getTamano()>0 && barcoYaAveriguado==false;i++){
			if(jugador.getNavio().getPosicion()[i].equals(posicionDeLaBomba)){
				barcoYaAveriguado=true;
				if(jugador.getNavio().perderTrozoDeBarco()){
					jugador.setNumeroDeBarcos(jugador.getNumeroDeBarcos()-1);
				}
			}
		}
		for(int i=0;i<2 && jugador.getPesquero().getTamano()>0 && barcoYaAveriguado==false;i++){
			if(jugador.getPesquero().getPosicion()[i].equals(posicionDeLaBomba)){
				barcoYaAveriguado=true;
				if(jugador.getPesquero().perderTrozoDeBarco()){
					jugador.setNumeroDeBarcos(jugador.getNumeroDeBarcos()-1);
				}
			}
		}
		for(int i=0;i<3 && jugador.getVelero().getTamano()>0 && barcoYaAveriguado==false;i++){
			if(jugador.getVelero().getPosicion()[i].equals(posicionDeLaBomba)){
				barcoYaAveriguado=true;
				if(jugador.getVelero().perderTrozoDeBarco()){
					jugador.setNumeroDeBarcos(jugador.getNumeroDeBarcos()-1);
				}
			}
		}
		*/
	}
}
