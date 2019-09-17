package GraphicUserInterface;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ButtonsPanel extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7761012838574372481L;

	private BtnListener btnListener;
	private CalcButton[] btn;
	private String[] buttonLabels;
	private boolean solver;

	public ButtonsPanel() {

		solver = false;
		buttonLabels = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "/", "*", "=", "C",
				",", "x", "a^2", "solve" };

		btn = new CalcButton[20];
		int i = 0;
		for (String label : buttonLabels) {
			btn[i] = new CalcButton(label);
			btn[i].addActionListener(this);
			i++;

		}
		btn[17].setEnabled(false);
		btn[18].setEnabled(false);
		btn[19].setEnabled(false);

		showUI();

	}

	public void setBtnListener(BtnListener btnListener) {
		this.btnListener = btnListener;
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		CalcButton clicked = (CalcButton) event.getSource(); // èrÛd≥em eventu musi byÊ CalcButton dlatego rzutujemy

		if (btnListener != null) {

			this.calculationEmitted(clicked.getText());

		}
	}

	public void setEquationSolver(boolean solver) {
		
		for(int i=10; i<15; i++)
		{
			btn[i].setEnabled(!solver);
		}
		
		
		btn[19].setEnabled(solver);
	}

	private void showUI() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.fill = GridBagConstraints.BOTH;
		gc.gridy = 0;

		int[] buttons = { 15, 17, 18, 13, 7, 8, 9, 12, 4, 5, 6, 11, 1, 2, 3, 10, 19, 0, 16, 14 };

		for (int i = 0; i < 5; i++) {
			gc.weightx = 1;
			gc.weighty = 1;

			gc.gridx = 0;
			gc.insets = new Insets(3, 3, 3, 3);
			add(btn[buttons[i * 4]], gc);

			gc.gridx++;
			gc.insets = new Insets(3, 3, 3, 3);
			add(btn[buttons[i * 4 + 1]], gc);

			gc.gridx++;
			gc.insets = new Insets(3, 3, 3, 3);
			add(btn[buttons[i * 4 + 2]], gc);

			gc.gridx++;
			gc.insets = new Insets(3, 3, 3, 3);
			add(btn[buttons[i * 4 + 3]], gc);

			gc.gridy++;
		}

	}

	private void calculationEmitted(String calc) {
		switch (calc) {
		case "0":
			btnListener.calculationEmitted("0");
			break;
		case "1":
			btnListener.calculationEmitted("1");
			break;
		case "2":
			btnListener.calculationEmitted("2");
			break;
		case "3":
			btnListener.calculationEmitted("3");
			break;
		case "4":
			btnListener.calculationEmitted("4");
			break;
		case "5":
			btnListener.calculationEmitted("5");
			break;
		case "6":
			btnListener.calculationEmitted("6");
			break;
		case "7":
			btnListener.calculationEmitted("7");
			break;
		case "8":
			btnListener.calculationEmitted("8");
			break;
		case "9":
			btnListener.calculationEmitted("9");
			break;
		case "/":
			btnListener.calculationEmitted("/");
			break;
		case "*":
			btnListener.calculationEmitted("*");
			break;
		case "-":
			btnListener.calculationEmitted("-");
			break;
		case "+":
			btnListener.calculationEmitted("+");
			break;
		case ",":
			btnListener.calculationEmitted(",");
			break;
		case "C":
			btnListener.calculationDeleted();
			break;
		case "=":
			if (solver) {
				btnListener.calculationEmitted("=");
			} else
				btnListener.calculate();
			break;
		case "x":
			if (solver)
				btnListener.calculationEmitted("x");
			break;
		case "solve":
			btnListener.solveEquation();
		}
	}
}
