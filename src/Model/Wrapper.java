package Model;

import java.util.Vector;

public class Wrapper {
	
	Vector numbersArray;
	Vector operationArray;
	
	public Wrapper()
	{
		numbersArray= new Vector<Double>();
		operationArray = new Vector<Character>();
	}
	
	public void simpleCalculation(String text)
	{
		
		
		int i = 0;
		String number="";
		while(text.charAt(i)!='\0')
		{
			char character=text.charAt(i);
			if(character=='+' || character=='-' || character=='*' || character=='/')
			{
				double dNum = Double.parseDouble(number);
				
			}
		}
	}

}
