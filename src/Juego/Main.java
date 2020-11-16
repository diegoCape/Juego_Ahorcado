package Juego;

import java.util.Scanner;

public class Main {

	public static void pintaMuñeco(int vidas) {
		
		switch (vidas) {
		
		case 7:
			
			System.out.println("_______________________________");
			System.out.println(" ");
			
			break;
			
		case 6:
			
			System.out.println(" ");
			System.out.println("");
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
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println("_______________________________");
	        System.out.println(" ");
	        
			break;
			
		case 5:
			
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
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_______________________________");
			System.out.println(" ");
			
			break;
			
		case 4:
			
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
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println("|_______________________________");
	        System.out.println(" ");
	        
			break;
	
		case 3:
			
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
	        System.out.println(" | ");
	        System.out.println("|_______________________________");
	        System.out.println(" ");
	        
			break;
			
		case 2:
			
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
	        System.out.println("|_______________________________");
	        System.out.println(" ");
	        
			break;
			
		case 1:
			
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
	        System.out.println("|_______________________________");
	        System.out.println(" ");
	        
			break;
			
			
		}
		
	}
	
	
	
	public static boolean comprobarLetra(String vPalabra[], String letra) {
		
		boolean encontrado = false;
		
		
		for (int i = 0; i < palabra.length(); i++) {
			
			if (palabra.substring(i).equalsIgnoreCase(letra)) {
				
				encontrado = true;
				
			}else {
				
				
			}
		}
		
		return encontrado;
		
	}
	
	
	public static void inicializarVectores(String palabra, String vPalabra[], String vAciertos[], String vFallos[]) {
		
		for (int i = 0; i < vFallos.length; i++) {
			
			vFallos[i] = "_";
			
		}
		
		for (int i = 0; i < vPalabraSecreta.length; i++) {
			//Trocear la palabra en letras al vector
			
			vAciertos[i] = "_ ";
		}
		
		
		
	}
	
	
	public static void main(String[] args) {

		Scanner leer = new Scanner (System.in);
		
		int vidas = 7;
		String palabra = "Espejo", letra = "";
		String vPalabra[], vAciertos[], vFallos[];
		vPalabra = new String[palabra.length()];
		vAciertos = new String[palabra.length()];
		vFallos = new String[vidas];
		
		
		
		//System.out.println("Introduce una Palabra para Adivinar");
		//palabra = leer.next();
		
		do {
			
			System.out.println("Introduce una Letra Para Comprobar si Aparece en la Palabra");
			letra = leer.next();
			
			
			
			vidas = vidas - 1;
			pintaMuñeco(vidas);
			
			
		}while(vidas>=0);
		
		
	}
	
}
