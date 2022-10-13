package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class PointPage extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PointPage dialog = new PointPage();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PointPage() {
		setTitle("Point Page");
		setBounds(718, 382, 401, 550);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					ReceiptPage receiptpage=new ReceiptPage();
					receiptpage.setVisible(true);
					setVisible(false);
				}
			});
			lblNewLabel.setIcon(new ImageIcon(PointPage.class.getResource("/image/btnReceipt.png")));
			lblNewLabel.setBounds(12, 445, 360, 56);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(PointPage.class.getResource("/image/btnSaveYes.png")));
			lblNewLabel_1.setBounds(207, 379, 165, 56);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(PointPage.class.getResource("/image/btnSaveNo.png")));
			lblNewLabel_1.setBounds(12, 379, 165, 56);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(PointPage.class.getResource("/image/CoffeeBackGround.png")));
			lblNewLabel_1.setBounds(0, 365, 385, 146);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(PointPage.class.getResource("/image/lastSource.png")));
			lblNewLabel_2.setBounds(11, 0, 361, 309);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("전화번호 :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
			lblNewLabel_2.setBounds(-29, 309, 165, 62);
			contentPanel.add(lblNewLabel_2);
		}
		contentPanel.add(getTextField());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(106, 319, 266, 36);
			textField.setColumns(10);
		}
		return textField;
	}
}
