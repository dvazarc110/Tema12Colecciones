package ejercicios12_ArrayList;

import java.util.List;

public class Lista <T extends List> {

	private T list;
	
	public Lista (List<String> lista) {
		this.list = (T) lista;
	}
	
	public List<String> reverseList(List<String> lista) {
		for(int i = (lista.size()-1); i >= 0; i--) {
			(this.list).add(lista.get(i));
		}
		return this.list;
	}
}
