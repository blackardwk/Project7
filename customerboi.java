import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class Customer extends Pizza {
	private String lastName;
	private String firstName;
	private String phone;
	private String email;
	private String streetAddress;
	private int numPizzas;
	private ArrayList<Pizza> pizza;

/*
* Default constructor for Customer
*/
	public Customer() {
		super();
		this.lastName = null;
		this.firstName = null;
		this.phone = null;
		this.email = null;
		this.streetAddress = null;
		this.numPizzas = 0;
		ArrayList<Pizza> pizza = new ArrayList<Pizza>();
	}

/*
 * Parameterized constructor for Customer
 */
	public Customer (String lastName, String firstName, String phone, String email) {
	
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;
		//this.streetAddress = streetAddress;
		//this.numPizzas = numPizzas;
		//this.ArrayList<Pizza> = ArrayList<Pizza>;
	}	
/*
 * setter for lastName
 */
	public void setLastName() {
		this.lastName = "";
	}
/*
 * getter for lastName
 */
	public String getLastName(String lastName) {
		this.lastName = lastName;
		return lastName;
	}

/*
 * setter for firstName
 */
	public void setFirstName() {
		this.lastName = "";
	}
/*
 * getter for firstName
 */
	public String getFirstName(String firstName) {
		this.firstName = firstName;
		return firstName;
	}

/*
 * setter for phone
 */
	public void setPhone() {
		this.phone = "";
	}
/*
 * getter for phone
 */
	public String getPhone(String phone) {
		this.phone = phone;
		return phone;
	}
	
/*
 * setter for email
 */
	public void setEmail() {
		this.email = "";
	}
/*
 * getter for email
 */
	public String getEmail(String email) {
		this.email = email;
		return email;
	}
}
