import java.util.ArrayList;

public class Group2 {

	private ArrayList<Person> people2 = new ArrayList<Person>();
	private String groupName2;
	
	public Group2 (String name) {
		groupName2 = name;
	}
	
	public void addPerson (String name, int id, int age) {
		people2.add(new Person(name, id, age));	
	}
	
	public void PrintGroup2() {
		System.out.println("Group 2's name is: " + groupName2);
		//TO DO iterate through the arraylist and use the toString method to output the data held within the arraylist
		for(int i = 0; i < people2.size(); i++) {
			System.out.println(people2.get(i).toString());
		}
	}
	
	// TO DO create an selection sort method that sorts the global arraylist
	public void selectionSort() {
		int indexOfSmallestAge;
		Person youngestPerson;
		for(int outerControl = 0; outerControl < people2.size() - 1; outerControl++) {

			indexOfSmallestAge = outerControl; // start with the first index
			youngestPerson = people2.get(outerControl); // get a Truck Object

			for(int innerControl = outerControl + 1; innerControl < people2.size(); innerControl++) {
				// test the current smallest value against the next value in the array

				// comparing the cost of two Truck Objects
				if( people2.get(innerControl).getAge() < youngestPerson.getAge()) {
					youngestPerson = people2.get(innerControl); // keep up with the Truck with the lowest cost
					indexOfSmallestAge = innerControl; // and the index
				} // ends the if
			} // ends the inner for loop

			// swap the Objects in the array
			people2.set(indexOfSmallestAge, people2.get(outerControl)); // move the larger
			// costing Truck further down the array
			people2.set(outerControl, youngestPerson); // place the smallest costing
			// Truck Object toward the front of the array

		} // ends the outer for loop
	}

}
