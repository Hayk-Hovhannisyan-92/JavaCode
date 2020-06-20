package BlokSxemaPage;

import java.util.Scanner;

public class BlokSxema {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Import gender  of  user --");
		String userGender = scanner.next();
		if (userGender.equals("male")) {
			System.out.println("I shall not wear shoes in heels ");
		} 
		
		else 
		if(userGender.equals("female")){
			System.out.print("Import height of user --");
			int weight = scanner.nextInt();
			
			if (weight < 165) {
				System.out.println("I shall wear shoes in heels in 5sm ");
			}
			else
			if (weight < 170) {
				System.out.println("I shall wear shoes in heels in 2sm ");
			}
			else
			System.out.println("I shall not wear shoes in heels too");
		}
	}
}
