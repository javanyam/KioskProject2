package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.dao.Daoorders;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class PointPage extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfTelno;

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
			JLabel lblSavePoint = new JLabel("");
			lblSavePoint.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(tfTelno.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요!");
						tfTelno.requestFocus();
					}else {
						String tel = tfTelno.getText().trim();
						Daoorders daoorders = new Daoorders(tel);
						PaymentsCard card = new PaymentsCard();
						card.setVisible(true);
						setVisible(false);
					}
				}
			});
			lblSavePoint.setIcon(new ImageIcon(PointPage.class.getResource("/image/btnSaveYes.png")));
			lblSavePoint.setBounds(207, 444, 165, 56);
			contentPanel.add(lblSavePoint);
		}
		{
			JLabel lblDont = new JLabel("");
			lblDont.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Daoorders daoorders = new Daoorders("0");
					PaymentsCard card = new PaymentsCard();
					card.setVisible(true);
					setVisible(false);
				}
			});
			lblDont.setIcon(new ImageIcon(PointPage.class.getResource("/image/btnSaveNo.png")));
			lblDont.setBounds(12, 444, 165, 56);
			contentPanel.add(lblDont);
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
		contentPanel.add(getTfTelno());
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setBounds(106, 319, 266, 36);
			tfTelno.setColumns(10);
		}
		return tfTelno;
	}
}
