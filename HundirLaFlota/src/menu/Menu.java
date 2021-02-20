package menu;

public class Menu{
	public static void imprimirColocarBarco(String barcoAColocar){
		System.out.println("Vas a colocar el "+barcoAColocar);
	}
	public static void imprimirVaAColocar(String jugadorQueColoca, String jugadorTaparOjos){
	System.out.println("Va a colocar los barcos "+jugadorQueColoca+", "+jugadorTaparOjos+" tapate los ojos, ¡No mires!");
	}
	public static void imprimirVaAAtacar(String jugadorAtacante){
	System.out.println("Es el turno de atacar de "+jugadorAtacante);	
	}
	public static void imprimirNombreJugador(String numeroJugador){
		System.out.println("Introduce tu nombre Jugador"+numeroJugador);
	}
}