import java.util.Scanner;

public class ClassroomSize {

	public static void main(String[] args) {

		double length;
		double width;
		String answer;

		do {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Length: ");
		length = input.nextDouble();

		System.out.println("Enter Width: ");
		width = input.nextDouble();

		System.out.println("Area: " + length * width);
		System.out.println("Perimeter: " + (length + width) * 2);

		System.out.println("Continue? (Yes or No)");
		answer = input.next();
		}
		while(answer.equalsIgnoreCase("Yes"));
		

	  }
			
		

	}


