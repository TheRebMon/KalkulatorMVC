package Controller;

import Model.Model;

public class Controller {

	private Model model;

	public Controller() {
		model = new Model();
	}

	public void calculate(String calculation) {
		model.calculate(calculation);
	}

	public String getSolution() {
		return model.getSolution();
	}

	public void solve(String a, String b, String c) {
		model.solve(a, b, c);
	}
	
	public String getEqSolution1()
	{
		return model.getEqSolution1();
	}
	
	public String getEqSolution2()
	{
		return model.getEqSolution2();
	}

}
