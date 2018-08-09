package Temperature;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel temperature;
	private JLabel degrees;
	private JTextField entry;
	private JTextArea result;
	private JButton calcFahrenheit;
	private JButton calcCelsius;
	
	public MyPanel() {
		temperature = new JLabel("Temperature: ");
		add(temperature);
		
		// Input box for temperature
		entry = new JTextField(4);
		add(entry);
		
		degrees = new JLabel("\u00b0");
		add(degrees);
		
		//Fahrenheit button
		calcFahrenheit = new JButton("Fahrenheit");
		add(calcFahrenheit);
		calcFahrenheit.addActionListener(new calculateFahrenheit());
		
		//Celsius button
		calcCelsius = new JButton("Celsius");
		calcCelsius.addActionListener(new calculateCelsius());
		add(calcCelsius);
		
		//Text box where answer appears
		result = new JTextArea();
		add(result);
		JScrollPane scroll = new JScrollPane(result);
		scroll.setPreferredSize(new Dimension(100, 50));
		add(scroll, BorderLayout.SOUTH);
		result.setEditable(false);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.add(calcFahrenheit);
		buttonsPanel.add(calcCelsius);
		add(buttonsPanel, BorderLayout.SOUTH);
		
		JPanel text = new JPanel();
		text.add(result);
		text.add(scroll);
		add(text, BorderLayout.SOUTH);
	}
	
	private class calculateFahrenheit implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			result.setText(Double.toString(Temperature.calculateFahrenheit(Double.parseDouble(entry.getText()))));
		}
	}
		
	private class calculateCelsius implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			result.setText(Double.toString(Temperature.calculateCelsius(Double.parseDouble(entry.getText()))));
			
		}
	}
}
