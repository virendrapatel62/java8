package java8;

@FunctionalInterface
public interface Movable {
	public void move();
	default void display() {
		System.out.println("This is desplay method");
	}
}

class Animal implements Movable{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}
class Human implements Movable{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void display() {
		System.out.println("I am human from dipaly");
	}
	
}