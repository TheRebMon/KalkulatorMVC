package Model;

import java.util.List;

public class Model {

	Wrapper wrapper;
	List<Double> numbers;
	List<Character> operations;
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

			if ((char) operations.get(i) == '*') {
				double x = (double) numbers.get(i);
				double y = (double) numbers.get(i + 1);
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

			if ((char) operations.get(i) == '/') {
				double x = (double) numbers.get(i);
				double y = (double) numbers.get(i + 1);
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

			if ((char) operations.get(i) == '-') {
				double x = (double) numbers.get(i);
				double y = (double) numbers.get(i + 1);
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

			if ((char) operations.get(i) == '+') {
				double x = (double) numbers.get(i);
				double y = (double) numbers.get(i + 1);
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
		double delta = Math.sqrt(Math.pow(numbers.get(1), 2) - 4 * numbers.get(0) * numbers.get(2));

		if (delta > 0) {

			x1 = (delta - numbers.get(1)) / (2 * numbers.get(0));
			x2 = (delta + numbers.get(1)) / (2 * numbers.get(0));
		} else if (delta == 0) {
			x1 = x2 = -numbers.get(1) / (2 * numbers.get(0));
		} else {
			x1 = null;
			x2 = null;
		}
		try{
			eq1 = x1.toString();
			eq2 = x2.toString();
		}catch(NullPointerException e){
			eq1 = eq2 = null;
		}
		
		
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
