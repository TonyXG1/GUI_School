package Anton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class lucky7casinogame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	double balance = 100.0;
	String startBalance = Double.toString(balance);

	String [] options = {"Вкарай още 100 лв.", "Вкарай още 500 лв.", "Излез от играта"};
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lucky7casinogame frame = new lucky7casinogame();
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
	public lucky7casinogame() {
		setTitle("\u0429\u0430\u0441\u0442\u043B\u0438\u0432\u043E 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lucky 7", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 153));
		panel.setBounds(10, 10, 394, 184);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(46, 67, 70, 70);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBackground(new Color(204, 153, 51));
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 67, 70, 70);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setBackground(new Color(255, 204, 0));
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(278, 67, 70, 70);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setBackground(new Color(204, 153, 51));
		textField_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		textField_2.setColumns(10);
		panel.add(textField_2);

		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 153, 0));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u041F\u0430\u0440\u0438", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(85, 205, 244, 70);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPechalba = new JLabel("\u0421\u043F\u0435\u0447\u0435\u043B\u0435\u043D\u0430 \u0441\u0443\u043C\u0430");
		lblPechalba.setForeground(new Color(255, 255, 204));
		lblPechalba.setHorizontalAlignment(SwingConstants.CENTER);
		lblPechalba.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 25));
		lblPechalba.setBounds(10, 21, 224, 39);
		panel_1.add(lblPechalba);
		
		
		JLabel lbl1 = new JLabel("\u0411\u0430\u043B\u0430\u043D\u0441:");
		lbl1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbl1.setBounds(134, 21, 70, 20);
		panel.add(lbl1);
		
		JLabel img4 = new JLabel("");
		img4.setIcon(new ImageIcon(lucky7casinogame.class.getResource("/sources/american-money-falling-raining-10446176.jpg")));
		img4.setBounds(339, 216, 65, 117);
		contentPane.add(img4);
		img4.setVisible(false);
		
		JLabel img1 = new JLabel("");
		img1.setIcon(new ImageIcon(lucky7casinogame.class.getResource("/sources/american-money-falling-raining-10446176.jpg")));
		img1.setBounds(10, 216, 65, 117);
		contentPane.add(img1);
		img1.setVisible(false);
		
		
		JLabel img2 = new JLabel("");
		img2.setIcon(new ImageIcon(lucky7casinogame.class.getResource("/sources/cartoon-money-bear-vector.jpg")));
		img2.setBounds(85, 285, 120, 48);
		contentPane.add(img2);
		img2.setVisible(false);
		
		JLabel img3 = new JLabel("");
		img3.setIcon(new ImageIcon(lucky7casinogame.class.getResource("/sources/money-hands-giving-thumbs-up-gesture-cartoon-24181640.jpg")));
		img3.setBounds(209, 285, 120, 48);
		contentPane.add(img3);
		img3.setVisible(false);
		
		JLabel lblBalance = new JLabel(startBalance);
		lblBalance.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblBalance.setBounds(214, 21, 96, 20);
		panel.add(lblBalance);
		
		JButton btnStart = new JButton("\u0420\u0430\u0437\u0431\u044A\u0440\u043A\u0430\u0439");
		btnStart.setBounds(134, 147, 126, 27);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				img1.setVisible(false);
				img2.setVisible(false);
				img3.setVisible(false);
				img4.setVisible(false);
				
				balance -= 10;
				short count = 0;
				
				if (balance < 0) 
				{
					JOptionPane.showOptionDialog(null, "Нямаш достатъчно пари! Ще вкараш ли още?", 
							"Click a button",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					
				}
				
				int n1 = (int)(Math.random()*10);
				int n2 = (int)(Math.random()*10);
				int n3= (int)(Math.random()*10);
				
				if (n1 == 7)count++;
				if (n2 == 7)count++;
				if (n3 == 7)count++;
				
				if (count == 1) 
				{
					balance += 20;
					lblPechalba.setText("Печелиш " + Integer.toString(20) + " лева");
					img1.setVisible(true);
					img2.setVisible(true);
					img3.setVisible(true);
					img4.setVisible(true);
				} 
				else if (count == 2)
				{
					balance += 50;
					lblPechalba.setText("Печелиш " + Integer.toString(100) + " лева");
					img1.setVisible(true);
					img2.setVisible(true);
					img3.setVisible(true);
					img4.setVisible(true);
				} 
				
				else if (count == 3) 
				{
					balance += 100;
					lblPechalba.setText("Печелиш " + Integer.toString(500) + " лева");
					img1.setVisible(true);
					img2.setVisible(true);
					img3.setVisible(true);
					img4.setVisible(true);
				} 
				
				else lblPechalba.setText("Губиш 10 лева");

				
				
				textField.setText(Integer.toString(n1));
				textField_1.setText(Integer.toString(n2));
				textField_2.setText(Integer.toString(n3));
				
				lblBalance.setText(Double.toString(balance));
				
			}
		});
		btnStart.setFont(new Font("Century Gothic", Font.BOLD, 15));
		panel.add(btnStart);
		

	}
}
