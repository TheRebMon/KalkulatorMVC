package GraphicUserInterface;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{

	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton plusBtn;
	private JButton minusBtn;
	private JButton divideBtn;
	private JButton multiplicationBtn;
	private JButton calculateBtn;
	private JButton deleteBtn;
	
	
	public ButtonsPanel()
	{
		btn0 = new JButton("0");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		plusBtn = new JButton("+");
		minusBtn = new JButton("-");
		divideBtn = new JButton("/");
		multiplicationBtn = new JButton("*");
		calculateBtn = new JButton("=");
		deleteBtn = new JButton("C");
		
		
		
		setLayout(new GridLayout(4,4));
		//GridBagConstraints gc = new GridBagConstraints();
		add(deleteBtn); add(divideBtn); add(multiplicationBtn); add(minusBtn); add(btn1); add(btn2); add(btn3); add(plusBtn); add(btn4); add(btn5); add(btn6); add(calculateBtn); add(btn7); add(btn8); add(btn9); add(btn0);
		
	}
}
