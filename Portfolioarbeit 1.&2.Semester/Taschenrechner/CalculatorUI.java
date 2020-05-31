import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorUI extends JFrame {
	public CalculatorUI() {
		super("Calculator");
		FlowLayout defaultFlowLayout = new FlowLayout(FlowLayout.LEFT);
		//keyboardPanel
		JPanel keyboardPanel = new JPanel(new GridLayout(0, 4));
		JButton clearBtn = new JButton("C");
		keyboardPanel.add(clearBtn);
		JButton deleteBtn = new JButton("DEL");
		keyboardPanel.add(deleteBtn);
		JButton positiveOrNegativeBtn = new JButton("+/-");
		keyboardPanel.add(positiveOrNegativeBtn);
		JButton resultBtn = new JButton("=");
		keyboardPanel.add(resultBtn);
		JButton sevenBtn = new JButton("7");
		keyboardPanel.add(sevenBtn);
		JButton eightBtn = new JButton("8");
		keyboardPanel.add(eightBtn);
		JButton nineBtn = new JButton("9");
		keyboardPanel.add(nineBtn);
		JButton divideBtn = new JButton("/");
		keyboardPanel.add(divideBtn);
		JButton fourBtn = new JButton("4");
		keyboardPanel.add(fourBtn);
		JButton fiveBtn = new JButton("5");
		keyboardPanel.add(fiveBtn);
		JButton sixBtn = new JButton("6");
		keyboardPanel.add(sixBtn);
		JButton multiplyBtn = new JButton("*");
		keyboardPanel.add(multiplyBtn);
		JButton oneBtn = new JButton("1");
		keyboardPanel.add(oneBtn);
		JButton twoBtn = new JButton("2");
		keyboardPanel.add(twoBtn);
		JButton threeBtn = new JButton("3");
		keyboardPanel.add(threeBtn);
		JButton subtractBtn = new JButton("-");
		keyboardPanel.add(subtractBtn);
		JPanel emptyPanel = new JPanel(defaultFlowLayout);
		keyboardPanel.add(emptyPanel);
		JButton zeroBtn = new JButton("0");
		keyboardPanel.add(zeroBtn);
		JButton dotBtn = new JButton(".");
		keyboardPanel.add(dotBtn);
		JButton addBtn = new JButton("+");
		keyboardPanel.add(addBtn);
		//keyboardPanel
		//showPanel
		JPanel calculateFieldPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JTextField calculateField = new JTextField("0");
		calculateField.setFont(new Font(null, Font.BOLD, 30));
		calculateFieldPanel.add(calculateField);
		//showPanel
		//overlayPanel
		JPanel overlayPanel = new JPanel(new GridLayout(2, 0));
		overlayPanel.add(calculateFieldPanel);
		overlayPanel.add(keyboardPanel);
		//overlayPanel
		//ContentPane
		add(overlayPanel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		//ContentPane
	}

	public static void main(String[] args) {
		new CalculatorUI();
	}
}
