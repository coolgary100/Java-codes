
public class Dog {
	
	int dogAge;
	
	public Dog(String name) {
		System.out.println("Passed Name is:" + name);
	}
	
	public void setAge( int age ) {
		dogAge = age;
	}
	
	public int getAge ( ) {
		System.out.println("Puppy's age is:" + dogAge );
		return dogAge;
	}
	
	public static void main(String []args) {
		Dog myPuppy = new Dog( "Bobby");
		
		myPuppy.setAge(2);;
		
		myPuppy.getAge();
		
		System.out.println("Variable Value :" + myPuppy.dogAge);
	}
}
