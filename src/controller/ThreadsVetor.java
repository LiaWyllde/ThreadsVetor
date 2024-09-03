package controller;

public class ThreadsVetor extends Thread {
	
	private int[] arrayNumbers;
	private int oddEven;
	
	public ThreadsVetor(int[] arrayNumbers, int oddEven) {
		this.arrayNumbers = arrayNumbers;
		this.oddEven = oddEven;
	}
	
	private void showTime(int[] arrayNumbers, int oddEven) {
		
		double initialTime = System.nanoTime();
		
		if (oddEven % 2 == 0) {
			
			for (int i = 0; i < arrayNumbers.length; i++) {}
			System.out.println("Even number");
			
		} else {
			
			for (int number : arrayNumbers) {}	
			System.out.println("Odd number");
		}
		double finalTime = System.nanoTime();
		double timeDifference = finalTime - initialTime;
		timeDifference /= Math.pow(10,9);
		
		System.out.println("Time to run: " + timeDifference + ".s");		
	}
	
	@Override
	public void run() {
		showTime(arrayNumbers, oddEven);
	}
}
