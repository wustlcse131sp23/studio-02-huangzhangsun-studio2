package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("start amount: ");
		int startAmount = in.nextInt();
		
		System.out.println("win Chance: ");
		double winChance = in.nextDouble();
		
		System.out.println("win Limit: ");
		int winLimit = in.nextInt();
		
		System.out.println("total Simulations: ");
		int totalSimulations = in.nextInt();
		
		
		int currentAmount = startAmount;
		for (int i = 0; i < totalSimulations; i++) {
			int count = 0;
			while (currentAmount > 0 && currentAmount < winLimit) {
				double prob = Math.random();
				if(prob <=  winChance) {
					currentAmount = currentAmount + 1;
				}
				else{
					currentAmount = currentAmount - 1;
				}
				count = count + 1;
				if (currentAmount == 0) {
					System.out.println("Similation " + (i+1) + ":" + count + " LOSE");
				}
				if (currentAmount == winLimit)
					System.out.println("Similation " + (i+1) +":" + + count + " Win");
				}
				
			
		}
		
		

	}

}
