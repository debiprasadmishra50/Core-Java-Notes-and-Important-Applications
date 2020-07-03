package Graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class Notepad extends JFrame implements ActionListener,UndoableEditListener
{
	JMenu file,edit,format,view,help;
	JMenuItem New,open,save,saveas,exit;
	JMenuItem undo,redo,cut,copy,paste,delete,selectall,timedate;
	JMenuItem wordwrap,font;
	JMenuItem statusBar;
	JMenuItem viewHelp,about;
	JTextArea ta;
	JScrollPane sp;
	JMenuBar mbr;
	JLabel statusbar;
	UndoManager edit_undo = new UndoManager();
	
	String content,path="";
	Notepad()
	{
		ta = new JTextArea(); //textArea Created
		ta.setBackground(new Color(241, 249, 237));
		add(ta);
		sp = new JScrollPane(ta); //Scroll-bar Created
		add(sp);
		mbr = new JMenuBar();	//Menu-bar Created
		add(mbr,BorderLayout.NORTH); //Menu-bar added
		statusbar = new JLabel("||       Ln 1, Col 1  ",JLabel.RIGHT);
		add(statusbar,BorderLayout.SOUTH); //Line and Column status-bar in south-east corner added
		
		ta.addCaretListener
		(
			new CaretListener()
			{
				public void caretUpdate(CaretEvent e)
				{
					int lineNumber=0, column=0, pos=0;
					try
					{
						pos=ta.getCaretPosition();
						lineNumber=ta.getLineOfOffset(pos);
						column=pos-ta.getLineStartOffset(lineNumber);
					}
					catch(Exception ex){}
					
					if(ta.getText().length()==0)
					{
						lineNumber=0; column=0;
					}
					statusbar.setText("||       Ln "+(lineNumber+1)+", Col "+(column+1));
				}
			}
		);
		
		menuCreate();
		menuItemCreate();
		menuAdd();
		menuItemAdd();
		
		//Register the File Components
		New.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);
		exit.addActionListener(this);
		
		//Register the Edit Components
		undo.addActionListener(this);
		redo.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		delete.addActionListener(this);
		selectall.addActionListener(this);
		timedate.addActionListener(this);
		
		ta.getDocument().addUndoableEditListener
		(
	        new UndoableEditListener() 
	        {
		        public void undoableEditHappened(UndoableEditEvent e) 
		        {
		        	edit_undo.addEdit(e.getEdit());
		        }
	        }
        );
		
		//Register the Format Component
		wordwrap.addActionListener(this);
		font.addActionListener(this);
		
		//Register the View component
		statusBar.addActionListener(this);
		
		//Register the Help component
		viewHelp.addActionListener(this);
		about.addActionListener(this);
		
		//Frame Design part
		frameDesign();
		
	}
	
	public void frameDesign()
	{
		setSize(400, 400);
		setTitle("Notepad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void menuItemAdd() 
	{
		//add menu items to menu
		file.add(New);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.add(new JSeparator());
		file.add(exit);
				
		//add menu-items for Edit menu
		edit.add(undo);
		edit.add(redo);
		edit.add(new JSeparator());
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delete);
		edit.add(new JSeparator());
		edit.add(selectall);
		edit.add(timedate);
				
		//add menu-items for Format menu
		format.add(wordwrap);
		format.add(font);
		
		//add menu-items for View menu
		view.add(statusBar);
		
		//add menu-items for Help menu
		help.add(viewHelp);
		help.add(new JSeparator());
		help.add(about);
	}

	private void menuAdd()
	{
		//add menus to menu bar
		mbr.add(file);
		mbr.add(edit);
		mbr.add(format);
		mbr.add(view);
		mbr.add(help);
	}
	
	private void menuItemCreate()
	{
		//Create menu-items for File menu
		New = new JMenuItem("New");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		saveas = new JMenuItem("Save As");
		exit = new JMenuItem("Exit");
		
		//Create menu-items for Edit menu
		undo = new JMenuItem("Undo");
		redo = new JMenuItem("Redo");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		delete = new JMenuItem("Delete");
		selectall = new JMenuItem("Select All");
		timedate = new JMenuItem("Time/Date");

		//Create menu-items for Format menu
		wordwrap = new JMenuItem("Word Wrap");
		font = new JMenuItem("Font...");
				
		//Create menu-items for View menu
		statusBar = new JMenuItem("Status Bar");
				
		//Create menu-items for Help menu
		viewHelp = new JMenuItem("View Help");
		about = new JMenuItem("About Notepad");
	}
	
	private void menuCreate()
	{
		file = new JMenu("File");
		edit = new JMenu("Edit");
		format = new JMenu("Format");
		view = new JMenu("View");
		help = new JMenu("Help");
	}

	public static void main(String[] args) 
	{
		new Notepad();
	}
	
	//Event Handling
	public void actionPerformed(ActionEvent e) 
	{
		String text = e.getActionCommand(); //return the text of the button
		
		//For File menu
		if(text.equals("New"))
			file_New();
		if(text.equals("Exit"))
			System.exit(0);
		
		//For Edit Menu
		if(text.equals("Cut"))
			ta.cut();
		if(text.equals("Copy"))
			ta.copy();
		if(text.equals("Paste"))
			ta.paste();
		if(text.equals("Delete"))
			edit_Delete();
		if(text.equals("Select All"))
			ta.selectAll();
		if(text.equals("Time/Date"))
			edit_TimeDate();
		if (text.equals("Undo")) 
			edit_Undo();
		if (text.equals("Redo")) 
			edit_Redo();
		
		//For format menu
		if (text.equals("Word Wrap"))
			format_wordwrap();
	}
	private void format_wordwrap() 
	{
		if(ta.getLineWrap()==false)
			ta.setLineWrap(true);
		else
			ta.setLineWrap(false);
	}

	private void edit_Redo() 
	{
		try
		{ 
			edit_undo.redo();
		}
		catch (CannotRedoException cre) 
		{
			cre.printStackTrace();
		}
	}

	private void edit_Undo() 
	{
		try
		{ 
			edit_undo.undo();
		}
		catch (CannotUndoException cue) 
		{
			cue.printStackTrace();
		}
	}

	private void edit_TimeDate() 
	{
		try
		{
			int start = ta.getSelectionStart();
			int end = ta.getSelectionEnd();
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy h:m a");
			String now = sdf.format(cal.getTime());
			String temp1 = ta.getText().substring(0, start);
			String temp2 = ta.getText().substring(end);
			ta.setText(temp1+" "+now+" "+temp2);
			ta.select(start+1, start+1+now.length());;
		}
		catch (NullPointerException npe) 
		{
			npe.printStackTrace();
		}
		catch (IllegalArgumentException iae) 
		{
			iae.printStackTrace();
		}
	}

	private void edit_Delete() 
	{
		String temp = ta.getText();
		ta.setText(temp.substring(0, ta.getSelectionStart())+temp.substring(ta.getSelectionEnd()));
	}

	private void file_New() 
	{
		if (ta.getText().equals("") || ta.getText().equals(content)) 
		{
			new Notepad().setTitle("untitled-Notepad");
		}
		else
		{
			int a = JOptionPane.showConfirmDialog(null, "The text has been changed\nDo you want to Save the changes ?");
			if(a==0) //yes
				file_save();
			else if(a==1) //no
			{
				new Notepad(); 
				setTitle("untitled-Notepad");
			}
			else if(a==2)  //cancel
				return;
		}
	}

	private void file_save() 
	{
		
	}

	public void undoableEditHappened(UndoableEditEvent e) {}
}
