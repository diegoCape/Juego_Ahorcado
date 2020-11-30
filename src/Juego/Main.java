package Juego;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner leer = new Scanner (System.in);
		
		int vidas = 8;
		String palabra = "Zarigueya", letra = "";
		String vPalabra[], vAciertos[], vFallos[];
		vPalabra = new String[palabra.length()];
		vAciertos = new String[palabra.length()];
		vFallos = new String[vidas];
		
		
		Funciones.inicializarVectores(palabra, vPalabra, vAciertos, vFallos);
		
		
		do {
			
			System.out.println("\nIntroduce una Letra Para Comprobar si Aparece en la Palabra");
			letra = leer.next();
			
			
			vidas = Funciones.comprobarLetraVidas(vPalabra, letra, vidas, vAciertos, vFallos);
			
			Funciones.dibujarAciertosFallos(vFallos, vAciertos);
			
			Funciones.pintaMuñeco(vidas);
			
			
		}while(vidas>0 && Funciones.comprobarVictoria(vAciertos)==false);
		
	}
	
}
