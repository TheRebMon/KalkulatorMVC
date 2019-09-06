package Model;

import java.util.Vector;

public class Model {

	Wrapper wrapper;
	Vector numbers;
	Vector operations;
	String solution;
	
	public Model()
	{
		 wrapper = new Wrapper();
		 numbers = new Vector<Double>();
		 operations = new Vector<Character>();
	}
	
	public void calculate(String calculation)
	{
		wrapper.simpleCalculation(calculation);
		numbers =wrapper.getNumbersArray();
		operations = wrapper.getOperationArray();
		
		
		
		
	}
	
	public String getSolution()
	{
		return solution;
	}
}
