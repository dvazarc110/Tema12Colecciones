package ejercicios12_Arboles;

public enum Category {

	BOSS('B'), MANAGER('M'), EMPLOYEE('E');
	
	private final char code;
	private int count = 0;
	
	
	Category (char code){
		this.code = code;
	}
	
	public char getCode() {
		return code;
	}
	

    

    public int nextNum() {
        return ++count;
    }
}
