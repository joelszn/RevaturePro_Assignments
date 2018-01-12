package java_assignment_2_statements;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a class named Assignment8 which uses a do-while loop to print
		// only the odd
		// number between 1 and 9, inclusive.

		int i = 0;
		do {
			if (i % 2 != 0) {
				System.out.println(i);
			}

			i++;
		} while (i < 11);

	}

}
