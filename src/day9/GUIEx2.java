package day9;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIEx2 {

	public static void main(String[] args) {

		//Create the frame
		JFrame frame = new JFrame("Border Layout");
		frame.setSize(500, 400);	//in Pixels
		
		BorderLayout b = new BorderLayout(5, 10);

		//Panel
		//프레임 안에 패널 
		JPanel wPanel = new JPanel();
		wPanel.setBackground(Color.red);
		
		JPanel nPanel = new JPanel();
		nPanel.setBackground(Color.yellow);
		
		JPanel ePanel = new JPanel();
		ePanel.setBackground(Color.black);
		
		JPanel sPanel = new JPanel();
		sPanel.setBackground(Color.blue);
		
		JPanel cPanel = new JPanel();
		cPanel.setBackground(Color.green);
		
		JLabel label1 = new JLabel("This s my GUI");
		label1.setBounds(10,10,100,40);
		cPanel.add(label1);
		
		frame.add(nPanel, BorderLayout.NORTH);
		frame.add(wPanel, b.WEST);
		frame.add(cPanel, b.CENTER);
		frame.add(ePanel, b.EAST);
		frame.add(sPanel, b.SOUTH);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
				
	}

}
