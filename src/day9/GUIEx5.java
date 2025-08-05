package day9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIEx5 {


	public static void main(String[] args) {
		
		//Create the frame
		JFrame frame = new JFrame("My GUI");
		frame.setSize(500, 400);	//in Pixels
		
		JFrame frame1 = new JFrame("Hello");
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
	
		JLabel label2 = new JLabel("User");
		label2.setBounds(40, 100, 100, 50);
		panel.add(label2);
		
		JLabel label3 = new JLabel("Password");
		label3.setBounds(40, 150, 100, 50);
		panel.add(label3);
		
		
		//Text
		JTextField id = new JTextField();
		id.setBounds(120, 100, 300, 50);
		panel.add(id);
		
		JTextField pw = new JTextField();
		pw.setBounds(120, 150, 300, 50);
		panel.add(pw);
		
		String id1 = "wonhee";
		String pw1 = "1234";
		
		//Buttons
		JButton button1 = new JButton("Login");
		button1.setBounds(20, 200, 100, 50);
		panel.add(button1);
		button1.addActionListener(	new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String varId = id.getText().toString();
				String varPw = pw.getText().toString();
				
				if(id1.equals(varId) && pw1.equals(varPw)) {
					label1.setText("Hello");
					panel.add(label1);
					frame1.setVisible(true);
					frame.dispose();
					frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				else {
					label1.setText("Wrong");
					panel.add(label1);
				}
				
				
			}	
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}



}
