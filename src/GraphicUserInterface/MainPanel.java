package GraphicUserInterface;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel {

	private ButtonsPanel btns;
	private CalculationField textField;

	public MainPanel() {
		btns = new ButtonsPanel();
		textField = new CalculationField();
		
		btns.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField.setBorder(BorderFactory.createLineBorder(Color.RED));

		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.fill = GridBagConstraints.BOTH;
		//////////////////////// First Row////////////////////////////
		gc.gridy = 0;
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = 0.2;
		gc.anchor = GridBagConstraints.NORTH;

		add(textField, gc);

		/////////////////////// Second Row/////////////////////
		gc.gridy++;
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = 1;

		add(btns, gc);

	}
}
