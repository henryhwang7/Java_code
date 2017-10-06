package java_practice;

class Plane {
	private String company, model;
	private int number;
	public static int count;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	static int getCount() {
		return count;
	}

	Plane(String company, String model, int number) {
		this.company = company;
		this.model = model;
		this.number = number;
		++count;
	}
	Plane() {
		++count;
	}
	
	public void display() {
		System.out.println("Manufacturer: "+getCompany());
		System.out.println("Model Name: "+getModel());
		System.out.println("Maximum Capacity: "+getNumber());
	}
}


public class PlaneManufacturing {
	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane("Airbus","A380",500);
		
		p1.setCompany("Boeing");
		p1.setModel("Boeing707");
		p1.setNumber(200);
		p1.display();
		System.out.println();
		
		p2.display();
		
		System.out.println("\nCurrent number of planes: "+Plane.getCount());
	}
}
