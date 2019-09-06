package Controller;

import Model.Model;

public class Controller {
	
	private Model model;
	
	public Controller()
	{
		model = new Model();
	}
	
	public void calculate(String calculation)
	{
		model.calculate(calculation);
	}
	
	public String getSolution()
	{
		return model.getSolution();
	}
	
}
