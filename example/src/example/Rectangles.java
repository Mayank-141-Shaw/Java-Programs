package example;
import java.awt.*;
import java.applet.*;
public class Rectangles extends Applet{
	public void paint(Graphics G) {
		G.setColor(null);
		G.drawRect(10, 10, 60, 60);
		G.drawOval(80, 10, 50, 50);
		G.draw3DRect(150, 50, 40, 40, true);
		G.fillRoundRect(70, 140, 140, 100, 30, 40);
		
	}
}
