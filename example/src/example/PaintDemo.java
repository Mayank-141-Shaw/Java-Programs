package example;

import javax.swing.JFrame;
import javax.swing.*;

public class PaintDemo {
	PaintDemo(){
		
		JLabel jlab;
		PaintPanel pp;
		JFrame jfrm = new JFrame("Paint Demo");
		
		jfrm.setSize(200, 150);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pp = new PaintPanel();
		jfrm.add(pp);
		
		jfrm.setVisible(true);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new PaintDemo();
			}
		});
	}
}
