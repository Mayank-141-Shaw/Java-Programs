package example;
import java.awt.event.*;
import java.applet.*;
import java.awt.*;
public class MyMouseMotionAdapter {
	AdapterDemo adapterdemo;
	public MyMouseMotionAdapter(AdapterDemo adapterdemo) {
		this.adapterdemo = adapterdemo;
	}
	
	public void mouseDragged(MouseEvent me) {
		adapterdemo.showStatus("Mouse Dragged");
	}
}
