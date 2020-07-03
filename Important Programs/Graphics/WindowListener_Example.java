package Graphics;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class WindowListener_Example  extends JFrame implements WindowListener
{
	WindowListener_Example()
	{
		setLayout(new FlowLayout());
		
		setVisible(true);
		setSize(300,300);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addWindowListener(this);
		
	}
	public static void main(String[] args) 
	{
		new WindowListener_Example();
	}
	
	public void windowOpened(WindowEvent e) 
	{
	}
	public void windowClosing(WindowEvent e) 
	{
		System.out.println("Window is Closing");
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) 
	{
	}
	public void windowIconified(WindowEvent e) 
	{
	}
	public void windowDeiconified(WindowEvent e) 
	{
	}
	public void windowActivated(WindowEvent e) 
	{
	}
	public void windowDeactivated(WindowEvent e) 
	{
	}
	
}