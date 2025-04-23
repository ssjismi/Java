import java.applet.*;
import java.awt.*;
public class Drawshape extends Applet
{
 public void init()
 {
  setBackground(java.awt.Color.white);
 }
 public void paint(Graphics g)
 {
  g.drawOval(50,50,100,100);
  g.drawRect(200,50,100,60);
  g.drawLine(50,200,300,200);
 }
}

