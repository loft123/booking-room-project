package ClientView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Client.ClientDAO;
import Client.ClientVO;
import ClientLogin.LoginGUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class TimePayGUI {

	private JFrame frame;
	private JLabel lb_image;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public TimePayGUI(ClientVO vo) {
		initialize(vo);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ClientVO vo) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("�̿� �ð� ����");
		frame.setLocationRelativeTo(null);
		
		
		JButton btnNewButton = new JButton("4\uC2DC\uAC04");
		btnNewButton.setFont(new Font("HY����L", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cnt = 4;
				JOptionPane.showMessageDialog(null, "4�ð� ���� �����Ͻðڽ��ϱ�?");
				ClientDAO dao = new ClientDAO();
				ClientVO votime = dao.Timepay(vo, cnt);
				if (votime!=null) {
					JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�.");
					frame.dispose();
					FirstVIewGUI view = new FirstVIewGUI(votime, null, null);
				}
				
			}
		});
		btnNewButton.setBounds(68, 79, 125, 59);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("8\uC2DC\uAC04");
		button.setFont(new Font("HY����L", Font.PLAIN, 15));
		button.setBackground(new Color(255, 255, 240));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int cnt = 8;
				JOptionPane.showMessageDialog(null, "8�ð� ���� �����Ͻðڽ��ϱ�?");
				ClientDAO dao = new ClientDAO();
				ClientVO votime = dao.Timepay(vo, cnt);
				if (votime!=null) {
					JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�.");
					frame.dispose();
					FirstVIewGUI view = new FirstVIewGUI(votime, null, null);
				}
			
			
			}
		});
		button.setBounds(224, 79, 125, 59);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("<HTML><center>�ϱ�<br>(24�ð�)</center></HTML>");
		button_1.setFont(new Font("HY����L", Font.PLAIN, 15));
		button_1.setBackground(new Color(255, 255, 240));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int cnt = 24;
				JOptionPane.showMessageDialog(null, "�Ϸ�(24�ð�)���� �����Ͻðڽ��ϱ�?");
				ClientDAO dao = new ClientDAO();
				ClientVO votime = dao.Timepay(vo, cnt);
				if (votime!=null) {
					JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�.");
					frame.dispose();
					FirstVIewGUI view = new FirstVIewGUI(votime, null, null);
				}
			
			}
		});
		button_1.setBounds(68, 160, 125, 59);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("<HTML><center>�ְ���<br>(168�ð�)</center></HTML>");
		button_2.setFont(new Font("HY����L", Font.PLAIN, 15));
		button_2.setBackground(new Color(255, 255, 240));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cnt = 168;
				JOptionPane.showMessageDialog(null, "�ְ�(168�ð�)���� �����Ͻðڽ��ϱ�?");
				ClientDAO dao = new ClientDAO();
				ClientVO votime = dao.Timepay(vo, cnt);
				if (votime!=null) {
					JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�.");
					frame.dispose();
					FirstVIewGUI view = new FirstVIewGUI(votime, null, null);
				}
			
			
			}
		});
		button_2.setBounds(224, 160, 125, 59);
		frame.getContentPane().add(button_2);
		
		JLabel lblNewLabel = new JLabel("\uC774\uC6A9 \uC2DC\uAC04 \uC120\uD0DD");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY����L", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(148, 10, 141, 59);
		frame.getContentPane().add(lblNewLabel);
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\SMHRD\\Downloads\\javaproject_semi\\javaproject_semi\\image\\background.png");
	      Image img = icon.getImage();
	      Image changeImg = img.getScaledInstance(613, 357, Image.SCALE_SMOOTH); // ũ������ (����, ����)
	      ImageIcon changeIcon = new ImageIcon(changeImg);
	      lb_image = new JLabel(changeIcon);
	      frame.getContentPane().add(lb_image);
	      lb_image.setBounds(0, 0, 434, 261);
	      frame.getContentPane().add(lb_image);
		

	}

}
