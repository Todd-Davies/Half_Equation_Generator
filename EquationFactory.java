import java.util.ArrayList;
import java.util.Random;

/**
 * Creates random (but hopefully valid) half equations with spaces for
 * students to fill in the gaps.
 * @author Todd Davies <todd434@gmail.com>
 * @date 25.01.13
 */
class EquationFactory {

	ArrayList<Element> elements = new ArrayList<Element>();

	public EquationFactory(ArrayList<Element> elements) {
		this.elements = elements;
	}

	public Equation generateRandomEquation() {
		Equation output = new Equation();
		Random r = new Random();
		//Pick a random element to use in this question
		Element element = elements.get(r.nextInt(elements.size()));
		//Create an Entity representation of the element to go on the left side
		Entity entity = 
			new Entity(element.getName(),
			 		   element.getChargeDifferenceFromFullShell(),
					   1,
 					   0);
		output.addToLeftSide(entity);
		//Make a copy of the entity to go on the right side
		entity = entity.clone();
		if(r.nextInt(2)==0) { //1 in 3 chance of a hard one coming up where you
							  //must balance the coefficients too.
			entity.setCoefficient(r.nextInt(5));
		}
		//Create variables to keep easy track of the state of the equation
		int oldQuantity = entity.getQuantity();
		int newQuantity = oldQuantity;
		int oldCharge = entity.getCharge();
		int newCharge = oldCharge;
		//If the chosen element has a charge of +-1 then it can't form molecules
		//with itself (e.g. you can't have H_2 but you can have O_2) so make the
		//right side have a quantity of 1 and no charge
		if(Math.abs((entity.getCharge()))==1) {
			newQuantity = 1;
			entity.setCharge(0);
		} else {
			//Loop until we get a different quantity from the old quantity
			//(usually) one loop
			while(newQuantity==oldQuantity) {
				//Select a random quantity possible for this element
				newQuantity = 1 + r.nextInt(
						Math.abs(element.getChargeDifferenceFromFullShell()));
			}
			//Work out the new charge by pairing up the free electrons and
			//seeing how many are left over (or under)
			for(int i=0;i<entity.getQuantity();i++) {
				newCharge += element.getChargeDifferenceFromFullShell();
			}
			newCharge = ((entity.getCoefficient()>0) ? entity.getCoefficient()
				: 1) * (newCharge % 2);
			entity.setCharge(newCharge);
		}
		entity.setQuantity(newQuantity);
		output.addToRightSide(entity);
		//Add an electron to the side where the charge is highest (so it can be
		//balanced)
		if(oldCharge<=newCharge) {
			output.addToRightSide(generateElectron(0));
		} else {
			output.addToLeftSide(generateElectron(0));
		}
		return output;
	}

	/**
	 * Creates an entity representing an electron
	 */
	private static Entity generateElectron(int coefficient) {
		return new Entity("e", -1, 1, coefficient);
	}
}