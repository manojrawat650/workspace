import java.applet.Applet;
import java.awt.*;
public class First extends Applet
{
  public void init()
  {
	  TextField t1,t2;
		t1=new TextField();
		t2=new TextField();
		t1.setBounds(10,10,200,10);
		t2.setBounds(10,50,100,10);
		this.add(t1);
		this.add(t2);
		Button b=new Button("press");
		b.setBounds(10,200,20,30);
		this.add(b);
  }
public void paint(Graphics g)
{
	
	}
}
/*
 <applet code="First.class width=800 height=500">
</applet>
 */
