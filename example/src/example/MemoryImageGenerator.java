package example;
import java.awt.*;
import java.applet.*;
import java.awt.image.*;
@SuppressWarnings("serial")
public class MemoryImageGenerator extends Applet{
	Image img;
	public void init() {
		Dimension d=getSize();
		int w = d.width;
		int h = d.height;
		int pixels[] = new int[w*h];
		int i=0;
		
		for(int y=0;y<h; y++) {
			for(int x=0; x<w; x++) {
				int r = (x*6^y*3)&0xff;
				int g = (x*3^y*2)&0xff;
				int b = (x*2^y*4)&0xff;
				pixels[i++] = (255 << 24)|(r<<16)|(g<<8)|b;
			}
		}
		img = createImage(new MemoryImageSource(w, h, pixels, 0, w));
	}
	
	public void paint(Graphics g) {
		g.drawImage(img,  0,  0,  this);
	}
}
