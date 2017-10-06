package java_practice;
import java.util.Scanner;

class Date {
	private int year, month, day;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public void setDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	public void printDate() {
		System.out.println(month+"/"+day+"/"+year+"/");
	}
}

public class DateTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		
		System.out.print("Type year: ");
		int iy = sc.nextInt();
		System.out.print("Type month: ");
		int im = sc.nextInt();
		System.out.print("Type day: ");
		int id = sc.nextInt();
		
		d.setDate(iy, im, id);
		d.printDate();
		
		d.setYear(2020);
		d.printDate();
		
		d.setMonth(5);
		d.printDate();
		
		d.setDay(15);
		d.printDate();
		
		sc.close();
	}
}
