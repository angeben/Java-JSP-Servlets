import javax.swing.*;
import java.awt.*;
import actions.*;


public class Main {
	
	public static void main(final String[] args) {
	    JFrame f = new JFrame("Java Application");

	    JPanel content = new JPanel();
	    content.setLayout(new BorderLayout());

	    JPanel buttonsPanel = new JPanel();
	    // GridLayout(int rows, int cols, int hgap, int vgap)
	    buttonsPanel.setLayout(new GridLayout(2, 2, 25, 54));

	    JButton button1 = new JButton("Learn about us!");
	    JButton button2 = new JButton("Fibonacci Sequence");
	    //JButton button3 = new JButton("Button 3");
	    //JButton button4 = new JButton("Button 4");
	    
	    buttonsPanel.add(button1);
	    button1.addActionListener(new HelloWindow());
	    buttonsPanel.add(button2);
	    button2.addActionListener(new ShowFibonacci());
	    //buttonsPanel.add(button3);
	    //buttonsPanel.add(button4);

	    JLabel WelcomeText = new JLabel("Welcome to our Java Application");
	    
	    JRadioButton r1 = new JRadioButton("A) Radio 1");    
	    JRadioButton r2 = new JRadioButton("B) Radio 2");
	    ButtonGroup bg = new ButtonGroup();    
	    bg.add(r1);bg.add(r2); 
	    JPanel radioButtons = new JPanel();
	    radioButtons.add(r1);
	    radioButtons.add(r2);
	    
	    content.add(buttonsPanel, BorderLayout.CENTER);
	    content.add(radioButtons, BorderLayout.WEST);
	    content.add(WelcomeText, BorderLayout.SOUTH);

	    f.setContentPane(content);

	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setSize(600, 300);
	    f.setVisible(true);

	}
}
