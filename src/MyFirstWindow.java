
//Has many flaws, like doesn't empty result when adding new value. 
//Should also empty other textfield if writing in a nother to not covert 
//two at teh same time or the like

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MyFirstWindow {
	ConversorDegresRadians con = new ConversorDegresRadians();
	DecimalFormat df = new DecimalFormat("0.00");

	private JFrame frmConversor;
	private JTextField txtFgdfg;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstWindow window = new MyFirstWindow();
					window.frmConversor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFirstWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversor = new JFrame();
		frmConversor.setResizable(false);
		frmConversor.setTitle("Conversor");
		frmConversor.setBounds(100, 100, 249, 299);
		frmConversor.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		frmConversor.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"Enter value in degrees:");
		lblNewLabel.setBounds(29, 35, 122, 23);
		frmConversor.getContentPane().add(lblNewLabel);

		JLabel lblResult = new JLabel("Result: ");
		lblResult.setBounds(29, 154, 122, 29);
		frmConversor.getContentPane().add(lblResult);

		textField_1 = new JTextField();
		textField_1.setBounds(29, 123, 89, 20);
		frmConversor.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnRed = new JButton("to radians");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// lblNewLabel.setName("Button clicked");
				// lblNewLabel.setText("Button clicked");

				// lblResult.setText(lblResult.getText()+con.convertToRadians(Double.parseDouble(textField_1.getText())));
				// con.convertToRadians(Double.parseDouble(lblNewLabel.getText()));

				double radians = 0.00;
				radians = con.convertToRadians(Double
						.parseDouble(txtFgdfg.getText()));
				// double result = df.format(degrees);
				lblResult.setText(
						lblResult.getText() + radians);
				
////				------
//				double total = Double.parseDouble(jlbTotal.getText());
//				double price = Double.parseDouble(jlbPrice.getText());

			}
		});
		btnRed.setBounds(29, 194, 89, 23);
		frmConversor.getContentPane().add(btnRed);

		JButton btnToDegree = new JButton("to degree");
		btnToDegree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// lblResult.setText("kajsdg");
				// lblResult.setText(lblResult.getText()+con.convertToDegree(Double.parseDouble(textField_1.getText())));

				double degrees = 0.00;
				degrees = con
						.convertToDegree(Double.parseDouble(
								textField_1.getText()));
				// double result = df.format(degrees);
				lblResult.setText(
						lblResult.getText() + degrees);

			}
		});
		btnToDegree.setBounds(128, 194, 89, 23);
		frmConversor.getContentPane().add(btnToDegree);

		txtFgdfg = new JTextField();
		txtFgdfg.setBounds(29, 60, 89, 20);
		frmConversor.getContentPane().add(txtFgdfg);
		txtFgdfg.setColumns(10);

		// textField_1 = new JTextField();
		// textField_1.setBounds(29, 123, 89, 20);
		// frmConversor.getContentPane().add(textField_1);
		// textField_1.setColumns(10);

		// JLabel lblResult = new JLabel("Result: ");
		// lblResult.setBounds(29, 154, 122, 29);
		// frmConversor.getContentPane().add(lblResult);

		JLabel lblEnterValueIn = new JLabel(
				"Enter value in radians: ");
		lblEnterValueIn.setBounds(29, 102, 141, 14);
		frmConversor.getContentPane().add(lblEnterValueIn);
	}
}
