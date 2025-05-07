import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Houseapplet extends Applet implements MouseListener
{
 boolean isRed=false;
 public void init()
 {
  addMouseListener(this);
 }
 public void paint(Graphics g)
 {
  g.setColor(Color.yellow);
  g.fillRect(100,150,200,150);
  g.setColor(Color.red);
  g.drawLine(100,150,200,80);
  g.drawLine(200,80,300,150);
  g.setColor(isRed ? Color.red : Color.blue);
  g.fillRect(180,230,40,70);
 }
 public void mouseClicked(MouseEvent e)
 {
  int x=e.getX();
  int y=e.getY();
  if((x>=180&&x<=220)&&(y>=230&&y<=300))
  {
   isRed=!isRed;
   repaint();
  }
 }
 public void mousePressed(MouseEvent e)
 {
 }
 public void mouseReleased(MouseEvent e)
 {
 }
 public void mouseEntered(MouseEvent e)
 {
 }
 public void mouseExited(MouseEvent e)
 {
 }
} 
