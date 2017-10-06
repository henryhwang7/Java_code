package java_practice;
import java.util.Scanner;
public class CarTest {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type speed score: ");
		int speed = sc.nextInt();
		System.out.print("Type design score: ");
		int design = sc.nextInt();
		System.out.print("Type mileage score: ");
		int mileage = sc.nextInt();
		
		double avg = (double)(speed+design+mileage)/3;
		System.out.print("Result: ");
		if (avg >= 80) {
			if (speed >= 80 && design >=80 && mileage >= 80)
				System.out.print("Best! ");
			System.out.println("Pass the test");
		}
		else if (avg >= 70) {
			System.out.println("Normal");
		}
		else {
			System.out.println("Recall");
		}
		System.out.printf("Average: %.1f", avg);
	}
}
