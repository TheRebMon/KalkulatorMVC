package GraphicUserInterface;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Controller.Controller;

public class MainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8985166838789557040L;
	private ButtonsPanel btns;
	private CalculationField textField;
	private Controller controller;
	private boolean cleanFlag;

	public MainPanel() {
		btns = new ButtonsPanel();
		textField = new CalculationField();
		controller = new Controller();
		cleanFlag = false;

		btns.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField.setBorder(BorderFactory.createLineBorder(Color.RED));

		btns.setBtnListener(new BtnListener() {

			@Override
			public void calculationEmitted(String text) {

				if (cleanFlag) {
					textField.setText("");
					cleanFlag = false;
				}

				addText(text);

			}

			@Override
			public void calculationDeleted() {
				deleteText();
				if (cleanFlag) {
					textField.setText("");
					cleanFlag = false;
				}
			}

			@Override
			public void calculate() {

				if (cleanFlag) {
					controller.calculate(textField.getText() + "*2");
				} else {
					controller.calculate(textField.getText());

				}
				textField.setText("");
				addText(controller.getSolution());
				cleanFlag = true;

			}

		});

		showUI();

	}

	//TODO double operation sign input
	public void addText(String text) {
		ArrayList<String> operation = new ArrayList<String>();
		operation.add("+");
		operation.add("*");
		operation.add("/");
		operation.add("-");
		operation.add(",");
		operation.add("=");
		
		String input = textField.getText();

		for (String sign : operation)
			if (input.endsWith(sign) && text.equals(sign))
				return;
			else
				continue;

		textField.setText(textField.getText() + text);

	}

	public void deleteText() {

		String text = textField.getText();
		if (text.length() > 0) {
			textField.setText(text.substring(0, text.length() - 1));
		}

	}

	private void showUI() {
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
	public void setSolver(boolean b)
	{
		btns.setEquationSolver(b);
		textField.setText("");
	}
}
