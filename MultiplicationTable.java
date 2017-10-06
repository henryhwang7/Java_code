package java_practice;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.print("Type an integer for multiplication table: ");
		int num = new Scanner(System.in).nextInt();
		if (num >=2 && num <=9) {
			for (int i = 1; i <=9; i++)
				System.out.println(num+"*"+i+"="+num*i);
		}
		else
			System.out.println("Type an integer only from 2 to 9");
		System.out.println();
		
		// Using 'while' to print the table 
		int i = 1, j = 0;
		while (++i<10) {
			System.out.println("<"+i+" Multiplier>");
			while (++j<10) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			j = 0;
			System.out.println("----------------");
		}
	}
}
