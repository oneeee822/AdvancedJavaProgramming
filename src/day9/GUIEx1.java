package day9;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIEx1 {

	public static void main(String[] args) {
		
		//Create the frame
		JFrame frame = new JFrame("My First GUI");
		frame.setSize(500, 400);	//in Pixels
		
		//Panel
		//프레임 안에 패널 
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		
		
		//Label 1
		//패널 안에 레이블들 
		JLabel label1 = new JLabel("This is my First GUI");
		label1.setBounds(50, 80, 200, 50);
		panel.add(label1);
		
		//Label 2
		//레이어로 되어있기 때문에 frame에 add하면 그냥 덮어씀 
		JLabel label2 = new JLabel("This is my second line of text");
		label2.setBounds(50, 120, 200, 50);
		panel.add(label2);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
