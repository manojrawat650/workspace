import java.applet.*;
import java.awt.*;
public class ParamApplet extends Applet
{
public void init()
{
	}
public void paint(Graphics g)
{
	String st=getParameter("name");
	g.drawString(st,10,10);
}
}

/*<html>  
<body>
<applet code="ParamApplet.class" width="400" height="400">
 <param name="name" value="manoj">
 </applet>  
</body>
</html>*/
