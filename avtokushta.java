package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
public class avtokushta extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					avtokushta frame = new avtokushta();
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
	public avtokushta() {
		setTitle("\u0410\u0432\u0442\u043E\u043A\u044A\u0449\u0430");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 665);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0410\u0432\u0442\u043E\u043A\u044A\u0449\u0430 \"\u0411\u044A\u0440\u0437\u0438 \u0438 \u044F\u0440\u043E\u0441\u0442\u043D\u0438\"");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel.setBounds(154, 11, 426, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(avtokushta.class.getResource("/source/bugatti.png")));
		lblNewLabel_1.setBounds(147, 45, 440, 173);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u041C\u0430\u0440\u043A\u0430", TitledBorder.LEADING, TitledBorder.TOP,
				new Font("Arial Black", Font.PLAIN, 13), new Color(25, 25, 112)));
		panel.setBounds(10, 268, 350, 288);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.control);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0413\u043E\u0434\u0438\u043D\u0430 \u043D\u0430 \u043F\u0440\u043E\u0438\u0437\u0432\u043E\u0434\u0441\u0442\u0432\u043E", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 188, 330, 89);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBackground(new Color(25, 25, 112));
		comboBox.setMaximumRowCount(4);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u0418\u0437\u0431\u0435\u0440\u0435\u0442\u0435 \u0433\u043E\u0434\u0438\u043D\u0430 \u043D\u0430 \u043F\u0440\u043E\u0438\u0437\u0432\u043E\u0434\u0441\u0442\u0432\u043E", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004"}));
		comboBox.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		comboBox.setBounds(10, 31, 310, 36);
		panel_2.add(comboBox);
		
		JRadioButton rdbtnVolkswagen = new JRadioButton("Volkswagen");
		rdbtnVolkswagen.setBackground(SystemColor.scrollbar);
		buttonGroup.add(rdbtnVolkswagen);
		rdbtnVolkswagen.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		rdbtnVolkswagen.setBounds(44, 18, 109, 23);
		panel.add(rdbtnVolkswagen);
		
		JRadioButton rdbtnToyota = new JRadioButton("Toyota");
		rdbtnToyota.setBackground(SystemColor.scrollbar);
		buttonGroup.add(rdbtnToyota);
		rdbtnToyota.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		rdbtnToyota.setBounds(44, 59, 109, 23);
		panel.add(rdbtnToyota);
		
		JRadioButton rdbtnHonda = new JRadioButton("Honda");
		rdbtnHonda.setBackground(SystemColor.scrollbar);
		buttonGroup.add(rdbtnHonda);
		rdbtnHonda.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		rdbtnHonda.setBounds(44, 100, 109, 23);
		panel.add(rdbtnHonda);
		
		JRadioButton rdbtnMercedes = new JRadioButton("Mercedes");
		rdbtnMercedes.setBackground(SystemColor.scrollbar);
		buttonGroup.add(rdbtnMercedes);
		rdbtnMercedes.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		rdbtnMercedes.setBounds(44, 141, 109, 23);
		panel.add(rdbtnMercedes);
		
		JRadioButton rdbtnPorsche = new JRadioButton("Porsche");
		rdbtnPorsche.setBackground(SystemColor.scrollbar);
		buttonGroup.add(rdbtnPorsche);
		rdbtnPorsche.setForeground(new Color(218, 165, 32));
		rdbtnPorsche.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnPorsche.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		rdbtnPorsche.setBounds(197, 59, 109, 23);
		panel.add(rdbtnPorsche);
		
		JRadioButton rdbtnFiat = new JRadioButton("Fiat");
		rdbtnFiat.setBackground(SystemColor.scrollbar);
		buttonGroup.add(rdbtnFiat);
		rdbtnFiat.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnFiat.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		rdbtnFiat.setBounds(197, 18, 109, 23);
		panel.add(rdbtnFiat);
		
		JRadioButton rdbtnLambo = new JRadioButton("Lamborghini");
		rdbtnLambo.setBackground(SystemColor.scrollbar);
		buttonGroup.add(rdbtnLambo);
		rdbtnLambo.setForeground(new Color(218, 165, 32));
		rdbtnLambo.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnLambo.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		rdbtnLambo.setBounds(197, 100, 109, 23);
		panel.add(rdbtnLambo);
		
		JRadioButton rdbtnBugatti = new JRadioButton("Bugatti");
		rdbtnBugatti.setBackground(SystemColor.scrollbar);
		buttonGroup.add(rdbtnBugatti);
		rdbtnBugatti.setForeground(new Color(218, 165, 32));
		rdbtnBugatti.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnBugatti.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		rdbtnBugatti.setBounds(197, 141, 109, 23);
		panel.add(rdbtnBugatti);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.scrollbar);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0415\u043A\u0441\u0442\u0440\u0438", TitledBorder.RIGHT, TitledBorder.TOP, new Font("Arial Black", Font.PLAIN, 13), new Color(25, 25, 112)));
		panel_1.setBounds(377, 422, 350, 134);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbx1 = new JCheckBox("\u0417\u0430\u0442\u043E\u043F\u043B\u044F\u0449\u0438 \u0441\u0435\u0434\u0430\u043B\u043A\u0438");
		chckbx1.setBackground(SystemColor.scrollbar);
		chckbx1.setFont(new Font("Arial Narrow", Font.PLAIN, 12));
		chckbx1.setBounds(28, 29, 150, 23);
		panel_1.add(chckbx1);
		
		JCheckBox chckbx2 = new JCheckBox("\u0414\u0435\u0442\u0435\u043A\u0442\u043E\u0440 \u0437\u0430 \u0434\u044A\u0436\u0434");
		chckbx2.setBackground(SystemColor.scrollbar);
		chckbx2.setFont(new Font("Arial Narrow", Font.PLAIN, 12));
		chckbx2.setBounds(28, 81, 150, 23);
		panel_1.add(chckbx2);
		
		JCheckBox chckbx3 = new JCheckBox("\u0417\u0430\u0442\u043E\u043F\u043B\u044F\u0449\u043E \u043F\u0440\u0435\u0434\u043D\u043E \u0441\u0442\u044A\u043A\u043B\u043E");
		chckbx3.setBackground(SystemColor.scrollbar);
		chckbx3.setFont(new Font("Arial Narrow", Font.PLAIN, 12));
		chckbx3.setBounds(180, 29, 146, 23);
		panel_1.add(chckbx3);
		
		JCheckBox chckbx4 = new JCheckBox("\u0410\u0434\u0430\u043F\u0442\u0438\u0432\u0435\u043D \u043A\u0440\u0443\u0438\u0437 \u043A\u043E\u043D\u0442\u0440\u043E\u043B");
		chckbx4.setBackground(SystemColor.scrollbar);
		chckbx4.setFont(new Font("Arial Narrow", Font.PLAIN, 12));
		chckbx4.setBounds(180, 81, 146, 23);
		panel_1.add(chckbx4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(SystemColor.scrollbar);
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0426\u0432\u044F\u0442", TitledBorder.RIGHT, TitledBorder.TOP, new Font("Arial Black", Font.PLAIN, 13), new Color(25, 25, 112)));
		panel_1_1.setBounds(377, 268, 350, 134);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JRadioButton rdbtnred = new JRadioButton("\u0447\u0435\u0440\u0432\u0435\u043D");
		rdbtnred.setBackground(SystemColor.scrollbar);
		buttonGroup_1.add(rdbtnred);
		rdbtnred.setForeground(Color.RED);
		rdbtnred.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnred.setBounds(5, 17, 109, 23);
		panel_1_1.add(rdbtnred);
		
		
		JRadioButton rdbtnblue = new JRadioButton("\u0441\u0438\u043D");
		rdbtnblue.setBackground(SystemColor.scrollbar);
		buttonGroup_1.add(rdbtnblue);
		rdbtnblue.setForeground(Color.BLUE);
		rdbtnblue.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnblue.setBounds(5, 53, 109, 23);
		panel_1_1.add(rdbtnblue);
		
		JRadioButton rdbtngreen = new JRadioButton("\u0437\u0435\u043B\u0435\u043D");
		rdbtngreen.setBackground(SystemColor.scrollbar);
		buttonGroup_1.add(rdbtngreen);
		rdbtngreen.setForeground(new Color(0, 128, 0));
		rdbtngreen.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtngreen.setBounds(5, 88, 109, 23);
		panel_1_1.add(rdbtngreen);
		
		JRadioButton rdbtnyellow = new JRadioButton("\u0436\u044A\u043B\u0442");
		rdbtnyellow.setBackground(SystemColor.scrollbar);
		buttonGroup_1.add(rdbtnyellow);
		rdbtnyellow.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnyellow.setForeground(Color.YELLOW);
		rdbtnyellow.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnyellow.setBounds(119, 17, 109, 23);
		panel_1_1.add(rdbtnyellow);
		
		JRadioButton rdbtnblack = new JRadioButton("\u0447\u0435\u0440\u0435\u043D");
		rdbtnblack.setBackground(SystemColor.scrollbar);
		buttonGroup_1.add(rdbtnblack);
		rdbtnblack.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnblack.setForeground(Color.BLACK);
		rdbtnblack.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnblack.setBounds(119, 88, 109, 23);
		panel_1_1.add(rdbtnblack);
		
		JRadioButton rdbtnpurple = new JRadioButton("маджента");
		rdbtnpurple.setBackground(SystemColor.scrollbar);
		buttonGroup_1.add(rdbtnpurple);
		rdbtnpurple.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnpurple.setForeground(Color.MAGENTA);
		rdbtnpurple.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnpurple.setBounds(233, 17, 109, 23);
		panel_1_1.add(rdbtnpurple);
		
		JRadioButton rdbtnorange = new JRadioButton("\u043E\u0440\u0430\u043D\u0436\u0435\u0432");
		rdbtnorange.setBackground(SystemColor.scrollbar);
		buttonGroup_1.add(rdbtnorange);
		rdbtnorange.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnorange.setForeground(Color.ORANGE);
		rdbtnorange.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnorange.setBounds(233, 88, 109, 23);
		panel_1_1.add(rdbtnorange);
		
		JRadioButton rdbtngray = new JRadioButton("\u0441\u0438\u0432");
		rdbtngray.setBackground(SystemColor.scrollbar);
		buttonGroup_1.add(rdbtngray);
		rdbtngray.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtngray.setForeground(Color.GRAY);
		rdbtngray.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtngray.setBounds(233, 53, 109, 23);
		panel_1_1.add(rdbtngray);
		
		JPanel panel_color = new JPanel();
		panel_color.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_color.setBackground(Color.WHITE);
		panel_color.setBounds(139, 47, 73, 37);
		panel_1_1.add(panel_color);
		
		
		JButton btnStart = new JButton("\u0417\u0430\u044F\u0432\u0438");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int cena = 0;
				boolean luks = false;
				String text = "";
				
				String kola = "";
				if (rdbtnVolkswagen.isSelected()) {cena+=12500;kola = "Volkswagen";}
				else if (rdbtnToyota.isSelected()) {cena+=16000;kola = "Toyota";}
				else if (rdbtnHonda.isSelected()) {cena+=18500;kola = "Honda";}
				else if (rdbtnMercedes.isSelected()) {cena+=40000;kola = "Mercedes";}
				else if (rdbtnFiat.isSelected()) {cena+=9750;kola = "Fiat";}
				else if (rdbtnPorsche.isSelected()) {cena+=140000;luks = true;kola = "Porschе";}
				else if (rdbtnLambo.isSelected()) {cena+=780000;luks = true;kola = "Lamborghini";}
				else if (rdbtnBugatti.isSelected()) {cena+=2500000;luks = true;kola = "Bugatti";}
				
				else JOptionPane.showMessageDialog(null, "Моля изберете желаната от вас марка кола!", "Грешка", JOptionPane.ERROR_MESSAGE);
				
				
				
				String godina  = comboBox.getSelectedItem().toString();
				
				
				
				String color = "";
				
				if (rdbtnred.isSelected()) {cena = cena - (cena/10); color = "червен";}			
				else if (rdbtnblue.isSelected()) color = "син";
				else if (rdbtngreen.isSelected()) color = "зелен";
				else if (rdbtnyellow.isSelected()) color = "жълт";
				else if (rdbtnblack.isSelected()) color = "черен";
				else if (rdbtnpurple.isSelected()) color = "маджента";
				else if (rdbtngray.isSelected()) color = "сив";
				else if (rdbtnorange.isSelected()) color = "оранжев";
				
				else JOptionPane.showMessageDialog(null, "Моля изберете желания от вас цвят за колата!", "Грешка", JOptionPane.ERROR_MESSAGE);
				
				
				
				String ekstri = "";
				boolean check = false;
				
				if (luks == false) {
					
					if (chckbx1.isSelected()) 
					{
						cena+=500;
						ekstri += "Затоплящи седалки";
						check = true;
					}
					
					if (chckbx2.isSelected()) 
					{
						if (check)ekstri+=", ";
						cena+=100;
						ekstri += "Детектор за дъжд";
						check = true;
					}
					
					if (chckbx3.isSelected()) 
					{
						if (check)ekstri+=", ";
						cena+=250;
						ekstri+= "Затоплящо предно стъкло";
						
						check = true;
					}
					
					if (chckbx4.isSelected()) 
					{
						if (check)ekstri+=", ";
						cena+=1000;
						ekstri += "Адаптивен круиз контрол";
					}
					
				}
				
				else if (luks)ekstri="Затоплящи седалки, Детектор за дъжд, Затоплящо предно стъкло, Адаптивен круиз контрол";
				
				if (ekstri.isEmpty())ekstri = "Без екстри";
				
				text = "Вие поръчахте: " + kola + " " + godina + "\nЦвят: " + color  +"\nЕкстри: " + ekstri;
				
				
				JOptionPane.showMessageDialog(null, text + "\nДължите сума от: " + cena + " лева.", "Вашата поръчка", JOptionPane.DEFAULT_OPTION);
				
				
				
				
				
			}
		});
		btnStart.setForeground(new Color(255, 255, 255));
		btnStart.setBackground(new Color(25, 25, 112));
		btnStart.setFont(new Font("Arial Black", Font.BOLD, 25));
		btnStart.setBounds(263, 567, 250, 48);
		contentPane.add(btnStart);
		
		JButton btnCenorazpis = new JButton("\u0426\u0435\u043D\u043E\u0440\u0430\u0437\u043F\u0438\u0441");
		btnCenorazpis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String [] options = {"Марки", "Цветове", "Екстри"};
				
				int response = JOptionPane.showOptionDialog(null, "Изберете на кое искате да видите цените:", "Ценоразпис", 0, 1, null, options, options[0]);
				
				if (response == 0 ) JOptionPane.showMessageDialog(null, "Цените на всяка марка кола. Цените са базови и не включват екстри. Марките оцветени с жълто са луксозни:\n"
						+ "Volkswagen: 12 500 лв.\nToyota: 16 000 лв.\nHonda: 18 500 лв\n"
						+ "Mercedes: 40 000 лв.\nFiat: 9 750 лв.\nPorsche: 140 000 лв.\nLamborghini: 780 000 лв.\nBugatti: 2 500 000 лв.", "Марки", JOptionPane.INFORMATION_MESSAGE);
				
				else if (response == 1) JOptionPane.showMessageDialog(null, "Цената за всички цветове е еднаква и тя е включена в базовата цена.\n САМО СЕГА:\nОтстъпка от 10% на кола с червен цвят.", "Цветове", JOptionPane.INFORMATION_MESSAGE);
				
				else if (response == 2) JOptionPane.showMessageDialog(null, "Цените за всяка добавена екстра се добавя към поръчката.\n"
						+ "Затоплящи седалки: 500 лева.\nДетектор за дъжд: 100 лева.\nЗатоплящо предно стъкло: 250 лева.\n"
						+ "Адаптивен круиз контрол: 1000 лв.\nЛуксозните коли притежават всички екстри в базовата цена и няма да бъде добавено допълнително за екстрите.", "Екстри", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		});
		btnCenorazpis.setForeground(new Color(255, 255, 255));
		btnCenorazpis.setBackground(new Color(25, 25, 112));
		btnCenorazpis.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnCenorazpis.setBounds(95, 234, 177, 23);
		contentPane.add(btnCenorazpis);
		
		JButton btnPreview = new JButton("Виж си цвета");
		btnPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnred.isSelected()) panel_color.setBackground(Color.red);
				else if (rdbtnblue.isSelected()) panel_color.setBackground(Color.blue);
				else if (rdbtngreen.isSelected()) panel_color.setBackground(Color.green);
				else if (rdbtnyellow.isSelected()) panel_color.setBackground(Color.yellow);
				else if (rdbtnblack.isSelected()) panel_color.setBackground(Color.black);
				else if (rdbtnpurple.isSelected()) panel_color.setBackground(Color.magenta);
				else if (rdbtngray.isSelected()) panel_color.setBackground(Color.gray);
				else if (rdbtnorange.isSelected()) panel_color.setBackground(Color.orange);
			}
		});
		btnPreview.setForeground(new Color(255, 255, 255));
		btnPreview.setBackground(new Color(25, 25, 112));
		btnPreview.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnPreview.setBounds(377, 234, 167, 23);
		contentPane.add(btnPreview);
		
		JButton btnClear = new JButton("Изчисти");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnVolkswagen.setSelected(false);
				rdbtnToyota.setSelected(false);
				rdbtnHonda.setSelected(false);
				rdbtnMercedes.setSelected(false);
				rdbtnFiat.setSelected(false);
				rdbtnPorsche.setSelected(false);
				rdbtnLambo.setSelected(false);
				rdbtnBugatti.setSelected(false);
				comboBox.setSelectedIndex(0);
				rdbtnred.setSelected(false);
				rdbtnblue.setSelected(false);
				rdbtngreen.setSelected(false);
				rdbtnyellow.setSelected(false);
				rdbtnblack.setSelected(false);
				rdbtnpurple.setSelected(false);
				rdbtngray.setSelected(false);
				rdbtnorange.setSelected(false);
				chckbx1.setSelected(false);
				chckbx2.setSelected(false);
				chckbx3.setSelected(false);
				chckbx4.setSelected(false);
				panel_color.setBackground(Color.WHITE);
				
				
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnClear.setBackground(new Color(25, 25, 112));
		btnClear.setBounds(560, 234, 167, 23);
		contentPane.add(btnClear);
	}
}
