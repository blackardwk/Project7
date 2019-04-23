import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Size: PERSONAL, MEDIUM, LARGE,
EXTRA_LARGE
Sauce: MARINARA, GARLIC_PARMESAN,
ALFREDO
Crust: THIN, HAND_TOSSED, PAN
Cheese: REGULAR, EXTRA
Meat Topping: NULL, PEPPERONI, HAM,
ITALIAN_SAUSAGE, SALAMI, BEEF, BACON
Veggie Topping: NULL, GREEN_PEPPERS,
ONIONS, MUSHROOMS, PINEAPPLE, SPINACH
 */

public class Pizza {
	private Size size;
	private Sauce sauce;
	private Crust crust;
	private Cheese cheese;
	private MeatTopping meatTopping;
	private VeggieTopping veggieTopping;
	
	public enum Size {
		PERSONAL, MEDIUM, LARGE, EXTRA_LARGE
	}


	public enum Sauce {
		MARINARA, GARLIC_PARMESAN, ALFREDO
	}


	public enum Crust {
		THIN, HAND_TOSSED, PAN
	}


	public enum Cheese {
		REGULAR, EXTRA
	}


	public enum MeatTopping {
		NULL, PEPPERONI, HAM, ITALIAN_SAUSAGE, SALAMI, BEEF, BACON
	}


	public enum VeggieTopping {
		NULL, GREEN_PEPPERS, ONIONS, MUSHROOMS, PINEAPPLE, SPINACH
	}

	/*
	 * Default constructor for pizza
	 */
	public Pizza() {
		Size size = Size.PERSONAL;
		Sauce sauce = Sauce.MARINARA;
		Crust crust = Crust.THIN;
		Cheese cheese = Cheese.REGULAR;
		MeatTopping meatTopping = MeatTopping.NULL;
		VeggieTopping veggieTopping = VeggieTopping.NULL;
	} 

/*
 * Parameterized constructor for pizza
 */
	public Pizza(Size size, Sauce sauce, Crust crust, Cheese cheese, MeatTopping meatTopping, VeggieTopping veggieTopping) {
		this.size = size;
		this.sauce = sauce;
		this.crust = crust;
		this.cheese = cheese;
		this.meatTopping = meatTopping;
		this.veggieTopping = veggieTopping;
	}

	public void setSize() {
		this.size = size;
	}

	public Size getSize(Size size) {
		return size;	
	}
	
	public String toString() {
		return "Pizza List: " + "\n" + size + "\n" + sauce + "\n" + crust + "\n" + cheese + "\n" + meatTopping + "\n" + veggieTopping;
	}
}
