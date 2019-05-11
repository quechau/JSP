class Animal {

	public String name;
	public int age;
	public String type;
	String[] types = {"Dog", "Cat", "Tiger", "Unknown" }; 
	
	public boolean isAnimal(String type) {
		boolean result = false;
		for(String i : types) {
			if(i.equalsIgnoreCase(type)) {
				result = true;
			}
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if(this.isAnimal(type)) {
			this.type = type;
		}
		else {
			this.type = types[3];
		}
	}

	@Override
	public String toString() {
		return "Animal Inheritance:\nname=" + name + ", age=" + age + ", type=" + type;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void honk() {
		System.out.println("???");
	}

	public Animal(String name, int age, String type) {
		this.age = age;
		this.name = name;
		if(this.isAnimal(type)) {
			this.type = type;
		}
		else {
			this.type = types[3];
		}
	}
}

class Dog extends Animal {

	public Dog(String name, int age, String type) {
		super(name, age, type);
	}

	@Override
	public void honk() {
		System.out.println("Gow Gow");

	}
}

class Tiger extends Animal {

	public Tiger(String name, int age, String type) {
		super(name, age, type);
	}

	@Override
	public void honk() {
		System.out.println("Wow Wow");
	}

}

public class TestInheritance {
	public static void main(String[] args) {
		Dog dog = new Dog("ConCho", 0, "Dog");
		dog.name = "Cho";
		dog.age = 5;
		System.out.println(dog.toString());
		dog.honk();

		Tiger tiger = new Tiger("Ho", 20, "Cat");
		System.out.println(tiger.toString());
		tiger.honk();

		tiger.setType("Tiger");
		System.out.println(tiger.toString());
		tiger.honk();
		
		tiger.setType("Pig");
		System.out.println(tiger.toString());
	}

}
