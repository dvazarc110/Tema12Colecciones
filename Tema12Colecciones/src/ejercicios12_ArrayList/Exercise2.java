package ejercicios12_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

	public void show() {
		List<String> lista = new ArrayList<>();
		Lista list = new Lista(lista);
		lista = fillList();
		System.out.printf("\nLista: %s", lista.toString());
		System.out.printf("\nLista invertida: %s", (list.reverseList(lista)).toString());
	}
	
	public List<String> fillList(){
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		List<String> lista = new ArrayList<>();
		int cont = 1;
		String answer;
		boolean out = false;
		
		do {
			if(cont == 1) {
				System.out.printf("Introduzca el %der elemento de su lista: ", cont);
			}else {
				System.out.printf("Introduzca el %dº elemento de su lista: ", cont);
			}
			
			lista.add(consola.readString());
			
			System.out.println("¿Quiere añadir otro valor a su lista? (Y/N)");
			answer = ((consola.readString()).toUpperCase()).trim();
			
			if((answer.substring(0, 1)).equalsIgnoreCase("N")) {
				out = true;
			}
			cont++;
			
		}while(!out);
		
		return lista;
	}
	
	public static void main(String[] args) {

		new Exercise2().show();
		
	}

}
