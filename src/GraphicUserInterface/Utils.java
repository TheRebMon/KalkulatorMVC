package GraphicUserInterface;

import java.util.ArrayList;

import javax.swing.JTextField;

public class Utils {

	public static void addText(String character, JTextField textField)
	{
		ArrayList<String> operation = new ArrayList<String>();
		operation.add("+");
		operation.add("*");
		operation.add("/");
		operation.add(",");
		operation.add("=");

		String input =textField.getText();

		// TODO if for if zagniezdzenie zle
		if (operation.contains(character)) {
			for (String sign : operation)
				if (input.endsWith(sign))
					return;

		}
		textField.setText(textField.getText() + character);
	}
	
	public static void deleteText(JTextField textField)
	{
		String text = textField.getText();
		if (text.length() > 0) {
			textField.setText(text.substring(0, text.length() - 1));
		}
	}
	
}
