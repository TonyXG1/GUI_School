package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kompleks extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	int count = 0;
	int []arr = new int[12];
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kompleks frame = new kompleks();
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
	public kompleks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 0));
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 0));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0421\u043F\u0438\u0441\u044A\u043A \u043D\u0430 \u0442\u0443\u0440\u0438\u0441\u0442\u0438\u0442\u0435 \u043F\u043E \u043C\u0435\u0441\u0435\u0446\u0438", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, new Font("Cambria", Font.BOLD, 15), Color.CYAN));
		panel.setBounds(10, 86, 324, 449);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setFont(new Font("Century", Font.PLAIN, 20));
		list.setVisibleRowCount(12);
		list.setBounds(10, 29, 304, 410);
		panel.add(list);
		
		JLabel lblNewLabel = new JLabel("\u0422\u0443\u0440\u0438\u0441\u0442\u0438\u0447\u0435\u0441\u043A\u0438 \u043A\u043E\u043C\u043F\u043B\u0435\u043A\u0441");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 35));
		lblNewLabel.setBounds(146, 10, 394, 42);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(354, 161, 202, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\u0421\u0442\u0430\u0442\u0438\u0441\u0442\u0438\u043A\u0430", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		panel_1.setBounds(354, 256, 322, 279);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u041C\u0438\u043D. \u0431\u0440\u043E\u0439 \u0442\u0443\u0440\u0438\u0441\u0442\u0438:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Century", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 36, 185, 24);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u041C\u0430\u043A\u0441. \u0431\u0440\u043E\u0439 \u0442\u0443\u0440\u0438\u0441\u0442\u0438:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Century", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 96, 185, 24);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u041E\u0431\u0449 \u0431\u0440\u043E\u0439:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Century", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 156, 185, 24);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u0421\u0440\u0435\u0434\u0435\u043D \u0431\u0440\u043E\u0439:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("Century", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(10, 216, 185, 24);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblMin = new JLabel("");
		lblMin.setBounds(205, 36, 107, 24);
		panel_1.add(lblMin);
		
		JLabel lblMax = new JLabel("");
		lblMax.setBounds(205, 96, 107, 24);
		panel_1.add(lblMax);
		
		JLabel lblAll = new JLabel("");
		lblAll.setBounds(205, 156, 107, 24);
		panel_1.add(lblAll);
		
		JLabel lblAvg = new JLabel("");
		lblAvg.setBounds(205, 216, 107, 24);
		panel_1.add(lblAvg);
		
		JLabel lblMonth = new JLabel("\u041C\u0435\u0441\u0435\u0446 1:");
		lblMonth.setForeground(new Color(0, 191, 255));
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setFont(new Font("Century", Font.PLAIN, 25));
		lblMonth.setBounds(383, 120, 146, 31);
		contentPane.add(lblMonth);
		
		DefaultListModel demoList = new DefaultListModel();

		
		JButton btnStart = new JButton("\u0412\u044A\u0432\u0435\u0434\u0438");
		btnStart.setForeground(new Color(255, 140, 0));
		btnStart.setBackground(new Color(0, 191, 255));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				arr[count] = Integer.parseInt(textField.getText());
				count++;
				demoList.addElement(count + " μερεφ: " + arr[count-1]);
				list.setModel(demoList);
				
				lblMonth.setText("Μερεφ " + (count+1) + ":");
				
				textField.setText(null);
			}
		});
		btnStart.setFont(new Font("Century", Font.PLAIN, 18));
		btnStart.setBounds(566, 161, 110, 26);
		contentPane.add(btnStart);
		
		JButton btnStat = new JButton("\u0421\u0442\u0430\u0442\u0438\u0441\u0442\u0438\u043A\u0430");
		btnStat.setForeground(new Color(255, 140, 0));
		btnStat.setBounds(450, 221, 125, 26);
		contentPane.add(btnStat);
		btnStat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int min = arr[0],  max = arr[0];
				double sum = 0;
				double average;
				for (int i=0;i<arr.length;i++) {
					if (arr[i]==0)break;
					if (min>arr[i]) min = arr[i];
					if (max<arr[i]) max = arr[i];
					
					sum+=arr[i];
					
				}
				average = sum / Double.valueOf(count);
				
				lblMin.setText(String.valueOf(min));
				lblMax.setText(String.valueOf(max));
				lblAll.setText(String.valueOf(sum));
				lblAvg.setText(String.valueOf(average));
				
				demoList.clear();
				list.setModel(demoList);
			}
		});
		btnStat.setFont(new Font("Century", Font.PLAIN, 17));
		

	}
}
