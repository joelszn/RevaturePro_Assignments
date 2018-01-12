package java_assignment_1_introduction;

import java.util.Arrays;
import java.util.Random;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// added a random number generator to make more challenging
		Random randNum = new Random();
		int[] numbers = new int[5];

		// loop to generate 5 random numbers to load into array
		for (int i = 0; i < 5; i++) {

			int intArr = randNum.nextInt(5) + 1; // plus 1 because it starts at
													// 0, & you want numbers 1-5
			numbers[i] = intArr; // assigning the i'th value of the array to the
									// random number generated
			// System.out.println(intArr);

		}

		System.out.println(Arrays.toString(numbers)); // printing array

	}

}
