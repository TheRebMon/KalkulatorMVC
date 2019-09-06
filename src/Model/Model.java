package Model;

import java.util.Vector;

public class Model {

	Wrapper wrapper;
	Vector<Double> numbers;
	Vector<Character> operations;
	String solution;

	public Model() {
		wrapper = new Wrapper();
	}

	public void calculate(String calculation) {
		wrapper.simpleCalculation(calculation);
		numbers = wrapper.getNumbersArray();
		operations = wrapper.getOperationArray();

		for (int i = 0; i < numbers.size()-1; i++) {

			if((char)operations.elementAt(i) == '*')
			{
				double x = (double) numbers.elementAt(i);
				double y = (double) numbers.elementAt(i+1);
				double variable = x * y;
				numbers.set(i, variable);
				numbers.remove(i+1);
				if(operations.size()<=1) break;
				operations.remove(i);
				
			}
		}
		
		for (int i = 0; i < numbers.size()-1; i++) {

			if((char)operations.elementAt(i) == '/')
			{
				double x = (double) numbers.elementAt(i);
				double y = (double) numbers.elementAt(i+1);
				double variable = x / y;
				numbers.set(i, variable);
				numbers.remove(i+1);
				if(operations.size()<=1) break;
				operations.remove(i);
				
			}
		}
		
		for (int i = 0; i < numbers.size()-1; i++) {

			if((char)operations.elementAt(i) == '-')
			{
				double x = (double) numbers.elementAt(i);
				double y = (double) numbers.elementAt(i+1);
				double variable = x - y;
				numbers.set(i, variable);
				numbers.remove(i+1);
				if(operations.size()<=1) break;
				operations.remove(i);
				
			}
		}
		
		for (int i = 0; i < numbers.size()-1; i++) {

			if((char)operations.elementAt(i) == '+')
			{
				double x = (double) numbers.elementAt(i);
				double y = (double) numbers.elementAt(i+1);
				double variable = x + y;
				numbers.set(i, variable);
				numbers.remove(i+1);
				if(operations.size()<=1) break;
				operations.remove(i);
				
				
			}
		}
		
		solution = numbers.get(0).toString();
		System.out.println(solution);

	}

	public String getSolution() {
		return solution;
	}
}
