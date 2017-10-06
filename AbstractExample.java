package java_practice;

abstract class Animal {
	abstract void move();
	abstract void shape();
}
class Lion extends Animal {
	void move() {
		System.out.println(getClass().getSimpleName()+" is running.");
	}
	void shape() {
		System.out.println("It has four legs with sharp claw and teeth");
	}
}
class Goldfish extends Animal {
	void move() {
		System.out.println("Goldfish is swimming");
	}
	void shape() {
		System.out.println("It has a fin");
	}
}

class Eagle extends Animal {
	void move() {
		System.out.println("Eagle is Flying");
	}
	void shape() {
		System.out.println("It has a sharp beak and big wings");
	}
}

public class AbstractExample {
	public static void main(String[] args) {
		Lion L = new Lion();
		L.move();
		L.shape();
		System.out.println();
		
		Goldfish g = new Goldfish();
		g.move();
		g.shape();
		System.out.println();
		
		Eagle e = new Eagle();
		e.move();
		e.shape();
	}
}
