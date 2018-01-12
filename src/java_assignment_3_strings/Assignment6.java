package java_assignment_3_strings;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello My Name is Java";

		// iterate through the chars

		for (int i = 0; i < s1.length(); i++) {

			int count = 0;
			char c = s1.charAt(i);
			 System.out.println(c);
			//System.out.println(s1.charAt(i));

			char d = ' ';
			
			
			if (count == 2) {
				//System.out.println( s1.indexOf());
				//System.out.println(s1.charAt(i));
			}
			if (c == d) {
				 //System.out.println("TRUE");
				 count++;
			}
			
			
			
		}

		//official answer
		String str = "Hello My Name is Java";

		int index = str.indexOf(" ", str.indexOf(" ") +1);

		//System.out.println("The second space is at: " + index);

	}

}
