package ejercicios12_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

	public void show() {
		List<Integer> lista = rellenarLista();
		double media = calcmedia(lista);
		System.out.printf("\nLa media de los números introducidos es: %.2f", media);
		System.out.printf("\nLos números introducidos inferiores a la media son: %s", menoresmedia(lista, media));
	}
	
	public List<Integer> rellenarLista(){
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		int num;
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 1; i<=10; i++) {
			if(i == 1) {
				System.out.printf("Introduce el %der número: ", i);
				num = consola.readInt();
				lista.add(num);
			}else {
				System.out.printf("\nIntroduce el %dº número: ", i);
				num = consola.readInt();
				lista.add(num);
			}
		}
		
		return lista;
	}
	
	public double calcmedia(List<Integer> lista) {
		int total = 0;
		
		for(int i= 0; i < lista.size(); i++) {
			total+=lista.get(i);
		}
		
		return ((double)total)/lista.size();
	}
	
	public String menoresmedia (List<Integer> lista, double media) {
		String numeros = "";
		
		for(int i = 0; i < lista.size(); i++) {
			if(((double)lista.get(i)) < media) {
				numeros = numeros.concat(String.format((lista.get(i)).toString() + ", "));
			}
		}
		numeros = numeros.substring(0,(numeros.length()-2));
		return numeros;
	}
	
	public static void main(String[] args) {

		new Exercise1().show();
		
	}

}
