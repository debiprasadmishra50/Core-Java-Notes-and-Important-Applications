package Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AdapterClass_Example_WindowEvent extends Frame 
{
	AdapterClass_Example_WindowEvent()
	{
		setLayout(new FlowLayout());
		String c[] = {"RED","YELLOW","GREEN"};

		setVisible(true);
		setSize(300, 300);
		
		addWindowListener
		(
				new WindowAdapter()
				{
					public void windowClosing (WindowEvent we)
					{
						System.out.println("Now window is closing ....:( ");
						System.exit(0);
					}
				}
		);
		
		
	}
	public static void main(String[] args) 
	{
		new AdapterClass_Example_WindowEvent();
	}
}
