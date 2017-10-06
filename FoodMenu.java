package java_practice;
import java.text.DecimalFormat;
import java.util.Scanner;

class Food {
	int order;
	String[][] food;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of orders: ");
		order = sc.nextInt();
		food = new String[order][2];
		System.out.println("Total Number of Orders: "+order);
		
		for (int i=0; i<food.length;i++) {
			System.out.print("#"+(i+1)+" order name: ");
			food[i][0] = sc.next();
			System.out.print("#"+(i+1)+" order price (in dollar): ");
			food[i][1] = sc.next();
		}
		sc.close();
	}
	
	void print() {
		input();
		DecimalFormat df = new DecimalFormat("#,##0 dollars");
		
		System.out.println("\n--------Order Summary----------");
		for (int i=0; i<food.length;i++) {
			System.out.println("#"+(i+1)+" order name: "+food[i][0]+"");
			System.out.println("#"+(i+1)+" order price: "+df.format(Integer.parseInt(food[i][1]))+"");
			System.out.println();
		}
	}
}

public class FoodMenu {
	public static void main(String[] args) {
		Food food1 = new Food();
		food1.print();
	}
}
