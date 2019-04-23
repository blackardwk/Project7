
import java.util.ArrayList;

public class Customer extends Pizza {
	private String lastName;
	private String firstName;
	private String phone;
	private String email;
	private String streetAddress;
	private int numPizzas;
	private ArrayList<Pizza> pizzas;

/*
* Default constructor for Customer
*/
	public Customer() {

		this.lastName = null;
		this.firstName = null;
		this.phone = null;
		this.email = null;
		this.streetAddress = null;
		this.numPizzas = 0;
		this.pizzas = new ArrayList<Pizza>();
	}

/*
 * Parameterized constructor for Customer
 */
	public Customer (String lastName, String firstName, String phone, String email) {
	
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;
		this.pizzas = new ArrayList<Pizza>();
	}	
/*
 * setter for lastName
 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
/*
 * getter for lastName
 */
	public String getLastName() {
		return lastName;
	}

/*
 * setter for firstName
 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
/*
 * getter for firstName
 */
	public String getFirstName() {
		return firstName;
	}

/*
 * setter for phone
 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
/*
 * getter for phone
 */
	public String getPhone() {
		return phone;
	}
	
/*
 * setter for email
 */
	public void setEmail(String email) {
		this.email = email;
	}
/*
 * getter for email
 */
	public String getEmail() {
		return email;
	}
	
/*
 * setter for streetAddress
 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
/*
 * getter for streetAddress
 */
	public String getStreetAddress() {
		return streetAddress;
	}

/*
* getter for numPizza
*/
	public int getNumPizzas() {
		return numPizzas;
	}
	
	public void orderPizza(Pizza pizza) {
		pizzas.add(pizza);
		numPizzas++;
	}
	
	public ArrayList<Pizza> getPizzas() {
		return pizzas;
	}
	
	public String toString() {
		if (numPizzas == 0) {
			return firstName + " " + lastName + "\n" + phone + "\n" + email + "\n" +  streetAddress + "\n";
		}
		else {
			return firstName + " " + lastName + "\n" + phone + "\n" + email + "\n" + streetAddress + "\n" + " Pizza List:" + "\n" + pizzas.toString();
		}
	}
}