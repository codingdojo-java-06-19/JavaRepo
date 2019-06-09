public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("The gorilla threw something!");
		this.energyLevel -= 5;
	}
	
	public void eatBanana() {
		System.out.println("The gorilla ate a banana.");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The gorilla is climbing.");
		this.energyLevel -= 10;
	}
}
