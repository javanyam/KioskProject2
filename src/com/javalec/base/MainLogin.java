package com.javalec.base;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import com.javalec.dao.Daoemployee;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class MainLogin {

	private JFrame frmLoginPage;
	private JTextField tfInPutID;
	private JPasswordField pfInPutPW;
	private JCheckBox ckbShowPW;
	private JButton btnLogin;
	private JButton btnFindPW;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLogin window = new MainLogin();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPage = new JFrame();
		frmLoginPage.setResizable(false);
		frmLoginPage.setTitle("Login Page");
		frmLoginPage.setBounds(700, 100, 437, 832);
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginPage.getContentPane().setLayout(null);
		frmLoginPage.getContentPane().add(getTfInPutID());
		frmLoginPage.getContentPane().add(getPfInPutPW());
		frmLoginPage.getContentPane().add(getCkbShowPW());
		frmLoginPage.getContentPane().add(getBtnLogin());
		frmLoginPage.getContentPane().add(getBtnFindPW());
		frmLoginPage.getContentPane().add(getLblNewLabel());
		frmLoginPage.getContentPane().add(getLblNewLabel_1());
		frmLoginPage.getContentPane().add(getLblNewLabel_2());
		frmLoginPage.setUndecorated(true);
	}
	private JTextField getTfInPutID() {
		if (tfInPutID == null) {
			tfInPutID = new JTextField();
			tfInPutID.setBounds(139, 567, 164, 31);
			tfInPutID.setColumns(10);
		}
		return tfInPutID;
	}
	private JPasswordField getPfInPutPW() {
		if (pfInPutPW == null) {
			pfInPutPW = new JPasswordField();
			pfInPutPW.setBounds(139, 614, 164, 31);
		}
		return pfInPutPW;
	}
	private JCheckBox getCkbShowPW() {
		if (ckbShowPW == null) {
			ckbShowPW = new JCheckBox("PW??????");
			ckbShowPW.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// pfPW??? ??????????????? ??????????????? ?????????
					seePW();
				}
			});
			ckbShowPW.setBounds(122, 651, 87, 23);
			ckbShowPW.setBackground(Color.decode("#D8ECFE"));
		}
		return ckbShowPW;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("?????????");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					loginAction();
					// ????????? ????????? ????????????(??????????????? ?????? ??? ???????????? ??????,DB??? ????????? ?????? ????????? ????????? ??????????????????,??? ?????? ???????????????)
				}
			});
			btnLogin.setBounds(102, 706, 200, 48);
		}
		return btnLogin;
	}
	private JButton getBtnFindPW() {
		if (btnFindPW == null) {
			btnFindPW = new JButton("PW??????");
			btnFindPW.setBounds(211, 651, 97, 23);
			btnFindPW.setBackground(Color.decode("#D8ECFE"));
		}
		return btnFindPW;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(MainLogin.class.getResource("/image/ShopName.png")));
			lblNewLabel.setBounds(121, 34, 177, 42);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(MainLogin.class.getResource("/image/loginimage.png")));
			lblNewLabel_1.setBounds(0, 98, 421, 598);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(MainLogin.class.getResource("/image/underCofee.png")));
			lblNewLabel_2.setBounds(0, 262, 462, 531);
		}
		return lblNewLabel_2;
	}
	//function
	private void seePW() {
		if (ckbShowPW.isSelected()) {
			pfInPutPW.setEchoChar((char) 0);
		} else {
			pfInPutPW.setEchoChar('*');
		}

	}

	private void loginAction() {//????????? ???????????? ???????????? ????????? ??????
		int check1 = 0;
		int check2 = 0;
		
		String id = tfInPutID.getText();
		id = id.replace(" ", "");// ????????? ?????? ?????? ??? ????????????
		
		char[] pass = pfInPutPW.getPassword();
		String pw = new String(pass);
		pw = pw.replace(" ", "");// ????????? ?????? ?????? ??? ????????????

		
		Daoemployee dao = new Daoemployee(id, pw);
		check1 = dao.employeecheck1();
		if (check1 == 1) {
			JOptionPane.showInternalMessageDialog(null, "????????? ???????????????.");
		} else {
			check2 = dao.employeecheck2();
			if(check2==1) {
					JOptionPane.showMessageDialog(null, id+"??? ???????????????.");
					frmLoginPage.setVisible(false);
					KioskMain kioskMain=new KioskMain();
					kioskMain.setVisible(true);
					
			}
			if(check2==0){
				JOptionPane.showMessageDialog(null, "???????????? ??????????????? ??????????????????.");
			}
		}
	}
		
}//END
