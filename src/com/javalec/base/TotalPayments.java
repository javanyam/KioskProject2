package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TotalPayments extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_8_1;
	private JLabel lblNewLabel_9_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TotalPayments dialog = new TotalPayments();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TotalPayments() {
		setTitle("PaymentsPage");
		setBounds(715, 382, 401, 550);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getLblNewLabel());
		contentPanel.add(getLblNewLabel_1());
		contentPanel.add(getLblNewLabel_2_1());
		contentPanel.add(getLblNewLabel_2_2());
		contentPanel.add(getLblNewLabel_2_3());
		contentPanel.add(getLblNewLabel_3());
		contentPanel.add(getLblNewLabel_2());
		contentPanel.add(getLblNewLabel_4());
		contentPanel.add(getLblNewLabel_5());
		contentPanel.add(getLblNewLabel_8_1());
		contentPanel.add(getLblNewLabel_9_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PaymentsCard paymentsCard=new PaymentsCard();
					paymentsCard.setVisible(true);
					setVisible(false);
				}
			});
			lblNewLabel.setIcon(new ImageIcon(TotalPayments.class.getResource("/image/btnPayment.png")));
			lblNewLabel.setBounds(12, 413, 360, 56);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(TotalPayments.class.getResource("/image/CoffeeBackGround.png")));
			lblNewLabel_1.setBounds(0, 365, 385, 146);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("");
			lblNewLabel_2_1.setIcon(new ImageIcon(TotalPayments.class.getResource("/image/line.png")));
			lblNewLabel_2_1.setBounds(16, 275, 356, 5);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("");
			lblNewLabel_2_2.setIcon(new ImageIcon(TotalPayments.class.getResource("/image/line.png")));
			lblNewLabel_2_2.setBounds(16, 189, 356, 5);
		}
		return lblNewLabel_2_2;
	}
	private JLabel getLblNewLabel_2_3() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel("");
			lblNewLabel_2_3.setIcon(new ImageIcon(TotalPayments.class.getResource("/image/line.png")));
			lblNewLabel_2_3.setBounds(16, 104, 356, 5);
		}
		return lblNewLabel_2_3;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(TotalPayments.class.getResource("/image/coffee payments.png")));
			lblNewLabel_3.setBounds(22, 10, 89, 84);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("총 14,000원");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 36));
			lblNewLabel_2.setBounds(46, 303, 295, 62);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("2");
			lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 16));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(261, 53, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon(TotalPayments.class.getResource("/image/PaymentsQuentity.png")));
			lblNewLabel_5.setBounds(228, 10, 123, 69);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_8_1() {
		if (lblNewLabel_8_1 == null) {
			lblNewLabel_8_1 = new JLabel("카페라떼");
			lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8_1.setFont(new Font("굴림", Font.BOLD, 20));
			lblNewLabel_8_1.setBounds(112, 21, 107, 24);
		}
		return lblNewLabel_8_1;
	}
	private JLabel getLblNewLabel_9_1() {
		if (lblNewLabel_9_1 == null) {
			lblNewLabel_9_1 = new JLabel("7000원");
			lblNewLabel_9_1.setFont(new Font("굴림", Font.PLAIN, 20));
			lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9_1.setBounds(121, 46, 83, 25);
		}
		return lblNewLabel_9_1;
	}
}
