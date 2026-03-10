package ejercicios12_Arboles;

public class Key {

	Category category;
	int num = 0;
	
	Key(Category category){
		this.category = category;
		this.num = category.nextNum();
	}

	@Override
	public String toString() {
		String output = String.format("%c%d", category.getCode(), this.num);
		return output;
	}
	
}
