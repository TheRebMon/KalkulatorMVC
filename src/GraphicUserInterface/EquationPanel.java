package GraphicUserInterface;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EquationPanel extends JPanel implements Editable {

	private static final long serialVersionUID = 6385082038019313843L;

	private JTextField aField;
	private JTextField bField;
	private JTextField cField;
	private JLabel aLabel;
	private JLabel bLabel;
	private JLabel cLabel;
	private JLabel equationLabel;
	private JLabel eq1Label;
	private JLabel eq2Label;
	private JPanel northPanel;
	private JPanel southPanel;
	private VariableEnum var;

	public EquationPanel() {

		northPanel = new JPanel();
		southPanel = new JPanel();
		var = VariableEnum.a;

		aField = new JTextField(5);
		bField = new JTextField(5);
		cField = new JTextField(5);
		aLabel = new JLabel("a = ");
		bLabel = new JLabel("b = ");
		cLabel = new JLabel("c = ");
		equationLabel = new JLabel("ax^2 + bx + c = 0");
		eq1Label = new JLabel();
		eq2Label = new JLabel();

		northPanel.add(equationLabel);
		southPanel.setLayout(new FlowLayout());
		southPanel.add(aLabel);
		southPanel.add(aField);
		southPanel.add(bLabel);
		southPanel.add(bField);
		southPanel.add(cLabel);
		southPanel.add(cField);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(northPanel);
		add(southPanel);
		add(eq1Label);
		add(eq2Label);

		aField.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				var = VariableEnum.a;
			}

			@Override
			public void focusLost(FocusEvent e) {

			}
		});
		bField.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				var = VariableEnum.b;
			}

			@Override
			public void focusLost(FocusEvent e) {

			}
		});
		cField.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				var = VariableEnum.c;
			}

			@Override
			public void focusLost(FocusEvent e) {

			}
		});

	}

	@Override
	public void addText(String character) {
		Utils.addText(character, getSelectedTextField());
	}

	@Override
	public void deleteText() {
		Utils.deleteText(getSelectedTextField());

	}

	public void changeVariable() {

		switch (var) {
		case a:
			var = VariableEnum.b;
			break;
		case b:
			var = VariableEnum.c;
			break;
		case c:
			var = VariableEnum.a;
			break;
		}
	}

	public JTextField getSelectedTextField() {
		switch (var) {
		case a:
			return aField;
		case b:
			return bField;
		case c:
			return cField;
		default:
			return null;
		}
	}

	public String getA() {
		return aField.getText();
	}

	public String getB() {
		return bField.getText();
	}

	public String getC() {
		return cField.getText();
	}

	public void setEquationSolve(String eq1, String eq2) {
		if (eq1 != null && eq2 != null) {
			eq1Label.setText("x1 = " + eq1);
			eq2Label.setText("x2 = " + eq2);
		}
		else {
			eq1Label.setText("Delta");
			eq2Label.setText("mniejsza od zera!");
		}
		
	}

}
