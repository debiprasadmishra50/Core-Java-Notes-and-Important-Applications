package Graphics;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad_Ex_class  extends JFrame implements ActionListener
{
	JTextArea ta1; //Create a textarea
	JScrollPane p1; //To add a scrollbar into Textarea
	Notepad_Ex_class()
	{
		ta1 = new JTextArea();
		add(ta1);
		
		p1 = new JScrollPane(ta1);
		add(p1);
		
		JMenuBar mbr = new JMenuBar();
		add(mbr,BorderLayout.NORTH);
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		mbr.add(file);
		mbr.add(edit);
		
		JMenuItem copy = new JMenuItem("COPY");
		JMenuItem paste = new JMenuItem("PASTE");
		JMenuItem selectall = new JMenuItem("SELECT ALL");
		JMenuItem cut = new JMenuItem("CUT");
		JMenuItem today = new JMenuItem("TODAY");
		
		edit.add(copy);
		edit.add(paste);
		edit.add(selectall);
		edit.add(cut);
		edit.add(today);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the Frame
		setVisible(true);
		setSize(300,300);
		
		//Register Event with UI components
		cut.addActionListener(this);
		copy.addActionListener(this);
		selectall.addActionListener(this);
		paste.addActionListener(this);
		today.addActionListener(this);
		
	}	
	public static void main(String[] args) 
	{
		new Notepad_Ex_class();
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String text = e.getActionCommand();//return the text of the button
		if(text.equals("COPY"))
			ta1.copy();
		if(text.equals("CUT"))
			ta1.cut();
		if(text.equals("PASTE"))
			ta1.paste();
		if(text.equals("SELECT ALL"))
			ta1.selectAll();
		if(text.equals("TODAY"))
			ta1.setText(new Date().toString());
		
	}
	
}