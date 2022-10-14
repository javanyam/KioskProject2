package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.dao.DaoMenu;
import com.javalec.dto.DtoMenu;
import com.javalec.style.Style;
import com.javalec.util.DBConnect;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class NowPayments extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2_1;
	private JLabel lblTotalPrice;
	private JLabel lblImage;
	private JLabel lblNewLabel_4;
	private JLabel lblCount;
	private JLabel lblNewLabel_5;
	private JLabel lblName;
	private JLabel lblPrice;
	private JLabel lblPlus;
	private JLabel lblMinus;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NowPayments dialog = new NowPayments();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NowPayments() {
		setTitle("NowPayments");
		setBounds(718, 282, 401, 550);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getLblNewLabel());
		contentPanel.add(getLblNewLabel_1());
		contentPanel.add(getLblNewLabel_2_1());
		contentPanel.add(getLblTotalPrice());
		contentPanel.add(getLblImage());
		contentPanel.add(getLblNewLabel_4());
		contentPanel.add(getLblCount());
		contentPanel.add(getLblName());
		contentPanel.add(getLblPrice());
		contentPanel.add(getLblPlus());
		contentPanel.add(getLblMinus());
		contentPanel.add(getLblNewLabel_5());
		
		selectInfo();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PointPage point = new PointPage();
					point.setVisible(true);
					setVisible(false);
				}
			});
			lblNewLabel.setIcon(new ImageIcon(NowPayments.class.getResource("/image/btnNowOrder.png")));
			lblNewLabel.setBounds(12, 413, 360, 56);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(NowPayments.class.getResource("/image/CoffeeBackGround.png")));
			lblNewLabel_1.setBounds(0, 365, 385, 146);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("");
			lblNewLabel_2_1.setIcon(new ImageIcon(NowPayments.class.getResource("/image/line.png")));
			lblNewLabel_2_1.setBounds(16, 326, 356, 5);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblTotalPrice() {
		if (lblTotalPrice == null) {
			lblTotalPrice = new JLabel();
			lblTotalPrice.setHorizontalAlignment(SwingConstants.CENTER);
			lblTotalPrice.setFont(new Font("굴림", Font.BOLD, 36));
			lblTotalPrice.setBounds(48, 265, 295, 62);
		}
		return lblTotalPrice;
	}
	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			lblImage.setBounds(12, 47, 179, 179);
		}
		return lblImage;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					insertCartAction();
				}
			});
			lblNewLabel_4.setIcon(new ImageIcon(NowPayments.class.getResource("/image/btnPutIn.png")));
			lblNewLabel_4.setBounds(203, 192, 165, 56);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblCount() {
		if (lblCount == null) {
			lblCount = new JLabel("1");
			lblCount.setHorizontalAlignment(SwingConstants.CENTER);
			lblCount.setFont(new Font("굴림", Font.PLAIN, 16));
			lblCount.setBounds(256, 153, 57, 15);
		}
		return lblCount;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon(NowPayments.class.getResource("/image/PaymentsQuentity.png")));
			lblNewLabel_5.setBounds(223, 110, 123, 69);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("");
			lblName.setHorizontalAlignment(SwingConstants.CENTER);
			lblName.setFont(new Font("굴림", Font.BOLD, 25));
			lblName.setBounds(223, 41, 140, 24);
		}
		return lblName;
	}
	private JLabel getLblPrice() {
		if (lblPrice == null) {
			lblPrice = new JLabel("");
			lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice.setFont(new Font("굴림", Font.PLAIN, 20));
			lblPrice.setBounds(248, 75, 83, 25);
		}
		return lblPrice;
	}
	private JLabel getLblPlus() {
		if (lblPlus == null) {
			lblPlus = new JLabel("");
			lblPlus.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					lblCount.setText(Integer.toString(Integer.parseInt(lblCount.getText())+1));
					changeTotalPrice();
				}
			});
			lblPlus.setBounds(312, 145, 34, 37);
		}
		return lblPlus;
	}
	private JLabel getLblMinus() {
		if (lblMinus == null) {
			lblMinus = new JLabel("");
			lblMinus.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					while(Integer.parseInt(lblCount.getText()) > 1) {
					lblCount.setText(Integer.toString(Integer.parseInt(lblCount.getText())-1));
					changeTotalPrice();
					}
				}
			});
			lblMinus.setBounds(224, 145, 34, 37);
		}
		return lblMinus;
	}
	
	// M
	Style style = new Style();
	
	private void selectInfo() {
		DaoMenu dao = new DaoMenu();
		DtoMenu dto = dao.selectMenuInfo();
		
		String filePath = Integer.toString(DBConnect.filename);
		
		lblName.setText(dto.getMenuname());
		lblPrice.setText(Integer.toString(dto.getMenuprice()));
		
		lblImage.setIcon(style.imageSize179(filePath));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblTotalPrice.setText("총 " + dto.getMenuprice() + "원");
		
		File file = new File(filePath);
		file.delete();

	}
	
	private void changeTotalPrice() {
		lblTotalPrice.setText("총 " + Integer.parseInt(lblPrice.getText())*Integer.parseInt(lblCount.getText()) + "원");
	}
	
	
	private void insertCartAction( ) {
	
		DaoMenu dao = new DaoMenu();
		DtoMenu dto = dao.selectMenuInfo();
		
		String filePath = Integer.toString(DBConnect.filename);
		
		
		
		if(MenuTouch.lblCartName0.getText().length()==0) {
			MenuTouch.lblCart0.setIcon(new ImageIcon(filePath));
			MenuTouch.lblCartName0.setText(dto.getMenuname());
			MenuTouch.lblCartPrice0.setText(Integer.toString(dto.getMenuprice())+"원");
			MenuTouch.a.add(dto.getMenuname());
			
			
		}else if(MenuTouch.lblCartName1.getText().length()==0){
			MenuTouch.lblCart1.setIcon(new ImageIcon(filePath));
			MenuTouch.lblCartName1.setText(dto.getMenuname());
			MenuTouch.lblCartPrice1.setText(Integer.toString(dto.getMenuprice())+"원");
			MenuTouch.a.add(dto.getMenuname());
			
		}else if(MenuTouch.lblCartName2.getText().equals("")) {
			MenuTouch.lblCart2.setIcon(new ImageIcon(filePath));
			MenuTouch.lblCartName2.setText(dto.getMenuname());
			MenuTouch.lblCartPrice2.setText(Integer.toString(dto.getMenuprice())+"원");
			MenuTouch.a.add(dto.getMenuname());
			
		}else if(!MenuTouch.lblCartName2.getText().equals("")) {
			
			JOptionPane.showMessageDialog(null, "장바구니에는 3개까지만 담을 수 있습니다.");
			
		}
		
		MenuTouch menuTouch = new MenuTouch();
		File file = new File(filePath);
		file.delete();
		
		menuTouch.setVisible(true);
		System.out.println(MenuTouch.a);
	}
		
		
		//------------------------
		
		
		
		
		
//		lblName.setText(dto.getMenuname());
//		lblPrice.setText(Integer.toString(dto.getMenuprice()));
//		
//		lblImage.setIcon(new ImageIcon(filePath));
//		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
//		
//		lblTotalPrice.setText("총 " + dto.getMenuprice() + "원");
//		
//		File file = new File(filePath);
//		file.delete();
		
	
} // End
