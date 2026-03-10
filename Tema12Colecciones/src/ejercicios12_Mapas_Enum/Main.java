package ejercicios12_Mapas_Enum;

public class Main {
	public void show() {
		BasicStringOperation stringOperation;
        stringOperation = BasicStringOperation.fromSymbol('L');//operation se asigna con la instancia correspondiente al símbolo +
        System.out.printf("La variable stringOperation es de tipo enum %s y su símbolo es %c", stringOperation, stringOperation.getSymbol());
	}

	public static void main(String[] args) {
		new Main().show();
	}
}
