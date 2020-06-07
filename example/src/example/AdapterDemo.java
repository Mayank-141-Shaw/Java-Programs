package example;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.*;
public class AdapterDemo extends Applet{
	public void init() {
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMotionAdapter(this));
	}
}
