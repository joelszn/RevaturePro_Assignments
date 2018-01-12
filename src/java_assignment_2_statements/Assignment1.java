package java_assignment_2_statements;

import java.util.Random;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// random nubmer
		Random randNum = new Random();
		int a = randNum.nextInt(10) + 1;

		if ((a % 2) == 0) { // using modulus to see if a number is even
			System.out.println(true);
			System.out.println(a);
		} else { // else print the number out to check
			System.out.println(false);
			System.out.println(a);
		}

	}

}
