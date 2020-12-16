package java8;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		System.out.println(animal);
		System.out.println(human);
		
		animal.display();
		human.display();
		
		System.out.println("....");
	}

}
