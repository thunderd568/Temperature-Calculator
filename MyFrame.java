package Temperature;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public MyFrame(String title, JPanel calculator, int width, int height) {
		super(title);
		setSize(new Dimension(width, height));
		setContentPane(calculator);
		
		//I'd prefer it if the table appears in the center of the user screen :) 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int upperLeftCornerX = (screenSize.width - getWidth()) / 2;
		int upperLeftCornerY = (screenSize.height - getHeight()) / 2;
		setLocation(upperLeftCornerX, upperLeftCornerY);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
	}
}
