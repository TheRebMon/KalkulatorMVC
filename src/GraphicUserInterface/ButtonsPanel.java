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

		solver=false;
		buttonLabels = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "/", "*", "=", "C",
				",", "x", "a^2", "solve" };
		// *****************************0****1*** 2*** 3*** 4*** 5*** 6*** 7*** 8***
		// 9*** 10** 11** 12** 13** 14 **15***16**17
		// ******16
		btn = new CalcButton[20];
		int i = 0;
		for (String label : buttonLabels) {
			btn[i] = new CalcButton(label);
			btn[i].addActionListener(this);
			i++;

		}
		

		showUI();

	}

	public void setBtnListener(BtnListener btnListener) {
		this.btnListener = btnListener;
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		CalcButton clicked = (CalcButton) event.getSource(); // èrÛd≥em eventu musi byÊ CalcButton dlatego rzutujemy

		if (btnListener != null) {
			switch (clicked.getText()) {
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
				if(solver)
				{
					btnListener.calculationEmitted("=");
				}
				else
				btnListener.calculate();
				break;
			case "x": 
				if(solver)
				btnListener.calculationEmitted("x");
				break;
			case "solve": btnListener.solveEquation();
			}
		}
	}
	
	public void setEquationSolver(boolean solver)
	{
		this.solver= solver;
	}

	private void showUI() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.fill = GridBagConstraints.BOTH;
		gc.gridy = 0;
		// First Row

		gc.weightx = 1;
		gc.weighty = 1;

		gc.gridx = 0;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[15], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[17], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[18], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[13], gc);

		// Next Row
		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;

		gc.gridx = 0;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[7], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[8], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[9], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[12], gc);

		// Next Row
		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;

		gc.gridx = 0;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[4], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[5], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[6], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[11], gc);

		// Next Row
		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;

		gc.gridx = 0;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[1], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[2], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[3], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[10], gc);

		// Next Row
		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;

		gc.gridx = 0;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[19], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[0], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[16], gc);

		gc.gridx++;
		gc.insets = new Insets(3, 3, 3, 3);
		add(btn[14], gc);
	}
}
