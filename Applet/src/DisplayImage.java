import java.awt.*;  
import java.awt.event.*;
import java.applet.*;  
  
  
public class DisplayImage extends Applet implements ActionListener {  
	TextField tf;
	Button b;
	public void init()
  { tf=new TextField();
  tf.setBounds(10,10,100,10);
	  b=new Button("press");
	  b.setBounds(100,100,20,20);
	  this.add(b);
	  this.add(tf);
	  b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
	  tf.setText("hello");
  }
  }  
/*<applet code="DisplayImage.class" width="500" height="500">
</applet>*/
      
  

/*<applet code="DisplayImage.class" width="300" height="300">  
</applet>  */