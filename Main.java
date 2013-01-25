import java.util.Random;
import java.util.ArrayList;

public class Main {

	private static final String START = "\\documentclass[twocolumn]{article}" +
		"\n\\author{Todd Davies}\n\\title{Half equation practice}\n" +
		"\\begin{document}\n\\maketitle";
	private static final String END = "\\end{document}";
	private static final String BEGIN_ITEMIZE = "\\begin{enumerate}\n";
	private static final String END_ITEMIZE = "\\end{enumerate}\n";
	
	public static void main(String[] args) {
		//Parse the command line input
		final int numQuestions = Integer.parseInt(args[0]);

		//Initialise the array of elements.
		ArrayList<Element> elements = initialiseElements();

		//Print out the first part of the document
		System.out.println(START);
		System.out.println(BEGIN_ITEMIZE);

		//Setup our equation factory
		EquationFactory equationFactory = new EquationFactory(elements);

		//Create 'numQuestions' equations, each in it's own list item
		for(int i=0; i<numQuestions; i++) {
			StringBuilder questionBuilder = new StringBuilder();
			questionBuilder.append("    \\item \\[ ");
			Equation equation = equationFactory.generateRandomEquation();
			questionBuilder.append(equation.getLatexString());
			questionBuilder.append(" \\]\n");
			System.out.println(questionBuilder.toString());	
		}

		//Print out the last part of the document
		System.out.println(END_ITEMIZE);
		System.out.println(END);
	}


	/**
	 * Provides the data for the equation generation
	 * TODO: Load the data from an external file
	 */
	private static ArrayList<Element> initialiseElements() {
		ArrayList<Element> elements = new ArrayList<Element>();
		elements.add(new Element("H", 1));
		elements.add(new Element("Na", 1));
		elements.add(new Element("Ag", 1));
		elements.add(new Element("K", 1));
		elements.add(new Element("Li", 1));
		elements.add(new Element("Ba", 2));
		elements.add(new Element("Ca", 2));
		elements.add(new Element("Cu", 2));
		elements.add(new Element("Mg", 2));
		elements.add(new Element("Zn", 2));
		elements.add(new Element("Pb", 2));
		elements.add(new Element("Fe", 2));

		elements.add(new Element("Fe", 3));
		elements.add(new Element("Al", 3));

		elements.add(new Element("Cl", -1));
		elements.add(new Element("Br", -1));
		elements.add(new Element("F", -1));
		elements.add(new Element("I", -1));

		elements.add(new Element("O", -2));
		elements.add(new Element("S", -2));

		return elements;
	}
}