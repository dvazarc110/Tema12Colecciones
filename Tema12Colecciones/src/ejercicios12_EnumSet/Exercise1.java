package ejercicios12_EnumSet;

import java.util.EnumSet;
import java.util.Locale;
import java.time.*;
import java.time.format.TextStyle;

public class Exercise1 {

	public void show() {
		
		EnumSet<Month> meses1, meses2, meses3, meses4, meses5;
		Locale l = Locale.of("es", "ES");
		
		System.out.println("1º");
		meses1 = EnumSet.allOf(Month.class);
		for(Month mes : meses1) {
			System.out.println((mes.getDisplayName(TextStyle.FULL,l)).toUpperCase());
		}
		
		System.out.println("\n2º");
		meses2 = EnumSet.noneOf(Month.class);
		meses2.add(Month.JUNE);
		meses2.add(Month.JULY);
		meses2.add(Month.AUGUST);
		meses2.add(Month.SEPTEMBER);
		for(Month mes : meses2) {
			System.out.println((mes.getDisplayName(TextStyle.FULL,l)).toUpperCase());
		}
		
		System.out.println("\n3º");
		meses3 = EnumSet.complementOf(meses2);
		for(Month mes : meses3) {
			System.out.println((mes.getDisplayName(TextStyle.FULL,l)).toUpperCase());
		}
		
		System.out.println("\n4º");
		meses4 = EnumSet.copyOf(meses3);
		for(Month mes : meses4) {
			System.out.println((mes.getDisplayName(TextStyle.FULL,l)).toUpperCase());
		}
		
		
		System.out.println("\n5º");
		meses5 = EnumSet.range(Month.SEPTEMBER, Month.DECEMBER);
		for(Month mes : meses5) {
			System.out.println((mes.getDisplayName(TextStyle.FULL,l)).toUpperCase());
		}
	}
	
	public static void main(String[] args) {

		new Exercise1().show();

	}
}
