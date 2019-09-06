package Model;

import java.util.Vector;

public class Wrapper {

	private Vector<Double> numbersArray;
	private Vector<Character> operationArray;

	public Wrapper() {
		numbersArray = new Vector<Double>(0);
		operationArray = new Vector<Character>(0);
	}

	public void simpleCalculation(String text) {
		boolean operation = true;

		
		String number = "";
		for(int i=0; i<text.length(); i++) {
			char character = text.charAt(i);

			if ((character == '+' || character == '-' || character == '*' || character == '/') && !operation) {
				double dNum = Double.parseDouble(number);
				numbersArray.add(dNum);
				number="";
				operation=true;

				switch (character) {
				case '+':
					operationArray.add('+');
					break;
				case '-':
					operationArray.add('-');
					break;
				case '*':
					operationArray.add('*');
					break;
				case '/':
					operationArray.add('/');
					break;
				}

			} else {
				System.out.println(number);
				operation=false;
				switch (character) {
				case '0':
					number = number+"0";
					break;
				case '1':
					number = number+"1";
					break;
				case '2':
					number = number+"2";
					break;
				case '3':
					number = number+"3";
					break;
				case '4':
					number = number+"4";
					break;
				case '5':
					number = number+"5";
					break;
				case '6':
					number = number+"6";
					break;
				case '7':
					number = number+"7";
					break;
				case '8':
					number = number+"8";
					break;
				case '9':
					number = number+"9";
					break;
				default:
					System.err.println("Z³y zapis!");

				}
				System.out.println();
				

			}
			

		}
		
		double dNum = Double.parseDouble(number);
		numbersArray.add(dNum);
	}

	public Vector<Double> getNumbersArray() {
		return numbersArray;
	}

	public Vector<Character> getOperationArray() {
		return operationArray;
	}

}
