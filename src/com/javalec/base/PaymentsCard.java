package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

public class PaymentsCard extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2;
	private JLabel lblTest;

	int count = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PaymentsCard dialog = new PaymentsCard();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PaymentsCard() {
		setTitle("PaymentsCard");
		setBounds(718, 382, 401, 550);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getLblNewLabel());
		contentPanel.add(getLblNewLabel_2_3());
		contentPanel.add(getLblTest());
		contentPanel.add(getLblNewLabel_2());
		contentPanel.add(getLblNewLabel_1());
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				Timer timer = new Timer();
				TimerTask task = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
						count++;
						if(count == 5) {
							setVisible(false);
							JOptionPane.showMessageDialog(null, "결제가 완료되었습니다. 감사합니다.");
							KioskMain kiosk = new KioskMain();
							kiosk.setVisible(true);
						}
						
					}
				};
				timer.schedule(task, 0, 1000);
			}
		});
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					setVisible(false);
				}
			});
			lblNewLabel.setIcon(new ImageIcon(PaymentsCard.class.getResource("/image/btnPaymenrsBack.png")));
			lblNewLabel.setBounds(12, 445, 360, 56);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(PaymentsCard.class.getResource("/image/paymentsCard.png")));
			lblNewLabel_1.setBounds(22, 127, 340, 308);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2_3() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel("");
			lblNewLabel_2_3.setIcon(new ImageIcon(PaymentsCard.class.getResource("/image/line.png")));
			lblNewLabel_2_3.setBounds(12, 112, 356, 5);
		}
		return lblNewLabel_2_3;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(PaymentsCard.class.getResource("/image/paymentsSource.png")));
			lblNewLabel_2.setBounds(22, 0, 344, 113);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblTest() {
		if (lblTest == null) {
			lblTest = new JLabel("");
			lblTest.setBounds(366, 127, 29, 16);
		}
		return lblTest;
	}
}
