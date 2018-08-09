package Temperature;

import javax.swing.JPanel;

public class TempGUI extends JPanel {
	
	private static final long serialVersionUID =1L;
	
	public static void main(String[] args) {
		int frameWidth = 300, frameHeight = 200;
		JPanel calculator = new MyPanel();
		MyFrame frame = new MyFrame("Temperature Calculator", calculator, frameWidth, frameHeight);
		frame.setVisible(true);
	}
}
