package javaproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientSeat {

	private JFrame frame;
	private JLabel lb_corona1;
	private JLabel lb_corona8;
	private JButton btn_seat_05;
	private JButton btn_seat_06;
	private JButton btn_seat_07;
	private JButton btn_seat_08;
	private JLabel lb_corona5;
	private JLabel lb_corona6;
	private JLabel lb_corona7;
	private JButton btn_seat_01;
	private JLabel lb_corona2;
	private JLabel lb_corona4;
	private JLabel lb_corona10;
	private JLabel lb_corona12;
	private JButton btn_seat_02;
	private JButton btn_seat_03;
	private JButton btn_seat_04;
	private JButton btn_seat_09;
	private JButton btn_seat_12;
	private JButton btn_seat_10;
	private JButton btn_seat_11;
	private JButton btn_seat_13;
	private JButton btn_seat_14;
	private JButton btn_seat_15;
	private JButton btn_seat_16;
	private JButton btn_seat_17;
	private JButton btn_seat_18;
	private JButton btn_seat_19;
	private JButton btn_seat_20;
	private JButton btn_seat_21;
	private JButton btn_seat_22;
	private JButton btn_seat_23;
	private JButton btn_seat_24;
	private JButton btn_seat_25;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public ClientSeat() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("좌석선택");
		frame.setBounds(100, 100, 818, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		// 확인 버튼
		JButton btn_check = new JButton("\uD655\uC778");
		btn_check.setBackground(new Color(102, 205, 170));
		btn_check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_check.setBounds(668, 496, 97, 23);
		frame.getContentPane().add(btn_check);

		JPanel panel = new JPanel();
		panel.setBounds(236, 139, 78, 76);
		frame.getContentPane().add(panel);

		btn_seat_01 = new JButton("\uC88C\uC11D01");
		panel.add(btn_seat_01);
		btn_seat_01.setBackground(new Color(255, 255, 255));
		btn_seat_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_01.setBackground(Color.yellow);
				}
		});

		lb_corona1 = new JLabel("");
		panel.add(lb_corona1);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(236, 230, 78, 76);
		frame.getContentPane().add(panel_1);

		btn_seat_08 = new JButton("\uC88C\uC11D08");
		panel_1.add(btn_seat_08);
		btn_seat_08.setBackground(new Color(255, 255, 255));
		btn_seat_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_08.setBackground(Color.yellow);
			}
		});

		lb_corona8 = new JLabel("");
		panel_1.add(lb_corona8);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(380, 229, 81, 73);
		frame.getContentPane().add(panel_1_1);

		btn_seat_07 = new JButton("\uC88C\uC11D07");
		panel_1_1.add(btn_seat_07);
		btn_seat_07.setBackground(new Color(255, 255, 255));
		btn_seat_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_07.setBackground(Color.yellow);
			}
		});

		lb_corona7 = new JLabel("");
		panel_1_1.add(lb_corona7);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(549, 229, 90, 76);
		frame.getContentPane().add(panel_1_2);

		btn_seat_06 = new JButton("\uC88C\uC11D06");
		panel_1_2.add(btn_seat_06);
		btn_seat_06.setBackground(new Color(255, 255, 255));
		btn_seat_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_06.setBackground(Color.yellow);
			}
		});

		lb_corona6 = new JLabel("");
		panel_1_2.add(lb_corona6);

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(684, 229, 81, 76);
		frame.getContentPane().add(panel_1_3);

		btn_seat_05 = new JButton("\uC88C\uC11D05");
		panel_1_3.add(btn_seat_05);
		btn_seat_05.setBackground(new Color(255, 255, 255));
		btn_seat_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_05.setBackground(Color.yellow);
			}
		});

		lb_corona5 = new JLabel("");
		panel_1_3.add(lb_corona5);

		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBounds(370, 142, 88, 73);
		frame.getContentPane().add(panel_1_4);

		btn_seat_02 = new JButton("\uC88C\uC11D02");
		btn_seat_02.setBackground(Color.WHITE);
		btn_seat_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_02.setBackground(Color.yellow);
			}
		});
		
		panel_1_4.add(btn_seat_02);

		lb_corona2 = new JLabel("");
		panel_1_4.add(lb_corona2);

		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBounds(549, 143, 90, 76);
		frame.getContentPane().add(panel_1_5);

		btn_seat_03 = new JButton("\uC88C\uC11D03");
		btn_seat_03.setBackground(Color.WHITE);
		btn_seat_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_03.setBackground(Color.yellow);
			}
		});
		panel_1_5.add(btn_seat_03);

		JLabel lb_corona3 = new JLabel("");
		panel_1_5.add(lb_corona3);

		JPanel panel_1_5_1 = new JPanel();
		panel_1_5_1.setBounds(684, 143, 81, 76);
		frame.getContentPane().add(panel_1_5_1);

		btn_seat_04 = new JButton("\uC88C\uC11D04");
		btn_seat_04.setBackground(Color.WHITE);
		btn_seat_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_04.setBackground(Color.yellow);
			}
		});
		
		panel_1_5_1.add(btn_seat_04);

		lb_corona4 = new JLabel("");
		panel_1_5_1.add(lb_corona4);

		JPanel panel_1_5_2 = new JPanel();
		panel_1_5_2.setBounds(300, 345, 90, 76);
		frame.getContentPane().add(panel_1_5_2);

		btn_seat_09 = new JButton("\uC88C\uC11D09");
		btn_seat_09.setBackground(Color.WHITE);
		btn_seat_09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_09.setBackground(Color.yellow);
			}
		});
		panel_1_5_2.add(btn_seat_09);

		JLabel lb_corona9 = new JLabel("");
		panel_1_5_2.add(lb_corona9);

		JPanel panel_1_5_3 = new JPanel();
		panel_1_5_3.setBounds(310, 437, 83, 76);
		frame.getContentPane().add(panel_1_5_3);

		btn_seat_12 = new JButton("\uC88C\uC11D12");
		btn_seat_12.setBackground(Color.WHITE);
		btn_seat_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_12.setBackground(Color.yellow);
			}
		});
		panel_1_5_3.add(btn_seat_12);

		lb_corona12 = new JLabel("");
		panel_1_5_3.add(lb_corona12);

		JPanel panel_1_5_4 = new JPanel();
		panel_1_5_4.setBounds(430, 345, 81, 73);
		frame.getContentPane().add(panel_1_5_4);

		btn_seat_10 = new JButton("\uC88C\uC11D10");
		btn_seat_10.setBackground(Color.WHITE);
		btn_seat_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_10.setBackground(Color.yellow);
			}
		});
		panel_1_5_4.add(btn_seat_10);

		lb_corona10 = new JLabel("");
		panel_1_5_4.add(lb_corona10);

		JPanel panel_1_5_5 = new JPanel();
		panel_1_5_5.setBounds(430, 437, 81, 76);
		frame.getContentPane().add(panel_1_5_5);

		btn_seat_11 = new JButton("\uC88C\uC11D11");
		btn_seat_11.setBackground(Color.WHITE);
		btn_seat_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_11.setBackground(Color.yellow);
			}
		});
		panel_1_5_5.add(btn_seat_11);

		JLabel lb_corona11 = new JLabel("");
		panel_1_5_5.add(lb_corona11);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(687, 10, 78, 76);
		frame.getContentPane().add(panel_2);
		
		btn_seat_13 = new JButton("\uC88C\uC11D13");
		btn_seat_13.setBackground(Color.WHITE);
		btn_seat_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_13.setBackground(Color.yellow);
			}
		});
		panel_2.add(btn_seat_13);
		
		JLabel lb_corona13 = new JLabel("");
		panel_2.add(lb_corona13);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(597, 10, 78, 76);
		frame.getContentPane().add(panel_3);
		
		btn_seat_14 = new JButton("\uC88C\uC11D14");
		btn_seat_14.setBackground(Color.WHITE);
		btn_seat_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_14.setBackground(Color.yellow);
			}
		});
		panel_3.add(btn_seat_14);
		
		JLabel lb_corona14 = new JLabel("");
		panel_3.add(lb_corona14);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(493, 10, 78, 76);
		frame.getContentPane().add(panel_4);
		
		btn_seat_15 = new JButton("\uC88C\uC11D15");
		btn_seat_15.setBackground(Color.WHITE);
		btn_seat_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_15.setBackground(Color.yellow);
			}
		});
		panel_4.add(btn_seat_15);
		
		JLabel lb_corona15 = new JLabel("");
		panel_4.add(lb_corona15);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(403, 10, 78, 76);
		frame.getContentPane().add(panel_5);
		
		btn_seat_16 = new JButton("\uC88C\uC11D16");
		btn_seat_16.setBackground(Color.WHITE);
		btn_seat_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_16.setBackground(Color.yellow);
			}
		});
		panel_5.add(btn_seat_16);
		
		JLabel lb_corona16 = new JLabel("");
		panel_5.add(lb_corona16);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(298, 10, 78, 76);
		frame.getContentPane().add(panel_6);
		
		btn_seat_17 = new JButton("\uC88C\uC11D17");
		btn_seat_17.setBackground(Color.WHITE);
		btn_seat_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_17.setBackground(Color.yellow);
			}
		});
		panel_6.add(btn_seat_17);
		
		JLabel lb_corona17 = new JLabel("");
		panel_6.add(lb_corona17);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(190, 10, 78, 76);
		frame.getContentPane().add(panel_7);
		
		btn_seat_18 = new JButton("\uC88C\uC11D18");
		btn_seat_18.setBackground(Color.WHITE);
		btn_seat_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_18.setBackground(Color.yellow);
			}
		});
		panel_7.add(btn_seat_18);
		
		JLabel lb_corona18 = new JLabel("");
		panel_7.add(lb_corona18);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(100, 10, 78, 76);
		frame.getContentPane().add(panel_8);
		
		btn_seat_19 = new JButton("\uC88C\uC11D19");
		btn_seat_19.setBackground(Color.WHITE);
		btn_seat_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_19.setBackground(Color.yellow);
			}
		});
		panel_8.add(btn_seat_19);
		
		JLabel lb_corona19 = new JLabel("");
		panel_8.add(lb_corona19);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(22, 10, 78, 76);
		frame.getContentPane().add(panel_9);
		
		btn_seat_20 = new JButton("\uC88C\uC11D20");
		btn_seat_20.setBackground(Color.WHITE);
		btn_seat_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_20.setBackground(Color.yellow);
			}
		});
		panel_9.add(btn_seat_20);
		
		JLabel lb_corona20 = new JLabel("");
		panel_9.add(lb_corona20);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(22, 96, 78, 76);
		frame.getContentPane().add(panel_10);
		
		btn_seat_21 = new JButton("\uC88C\uC11D21");
		btn_seat_21.setBackground(Color.WHITE);
		btn_seat_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_21.setBackground(Color.yellow);
			}
		});
		panel_10.add(btn_seat_21);
		
		JLabel lb_corona21 = new JLabel("");
		panel_10.add(lb_corona21);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(22, 177, 78, 76);
		frame.getContentPane().add(panel_11);
		
		btn_seat_22 = new JButton("\uC88C\uC11D22");
		btn_seat_22.setBackground(Color.WHITE);
		btn_seat_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_22.setBackground(Color.yellow);
			}
		});
		panel_11.add(btn_seat_22);
		
		JLabel lb_corona22 = new JLabel("");
		panel_11.add(lb_corona22);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(22, 263, 78, 76);
		frame.getContentPane().add(panel_12);
		
		btn_seat_23 = new JButton("\uC88C\uC11D23");
		btn_seat_23.setBackground(Color.WHITE);
		btn_seat_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_23.setBackground(Color.yellow);
			}
		});
		panel_12.add(btn_seat_23);
		
		JLabel lb_corona23 = new JLabel("");
		panel_12.add(lb_corona23);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(22, 345, 78, 76);
		frame.getContentPane().add(panel_13);
		
		btn_seat_24 = new JButton("\uC88C\uC11D24");
		btn_seat_24.setBackground(Color.WHITE);
		btn_seat_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_24.setBackground(Color.yellow);
			}
		});
		panel_13.add(btn_seat_24);
		
		JLabel lb_corona24 = new JLabel("");
		panel_13.add(lb_corona24);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(22, 443, 78, 76);
		frame.getContentPane().add(panel_14);
		
		btn_seat_25 = new JButton("\uC88C\uC11D25");
		btn_seat_25.setBackground(Color.WHITE);
		btn_seat_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TimeThread my = new TimeThread();
					my.start();
					btn_seat_25.setBackground(Color.yellow);
			}
		});
		panel_14.add(btn_seat_25);
		
		JLabel lb_corona25 = new JLabel("");
		panel_14.add(lb_corona25);
		
		// 코로나 19 때문에 사용 못한는 좌석 <관리자 모드>
				JButton btn_change = new JButton("\uBCC0\uACBD");
				btn_change.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btn_seat_02.setBackground(Color.getHSBColor(255,69,0));
						lb_corona2.setText("사용 X");
						btn_seat_04.setBackground(Color.red);
						lb_corona4.setText("사용 X");
						btn_seat_06.setBackground(Color.red);
						lb_corona6.setText("사용 X");
						btn_seat_08.setBackground(Color.red);
						lb_corona8.setText("사용 X");
						btn_seat_10.setBackground(Color.red);
						lb_corona10.setText("사용 X");
						btn_seat_12.setBackground(Color.red);
						lb_corona12.setText("사용 X");
					}
				});
				btn_change.setBounds(668, 463, 97, 23);
				frame.getContentPane().add(btn_change);
	}

	// 이용 시간 선택
	public class TimeThread extends Thread {

		@Override
		public void run() {// 4시간 -> 14400초

//			int cnt_4 = 14400;
//			int cnt_8 = 28800;
//			int cnt_24 = 86400;
//			int cnt_168 = 604800;

//			int cnt = 0;
//
//			int hour = 0;
//			int minute = 0;
//			int second = 0;
			int cnt = 5;
			
			while (true) {
//				hour = cnt / 3600;
//				minute = cnt % 3600 / 60;
//				second = cnt % 3600 % 60;
				

				lb_corona1.setText("<HTML>"+"<center>"+"사용 중"+"<br>"+cnt+""+"</center></HTML>");
				// cnt -> hour + ":" + minute + ":" + second
				cnt--;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (cnt < 0) {
					lb_corona1.setText("");
					btn_seat_01.setBackground(Color.white);
					break;
				}

			}
			
//			
//			if (cnt == 4) {// 4시간 버튼 입력
//				cnt = 14400;
//				while (true) {
//					hour = cnt / 3600;
//					minute = cnt % 3600 / 60;
//					second = cnt % 3600 % 60;
//
//					lb_corona1.setText("사용 중");
//					cnt--;
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					if (cnt < 0) {
//						lb_corona1.setText("");
//						btn_seat_01.setBackground(Color.white);
//						break;
//					}
//
//				}
//			} else if (cnt == 8) {
//				cnt = 28800;
//				
//				hour = cnt / 3600;
//				minute = cnt % 3600 / 60;
//				second = cnt % 3600 % 60;
//
//				while (true) {
//					hour = cnt / 3600;
//					minute = cnt % 3600 / 60;
//					second = cnt % 3600 % 60;
//
//					lb_corona1.setText("사용 중");
//					cnt--;
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					if (cnt < 0) {
//						lb_corona1.setText("");
//						btn_seat_01.setBackground(Color.white);
//						break;
//					}
//				}
//			} else if (cnt == 24) {
//				cnt = 86400;
//				
//				hour = cnt / 3600;
//				minute = cnt % 3600 / 60;
//				second = cnt % 3600 % 60;
//
//				while (true) {
//					hour = cnt / 3600;
//					minute = cnt % 3600 / 60;
//					second = cnt % 3600 % 60;
//
//					lb_corona1.setText("사용 중");
//					cnt--;
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					if (cnt < 0) {
//						lb_corona1.setText("");
//						btn_seat_01.setBackground(Color.white);
//						break;
//					}
//				}
//			} else if (cnt == 168) {
//				cnt = 604800;
//				
//				hour = cnt / 3600;
//				minute = cnt % 3600 / 60;
//				second = cnt % 3600 % 60;
//
//				while (true) {
//					hour = cnt / 3600;
//					minute = cnt % 3600 / 60;
//					second = cnt % 3600 % 60;
//
//					lb_corona1.setText("사용 중");
//					cnt--;
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					if (cnt < 0) {
//						lb_corona1.setText("");
//						btn_seat_01.setBackground(Color.white);
//						break;
//					}
//				}
//			}
		}
	}
}
