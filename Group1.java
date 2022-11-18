
public class Group1 {

	private int counter = 0;
	private Person[] people = new Person[10];
	private String groupName1;
	
	public Group1 (String name) {
		groupName1 = name;
	}
	
	public void addPerson (String name, int id, int age) {
		people[counter] = new Person(name, id, age);
		counter++;	
	}
	
	public void PrintGroup1() {
		System.out.println("Group 1's name is: " + groupName1);
		//TO DO iterate through the array and use the toString method to output the data held within the Person array
		for(int i = 0; i < 5; i++) {
			System.out.println(people[i].toString());
		}
		
	}
	
	// TO DO create an insertion sort method that sorts the global array
	public void insertionSort() {
//		int in, out;
//		for(out = 1; out < 5; out++) {
//			Person temp = people[out];
//			in = out;
//
//			while(in > 0 && people[in-1].getAge() > temp.getAge()) {
//				people[in] = people[in-1];
//				--in;
//			}
//			people[in] = temp;
//		}
		for (int outerLoop = 1; outerLoop < 5; outerLoop++) {
			Person key = people[outerLoop]; // the data type is now Truck as that is
			// the type of Object to be sorted
			int index = outerLoop - 1;
			while ( (index > -1) && ( people[index].getAge() > key.getAge() ) ) {
				// notice above we are getting the cost of a Truck to compare
				people[index+1] = people[index];

				index--;
			}
			people[index+1] = key; // places the key Object in its correct location
		}




	}


	
}
