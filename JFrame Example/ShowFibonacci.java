package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ShowFibonacci implements ActionListener{

	private int limit = 20;
	
	public ShowFibonacci(int n) {
		this.limit = n;
	}
	
	public ShowFibonacci() {
		this.limit = 10;
	}
	
	public void actionPerformed(ActionEvent event) {
		JFrame fibWindow = new JFrame("First Fibonacci numbers");
		int numbers[] = new int[limit];
		String num_string = "1, 1, ";
		numbers[0] = 1;
		numbers[1] = 1;
		for(int i = 2; i < limit; ++i) {
			numbers[i] = numbers[i-1] + numbers[i-2];
			if(i != limit - 1)
				num_string += (Integer.toString(numbers[i]) + ", ");
			else
				num_string += (Integer.toString(numbers[i]));			
		}
	
		fibWindow.setContentPane(new JLabel("The First Fibonacci numbers are: " + num_string));
		fibWindow.setSize(600, 200);
		fibWindow.setVisible(true);
	}
}
