package day9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIEx4 {

	public static void main(String[] args) {
		
		//Create the frame
		JFrame frame = new JFrame("My GUI");
		frame.setSize(500, 400);	//in Pixels
		
		//Panel
		//프레임 안에 패널 
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		

		//Label
		JLabel label1 = new JLabel("This is my GUI");
		label1.setBounds(20, 20, 200, 50);
		panel.add(label1);
	
		
		//Buttons
		JButton button1 = new JButton("Ok");
		button1.setBounds(20, 100, 100, 50);
		panel.add(button1);
		button1.addActionListener(	new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label1.setText("Ok is clicked");
				
			}	
		});
		
		JButton button2 = new JButton("Cancel");
		button2.setBounds(20, 160, 100, 50);
		panel.add(button2);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label1.setText("Cancel is clicked");
				
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}


}
