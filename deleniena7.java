package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class deleniena7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleniena7 frame = new deleniena7();
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
	public deleniena7() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(deleniena7.class.getResource("/source/7-filled-64.png")));
		setTitle("\u0414\u0435\u043B\u0435\u043D\u0438\u0435 \u043D\u0430 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 385);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 240));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0412\u044A\u0432\u0435\u0436\u0434\u0430\u043D\u0435", TitledBorder.RIGHT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 455, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0446\u044F\u043B\u043E \u0447\u0438\u0441\u043B\u043E:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(33, 16, 176, 28);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(219, 21, 203, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0427\u0438\u0441\u043B\u0430\u0442\u0430, \u043A\u043E\u0438\u0442\u043E \u0441\u0435 \u0434\u0435\u043B\u044F\u0442 \u043D\u0430 7 \u0431\u0435\u0437 \u043E\u0441\u0442\u0430\u0442\u044A\u043A: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(20, 82, 418, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblOutput1 = new JLabel("");
		lblOutput1.setLabelFor(this);
		lblOutput1.setBackground(new Color(255, 250, 240));
		lblOutput1.setForeground(new Color(0, 0, 0));
		lblOutput1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblOutput1.setBounds(10, 117, 850, 50);
		contentPane.add(lblOutput1);
		
		JLabel lblOutput1_1 = new JLabel("\u0421\u0443\u043C\u0430\u0442\u0430 \u043D\u0430 \u0447\u0438\u0441\u043B\u0430\u0442\u0430:");
		lblOutput1_1.setForeground(Color.BLACK);
		lblOutput1_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblOutput1_1.setBackground(new Color(255, 250, 240));
		lblOutput1_1.setBounds(10, 178, 209, 50);
		contentPane.add(lblOutput1_1);
		
		JLabel lblOutput1_1_1 = new JLabel("\u041F\u0440\u043E\u0438\u0437\u0432\u0435\u0434\u0435\u043D\u0438\u0435\u0442\u043E \u043D\u0430 \u0447\u0438\u0441\u043B\u0430\u0442\u0430:");
		lblOutput1_1_1.setForeground(Color.BLACK);
		lblOutput1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblOutput1_1_1.setBackground(new Color(255, 250, 240));
		lblOutput1_1_1.setBounds(10, 250, 209, 50);
		contentPane.add(lblOutput1_1_1);
		
		JLabel lblOutput2 = new JLabel("");
		lblOutput2.setForeground(Color.BLACK);
		lblOutput2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblOutput2.setBackground(new Color(255, 250, 240));
		lblOutput2.setBounds(229, 178, 245, 50);
		contentPane.add(lblOutput2);
		
		JLabel lblOutput3 = new JLabel("");
		lblOutput3.setForeground(Color.BLACK);
		lblOutput3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblOutput3.setBackground(new Color(255, 250, 240));
		lblOutput3.setBounds(229, 250, 245, 50);
		contentPane.add(lblOutput3);
		
		JButton btnStart = new JButton("\u041F\u0440\u0435\u0441\u043C\u0435\u0442\u043D\u0438");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(textField.getText());
 				String s = "";
 				int sum = 0;
 				int proizv = 1;
				for (int i = 1; i <= n; i++) 
				{
					if (i % 7 == 0) 
					{
						s = s + " " + i;
						sum+=i;
						proizv*=i;
					}
				}
				
				if (s.isEmpty() == true) 
				{
					sum = 0;
					proizv = 0;
					JOptionPane.showMessageDialog(null, "Няма число, което се дели на 7 в този интервал. опитай пак!");
				}
				
				
					lblOutput1.setText(s);
					lblOutput2.setText(Integer.toString(sum));
					lblOutput3.setText(Integer.toString(proizv));
				
				
				
			}
		});
		btnStart.setBounds(20, 312, 100, 23);
		contentPane.add(btnStart);
		
		JButton btnClear = new JButton("\u0418\u0437\u0447\u0438\u0441\u0442\u0438");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				lblOutput1.setText(null);
				lblOutput2.setText(null);
				lblOutput3.setText(null);
			}
		});
		btnClear.setBounds(197, 312, 100, 23);
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(new Color(255, 240, 245));
		btnExit.setIcon(new ImageIcon(deleniena7.class.getResource("/source/1398917_circle_close_cross_incorrect_invalid_icon.png")));
		btnExit.setBounds(429, 305, 36, 36);
		contentPane.add(btnExit);
	}
}
