package java_practice;
import java.io.IOException;
import java.util.Scanner;
public class DayPrint {
	public static void main(String[] args) throws IOException {
		System.out.print("Type either t,f,s: ");
		String day = new Scanner(System.in).next();
		
		switch(day) {
		case "T":case "t":
			System.out.println("Thursday");
			break;
		case "F":case "f":
			System.out.println("Friday");
			break;
		case "S":case "s":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Wrong choice");
		}
	}
}
