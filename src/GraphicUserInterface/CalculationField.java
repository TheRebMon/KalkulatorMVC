package GraphicUserInterface;

import java.awt.Font;

import javax.swing.JTextField;

public class CalculationField extends JTextField {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4647535589955279130L;

	public CalculationField()
	{
		setSize(200,400);
		setEditable(false);
		setFont(new Font(Font.MONOSPACED, 1, 20));
	}
}
