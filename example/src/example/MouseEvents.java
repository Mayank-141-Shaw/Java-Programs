package example;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener{
	
	String msg = "";
	int mouseX = 0, mouseY = 0;
	
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	//Handle mouse cliked
	public void mouseClicked(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Clicked";
		repaint();
	}
	
	//Handle Mouse Entered
	public void mouseEntered(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Entered";
		repaint();
	}
	
	//Handle mouse exited
	public void mouseExited(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Exited";
		repaint();
	}
	
	//Handle button pressed
	public void mousePressed(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down";
		repaint();
	}
	
	//Handle button released
	public void mouseReleased(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up";
		repaint();
	}
	
	//Handle Mouse dragged
	public void mouseDragged(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "8";
		showStatus("Dragging mouse at "+mouseX+", "+mouseY);
		repaint();
	}
	//Handle mouse moved
	public void mouseMoved(MouseEvent me) {
		showStatus("Moving mouse at "+me.getX()+", "+me.getY());
	}
	
	public void paint(Graphics g) {
		g.drawString(msg,  mouseX,  mouseY);
	}
}
