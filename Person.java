
public class Person {

	private String name;
	private int id;
	private int age;

	public Person() {
		name = "";
		id = 0;
		age = 0;
	}

	public Person(String name, int Id, int Age){
		this.name = name;
		id = Id;
		age = Age;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int Id) {
		id = Id;
	}

	public void setAge(int Age) {
		age = Age;
	}

	//TODO create a toString method
	public String toString() {
		String string = "Person's name: " + name + ", Person's id: " + id + ", Person's age: " + age;
		return string;
	}
	
}
