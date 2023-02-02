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
		
		
		int losses = 0;
		for (int i = 0; i < totalSimulations; i++) {
			int currentAmount = startAmount;
			int count = 0;
			while (currentAmount > 0 && (currentAmount < winLimit)) {
				double prob = Math.random();
				if(prob <=  winChance) {
					currentAmount = currentAmount + 1;
				}
				else{
					currentAmount = currentAmount - 1;
				}
				count = count + 1;

		}
			if (currentAmount == 0) {
				System.out.println("Similation " + (i+1) + ":" + count + " LOSE");
				losses = losses + 1;
			}
			if (currentAmount == winLimit)
				System.out.println("Similation " + (i+1) +":" + + count + " WIN");
			}
		double ruinRate = losses / 500.0;
		System.out.println("Losses: " + losses + "Simulations: " + totalSimulations);
		System.out.println("Ruin Rate from Simulation: " + ruinRate);
		
		
		double expectedRuin;
		double alpha;
		alpha = (1 - winChance) * 1.0 / winChance;
		if (winChance == .5) {
			expectedRuin = 1 - 1.0 * (startAmount) / winLimit;
		}
		else {
			
			expectedRuin = 
	(Math.pow(alpha, 1.0 * startAmount) - Math.pow(alpha, 1.0 * winLimit)) / (1 - Math.pow(alpha, winLimit*1.0));
		}
	}

}
