package GraphicUserInterface;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;

public class CalculationField extends JTextField implements Editable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4647535589955279130L;

	public CalculationField() {
		setSize(200, 400);
		setEditable(false);
		setFont(new Font(Font.MONOSPACED, 1, 20));
	}

	@Override
	public void addText(String character) {
		Utils.addText(character, this);
	}

	@Override
	public void deleteText() {
		Utils.deleteText(this);

	}
}
