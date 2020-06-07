package example;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MyMouseAdapter extends MouseAdapter{
	AdapterDemo adapterdemo;
	public MyMouseAdapter(AdapterDemo adapterdemo) {
		this.adapterdemo = adapterdemo;
	}
	public void mouseClicked(MouseEvent me) {
		adapterdemo.showStatus("Mouse Clicked");
	}
}
