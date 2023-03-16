package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField_x;
	private JTextField textField_y;
	private JTextField txtResult;

	public static double customLog (double x, double y) 
	{
		double result = Math.log(y) / Math.log(x);
		
		return result;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setBackground(Color.LIGHT_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\DOWNLOADS\\calculator-app-icon-25.jpg"));
		setTitle("\u041A\u0430\u043B\u043A\u0443\u043B\u0430\u0442\u043E\u0440");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 360);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0424\u0443\u043D\u043A\u0446\u0438\u0438", TitledBorder.TRAILING, TitledBorder.BOTTOM, null, new Color(192, 192, 192)));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 111, 314, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		


		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0427\u0438\u0441\u043B\u0430", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(10, 11, 294, 89);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblX = new JLabel("x =");
		lblX.setForeground(new Color(0, 0, 0));
		lblX.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblX.setBounds(21, 20, 46, 33);
		panel_1.add(lblX);
		
		textField_x = new JTextField();
		textField_x.setFont(new Font("Arial", Font.BOLD, 12));
		textField_x.setHorizontalAlignment(SwingConstants.CENTER);
		textField_x.setBounds(67, 20, 63, 30);
		panel_1.add(textField_x);
		textField_x.setColumns(10);
		
		textField_y = new JTextField();
		textField_y.setFont(new Font("Arial", Font.BOLD, 12));
		textField_y.setHorizontalAlignment(SwingConstants.CENTER);
		textField_y.setColumns(10);
		textField_y.setBounds(210, 20, 63, 30);
		panel_1.add(textField_y);
		
		JLabel lblY = new JLabel("y =");
		lblY.setForeground(Color.BLACK);
		lblY.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblY.setBounds(154, 20, 46, 33);
		panel_1.add(lblY);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_x.setText(null);
				textField_y.setText(null);
				txtResult.setText(null);
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnNewButton.setBounds(124, 61, 46, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0420\u0435\u0437\u0443\u043B\u0442\u0430\u0442", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 242, 294, 68);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtResult.setBackground(Color.GRAY);
		txtResult.setForeground(Color.BLACK);
		txtResult.setEditable(false);
		txtResult.setBounds(10, 21, 274, 36);
		panel_2.add(txtResult);
		txtResult.setColumns(10);
		
		
		
		JButton btnplus = new JButton("x + y");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double x = Double.parseDouble(textField_x.getText());
				double y = Double.parseDouble(textField_y.getText());
				
				String result = Double.toString(x + y);
				txtResult.setText(result);
				
			}
		});
		btnplus.setForeground(Color.BLACK);
		btnplus.setBackground(Color.WHITE);
		btnplus.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		btnplus.setBounds(22, 11, 75, 40);
		panel.add(btnplus);
		
		JButton btnminus = new JButton("x - y");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double x = Double.parseDouble(textField_x.getText());
				double y = Double.parseDouble(textField_y.getText());
				
				String result = Double.toString(x - y);
				txtResult.setText(result);
				
			}
		});
		btnminus.setForeground(Color.BLACK);
		btnminus.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		btnminus.setBackground(Color.WHITE);
		btnminus.setBounds(119, 11, 75, 40);
		panel.add(btnminus);
		
		JButton btnmultiplic = new JButton("x * y");
		btnmultiplic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double x = Double.parseDouble(textField_x.getText());
				double y = Double.parseDouble(textField_y.getText());
				
				String result = Double.toString(x * y);
				txtResult.setText(result);
			}
		});
		btnmultiplic.setForeground(Color.BLACK);
		btnmultiplic.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		btnmultiplic.setBackground(Color.WHITE);
		btnmultiplic.setBounds(216, 11, 75, 40);
		panel.add(btnmultiplic);
		
		JButton btndivision = new JButton("x / y");
		btndivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double x = Double.parseDouble(textField_x.getText());
				double y = Double.parseDouble(textField_y.getText());
				
				String result = Double.toString(x / y);
				txtResult.setText(result);
			}
		});
		btndivision.setForeground(Color.BLACK);
		btndivision.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		btndivision.setBackground(Color.WHITE);
		btndivision.setBounds(119, 62, 75, 40);
		panel.add(btndivision);
		
		JButton btnpow = new JButton("x ^ y");
		btnpow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double x = Double.parseDouble(textField_x.getText());
				double y = Double.parseDouble(textField_y.getText());
				
				txtResult.setText(Double.toString(Math.pow(x, y)));
			}
		});
		btnpow.setForeground(Color.BLACK);
		btnpow.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		btnpow.setBackground(Color.WHITE);
		btnpow.setBounds(22, 62, 75, 40);
		panel.add(btnpow);
		
		
		

		
		JButton btnpercent = new JButton("y% * x");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double x = Double.parseDouble(textField_x.getText());
				double y = Double.parseDouble(textField_y.getText());
				
				double result = x * (y/100);
				txtResult.setText(Double.toString(result));
			}
		});
		btnpercent.setForeground(Color.BLACK);
		btnpercent.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		btnpercent.setBackground(Color.WHITE);
		btnpercent.setBounds(216, 62, 75, 40);
		panel.add(btnpercent);
		
		
	}
}
