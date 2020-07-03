package Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class ItemListener_Example  extends JFrame implements ItemListener
{
	JComboBox cb1;
	ItemListener_Example()
	{
		setLayout(new FlowLayout());
		String c[] = {"RED","YELLOW","ORANGE"};
		cb1 = new JComboBox(c);
		add(cb1);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cb1.addItemListener(this);
		
	}
	public static void main(String[] args) 
	{
		new ItemListener_Example();
	}
	
	public void itemStateChanged(ItemEvent e) 
	{
		int index = cb1.getSelectedIndex();
		if(index==0)
		{
			Container c = getContentPane();
			c.setBackground(Color.red);
		}
		
		if(index==1)
			getContentPane().setBackground(Color.yellow);
		if(index==2)
			getContentPane().setBackground(Color.orange);
	}
	
	
}