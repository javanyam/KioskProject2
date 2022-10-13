package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KioskMain extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			KioskMain dialog = new KioskMain();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public KioskMain() {
		setTitle("StartKiosk");
		setBounds(700, 100, 437, 832);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBackground(new Color(64, 0, 0));
			lblNewLabel_1.setBounds(0, 681, 421, 112);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblShop = new JLabel("");
			lblShop.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					ChoiceCup choiceCup=new ChoiceCup();
					choiceCup.setVisible(true);
				}
			});
			lblShop.setIcon(new ImageIcon(KioskMain.class.getResource("/image/imageShop.png")));
			lblShop.setBounds(31, 717, 163, 51);
			contentPanel.add(lblShop);
		}
		{
			JLabel lblTakeOut = new JLabel("");
			lblTakeOut.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					ChoicCupOut choiceCupout=new ChoicCupOut();
					choiceCupout.setVisible(true);
				}
			});
			lblTakeOut.setIcon(new ImageIcon(KioskMain.class.getResource("/image/imageTakeOut.png")));
			lblTakeOut.setBounds(226, 717, 163, 51);
			contentPanel.add(lblTakeOut);
			
		}
		contentPanel.add(getLblNewLabel_2());
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(KioskMain.class.getResource("/image/Kiosk AD.png")));
			lblNewLabel.setBounds(0, 0, 421, 681);
			contentPanel.add(lblNewLabel);
		}
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					ManagerPageLogin login=new ManagerPageLogin();
					login.setVisible(true);
					setVisible(false);
				}
			});
			lblNewLabel_2.setIcon(new ImageIcon(KioskMain.class.getResource("/image/Logomini.png")));
			lblNewLabel_2.setBounds(92, 287, 60, 60);
		}
		return lblNewLabel_2;
	}
}
