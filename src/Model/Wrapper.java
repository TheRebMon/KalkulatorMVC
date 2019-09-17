package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Wrapper {

	private List<Double> numbersArray;
	private List<Character> operationArray;

	public Wrapper() {
		numbersArray = new ArrayList<Double>(10);
		operationArray = new ArrayList<Character>(10);
	}

	public void simpleCalculation(String text) {
		boolean operation = true;

		String number = "";
		boolean isPositive = true;

		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);

			if ((character == '+' || character == '-' || character == '*' || character == '/') && !operation || character==' ') {

				if (number != "") {
					double dNum = Double.parseDouble(number);
					numbersArray.add(isPositive ? dNum : dNum * -1);
					number = "";
					isPositive = true;
					operation = true;
				}

				switch (character) {
				case '+':
					operationArray.add('+');
					break;
				case '-':
					operationArray.add('+');
					if (isPositive) {
						isPositive = false;
					} else
						isPositive = true;
					break;
				case '*':
					operationArray.add('*');
					break;
				case '/':
					operationArray.add('/');
					break;
				case ' ':
					continue;
				}

			} else if (character == '-' && operation) {
				if (isPositive) {
					isPositive = false;
				} else
					isPositive = true;
			}

			else {
				System.out.println(number);
				operation = false;
				switch (character) {
				case '0':
					number = number + "0";
					break;
				case '1':
					number = number + "1";
					break;
				case '2':
					number = number + "2";
					break;
				case '3':
					number = number + "3";
					break;
				case '4':
					number = number + "4";
					break;
				case '5':
					number = number + "5";
					break;
				case '6':
					number = number + "6";
					break;
				case '7':
					number = number + "7";
					break;
				case '8':
					number = number + "8";
					break;
				case '9':
					number = number + "9";
					break;
				case ',':
					number = number + ".";
				default:
					System.err.println("Z³y zapis!");

				}
				System.out.println();

			}

		}

		double dNum = Double.parseDouble(number);
		numbersArray.add(isPositive ? dNum : dNum * -1);
	}

	public List<Double> getNumbersArray() {
		return numbersArray;
	}

	public List<Character> getOperationArray() {
		return operationArray;
	}

	/*
	 * public void getEquation(String equation) {
	 * 
	 * 
	 * for(int i = 0; i<equation.length(); i++) { char character =
	 * equation.charAt(i); String number=""; Vector<Double> freeNum = new
	 * Vector<Double>(); Vector<Double> x = new Vector<Double>(); Vector<Double>
	 * squareX = new Vector<Double>();
	 * 
	 * 
	 * } }
	 */

}
