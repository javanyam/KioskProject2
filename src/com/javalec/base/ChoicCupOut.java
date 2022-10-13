package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChoicCupOut extends JDialog {
	private JLabel lblTumbler;
	private JLabel lblCup;
//zzz
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoicCupOut dialog = new ChoicCupOut();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ChoicCupOut() {
		setTitle("CupCategory-out");
		setBounds(700, 682, 437, 250);
		getContentPane().setLayout(null);
		getContentPane().add(getLblTumbler());
		getContentPane().add(getLblCup());

	}

	private JLabel getLblTumbler() {
		if (lblTumbler == null) {
			lblTumbler = new JLabel("New label");
			lblTumbler.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					MenuTouch menuTouch=new MenuTouch();
					menuTouch.setVisible(true);
					setVisible(false);
				}
			});
			lblTumbler.setIcon(new ImageIcon(ChoicCupOut.class.getResource("/image/Cuptb.png")));
			lblTumbler.setBounds(33, 35, 163, 144);
		}
		return lblTumbler;
	}
	private JLabel getLblCup() {
		if (lblCup == null) {
			lblCup = new JLabel("New label");
			lblCup.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					MenuTouch menuTouch=new MenuTouch();
					menuTouch.setVisible(true);
					setVisible(false);
				}
			});
			lblCup.setIcon(new ImageIcon(ChoicCupOut.class.getResource("/image/Cupout.png")));
			lblCup.setBounds(225, 35, 163, 144);
		}
		return lblCup;
	}
}
