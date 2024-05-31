public class MainClass {
	public static void main(String[] args){
	Dog d1 = new Dog();
	d1.name= "Chintu";
	d1.bark();

	Dog d2 = new Dog();
	d2.name = "CP";
	d2.wark();
}
}

class Dog{   //factory
	///variable for dog properties
	String name;
	int age;
	String color;
	
	//function for dog behavier
	void wark() {
	System.out.println(name + " is walking");	
	}
	void bark(){
	System.out.println( name +" is barking");
	}
}

class Cat {
	
}