package ejercicios12_Mapas_Enum;

import java.util.Map;

public enum BasicStringOperation implements StringOperation{

	TO_LOWER('L'){
		
		@Override
		public String apply(String input) {
			return input.toLowerCase();
		}
		
	}, TO_UPPER('U'){
		
		@Override
		public String apply(String input) {
			return input.toUpperCase();
		}
	};

	private final char symbol;
	
	private static final Map<Character, BasicStringOperation> symboltoStringOperation = Map.of(BasicStringOperation.TO_LOWER.getSymbol(), BasicStringOperation.TO_LOWER,
			BasicStringOperation.TO_UPPER.getSymbol(), BasicStringOperation.TO_UPPER);
	
	BasicStringOperation (char symbol){
		this.symbol = symbol;
	}
	
	@Override
	public char getSymbol() {
		
		return symbol;
	}
	
	public static BasicStringOperation fromSymbol(char symbol) {
		return symboltoStringOperation.get(symbol);
	}
}
