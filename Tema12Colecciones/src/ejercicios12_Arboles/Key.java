package ejercicios12_Arboles;

public class Key {

	Category category;
	private static int num = 0;
	
	Key(Category category){
		this.category = category;
		this.num = this.num++;
	}
	
	@Override
	public String toString() {
		String output = String.format("%c%d", category.getCode(), num);
		return output;
	}
	
}
