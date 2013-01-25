import java.util.ArrayList;

/**
 * A class to handle equations and print them in LaTeX
 * @author Todd Davies <todd434@gmail.com>
 * @date 24.01.12
 */
class Equation {
	
	private ArrayList<Entity> leftSide;
	private ArrayList<Entity> rightSide;

	public Equation() {
		leftSide = new ArrayList<Entity>();
		rightSide = new ArrayList<Entity>();
	}

	/**
	 * Returns a LaTeX formatted representation of the equation
	 */
	public String getLatexString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<leftSide.size(); i++) {
			sb.append(leftSide.get(i).getLatexString());
			if(i<(leftSide.size()-1)) {
				sb.append(" + ");
			}
		}
		sb.append(" \\rightarrow ");
		for(int i=0; i<rightSide.size(); i++) {
			sb.append(rightSide.get(i).getLatexString());
			if(i<(rightSide.size()-1)) {
				sb.append(" + ");
			}
		}
		return sb.toString();
	}

	/**
	 * Adds an entity to the left side of the equation
	 * @return if the operation was succesful
	 */
	public boolean addToLeftSide(Entity entity) {
		return leftSide.add(entity);
	}

	/**
	 * Adds an entity to the right side of the equation
	 * @return if the operation was succesful
	 */
	public boolean addToRightSide(Entity entity) {
		return rightSide.add(entity);
	}
}