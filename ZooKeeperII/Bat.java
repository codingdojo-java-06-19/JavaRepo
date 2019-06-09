public class Bat extends Mammal{
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Flap, flap, flap!");
		this.energyLevel -= 50;
	}
	
	public void eatHuman() {
		System.out.println("The bat's eating someone!");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("The bat's attacking a town!");
		this.energyLevel -= 100;
	}
}
