package examples;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda2 {
	
  public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		Consumer<Integer> method = (n) -> {
			System.out.println(n);
		};
		numbers.forEach(method);
		
		System.out.println("");
		
		ArrayList<String> letras = new ArrayList<String>();
		letras.add("H");
		letras.add("o");
		letras.add("l");
		letras.add("a");
		Consumer<String> metodo = (y) -> {
			System.out.println(y);
		};
		letras.forEach(metodo);
	}
}