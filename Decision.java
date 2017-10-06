package java_practice;
import java.util.Scanner;
public class Decision {
	public static void main(String [] args) {
		System.out.print("Type your age: ");
		int age = new Scanner(System.in).nextInt();
		
		if ((age > 15) && (age < 100))
			System.out.println("You can register");
		else
			System.out.println("You can't register");
		
		String result = (age>15 && age <100)?"You can register":"You can't register";
		String result1 = (age<15 || age >100)?"You can't register":"You can register";
		System.out.println(result);
	}
}
