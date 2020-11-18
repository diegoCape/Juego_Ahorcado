package Juego;

import java.util.Scanner;

public class Main {

	public static void pintaMuñeco(int vidas) {
		
		switch (vidas) {
		
		case 7:
			
			System.out.println("Progreso del Dibujo: ");
			System.out.println(" ");
			System.out.println("_______________________________");
			System.out.println(" ");
			System.out.println("-------------------------------------------------------------");
			
			break;
			
		case 6:
			
			System.out.println(" ");
			System.out.println("Progreso del Dibujo: ");
			System.out.println("   ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" |_______________________________");
	        System.out.println(" ");
	        System.out.println("-------------------------------------------------------------");
	        
			break;
			
		case 5:
			
			System.out.println(" ");
			System.out.println("Progreso del Dibujo: ");
			System.out.println(" ");
			System.out.println("|------------------");
			System.out.println("|                 |");
			System.out.println("|                 |");
			System.out.println("|                 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_______________________________");
			System.out.println(" ");
			System.out.println("-------------------------------------------------------------");
			
			break;
			
		case 4:
			
			System.out.println(" ");
			System.out.println("Progreso del Dibujo: ");
			System.out.println(" ");
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                 | -  -  |");
	        System.out.println(" |                 |   o   |");
	        System.out.println(" |                  -------");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" |_______________________________");
	        System.out.println(" ");
	        System.out.println("-------------------------------------------------------------");
	        
			break;
	
		case 3:
			
			System.out.println(" ");
			System.out.println("Progreso del Dibujo: ");
			System.out.println(" ");
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                 | -  -  |");
	        System.out.println(" |                 |   o   |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" |_______________________________");
	        System.out.println(" ");
	        System.out.println("-------------------------------------------------------------");
	        
			break;
			
		case 2:
			
			System.out.println(" ");
			System.out.println("Progreso del Dibujo: ");
			System.out.println(" ");
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                 | -  -  |");
	        System.out.println(" |                 |   o   |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                     |");
	        System.out.println(" |                   / | \\ ");
	        System.out.println(" |                  /  |   \\ ");
	        System.out.println(" |                 /   |     \\ ");
	        System.out.println(" |                     |");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" |_______________________________");
	        System.out.println(" ");
	        System.out.println("-------------------------------------------------------------");
	        
			break;
			
		case 1:
			
			System.out.println(" ");
			System.out.println("Progreso del Dibujo: ");
			System.out.println(" ");
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                 | -  -  |");
	        System.out.println(" |                 |   o   |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                     |   ");
	        System.out.println(" |                   / | \\");
	        System.out.println(" |                  /  |   \\");
	        System.out.println(" |                 /   |     \\");
	        System.out.println(" |                     |   ");
	        System.out.println(" |                    /  \\ ");
	        System.out.println(" |                   /     \\ ");
	        System.out.println(" |                  /        \\ ");
	        System.out.println(" |_______________________________");
	        System.out.println(" ");
	        System.out.println("-------------------------------------------------------------");
	        
			break;
			
		case 0:
			
			System.out.println(" ");
			System.out.println("Progreso del Dibujo: ");
			System.out.println(" ");
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                 | x  x  |");
	        System.out.println(" |                 |   o   |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                     |   ");
	        System.out.println(" |                   / | \\");
	        System.out.println(" |                  /  |   \\");
	        System.out.println(" |                 /   |     \\");
	        System.out.println(" |                     |   ");
	        System.out.println(" |                    /  \\ ");
	        System.out.println(" |                   /     \\ ");
	        System.out.println(" |                  /        \\ ");
	        System.out.println(" |_______________________________");
	        System.out.println(" ");
	        System.out.println("Has Perdido, No Has Podido Adivinar la Palabra");
	        
			break;
			
			
		}
		
	}
	
	
	public static int comprobarLetraVidas(String vPalabra[], String letra, int vidas, String vAciertos[], String vFallos[]) {

		boolean encontrado = false;
		
		for (int i = 0; i < vPalabra.length; i++) {
			
			if (vPalabra[i].equalsIgnoreCase(letra)) {
				
				vAciertos[i] = letra;
				encontrado = true;
				
			}	
		}
		
		
		if (encontrado == false) {
			for (int i = 0; i < vFallos.length; i++) {
				if (letra.equals(vFallos[i])) {
					
					System.out.println("Ya Has Errado esa Letra, Prueba con Otra");
					break;
					
				}else {
					
					if (vFallos[i].equals("_")) {
						
						vFallos[i] = letra;
						vidas--;
						break;
				    }
					
				}
			}
			
		}
		
		return vidas;
		
	}
	
	
	public static void inicializarVectores(String palabra, String vPalabra[], String vAciertos[], String vFallos[]) {
		
		for (int i = 0; i < vFallos.length; i++) {
			
			vFallos[i] = "_";
		}
		
		
		for (int i = 0; i < vPalabra.length; i++) {
			
			vPalabra[i] = palabra.substring(i, i+1);
			vAciertos[i] = "_";
		}
		
	}
	
	
	public static void dibujarAciertosFallos(String vFallos[], String vAciertos[]) {

		System.out.println("\nProgreso de la Palabra:");
		
		for (int i = 0; i < vAciertos.length; i++) {
					
				System.out.print(vAciertos[i] + " ");
					
		}
		
		
		System.out.println(" ");
		System.out.println("\nLetras Falladas:");
		System.out.println(" ");
		
		for (int i = 0; i < vFallos.length; i++) {
			if (!vFallos[i].equals("_")) {
				
				System.out.print(vFallos[i] + " ");
				System.out.println(" ");
			}
		}
		
	}

	
	public static boolean comprobarVictoria (String vAciertos[]) {
		
		for (int i = 0; i < vAciertos.length; i++) {
			if (vAciertos[i].equals("_")) {
				
				return false;
			}
		}
		
		System.out.println("Enhorabuena Has Acertado la Palabra");
		return true;
	}
	
	
	public static void main(String[] args) {

		Scanner leer = new Scanner (System.in);
		
		int vidas = 8;
		String palabra = "Zarigueya", letra = "";
		String vPalabra[], vAciertos[], vFallos[];
		vPalabra = new String[palabra.length()];
		vAciertos = new String[palabra.length()];
		vFallos = new String[vidas];
		
		
		inicializarVectores(palabra, vPalabra, vAciertos, vFallos);
		
		//System.out.println("Introduce una Palabra para Adivinar");
		//palabra = leer.next();
		
		do {
			
			System.out.println("\nIntroduce una Letra Para Comprobar si Aparece en la Palabra");
			letra = leer.next();
			
			
			vidas = comprobarLetraVidas(vPalabra, letra, vidas, vAciertos, vFallos);
			
			dibujarAciertosFallos(vFallos, vAciertos);
			
			pintaMuñeco(vidas);
			
			
		}while(vidas>0 && comprobarVictoria(vAciertos)==false);
		
		
	}
	
}
