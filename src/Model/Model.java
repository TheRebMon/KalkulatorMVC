package Model;

import java.util.Vector;

public class Model {

	Wrapper wrapper;
	Vector<Double> numbers;
	Vector<Character> operations;
	String solution;
	String eq1, eq2;

	public Model() {
		wrapper = new Wrapper();
	}

	public void calculate(String calculation) {
		wrapper.simpleCalculation(calculation);
		numbers = wrapper.getNumbersArray();
		operations = wrapper.getOperationArray();
		if (numbers.size() <= operations.size()) {
			solution = "Wrong Syntax!";
			return;
		}

		// TODO zlikwidowaæ zagnie¿d¿enie w 4 miejscach poni¿ej
		for (int i = 0; i < numbers.size() - 1; i++) {

			if ((char) operations.elementAt(i) == '*') {
				double x = (double) numbers.elementAt(i);
				double y = (double) numbers.elementAt(i + 1);
				double variable = x * y;
				numbers.set(i, variable);
				numbers.remove(i + 1);
				if (operations.size() <= 1)
					continue;
				else {
					operations.remove(i);
					i--;
				}

			}
		}

		for (int i = 0; i < numbers.size() - 1; i++) {

			if ((char) operations.elementAt(i) == '/') {
				double x = (double) numbers.elementAt(i);
				double y = (double) numbers.elementAt(i + 1);
				double variable = x / y;
				numbers.set(i, variable);
				numbers.remove(i + 1);
				if (operations.size() <= 1)
					continue;
				else {
					operations.remove(i);
					i--;
				}

			}
		}

		for (int i = 0; i < numbers.size() - 1; i++) {

			if ((char) operations.elementAt(i) == '-') {
				double x = (double) numbers.elementAt(i);
				double y = (double) numbers.elementAt(i + 1);
				double variable = x - y;
				numbers.set(i, variable);
				numbers.remove(i + 1);
				if (operations.size() <= 1)
					continue;
				else {
					operations.remove(i);
					i--;
				}

			}
		}

		for (int i = 0; i < numbers.size() - 1; i++) {

			if ((char) operations.elementAt(i) == '+') {
				double x = (double) numbers.elementAt(i);
				double y = (double) numbers.elementAt(i + 1);
				double variable = x + y;
				numbers.set(i, variable);
				numbers.remove(i + 1);
				if (operations.size() <= 1)
					continue;
				else {
					operations.remove(i);
					i--;
				}

			}
		}

		solution = numbers.get(0).toString().replace('.', ',');

	}

	public String getSolution() {
		clearWrapper();
		return solution;
	}

	public void solve(String a, String b, String c) {

		Double x1, x2;

		wrapper.simpleCalculation(a + " " + b + " " + c);
		numbers = wrapper.getNumbersArray();
		double delta = Math.sqrt(Math.pow(numbers.elementAt(1), 2) - 4 * numbers.elementAt(0) * numbers.elementAt(2));

		if (delta > 0) {

			x1 = (delta - numbers.elementAt(1)) / (2 * numbers.elementAt(0));
			x2 = (delta + numbers.elementAt(1)) / (2 * numbers.elementAt(0));
		} else if (delta == 0) {
			x1 = x2 = -numbers.elementAt(1) / (2 * numbers.elementAt(0));
		} else {
			x1 = null;
			x2 = null;
		}
		eq1 = x1.toString();
		eq2 = x2.toString();
		
		clearWrapper();

	}

	public String getEqSolution1() {
		return eq1;
	}

	public String getEqSolution2() {
		return eq2;
	}

	public void clearWrapper() {
		wrapper = new Wrapper();
	}
}
