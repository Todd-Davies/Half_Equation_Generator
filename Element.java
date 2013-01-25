/**
 * A class to store data on an element
 * @author Todd Davies <todd434@gmail.com>
 * @date 25.01.13
 */
class Element {
	
	private String name;
	private int chargeDifferenceFromFullShell;

	/**
	 * @param name The name used in chemical formulas e.g. 'Ca'
	 * @param chargeDifferenceFromFullShell The difference in charge between an
	 *                                      atom with no charge and one with the
	 *                                      a complete outer shell (energy 
	 *                                      level)
	 */
	public Element(String name, int chargeDifferenceFromFullShell) {
		this.name = name;
		this.chargeDifferenceFromFullShell = chargeDifferenceFromFullShell;
	}


	public String getName() {
		return name;
	}

	public int getChargeDifferenceFromFullShell() {
		return chargeDifferenceFromFullShell;
	}
}