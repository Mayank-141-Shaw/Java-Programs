package example;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Alpha_Beta extends JApplet{
	JButton jbtnAlpha, jbtnBeta, jbtnGamma;
	
	JLabel jlab;
	
	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					makeGUI();
				}
			});
		}
		catch(Exception exc) {
			System.out.println("Cant create because of "+exc);
		}
	}
	
	private void makeGUI() {
		setLayout(new FlowLayout());
		
		jbtnAlpha = new JButton("Alpha");
		jbtnBeta = new JButton("Beta");
		jbtnGamma = new JButton("Gamma");
		
		jbtnAlpha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent le) {
				jlab.setText("Alpha was pressed");
			}
		});
		
		jbtnBeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent le) {
				jlab.setText("Beta was pressed");;
			}
		});
		
		jbtnGamma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent le) {
				jlab.setText("Gamma was pressed");
			}
		});
		
		
		add(jbtnAlpha);
		add(jbtnBeta);
		add(jbtnGamma);
		
		jlab = new JLabel("Press a button.");
		
		add(jlab);
	}
}
