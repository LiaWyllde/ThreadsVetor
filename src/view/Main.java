package view;
import java.util.Random;
import controller.ThreadsVetor;


public class Main {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] arrayNumbers = new int[1000];
		int size = arrayNumbers.length;
		int oddEven = 1;
		
		for (int i = 0; i < size; i++) {
			arrayNumbers[i] = rand.nextInt(100);
		}
		
		for (int i = 0; i < 2; i++) {
			ThreadsVetor t = new ThreadsVetor(arrayNumbers, oddEven);
			t.start();
			++oddEven;
		}

	}
}
