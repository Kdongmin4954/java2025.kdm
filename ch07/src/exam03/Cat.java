package exam03;

public class Cat {
	static int normalHeight = 2;
	int jumpHeight;
	
	Cat(int jumpHeight){
		this.jumpHeight = jumpHeight;
	}
	
	boolean IsHealthy() {
		if(jumpHeight > normalHeight) 
			return true;
		else
			return false;
	}
	
	void Heal() {
		if(IsHealthy()) {
			System.out.println("No problem");
		}
		else {
			System.out.println("sick!");
		}
	}

}
