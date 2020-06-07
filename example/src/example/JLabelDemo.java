package example;
import java.awt.*;
import javax.swing.*;

public class JLabelDemo extends JApplet{
	public void inti() {
		try {
			SwingUtilities.invokeAndWait(
					new Runnable() {
						public void run() {
							makeGUI();
						}
					}
					);
		}
		catch(Exception exc) {
			System.out.println("Can't create because of " + exc);
		}
	}
	
	private void makeGUI() {
		// Create an icon
		ImageIcon ii = new ImageIcon("france.gif");
		
		//Create label
		JLabel jl = new JLabel("France", ii, JLabel.CENTER);
		
		//Add label to the content plan
		add(jl);
	}
}
