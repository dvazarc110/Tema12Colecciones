package ejercicios12_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {

	public void show() {
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		List<String> lista = new ArrayList<>();
		int opcion;
		mostrar();
		do {
            opcion = consola.readIntInRange(0, 7);
         
            switch (opcion) {
            	case 0 -> mostrar();
            	case 1 -> {
            		lista = new ArrayList<>();
            		System.out.println("La anterior lista fue borrada y una nueva lista creada.\n");
            	}
            	case 2 -> System.out.printf("La lista tiene %d elementos\n", lista.size());
            	case 3 -> {
            		lista.add(addLista(consola));
            		System.out.println("Nuevo elemento añadido.\n");
            	}
            	case 4 -> {
            		lista.removeLast();
            		System.out.println("Último elemento de la lista eliminado.\n");
            	}
            	case 5 -> searchList(lista, consola);
            	case 6 -> System.out.printf("\nLista: %s\n", lista.toString());
            	case 7 -> System.out.println("¡Hasta luego!");
            	default -> System.out.println("Opción no válida, inténtalo de nuevo.");
            }

        } while (opcion != 7);
	}
	
	public void mostrar() {
		System.out.println("=== MENÚ DE LA LISTA ===");
		System.out.println("1. Nueva lista");
		System.out.println("2. Número de cadenas");
		System.out.println("3. Añadir cadena");
		System.out.println("4. Eliminar última cadena");
		System.out.println("5. Contiene cadena");
		System.out.println("6. Mostrar lista entera");
		System.out.println("7. Salir");
		System.out.println("0. Mostrar menú");
	}
	
	public String addLista(ConsoleInput consola) {
		System.out.println("Introduzca el elemento a añadir en su lista: ");
		return consola.readString();
	}
	
	public void searchList(List<String> lista, ConsoleInput consola) {
		String elemento;
		boolean search = false;
		int position = 0;
		System.out.printf("\nIntroduzca la cadena a buscar: ");
		elemento = consola.readString();
		
		for(int i = 0; i < lista.size(); i++) {
			if(elemento.equals(lista.get(i))) {
				search = true;
				position = i+1;
			}
		}
		
		System.out.printf("\nLa cadena introducida (%s) %s encuentra en la lista, y es el %s elemento que fue añadido en esta.\n", elemento, search? "se":"no se", position==1? "1er":String.format("%dº", position));
		
	}
	
	public static void main(String[] args) {

		new Exercise3().show();
		
	}

}
