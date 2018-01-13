package pr.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface Prime {
	//Sieve of Eratosthenes Function
	public static void sieveEratos(int number) {
		
		boolean[] primeList = new boolean[number + 1];
		int i = 0, j = 0, numCount = 0, square = (int) Math.sqrt(number);
		
		//Initialize all values in primeList to true
		for(i = 0; i < number; i++) {
			primeList[i] = true; 
		}
	
		//Sieve of Eratosthenes Algorithm
		for(i = 2; i <= square; i++) {
			if(primeList[i] == true) {
				for(j = i * i; j <= number; j += i) {
					primeList[j] = false;
				}
			}
		}
		
		//Print out the Result of Primes
		for(i = 2; i < number; i++) {
			if(primeList[i] == true && i != 1) {
				System.out.print(i + ", ");
				numCount++;
			}
			
			if(numCount == 9) {
				System.out.print("\n");
				numCount = 0;
			}
		}
		
	}
	
	//Ask a Question, Return Input
	public static String getInput(String question) {
		String word = null;
		
		System.out.print(question);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			word = input.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return word;
	}
}
