package GraphicUserInterface;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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

	public MainPanel() {
		btns = new ButtonsPanel();
		textField = new CalculationField();
		controller = new Controller();
		
		btns.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		btns.setBtnListener(new BtnListener()
				{

					@Override
					public void calculationEmitted(String text) {
						
						addText(text);
						
					}

					@Override
					public void calculationDeleted() {
						deleteText();
					}

					@Override
					public void calculate() {
						controller.calculate(textField.getText());
						textField.setText("");
						addText(controller.getSolution());
						
					}
					
					
					
				});

		showUI();

	}
	
	public void addText(String text)
	{
		textField.setText(textField.getText()+text);
	}
	
	public void deleteText()
	{
		
		String text = textField.getText();
		if(text.length()>0)
		{
			textField.setText(text.substring(0, text.length()-1));
		}
		
	}
	
	private void showUI()
	{
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
