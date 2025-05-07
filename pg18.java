import java.awt.*;
import java.awt.event.*;
public class pg18 extends Frame implements MouseListener,MouseMotionListener,KeyListener,WindowListener
{
 String message="";
 pg18()
 {
 setTitle("event handling demo");
 setSize(400,300);
 setLayout(null);
 setVisible(true);
 addMouseListener(this);
 addMouseMotionListener(this);
 addKeyListener(this);
 addWindowListener(this);
 setFocusable(true);
 }
 public void mouseClicked(MouseEvent e)
 {
  message="Mouse Clicked at (" + e.getX() +" "+e.getY()+ ")";
  repaint();
 }
 public void mousePressed(MouseEvent e)
 {
  message="Mouse Pressed";
  repaint();
 }
 public void mouseReleased(MouseEvent e)
 {
  message="Mouse released";
  repaint();
 }
 public void mouseDragged(MouseEvent e)
 {
  message="Mouse dragged";
  repaint();
 }
 public void mouseEntered(MouseEvent e)
 {
  message="Mouse Entered frame";
  repaint();
 }
 public void mouseExited(MouseEvent e)
 {
  message="Mouse exited frame";
  repaint();
 }
 public void mouseMoved(MouseEvent e)
 {
  message="Mouse Moved at (" + e.getX() +" "+e.getY()+ ")";
  repaint();
 }
 public void keyPressed(KeyEvent e)
 {
  message="key Pressed:"+e.getKeyChar();
  repaint();
 }
 public void keyTyped(KeyEvent e)
 {
  message="key Typed:"+e.getKeyChar();
  repaint();
 }
 public void keyReleased(KeyEvent e)
 {
  message="key released:"+e.getKeyChar();
  repaint();
 }
 public void windowOpened(WindowEvent e)
 {
  System.out.println("Window opened");
 }
 public void windowClosing(WindowEvent e)
 {
  System.out.println("Window closing");
  dispose();
  System.exit(0);
 }
 public void windowClosed(WindowEvent e)
 {
  System.out.println("window closed");
 }
 public void windowDeiconified(WindowEvent e)
 {
  System.out.println("window restored");
 }
 public void windowIconified(WindowEvent e)
 {
  System.out.println("window minimized");
 }
 public void windowActivated(WindowEvent e)
 {
  System.out.println("window activated");
 }
 public void windowDeactivated(WindowEvent e)
 {
  System.out.println("window deactivated");
 }
 public void paint(Graphics g)
 {
  g.drawString(message,50,150);
 }
 public static void main(String args[])
 {
  new pg18();
 }
}
