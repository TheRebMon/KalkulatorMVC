package GraphicUserInterface;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SettingsPanel extends JPanel implements ActionListener{
	
	private JCheckBox checkBox;
	private SolverListener listener;
	
	public SettingsPanel()
	{
		checkBox = new JCheckBox();
		checkBox.addActionListener(this);
		
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		add(checkBox);
		add(new JLabel("Equation Solver"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(listener != null)
		{
			listener.enabled(checkBox.isSelected()); 
		}
		
	}
	
	public void setSolverListener(SolverListener listener)
	{
		this.listener = listener;
	}

}
