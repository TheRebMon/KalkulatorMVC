package GraphicUserInterface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel implements ActionListener{

	private BtnListener btnListener;
	
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
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		multiplicationBtn.addActionListener(this);
		calculateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		
		setLayout(new GridLayout(4,4));
		//GridBagConstraints gc = new GridBagConstraints();
		add(deleteBtn); add(divideBtn); add(multiplicationBtn); add(minusBtn); add(btn1); add(btn2); add(btn3); add(plusBtn); add(btn4); add(btn5); add(btn6); add(calculateBtn); add(btn7); add(btn8); add(btn9); add(btn0);
		
	}
	
	public void setBtnListener(BtnListener btnListener)
	{
		this.btnListener = btnListener;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		JButton clicked = (JButton)event.getSource();  // èrÛd≥em eventu musi byÊ JButton dlatego rzutujemy
		
		if(btnListener!=null) {
			switch(clicked.getText())
			{
			case "0": btnListener.calculationEmitted("0"); break;
			case "1": btnListener.calculationEmitted("1"); break;
			case "2": btnListener.calculationEmitted("2"); break;
			case "3": btnListener.calculationEmitted("3"); break;
			case "4": btnListener.calculationEmitted("4"); break;
			case "5": btnListener.calculationEmitted("5"); break;
			case "6": btnListener.calculationEmitted("6"); break;
			case "7": btnListener.calculationEmitted("7"); break;
			case "8": btnListener.calculationEmitted("8"); break;
			case "9": btnListener.calculationEmitted("9"); break;
			case "/": btnListener.calculationEmitted("/"); break;
			case "*": btnListener.calculationEmitted("*"); break;
			case "-": btnListener.calculationEmitted("-"); break;
			case "+": btnListener.calculationEmitted("+"); break;
			case "C": btnListener.calculationDeleted(); break;
			case "=": btnListener.calculate(); break;
			}
		}
	}
	
	
}
