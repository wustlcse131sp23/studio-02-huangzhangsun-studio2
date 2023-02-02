package studio2;
import java.util.Scanner;
public class Pi {

	public static void main(String[] args) {
		double x;
		double y;
		double distance;
		double r = 0.5;
		int count = 0;
		double pi;
		Scanner in = new Scanner(System.in);
		System.out.println("total Simulations: ");
		int totalSimulations = in.nextInt();
		for (int i = 0; i < totalSimulations; i++) {
				
			x = Math.random() - 0.5;
			y = Math.random() - 0.5;
			distance = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
			if (distance <= 0.50) {
				count = count + 1;
			}
		}
		
		pi = count * 1.0 / totalSimulations * 4;
		System.out.println("Pi is: " + pi);
	}

	
}
