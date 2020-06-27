import java.applet.*;
import java.awt.*;
public class Applet_Ex extends Applet
{

	public void init()
	{
		System.out.println("init() called");
	}
	public void start()
	{
		System.out.println("start() called");
	}
	public void stop()
	{
		System.out.println("stop() called");
	}
	public void paint(Graphics g)
	{
		g.drawLine(100,50,400,50);
		g.drawString("Hello",100,70);
		g.drawRect(100,90,40,50);
		g.setColor(Color.red);
		g.fillRect(150,90,40,50);
		g.drawOval(100,150,40,50);
		g.setColor(Color.blue);
		g.fillOval(100,190,40,50);
		g.fillArc(100,150,250,300,350,70);
	}
	public void destroy()
	{
		System.out.println("destroy() called");
	}
}


//<applet code="Applet_Ex.class" width=300 height=300> </applet>