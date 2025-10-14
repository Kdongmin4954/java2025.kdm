package sec04.exam01;

public class Car {
	int gas;
	int minGas; //한 바퀴 돌 때 필요한 Gas
	String teamName;
	String Color;
	static int numberOfCars;
	
	Car(int gas, int minGas, String teamName, String color){
			this.gas = gas;
			this.minGas = minGas;
			this.teamName = teamName;
			this.Color = color;	
			numberOfCars++;
	
	}
	
	boolean IsLeftGas() {
		if(gas < minGas) {
			System.out.println("Need Fuel");
			return false;
	}
		
		System.out.println("Can run on more");
		return true;
	}
		
	
	void AddGas(int gas) {
		System.out.println("Full Fuel");
		this.gas = gas;
	}
	
	void RunOneRound()
	{
			System.out.println("One round done");
			this.gas -= minGas;
	}
	
	static void ShowNumberOfCars()
	{
		System.out.println("Number of Cars :" + numberOfCars);
		
	}
	
//	int Plus(int a, int b) {
//		return a + b;
//	}
//	
//	double Plus(double b, int a) {
//		return a + b;
//		}
//	
//	double Plus(int b, double a) {
//		return a + b;
//	}

}
	
