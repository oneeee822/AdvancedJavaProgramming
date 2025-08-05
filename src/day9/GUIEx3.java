package day9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIEx3 {


	public static void main(String[] args) {
		
		//Create the frame
		JFrame frame = new JFrame("My GUI with Menu");
		frame.setSize(500, 400);	//in Pixels
		
		//Panel
		//프레임 안에 패널 
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		
		//Menu Bar
		JMenuBar menuBar = new JMenuBar();
		
		//File Menu
		JMenu file = new JMenu("File");
		menuBar.add(file);
		
		JMenu edit = new JMenu("Edit");
		menuBar.add(edit);
		
		//Menu Items
		JMenuItem open = new JMenuItem("Open");
		file.add(open);
		
		JMenuItem New = new JMenuItem("New");
		file.add(New);
		
		JMenuItem save = new JMenuItem("Save");
		file.add(save);
		
		
		//Label 1
		//패널 안에 레이블들 
		JLabel label1 = new JLabel("This is my First GUI");
		label1.setBounds(20, 20, 200, 50);
		panel.add(label1);
		
		//Label 2
		//레이어로 되어있기 때문에 frame에 add하면 그냥 덮어씀 
		JLabel label2 = new JLabel("This is my second line of text");
		label2.setBounds(20, 60, 200, 50);
		panel.add(label2);
		
		//Buttons
		JButton button1 = new JButton("Click Me");
		button1.setBounds(20, 100, 100, 50);
		panel.add(button1);
		button1.addActionListener(	new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button pressed");
				
			}	
		});
		
		JButton button2 = new JButton("Cancel");
		button1.setBounds(20, 140, 120, 30);
		panel.add(button2);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}

			
		});
		
		//Text
		JTextField textField = new JTextField("Please enter your notes");
		textField.setBounds(20, 170, 200, 100);
		panel.add(textField);
		
		//add the Menu bar to the frame 
		frame.setJMenuBar(menuBar);
		
		//add the Menu bar to the frame
		frame.setJMenuBar(menuBar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
