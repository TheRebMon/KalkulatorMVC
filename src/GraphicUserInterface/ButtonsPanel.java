package GraphicUserInterface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ButtonsPanel extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7761012838574372481L;

	private BtnListener btnListener;
	
	private CalcButton btn0;
	private CalcButton btn1;
	private CalcButton btn2;
	private CalcButton btn3;
	private CalcButton btn4;
	private CalcButton btn5;
	private CalcButton btn6;
	private CalcButton btn7;
	private CalcButton btn8;
	private CalcButton btn9;
	private CalcButton plusBtn;
	private CalcButton minusBtn;
	private CalcButton divideBtn;
	private CalcButton multiplicationBtn;
	private CalcButton calculateBtn;
	private CalcButton deleteBtn;
	private CalcButton commaBtn;
	
	
	public ButtonsPanel()
	{
		btn0 = new CalcButton("0"); 
		btn1 = new CalcButton("1");
		btn2 = new CalcButton("2");
		btn3 = new CalcButton("3");
		btn4 = new CalcButton("4");
		btn5 = new CalcButton("5");
		btn6 = new CalcButton("6");
		btn7 = new CalcButton("7");
		btn8 = new CalcButton("8");
		btn9 = new CalcButton("9");
		plusBtn = new CalcButton("+");
		minusBtn = new CalcButton("-");
		divideBtn = new CalcButton("/");
		multiplicationBtn = new CalcButton("*");
		calculateBtn = new CalcButton("=");
		deleteBtn = new CalcButton("C");
		commaBtn = new CalcButton(",");
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
		commaBtn.addActionListener(this);
		
		
		setLayout(new GridLayout(5,4));
		//GridBagConstraints gc = new GridBagConstraints();
		add(deleteBtn); add(divideBtn); add(multiplicationBtn); add(minusBtn); add(btn7); add(btn8); add(btn9); add(plusBtn); add(btn4); add(btn5); add(btn6); add(calculateBtn); add(btn1); 
		add(btn2); add(btn3); add(btn0); add(commaBtn);
		
	}
	
	public void setBtnListener(BtnListener btnListener)
	{
		this.btnListener = btnListener;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		CalcButton clicked = (CalcButton)event.getSource();  // èrÛd≥em eventu musi byÊ CalcButton dlatego rzutujemy
		
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
			case ",": btnListener.calculationEmitted(","); break;
			case "C": btnListener.calculationDeleted(); break;
			case "=": btnListener.calculate(); break;
			}
		}
	}
	
	
}
