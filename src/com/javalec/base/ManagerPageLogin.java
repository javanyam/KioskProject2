package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ManagerPageLogin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField pfPW;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel;
	private JButton btnNewButton_3_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ManagerPageLogin dialog = new ManagerPageLogin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ManagerPageLogin() {
		setTitle("Manager Page Login");
		setBounds(700, 100, 437, 832);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getPfPW());
		contentPanel.add(getChckbxNewCheckBox());
		contentPanel.add(getBtnNewButton_3());
		contentPanel.add(getLblNewLabel());
		contentPanel.add(getBtnNewButton_3_1());
	}
	private JPasswordField getPfPW() {
		if (pfPW == null) {
			pfPW = new JPasswordField();
			pfPW.setEchoChar('*');
			pfPW.setFont(new Font("굴림", Font.BOLD, 50));
			pfPW.setBounds(45, 249, 324, 80);
		}
		return pfPW;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("PW표시");
			chckbxNewCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxNewCheckBox.isSelected()) {
						pfPW.setEchoChar((char)0);
					}else {
						pfPW.setEchoChar('*');
					}
				}
				
				
			});
			chckbxNewCheckBox.setBounds(45, 335, 115, 23);
		}
		return chckbxNewCheckBox;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("Enter");
			btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 20));
			btnNewButton_3.setBounds(269, 375, 100, 50);
		}
		return btnNewButton_3;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(ManagerPageLogin.class.getResource("/image/Logo.png")));
			lblNewLabel.setBounds(119, 10, 180, 179);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton_3_1() {
		if (btnNewButton_3_1 == null) {
			btnNewButton_3_1 = new JButton("뒤로가기");
			btnNewButton_3_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainLogin login= new MainLogin();
					login.main(null);
				}
			});
			btnNewButton_3_1.setFont(new Font("굴림", Font.PLAIN, 20));
			btnNewButton_3_1.setBounds(0, 0, 129, 50);
		}
		return btnNewButton_3_1;
	}
}
