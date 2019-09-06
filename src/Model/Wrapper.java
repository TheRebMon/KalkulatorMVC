package Model;

import java.util.Vector;

public class Wrapper {
	
	private Vector numbersArray;
	private Vector operationArray;
	
	public Wrapper()
	{
		numbersArray= new Vector();
		operationArray = new Vector();
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
				numbersArray.add(dNum);
				
				switch(character)
				{
				case '+': operationArray.add(new String("+")); break;
				case '-': operationArray.add(new String("-")); break;
				case '*': operationArray.add(new String("*")); break;
				case '/': operationArray.add(new String("/")); break;
				}
		
			}
			else
			{
				switch(character)
				{
				case '0': number.concat(new String("0")); break;
				case '1': number.concat(new String("1")); break;
				case '2': number.concat(new String("2")); break;
				case '3': number.concat(new String("3")); break;
				case '4': number.concat(new String("4")); break;
				case '5': number.concat(new String("5")); break;
				case '6': number.concat(new String("6")); break;
				case '7': number.concat(new String("7")); break;
				case '8': number.concat(new String("8")); break;
				case '9': number.concat(new String("9")); break;
				
				}
				
			}
			
		}
	}



	public Vector getNumbersArray()
	{
		return numbersArray;
	}
	
	public Vector getOperationArray()
	{
		return operationArray;
	}

}
