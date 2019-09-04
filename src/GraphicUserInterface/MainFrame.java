package GraphicUserInterface;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainFrame extends JFrame {
	
	private MainPanel mainPanel = new MainPanel();
	
	public MainFrame()
	{
		super("JAVA Kalkulator made in MVC structure");
		
		
		
		
		//Border
		Border emptyBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		Border mainBorder = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createCompoundBorder(emptyBorder, mainBorder);
		mainPanel.setBorder(border);
		add(mainPanel);
		
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
