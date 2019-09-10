package GraphicUserInterface;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class CalcButton extends JButton {
	
	public CalcButton(String text)
	{
		super(text);
		setFont(new Font(Font.SERIF, 1, 20));
		setPreferredSize(new Dimension(2,2));
		
	}

}
