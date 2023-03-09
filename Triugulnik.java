package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Triugulnik extends JFrame {

	private JPanel contentPane;
	private JTextField input_a;
	private JTextField input_b;
	private JTextField input_c;
	private JTextField output_P;
	private JTextField output_S;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triugulnik frame = new Triugulnik();
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
	public Triugulnik() {
		setResizable(false);
		setTitle("\u041D\u0430\u043C\u0438\u0440\u0430\u043D\u0435 \u043D\u0430 \u043B\u0438\u0446\u0435 \u0438 \u043F\u0435\u0440\u0438\u043C\u0435\u0442\u044A\u0440 \u043D\u0430 \u0442\u0440\u0438\u044A\u0433\u044A\u043B\u043D\u0438\u043A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u041F\u0435\u0440\u0438\u043C\u0435\u0442\u044A\u0440", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 230, 300, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("P =");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(112, 44, 49, 31);
		panel.add(lblNewLabel_1_2);
		
		output_P = new JTextField();
		output_P.setEditable(false);
		output_P.setColumns(10);
		output_P.setBounds(163, 44, 43, 31);
		panel.add(output_P);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u041B\u0438\u0446\u0435 / \u041F\u043B\u043E\u0449", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)), "\u041B\u0438\u0446\u0435 / \u041F\u043B\u043E\u0449", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(324, 230, 300, 120);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("S =");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2_1.setBounds(65, 44, 49, 31);
		panel_1.add(lblNewLabel_1_2_1);
		
		output_S = new JTextField();
		output_S.setEditable(false);
		output_S.setColumns(10);
		output_S.setBounds(115, 44, 125, 31);
		panel_1.add(output_S);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u041F\u0430\u0440\u0430\u043C\u0435\u0442\u0440\u0438 \u043D\u0430 \u0442\u0440\u0438\u044A\u0433\u044A\u043B\u043D\u0438\u043A\u0430", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		panel_2.setBounds(10, 82, 614, 137);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("a =");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(22, 53, 49, 31);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("b =");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(257, 53, 49, 31);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("c =");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(491, 53, 49, 31);
		panel_2.add(lblNewLabel_1_1_1);
		
		input_a = new JTextField();
		input_a.setBounds(70, 53, 43, 31);
		panel_2.add(input_a);
		input_a.setColumns(10);
		
		input_b = new JTextField();
		input_b.setColumns(10);
		input_b.setBounds(307, 53, 43, 31);
		panel_2.add(input_b);
		
		input_c = new JTextField();
		input_c.setColumns(10);
		input_c.setBounds(539, 53, 43, 31);
		panel_2.add(input_c);
		
		JLabel lblNewLabel = new JLabel("\u0422\u0440\u0438\u044A\u0433\u044A\u043B\u043D\u0438\u043A \u0441\u044A\u0441 \u0441\u0442\u0440\u0430\u043D\u0438 a  b  c :");
		lblNewLabel.setFont(new Font("Comfortaa", Font.PLAIN, 20));
		lblNewLabel.setBounds(141, 21, 351, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnStart = new JButton("\u041F\u0440\u0435\u0441\u043C\u0435\u0442\u043D\u0438");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
				int a = Integer.parseInt(input_a.getText());
				int b = Integer.parseInt(input_b.getText());
				int c = Integer.parseInt(input_b.getText());
				
				int sum1 = a + b;
				int sum2 = b + c;
				int sum3 = c + a;
						
				
					long P = a + b + c;

					long p = P / 2;
					
					long h = p*(p-a)*(p-b)*(p-c);
					double S = Math.sqrt(h);
					S = Math.floor(S*100)/100;
					
					output_P.setText(String.valueOf(P));
					output_S.setText(String.valueOf(S));
					
					
//					if (a >= sum2)
//					{
//						JOptionPane.showMessageDialog(null, "Invalid input! \nThe sum of the cathetus can't be less than the hypotenuse.",
//								"Error", JOptionPane.ERROR_MESSAGE);
//						
//						input_a.setText(null);
//						input_b.setText(null);
//						input_c.setText(null);
//					}
//					
//					else if (b >= sum3)
//					{
//						JOptionPane.showMessageDialog(null, "Invalid input! \nThe sum of the cathetus can't be less than the hypotenuse.",
//								"Error", JOptionPane.ERROR_MESSAGE);
//						
//						input_a.setText(null);
//						input_b.setText(null);
//						input_c.setText(null);
//					}
//					
//					else if (c >= sum1)				
//					{
//						JOptionPane.showMessageDialog(null, "Invalid input! \nThe sum of the cathetus can't be less than the hypotenuse.",
//								"Error", JOptionPane.ERROR_MESSAGE);
//						
//						input_a.setText(null);
//						input_b.setText(null);
//						input_c.setText(null);
//					}
					
					
						
					
					
				
				
				
				
				
			}
			
		});
		
		btnStart.setBounds(111, 361, 102, 36);
		contentPane.add(btnStart);
		
		JButton btnClear = new JButton("\u0418\u0437\u0447\u0438\u0441\u0442\u0438");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input_a.setText(null);
				input_b.setText(null);
				input_c.setText(null);
				output_P.setText(null);
				output_S.setText(null);
				
				
			}
		});
		btnClear.setBounds(420, 361, 102, 36);
		contentPane.add(btnClear);
	}
}
