package java_practice;

class Parent {
	int data = 100;
	public void print() {
		System.out.println("Print() Method of the Parent Class");
	}
}
class Child extends Parent {
	int data = 200;
	public void print() {
		super.print();
		System.out.println("Print() Method of the Child Class");
		System.out.println(data);
		System.out.println(this.data);
		System.out.println(super.data);
	}
}

public class OverridingExample {
	public static void main(String[] args) {
		Child child = new Child();
		child.print();
	}
}
