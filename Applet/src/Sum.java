import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Sum extends Applet implements ActionListener {
TextField t1;
TextField t2;
TextField t3;Button b;
int x;
int y;
int z;
	public void init()
{
		x=0;
		y=0;
		z=0;
		b=new Button("Press");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t1.setBounds(10,10,20,10);
		t2.setBounds(10,200,20,10);
	add(b);
	add(t1);
	add(t2);
	add(t3);
	b.addActionListener(this);
}
	public void paint(Graphics g)
	{
	g.drawString("enter the two numbers",10,100);
	String s1=t1.getText();
	String s2=t2.getText();
	x=Integer.parseInt(s1);
	y=Integer.parseInt(s2);
	g.drawString(String.valueOf(x+y),500,500);
	}

public void actionPerformed(ActionEvent e)
{ if (e.getSource()==b)
	{
	String i=String.valueOf(x);
	t3.setText(i);
	}
	
	}

}
/*<Applet code="Sum.java" width=400 height=400></Applet>*/
