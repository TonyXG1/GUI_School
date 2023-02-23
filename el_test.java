package gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class el_test extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					el_test frame = new el_test();
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
	public el_test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1084, 200);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0412\u044A\u043F\u0440\u043E\u0441 1", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)), "\u0412\u044A\u043F\u0440\u043E\u0441 1", TitledBorder.LEFT, TitledBorder.TOP, null, SystemColor.windowBorder));
		panel_3.setBounds(10, 63, 500, 126);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u041A\u043E\u0439 \u0435 \u043F\u044A\u0440\u0432\u0438\u044F \u0432\u043B\u0430\u0434\u0435\u0442\u0435\u043B \u043D\u0430 \u041F\u044A\u0440\u0432\u0430\u0442\u0430 \u0431\u044A\u043B\u0433\u0430\u0440\u0441\u043A\u0430 \u0434\u044A\u0440\u0436\u0430\u0432\u0430?");
		lblNewLabel.setBounds(10, 26, 480, 45);
		panel_3.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u0410\u0441\u0435\u043D");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(34, 78, 82, 23);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton Pravilen1 = new JRadioButton("\u0410\u0441\u043F\u0430\u0440\u0443\u0445");
		buttonGroup.add(Pravilen1);
		Pravilen1.setBounds(150, 78, 82, 23);
		panel_3.add(Pravilen1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\u041A\u0443\u0431\u0440\u0430\u0442");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(266, 78, 82, 23);
		panel_3.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("\u0422\u0435\u0440\u0432\u0435\u043B");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(382, 78, 82, 23);
		panel_3.add(rdbtnNewRadioButton_3);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0412\u044A\u043F\u0440\u043E\u0441 1", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)), "\u0412\u044A\u043F\u0440\u043E\u0441 4", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)));
		panel_3_3.setBounds(574, 63, 500, 126);
		panel.add(panel_3_3);
		panel_3_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("\u041A\u043E\u0433\u0430 \u041F\u0430\u0438\u0441\u0438\u0439 \u0425\u0438\u043B\u0435\u043D\u0434\u0430\u0440\u0441\u043A\u0438 \u043D\u0430\u043F\u0438\u0441\u0432\u0430 \"\u0418\u0441\u0442\u043E\u0440\u0438\u044F \u0441\u043B\u0430\u0432\u044F\u043D\u043E\u0431\u044A\u043B\u0433\u0430\u0440\u0441\u043A\u0430\"?");
		lblNewLabel_3.setBounds(10, 25, 480, 45);
		panel_3_3.add(lblNewLabel_3);
		
		JRadioButton Pravilen4 = new JRadioButton("1762 \u0433.");
		buttonGroup_3.add(Pravilen4);
		Pravilen4.setBounds(47, 77, 66, 23);
		panel_3_3.add(Pravilen4);
		
		JRadioButton rdbtnNewRadioButton_6_1 = new JRadioButton("1764 \u0433.");
		buttonGroup_3.add(rdbtnNewRadioButton_6_1);
		rdbtnNewRadioButton_6_1.setBounds(160, 77, 66, 23);
		panel_3_3.add(rdbtnNewRadioButton_6_1);
		
		JRadioButton rdbtnNewRadioButton_6_2 = new JRadioButton("1770 \u0433.");
		buttonGroup_3.add(rdbtnNewRadioButton_6_2);
		rdbtnNewRadioButton_6_2.setBounds(273, 77, 66, 23);
		panel_3_3.add(rdbtnNewRadioButton_6_2);
		
		JRadioButton rdbtnNewRadioButton_6_3 = new JRadioButton("1758 \u0433.");
		buttonGroup_3.add(rdbtnNewRadioButton_6_3);
		rdbtnNewRadioButton_6_3.setBounds(386, 77, 66, 23);
		panel_3_3.add(rdbtnNewRadioButton_6_3);
		
		JLabel Caption = new JLabel("\u0415\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u0435\u043D \u0442\u0435\u0441\u0442 \u0437\u0430 \u0438\u0441\u0442\u043E\u0440\u0438\u044F\u0442\u0430 \u043D\u0430 \u0411\u044A\u043B\u0433\u0430\u0440\u0438\u044F");
		Caption.setForeground(new Color(128, 0, 0));
		Caption.setFont(new Font("Comfortaa SemiBold", Font.BOLD, 21));
		Caption.setBounds(263, 11, 557, 41);
		panel.add(Caption);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 51));
		panel_1.setBounds(0, 199, 1084, 200);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0412\u044A\u043F\u0440\u043E\u0441 1", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)), "\u0412\u044A\u043F\u0440\u043E\u0441 2", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)));
		panel_3_1.setBounds(10, 29, 500, 126);
		panel_1.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u041A\u043E\u0439 \u0432\u0435\u043A \u0441\u0435 \u043D\u0430\u0440\u0438\u0447\u0430 \"\u0417\u043B\u0430\u0442\u043D\u0438\u044F \u0432\u0435\u043A\" \u043D\u0430 \u0411\u044A\u043B\u0433\u0430\u0440\u0438\u044F?");
		lblNewLabel_1.setBounds(10, 25, 480, 45);
		panel_3_1.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("8\u043C\u0438");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(53, 77, 58, 23);
		panel_3_1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_4_1 = new JRadioButton("9\u0442\u0438");
		buttonGroup_1.add(rdbtnNewRadioButton_4_1);
		rdbtnNewRadioButton_4_1.setBounds(164, 77, 58, 23);
		panel_3_1.add(rdbtnNewRadioButton_4_1);
		
		JRadioButton rdbtnNewRadioButton_4_2 = new JRadioButton("7\u043C\u0438");
		buttonGroup_1.add(rdbtnNewRadioButton_4_2);
		rdbtnNewRadioButton_4_2.setBounds(275, 77, 58, 23);
		panel_3_1.add(rdbtnNewRadioButton_4_2);
		
		JRadioButton Pravilen2 = new JRadioButton("10\u0442\u0438");
		buttonGroup_1.add(Pravilen2);
		Pravilen2.setBounds(386, 77, 58, 23);
		panel_3_1.add(Pravilen2);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0412\u044A\u043F\u0440\u043E\u0441 1", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)), "\u0412\u044A\u043F\u0440\u043E\u0441 5", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)));
		panel_3_4.setBounds(574, 29, 500, 126);
		panel_1.add(panel_3_4);
		panel_3_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("\u041A\u0430\u043A \u0441\u0435 \u043A\u0430\u0437\u0432\u0430 \u0434\u043E\u0433\u043E\u0432\u043E\u0440\u0430, \u043A\u043E\u0439\u0442\u043E \u043D\u043E\u0441\u0438 \u043E\u0441\u0432\u043E\u0431\u043E\u0436\u0434\u0435\u043D\u0438\u0435\u0442\u043E \u043D\u0430 \u0411\u044A\u043B\u0433\u0430\u0440\u0438\u044F \u043E\u0442 \u043E\u0441\u043C\u0430\u043D\u0441\u043A\u043E \u0440\u043E\u0431\u0441\u0442\u0432\u043E?");
		lblNewLabel_4.setBounds(10, 27, 480, 45);
		panel_3_4.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("\u0411\u0435\u0440\u043B\u0438\u043D\u0441\u043A\u0438");
		buttonGroup_4.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setBounds(43, 79, 109, 23);
		panel_3_4.add(rdbtnNewRadioButton_7);
		
		JRadioButton Pravilen5 = new JRadioButton("\u0421\u0430\u043D \u0421\u0442\u0435\u0444\u0430\u043D\u0441\u043A\u0438");
		buttonGroup_4.add(Pravilen5);
		Pravilen5.setBounds(195, 79, 109, 23);
		panel_3_4.add(Pravilen5);
		
		JRadioButton rdbtnNewRadioButton_7_2 = new JRadioButton("\u0411\u0435\u043B\u0433\u0440\u0430\u0434\u0441\u043A\u0438");
		buttonGroup_4.add(rdbtnNewRadioButton_7_2);
		rdbtnNewRadioButton_7_2.setBounds(347, 79, 109, 23);
		panel_3_4.add(rdbtnNewRadioButton_7_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 0, 0));
		panel_2.setBounds(0, 397, 1084, 206);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0412\u044A\u043F\u0440\u043E\u0441 1", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)), "\u0412\u044A\u043F\u0440\u043E\u0441 3", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)));
		panel_3_2.setBounds(10, 29, 500, 126);
		panel_2.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u041A\u043E\u044F \u0433\u043E\u0434\u0438\u043D\u0430 \u0435 \u043E\u0441\u0432\u043E\u0431\u043E\u0434\u0435\u043D\u0430 \u0411\u044A\u043B\u0433\u0430\u0440\u0438\u044F \u043E\u0442 \u0432\u0438\u0437\u0430\u043D\u0442\u0438\u0439\u0441\u043A\u043E \u0440\u043E\u0431\u0441\u0442\u0432\u043E?");
		lblNewLabel_2.setBounds(10, 27, 480, 45);
		panel_3_2.add(lblNewLabel_2);
		
		JRadioButton Pravilen3 = new JRadioButton("1185 \u0433.");
		buttonGroup_2.add(Pravilen3);
		Pravilen3.setBounds(40, 79, 74, 23);
		panel_3_2.add(Pravilen3);
		
		JRadioButton rdbtnNewRadioButton_5_1 = new JRadioButton("1174 \u0433.");
		buttonGroup_2.add(rdbtnNewRadioButton_5_1);
		rdbtnNewRadioButton_5_1.setBounds(154, 79, 74, 23);
		panel_3_2.add(rdbtnNewRadioButton_5_1);
		
		JRadioButton rdbtnNewRadioButton_5_2 = new JRadioButton("1194 \u0433.");
		buttonGroup_2.add(rdbtnNewRadioButton_5_2);
		rdbtnNewRadioButton_5_2.setBounds(268, 79, 74, 23);
		panel_3_2.add(rdbtnNewRadioButton_5_2);
		
		JRadioButton rdbtnNewRadioButton_5_3 = new JRadioButton("1201 \u0433.");
		buttonGroup_2.add(rdbtnNewRadioButton_5_3);
		rdbtnNewRadioButton_5_3.setBounds(382, 79, 74, 23);
		panel_3_2.add(rdbtnNewRadioButton_5_3);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0412\u044A\u043F\u0440\u043E\u0441 1", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)), "\u0412\u044A\u043F\u0440\u043E\u0441 6", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)));
		panel_3_5.setBounds(574, 29, 500, 126);
		panel_2.add(panel_3_5);
		panel_3_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("\u041A\u043E\u0433\u0430 \u0441\u0435 \u0447\u0435\u0441\u0442\u0432\u0430 \u0434\u0435\u043D\u044F \u043D\u0430 \u043D\u0430\u0440\u043E\u0434\u043D\u0438\u0442\u0435 \u0431\u0443\u0434\u0438\u0442\u0435\u043B\u0438?");
		lblNewLabel_5.setBounds(10, 30, 480, 45);
		panel_3_5.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("6 \u043C\u0430\u0439");
		buttonGroup_5.add(rdbtnNewRadioButton_8);
		rdbtnNewRadioButton_8.setBounds(31, 82, 86, 23);
		panel_3_5.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_8_1 = new JRadioButton("3 \u043C\u0430\u0440\u0442");
		buttonGroup_5.add(rdbtnNewRadioButton_8_1);
		rdbtnNewRadioButton_8_1.setBounds(148, 82, 86, 23);
		panel_3_5.add(rdbtnNewRadioButton_8_1);
		
		JRadioButton Pravilen6 = new JRadioButton("1 \u043D\u043E\u0435\u043C\u0432\u0440\u0438");
		buttonGroup_5.add(Pravilen6);
		Pravilen6.setBounds(265, 82, 86, 23);
		panel_3_5.add(Pravilen6);
		
		JRadioButton rdbtnNewRadioButton_8_3 = new JRadioButton("2 \u044E\u043D\u0438");
		buttonGroup_5.add(rdbtnNewRadioButton_8_3);
		rdbtnNewRadioButton_8_3.setBounds(382, 82, 86, 23);
		panel_3_5.add(rdbtnNewRadioButton_8_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(763, 166, 139, 28);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel Resultlbl = new JLabel("\u0420\u0435\u0437\u0443\u043B\u0442\u0430\u0442:");
		Resultlbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		Resultlbl.setBounds(10, 0, 86, 28);
		panel_4.add(Resultlbl);
		
		JLabel Result = new JLabel("");
		Result.setFont(new Font("Tahoma", Font.BOLD, 15));
		Result.setBounds(106, 0, 33, 28);
		panel_4.add(Result);
		
		JButton Startbtn = new JButton("\u041F\u0440\u0435\u0434\u0430\u0439");
		Startbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int score = 0;
				
				if (Pravilen1.isSelected() == true) 
				{
					score++;
					Pravilen1.setForeground(Color.green);
					
				}
				
				else 
				{
					lblNewLabel.setForeground(Color.red);
				}
				
				if (Pravilen2.isSelected() == true) 
				{
					score++;
					Pravilen2.setForeground(Color.green);
					
				}
				
				else 
				{
					lblNewLabel_1.setForeground(Color.red);
				}
				
				if (Pravilen3.isSelected() == true) 
				{
					score++;
					Pravilen3.setForeground(Color.green);
					
				}
				
				else 
				{
					lblNewLabel_2.setForeground(Color.red);
				}
				
				if (Pravilen4.isSelected() == true) 
				{
					score++;
					Pravilen4.setForeground(Color.green);
					
				}
				
				else 
				{
					lblNewLabel_3.setForeground(Color.red);
				}
				
				if (Pravilen5.isSelected() == true) 
				{
					score++;
					Pravilen5.setForeground(Color.green);
					
				}
				
				else 
				{
					lblNewLabel_4.setForeground(Color.red);
				}
				
				if (Pravilen6.isSelected() == true) 
				{
					score++;
					Pravilen6.setForeground(Color.green);
					
				}
				
				else 
				{
					lblNewLabel_5.setForeground(Color.red);
				}
				
				String result = String.valueOf(score);			
				Result.setText(result);
				
			}
		});
		Startbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		Startbtn.setBounds(62, 166, 180, 29);
		panel_2.add(Startbtn);
		

		

		
		JButton btnNewButton = new JButton("\u0418\u0437\u0442\u0440\u0438\u0439");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				lblNewLabel.setForeground(Color.black);
				buttonGroup.clearSelection();
				Pravilen1.setForeground(Color.black);
				
				lblNewLabel_1.setForeground(Color.black);
				buttonGroup_1.clearSelection();
				Pravilen2.setForeground(Color.black);
				
				lblNewLabel_2.setForeground(Color.black);
				buttonGroup_2.clearSelection();
				Pravilen3.setForeground(Color.black);
				
				lblNewLabel_3.setForeground(Color.black);
				buttonGroup_3.clearSelection();
				Pravilen4.setForeground(Color.black);
				
				lblNewLabel_4.setForeground(Color.black);
				buttonGroup_4.clearSelection();
				Pravilen5.setForeground(Color.black);
				
				lblNewLabel_5.setForeground(Color.black);
				buttonGroup_5.clearSelection();
				Pravilen6.setForeground(Color.black);
				
				Result.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(282, 166, 180, 29);
		panel_2.add(btnNewButton);
	}
}
