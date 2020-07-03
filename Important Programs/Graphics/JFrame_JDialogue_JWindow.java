package Graphics;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JWindow;

public class JFrame_JDialogue_JWindow 
{
	public static void main(String[] args) 
	{
		JFrame f1 = new JFrame();
		f1.setSize(200,200);
		f1.setVisible(true);
		f1.setLocation(100, 200);
		
		JDialog d1 = new JDialog();
		d1.setSize(200,200);
		d1.setVisible(true);
		d1.setLocation(350, 200);
		
		JWindow w1 = new JWindow();
		w1.setSize(200,200);
		w1.setVisible(true);
		w1.setLocation(600, 200);
		
	}
}
