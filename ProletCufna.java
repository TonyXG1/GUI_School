package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class ProletCufna extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProletCufna frame = new ProletCufna();
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
	
	short counter = 0;
	boolean b = false;
	boolean firstTime = true;
	
	
	public ProletCufna() {
		setTitle("Пролетна игра");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProletCufna.class.getResource("/source/Screenshot 2023-03-31 010701.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Winter", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 41, 735, 485);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		
		JButton btnOputvaniq = new JButton("\u041E\u043F\u044A\u0442\u0432\u0430\u043D\u0438\u044F");
		btnOputvaniq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(panel, "Разполагате със студен зимен пейзаж.\nЗа да промените сезона на дългоочакваната пролет\nтрябва да намерите 3те пролетни символа.\nСлед като ги намерите изберете бутона \"Смени\". \nКъсмет!", "Пролетна игра", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnOputvaniq.setFont(new Font("Comfortaa SemiBold", Font.PLAIN, 15));
		btnOputvaniq.setBounds(10, 2, 150, 34);
		contentPane.add(btnOputvaniq);
		
		JLabel lblSimvoli = new JLabel("\u041D\u0430\u043C\u0435\u0440\u0435\u043D\u0438 \u0441\u0438\u043C\u0432\u043E\u043B\u0438:");
		lblSimvoli.setFont(new Font("Comfortaa Medium", Font.PLAIN, 15));
		lblSimvoli.setBounds(465, 0, 176, 41);
		contentPane.add(lblSimvoli);
		
		JLabel lblCounter = new JLabel("0");
		lblCounter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCounter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCounter.setBounds(641, 0, 36, 41);
		contentPane.add(lblCounter);
		
		
		JLabel lblSpring = new JLabel("");
		lblSpring.setIcon(new ImageIcon(ProletCufna.class.getResource("/source/542196.jpg")));
		lblSpring.setBounds(10, 28, 712, 446);
		panel.add(lblSpring);
		lblSpring.setEnabled(false);
		lblSpring.setVisible(false);
		
		JButton btnStart = new JButton("\u0421\u043C\u0435\u043D\u0438");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (firstTime) 
				{
					JOptionPane.showMessageDialog(panel, "Вие намерихте всички символи. Сега може да се насладите на великолепния пролетен пейзаж!\nАко желаете може да смените отново на зимен пейзаж.", "Поздравления!", JOptionPane.PLAIN_MESSAGE);
					firstTime = false;
				}
				
				
				if (b == false) 
				{

					
					lblSpring.setEnabled(true);
					lblSpring.setVisible(true);
					panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Spring", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
					contentPane.setBackground(Color.pink);
					lblSimvoli.setVisible(false);
					btnOputvaniq.setVisible(false);
					lblCounter.setVisible(false);
					b = true;
				}
				
				else 
				{
					lblSpring.setEnabled(false);
					lblSpring.setVisible(false);
					panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Winter", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
					contentPane.setBackground(Color.gray);
					b = false;
				}
				
				
			}
		});
		btnStart.setEnabled(false);
		btnStart.setFont(new Font("Comfortaa SemiBold", Font.PLAIN, 16));
		btnStart.setBounds(292, 2, 150, 34);
		contentPane.add(btnStart);

		JButton btnShturkel = new JButton("");
		btnShturkel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				lblCounter.setText(String.valueOf(counter));
				btnShturkel.setEnabled(false);
				
				
				if (counter == 3) 
				{
					btnStart.setEnabled(true);
					lblCounter.setForeground(Color.pink);
				}
			}
		});
		
		
		
		btnShturkel.setIcon(new ImageIcon(ProletCufna.class.getResource("/source/\u0429\u044A\u0440\u043A\u0435\u043B.png")));
		btnShturkel.setBounds(29, 43, 120, 100);
		panel.add(btnShturkel);
		btnShturkel.setOpaque(false);
		btnShturkel.setContentAreaFilled(false);
		btnShturkel.setBorderPainted(false);
		
		JButton btnMartenici = new JButton("");
		btnMartenici.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				lblCounter.setText(String.valueOf(counter));
				btnMartenici.setEnabled(false);
				
				if (counter == 3) 
				{
					btnStart.setEnabled(true);
					lblCounter.setForeground(Color.pink);
				}
			}
		});
		btnMartenici.setIcon(new ImageIcon(ProletCufna.class.getResource("/source/martenica1_f_improf_300x394.png")));
		btnMartenici.setBounds(365, 291, 46, 57);
		panel.add(btnMartenici);
		btnMartenici.setOpaque(false);
		btnMartenici.setContentAreaFilled(false);
		btnMartenici.setBorderPainted(false);
		
		JButton btnKokiche = new JButton("");
		btnKokiche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				lblCounter.setText(String.valueOf(counter));
				btnKokiche.setEnabled(false);
				
				
				if (counter == 3) 
				{
					btnStart.setEnabled(true);
					lblCounter.setForeground(Color.pink);
				}
			}
		});
		btnKokiche.setIcon(new ImageIcon(ProletCufna.class.getResource("/source/snowdrop-g7926c5764_1280.png")));
		btnKokiche.setBounds(100, 388, 83, 75);
		panel.add(btnKokiche);
		btnKokiche.setOpaque(false);
		btnKokiche.setContentAreaFilled(false);
		btnKokiche.setBorderPainted(false);
		
		JLabel lblWinter = new JLabel("");
		lblWinter.setBounds(10, 28, 712, 446);
		panel.add(lblWinter);
		lblWinter.setIcon(new ImageIcon(ProletCufna.class.getResource("/source/wintry-winter-sun-tree-winter-preview.jpg")));
		
		

		

		

	}
}
