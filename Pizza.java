

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

	/*
	 * Default constructor for pizza
	 */
	public Pizza() {
		this.size = Size.PERSONAL;
		this.sauce = Sauce.MARINARA;
		this.crust = Crust.THIN;
		this.cheese = Cheese.REGULAR;
		this.meatTopping = MeatTopping.NULL;
		this.veggieTopping = VeggieTopping.NULL;
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

	public void setSize(Size size) {
		this.size = size;
	}

	public Size getSize() {
		return size;	
	}
	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Sauce getSauce() {
		return sauce;	
	}
	public void setCrust(Crust crust) {
		this.crust = crust;
	}

	public Crust getCrust() {
		return crust;	
	}
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Cheese getCheese() {
		return cheese;	
	}
	public void setMeatTopping(MeatTopping meatTopping) {
		this.meatTopping = meatTopping;
	}

	public MeatTopping getMeatTopping() {
		return meatTopping;	
	}
	public void setVeggieTopping(VeggieTopping veggieTopping) {
		this.veggieTopping = veggieTopping;
	}

	public VeggieTopping getVeggieTopping() {
		return veggieTopping;	
	}
	public String toString() {
		return "	" + size + "\n" + "	" + sauce + "\n" + "	" + crust + "\n" + "	" + cheese + "\n" + "	" + meatTopping + "\n" + "	" + veggieTopping + "\n" + "\n";
	}
}