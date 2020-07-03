package Graphics;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class MouseListener_Example  extends Frame 
{
	MouseListener_Example()
	{
		setLayout(new FlowLayout());
		
		setVisible(true);
		setSize(300,300);
		
		
		addMouseListener
		(
			new MouseAdapter() 
			{
				public void mouseExited(MouseEvent e) 
				{
					setBackground(Color.green);
				}
				public void mouseEntered(MouseEvent e) 
				{
					setBackground(Color.red);
				}
			}
		);
		
		addMouseMotionListener
		(
			new MouseMotionAdapter() 
			{
				public void mouseDragged(MouseEvent e) 
				{
					Graphics g = getGraphics();
					g.setColor(Color.blue);
					setBounds(e.getX(), e.getY(), 10, 10);
				}
			}
		);
	}
	public static void main(String[] args) 
	{
		new MouseListener_Example();
	}
	
}