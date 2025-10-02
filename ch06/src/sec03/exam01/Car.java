package sec03.exam01;

public class Car {
//	String company = "Kia";
//	String model = "Truck";
//	int maxSpeed = 150;
	String company;
	String model;
	int maxSpeed;
	
	public Car() {
		this("Kia", "Truck", 150);
	}
	
	public Car(String company) {
//		this.company = company;
		this("Kia", "Truck", 150);
		}
	
	public Car(String company, String model) {
//		this.company = company;
//		this.model = model;
		this("Kia", "Truck", 150);
	}
	
	
	public Car(String company, String model, int maxSpeed)
	{
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	public void ShowInfo() {
		System.out.println("Company :" + company);
		System.out.println("Model :" + model);
		System.out.println("maxSpeed :" + maxSpeed);
	}
	
}

