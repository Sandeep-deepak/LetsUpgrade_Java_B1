// Create a class employee. Inside that class create three variable name,age,city. Also create a function
// to display the three variables. In the main function create two objects and call the function using it.
package user_Data;

public class Main {

	public static void main(String[] args) {		
		employee u1 = new employee();
		employee u2 = new employee();
		
		u1.name = "Sandeep";
		u1.age = 25;
		u1.city = "Mumbai";
		
		u2.name = "Kishore";
		u2.age = 24;
		u2.city = "Bangalore";
		
		u1.display();
		u2.display();
	}

}
