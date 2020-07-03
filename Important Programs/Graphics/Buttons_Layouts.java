package Graphics;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Buttons_Layouts  extends JFrame
{
	Buttons_Layouts()
	{
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		setLayout(new GridLayout(3,2));
		setLayout(null);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Button b1 = new Button("Button-1");
		Button b2 = new Button("Button-2");
		Button b3 = new Button("Button-3");
		Button b4 = new Button("Button-4");
		Button b5 = new Button("Button-5");
		
		add(b1 , BorderLayout.EAST); //to add the buttons into frames
		add(b2 , BorderLayout.WEST);
		add(b3 , BorderLayout.SOUTH);
		add(b4 , BorderLayout.NORTH);
		add(b5 , BorderLayout.CENTER);
		
		b1.setBounds(100, 50, 120, 30);
		b2.setBounds(100, 100, 120, 30);
		b3.setBounds(240, 100, 120, 30);
		
	}
	public static void main(String[] args) 
	{
		new Buttons_Layouts();
	}
}
