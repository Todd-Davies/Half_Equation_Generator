/**
 * A class to hold an entity in a half equation
 * Is able to produce a representation of itself in LaTeX
 * @author Todd Davies <todd434@gmail.com>
 * @date 24.01.13
 */
class Entity {
	
	static final String SPACECHAR = "\\textunderscore\\textunderscore";

	private String name;
	private int charge;
	private int quantity;
	private int coefficient;

	/**
	 * Creates a new entity with the given parameters	
	 * @param name The name of the entity (e.g. H)
	 * @param charge The charge on the entity (e.g. -2)
	 * @param quantity The subscipt number after the entity (e.g. 2 for a
     * 		molecule of oxygen)
	 * @param coefficient The number of this entity (e.g. 2 for 2H)
	 * 
	 */
	public Entity(String name, int charge, int quantity, int coefficient) {
		setName(name);
		setCharge(charge);
		setQuantity(quantity);
		setCoefficient(coefficient);
	}

	/**
	 * Returns a clone of itself
	 */
	public Entity clone() {
		return new Entity(name, charge, quantity, coefficient);
	}

	/**
	 * Generates a LaTeX formatted representation of the entity
	 */
	public String getLatexString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getLatexCoefficient()).append(" ");
		sb.append(name);
		sb.append("^{").append(getLatexCharge()).append("}");
		sb.append("_{").append(getLatexQuantity()).append("}");
		return sb.toString();
	}

	/**
	 * Returns a LaTeX formatted representation of the charge.
	 */
	public String getLatexCharge() {
		return (charge==0)  ? "" : 
			   (charge<-1)  ? Integer.toString(Math.abs(charge)) + "-" :
			   (charge==-1) ? "-" : 
			   (charge==1)  ? "+" : Integer.toString(charge) + "+";
	}

	/**
	 * Returns a LaTeX formatted representation of the quantity.
	 */
	public String getLatexQuantity() {
		return (quantity==1) ? "" : Integer.toString(quantity);
	}

	/**
	 * Returns a LaTeX formatted representation of the coefficient.
	 */
	public String getLatexCoefficient() {
		return (coefficient==0) ? SPACECHAR :
			   (coefficient==1) ? "" : Integer.toString(coefficient);
	}

	/**
	 * Sets the name of the Entity
	 * @param name The name of the Entity
	 * @throws IllegalArgumentException
	 */
	public void setName(String name) {
		if(name!=null) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Name parameter must not be" +
			"null");
		}
	}

	/**
	 * Sets the charge of the Entity
	 * @param charge The charge of the Entity
	 */
	public void setCharge(int charge) {
		this.charge = charge;
	}

	/**
	 * Returns the charge on the Entity
	 */
	public int getCharge() { return charge; }

	/**
	 * Sets the quantity of the Entity
	 * @param quantity The quantity of the Entity (must be >0 or null)
	 * @throws IllegalArgumentException
	 */
	public void setQuantity(int quantity) {
		if(quantity>0) {
			this.quantity = quantity;
		} else {
			throw new IllegalArgumentException("Quantity must be greater than" +
			" or equal to 1");
		}
	}

	/**
	 * Returns the quantity of the Entity
	 */
	public int getQuantity() { return quantity; }

	/**
	 * Sets the coefficient of the Entity
	 * @param coefficient The coefficient of the Entity
	 */
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	public int getCoefficient() { return coefficient; }

}