package Graphics;
import java.awt.event.*;
import javax.swing.*;

public class ActionListener_Example  extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1;
	JButton b2;
	JButton b3;
	ActionListener_Example()
	{
		setLayout(null);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1 = new JButton("Button-1");
		b2 = new JButton("Button-2");
		b3 = new JButton("Button-3");
		l1 = new JLabel();
	
		add(b1);
		add(b2);
		add(b3);
		add(l1);
		
		b1.setBounds(100, 50, 120, 30);
		b2.setBounds(100, 100, 120, 30);
		b3.setBounds(240, 100, 120, 30);
		
		l1.setBounds(100, 160, 120, 30);
		
		b1.addActionListener(this);
		b2.addActionListener(new Demo());
		b3.addActionListener
		(
				new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						System.out.println("Button-3 : Anonymous Class");
						l1.setText("Button-3 : Anonymous Class");
					}
				}
		);
	}
	public static void main(String[] args) 
	{
		new ActionListener_Example();
	}
	public void actionPerformed(ActionEvent e) 
	{	
		System.out.println("Button-1 : Same Class");
		l1.setText("Button-1 : Same Class");
	}
}
class Demo implements ActionListener
{
	public void actionPerformed(ActionEvent e) 
	{
		ActionListener_Example t = new ActionListener_Example();
		System.out.println("Button-2 : Different class");
		t.l1.setText("Button-2 : Different Class");
		
	}
}