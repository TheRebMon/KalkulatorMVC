package GraphicUserInterface;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1259435248721869109L;
	private MainPanel mainPanel;

	public MainFrame() {
		super("JAVA Kalkulator made in MVC structure");

		mainPanel = new MainPanel();
		
		// Border
		Border emptyBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border mainBorder = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createCompoundBorder(emptyBorder, mainBorder);
		mainPanel.setBorder(border);

		setLayout(new BorderLayout());
		add(mainPanel, BorderLayout.CENTER);
		

		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
