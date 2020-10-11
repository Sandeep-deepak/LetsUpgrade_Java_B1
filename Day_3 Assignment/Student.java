import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
        //Questions 1:
        	// Take 5 subjects marks each subject 100 marks;
        	// calculate the percentage;
        	// based on the percentage print the grade and the percentage;
        int sub1;
		int sub2;
		int sub3;
		int sub4;
        int sub5;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter Marks Obtained in Subjects out of 100 : ");
		System.out.println("Enter English Marks: ");
		sub1 = inp.nextInt();
		System.out.println("Enter Maths Marks:");
		sub2 = inp.nextInt();
		System.out.println("Enter Science Marks:");
		sub3 = inp.nextInt();
		System.out.println("Enter Social Marks:");
		sub4 = inp.nextInt();
		System.out.println("Enter local-lang Marks:");
		sub5 = inp.nextInt();
		
		float total = sub1+sub2+sub3+sub4+sub5;
		float percentage = (total/500)*100;

		System.out.println("======================");

		if (percentage >= 85 && percentage <= 100) {
			System.out.println("Grade: A" + " , " + "Percentage: " + percentage);
		} else if (percentage >= 70 && percentage < 85) {
			System.out.println("Grade: B" + " , " + "Percentage: " + percentage);
		} else if (percentage >= 55 && percentage < 70) {
			System.out.println("Grade: C" + " , " + "Percentage: " + percentage);
		} else if (percentage >= 35 && percentage < 55) {
			System.out.println("Grade: D" + " , " + "Percentage: " + percentage);
		} else {
			System.out.println("Grade: F" + " , " + "Percentage: " + percentage);
		}
		
	}

}
