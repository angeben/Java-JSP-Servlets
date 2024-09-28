package actions;

import java.awt.event.*;
import javax.swing.*;

public class HelloWindow implements ActionListener {
	
	public void actionPerformed(ActionEvent event) {
		JFrame HelloWindow = new JFrame("Hello World!!");
		JLabel text = new JLabel("This is a simple app that we are creating for fun!");
		HelloWindow.setContentPane(text);
		HelloWindow.setSize(600, 200);
		HelloWindow.setVisible(true);
	}
}