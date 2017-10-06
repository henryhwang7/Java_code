package java_practice;

class Car {
	void start() {
		System.out.println("Begin the Start Method");
		check_engine();
		System.out.println("Terminate Start Method");
	}
	void check_engine() {
		System.out.println("Check_engine Method begins");
		check_oil();
		System.out.println("Terminate check_engine method");
	}
	void check_oil() {
		System.out.println("Begin the check_oil Method");
		System.out.println("Terminate check_oil method");
	}
}


public class Car_Test {
	public static void main(String[] args) {
		System.out.println("Begin Main method");
		Car c = new Car();
		c.start();
		System.out.println("Terminate Main Method");
	}
}
