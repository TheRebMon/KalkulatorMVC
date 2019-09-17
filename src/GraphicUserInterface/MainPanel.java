package GraphicUserInterface;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
	private JTabbedPane tabPane;
	private EquationPanel equationPanel;

	public MainPanel() {
		btns = new ButtonsPanel();
		textField = new CalculationField();
		controller = new Controller();
		tabPane = new JTabbedPane();
		equationPanel = new EquationPanel();

		tabPane.addTab("Simple Calculator", textField);
		tabPane.addTab("Equation Solver", equationPanel);
		tabPane.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				btns.setEquationSolver(tabPane.getSelectedIndex()==1 ? true : false);
			}
		});

		cleanFlag = false;

		btns.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField.setBorder(BorderFactory.createLineBorder(Color.RED));

		btns.setBtnListener(new BtnListener() {

			@Override
			public void calculationEmitted(String text) {

				if(tabPane.getSelectedIndex()==0 && cleanFlag) {
					JTextField component = (JTextField) tabPane.getSelectedComponent();
							component.setText("");
				textField.addText(text);
				}
				
				else {
					Editable component = (Editable)tabPane.getSelectedComponent();
					component.addText(text);
				}
				
				
				

			}

			@Override
			public void calculationDeleted() {
				
				if(tabPane.getSelectedIndex()==0 && cleanFlag)
				{
					textField.setText("");
					cleanFlag = false;
				}
				else
				{
					Editable component = (Editable)tabPane.getSelectedComponent();
					component.deleteText();
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
				textField.addText(controller.getSolution());
				cleanFlag = true;

			}

			@Override
			public void solveEquation() {
				controller.solve(equationPanel.getA(), equationPanel.getB(), equationPanel.getC());
				equationPanel.setEquationSolve(controller.getEqSolution1(), controller.getEqSolution2());
			}

		});

		showUI();

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

		add(tabPane, gc);

		/////////////////////// Second Row////////////////////////////
		gc.gridy++;
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = 1;

		add(btns, gc);
	}

	public void setSolver(boolean b) {
		btns.setEquationSolver(b);
		textField.setText("");
	}
	
	
}
