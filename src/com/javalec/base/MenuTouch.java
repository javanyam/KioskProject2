package com.javalec.base;

import java.awt.BorderLayout;
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
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MenuTouch extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblAllDel;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblTotalPrice;
	private JLabel lblNewLabel;
	private JLabel lblMenu0;
	private JLabel lblMenu1;
	private JLabel lblMenu2;
	private JLabel lblMenu3;
	private JLabel lblMenu4;
	private JLabel lblMenu5;
	private JLabel lblMenu6;
	private JLabel lblMenu7;
	private JLabel lblMenu8;
	private JLabel lblName0;
	private JLabel lblName1;
	private JLabel lblName2;
	private JLabel lblName3;
	private JLabel lblName4;
	private JLabel lblName5;
	private JLabel lblName6;
	private JLabel lblName7;
	private JLabel lblName8;
	private JLabel lblPrice0;
	private JLabel lblPrice1;
	private JLabel lblPrice2;
	private JLabel lblPrice3;
	private JLabel lblPrice4;
	private JLabel lblPrice5;
	private JLabel lblPrice6;
	private JLabel lblPrice7;
	private JLabel lblPrice8;
	static JLabel lblOrderbtn;
	private JPanel panel1;
	private JLabel lblBeverage;
	private JLabel lblDecaffeinated;
	private JLabel lblJuice;
	private JLabel lblNewLabel_4;
	private JLabel lblNew_1;
	private JLabel lblNew_1_1;
	private JLabel lblCoffee_1;
	
	DaoMenu dao = new DaoMenu();
	
	ArrayList<String> menuid = new ArrayList<String>();
	
	JLabel[] menuLabel = {new JLabel("1"),new JLabel("2"),new JLabel("3"),new JLabel("4"),new JLabel("5"),new JLabel("6"),new JLabel("7"),new JLabel("8"),new JLabel("9") };
	public static JLabel lblCart0;
	public static JLabel lblCart1;
	public static JLabel lblCart2;
	public static JLabel lblCartPrice0;
	public static JLabel lblCartPrice1;
	public static JLabel lblCartPrice2;
	public static JLabel lblCartName0;
	public static JLabel lblCartName1;
	public static JLabel lblCartName2;
	public static ArrayList<String> a = new ArrayList<String>();
	
//	ArrayList<JLabel> label = new ArrayList<JLabel>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MenuTouch dialog = new MenuTouch();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MenuTouch() {
		bringMenuname();
//		insertImage();
		setTitle("Menu Touch");
		setBounds(700, 100, 437, 832);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getLblNewLabel_2());
		contentPanel.add(getLblAllDel());
		contentPanel.add(getLblNewLabel_5());
		contentPanel.add(getLblNewLabel_6());
		contentPanel.add(getLblTotalPrice());
		contentPanel.add(getLblMenu0());
		contentPanel.add(getLblMenu1());
		contentPanel.add(getLblMenu2());
		contentPanel.add(getLblMenu3());
		contentPanel.add(getLblMenu4());
		contentPanel.add(getLblMenu5());
		contentPanel.add(getLblMenu6());
		contentPanel.add(getLblMenu7());
		contentPanel.add(getLblMenu8());
		contentPanel.add(getLblName0());
		contentPanel.add(getLblName1());
		contentPanel.add(getLblName2());
		contentPanel.add(getLblName3());
		contentPanel.add(getLblName4());
		contentPanel.add(getLblName5());
		contentPanel.add(getLblName6());
		contentPanel.add(getLblName7());
		contentPanel.add(getLblName8());
		contentPanel.add(getLblPrice0());
		contentPanel.add(getLblPrice1());
		contentPanel.add(getLblPrice2());
		contentPanel.add(getLblPrice3());
		contentPanel.add(getLblPrice4());
		contentPanel.add(getLblPrice5());
		contentPanel.add(getLblPrice6());
		contentPanel.add(getLblPrice7());
		contentPanel.add(getLblPrice8());
		contentPanel.add(getLblOrderbtn());
		contentPanel.add(getPanel1());
		contentPanel.add(getLblBeverage());
		contentPanel.add(getLblJuice());
		contentPanel.add(getLblNewLabel_4());
		contentPanel.add(getLblNewLabel());
		contentPanel.add(getLblNew_1());
		contentPanel.add(getLblNew_1_1());
		contentPanel.add(getLblDecaffeinated());
		contentPanel.add(getLblNewLabel_1());
		contentPanel.add(getLblCoffee_1());
		contentPanel.add(getLblCart0());
		contentPanel.add(getLblCart1());
		contentPanel.add(getLblCart2());
		contentPanel.add(getLblCartName0());
		contentPanel.add(getLblCartPrice0());
		contentPanel.add(getLblCartPrice1());
		contentPanel.add(getLblCartName1());
		contentPanel.add(getLblCartPrice2());
		contentPanel.add(getLblCartName2());
//		bringMenuname();
		insertImage();
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(MenuTouch.class.getResource("/image/MenuAD.png")));
			lblNewLabel_1.setBounds(0, 0, 421, 113);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(MenuTouch.class.getResource("/image/IsertProduct.png")));
			lblNewLabel_2.setBounds(229, 167, 54, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblAllDel() {
		if (lblAllDel == null) {
			lblAllDel = new JLabel("");
			lblAllDel.setIcon(new ImageIcon(MenuTouch.class.getResource("/image/AllDel.png")));
			lblAllDel.setBounds(334, 710, 60, 15);
		}
		return lblAllDel;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon(MenuTouch.class.getResource("/image/imageNew.png")));
			lblNewLabel_5.setBounds(12, 179, 91, 37);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel(">");
			lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_6.setBounds(287, 169, 13, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblTotalPrice() {
		if (lblTotalPrice == null) {
			lblTotalPrice = new JLabel("총 0 원");
			lblTotalPrice.setHorizontalAlignment(SwingConstants.CENTER);
			lblTotalPrice.setFont(new Font("굴림", Font.BOLD, 12));
			lblTotalPrice.setBounds(306, 735, 115, 27);
		}
		return lblTotalPrice;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(MenuTouch.class.getResource("/image/imageMenu.png")));
			lblNewLabel.setBounds(-5, 111, 433, 44);
		}
		return lblNewLabel;
	}
	private JLabel getLblMenu0() {
		if (lblMenu0 == null) {
			lblMenu0 = new JLabel("");
			lblMenu0.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DaoMenu.selectmenuid = menuid.get(0);
					NowPayments nowPayments=new NowPayments();
					nowPayments.setVisible(true);
				}
			});
			lblMenu0.setBounds(12, 265, 89, 89);
		}
		return lblMenu0;
	}
	private JLabel getLblMenu1() {
		if (lblMenu1 == null) {
			lblMenu1 = new JLabel("");
			lblMenu1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DaoMenu.selectmenuid = menuid.get(1);
					NowPayments nowPayments=new NowPayments();
					nowPayments.setVisible(true);
				}
			});
			lblMenu1.setBounds(109, 265, 89, 89);
		}
		return lblMenu1;
	}
	private JLabel getLblMenu2() {
		if (lblMenu2 == null) {
			lblMenu2 = new JLabel("");
			lblMenu2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DaoMenu.selectmenuid = menuid.get(2);
					NowPayments nowPayments=new NowPayments();
					nowPayments.setVisible(true);
				}
			});
			lblMenu2.setBounds(205, 265, 89, 89);
		}
		return lblMenu2;
	}
	private JLabel getLblMenu3() {
		if (lblMenu3 == null) {
			lblMenu3 = new JLabel("");
			lblMenu3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DaoMenu.selectmenuid = menuid.get(3);
					NowPayments nowPayments=new NowPayments();
					nowPayments.setVisible(true);
				}
			});
			lblMenu3.setBounds(12, 431, 89, 89);
		}
		return lblMenu3;
	}
	private JLabel getLblMenu4() {
		if (lblMenu4 == null) {
			lblMenu4 = new JLabel("");
			lblMenu4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DaoMenu.selectmenuid = menuid.get(4);
					NowPayments nowPayments=new NowPayments();
					nowPayments.setVisible(true);
				}
			});
			lblMenu4.setBounds(109, 431, 89, 89);
		}
		return lblMenu4;
	}
	private JLabel getLblMenu5() {
		if (lblMenu5 == null) {
			lblMenu5 = new JLabel("");
			lblMenu5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DaoMenu.selectmenuid = menuid.get(5);
					NowPayments nowPayments=new NowPayments();
					nowPayments.setVisible(true);
				}
			});
			lblMenu5.setBounds(205, 431, 89, 89);
		}
		return lblMenu5;
	}
	private JLabel getLblMenu6() {
		if (lblMenu6 == null) {
			lblMenu6 = new JLabel("");
			lblMenu6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DaoMenu.selectmenuid = menuid.get(6);
					NowPayments nowPayments=new NowPayments();
					nowPayments.setVisible(true);
				}
			});
			lblMenu6.setBounds(12, 590, 89, 89);
		}
		return lblMenu6;
	}
	private JLabel getLblMenu7() {
		if (lblMenu7 == null) {
			lblMenu7 = new JLabel("");
			lblMenu7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DaoMenu.selectmenuid = menuid.get(7);
					NowPayments nowPayments=new NowPayments();
					nowPayments.setVisible(true);
				}
			});
			lblMenu7.setBounds(109, 590, 89, 89);
		}
		return lblMenu7;
	}
	private JLabel getLblMenu8() {
		if (lblMenu8 == null) {
			lblMenu8 = new JLabel("");
			lblMenu8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DaoMenu.selectmenuid = menuid.get(8);
					NowPayments nowPayments=new NowPayments();
					nowPayments.setVisible(true);
				}
			});
			lblMenu8.setBounds(205, 590, 89, 89);
		}
		return lblMenu8;
	}
	private JLabel getLblName0() {
		if (lblName0 == null) {
			lblName0 = new JLabel("에소프레소");
			lblName0.setFont(new Font("굴림", Font.BOLD, 14));
			lblName0.setHorizontalAlignment(SwingConstants.CENTER);
			lblName0.setBounds(13, 365, 83, 15);
		}
		return lblName0;
	}
	private JLabel getLblName1() {
		if (lblName1 == null) {
			lblName1 = new JLabel("아메리카노");
			lblName1.setHorizontalAlignment(SwingConstants.CENTER);
			lblName1.setFont(new Font("굴림", Font.BOLD, 14));
			lblName1.setBounds(111, 365, 83, 15);
		}
		return lblName1;
	}
	private JLabel getLblName2() {
		if (lblName2 == null) {
			lblName2 = new JLabel("카페라떼");
			lblName2.setHorizontalAlignment(SwingConstants.CENTER);
			lblName2.setFont(new Font("굴림", Font.BOLD, 14));
			lblName2.setBounds(210, 364, 83, 15);
		}
		return lblName2;
	}
	private JLabel getLblName3() {
		if (lblName3 == null) {
			lblName3 = new JLabel("카푸치노");
			lblName3.setHorizontalAlignment(SwingConstants.CENTER);
			lblName3.setFont(new Font("굴림", Font.BOLD, 14));
			lblName3.setBounds(15, 527, 83, 15);
		}
		return lblName3;
	}
	private JLabel getLblName4() {
		if (lblName4 == null) {
			lblName4 = new JLabel("카페모카");
			lblName4.setHorizontalAlignment(SwingConstants.CENTER);
			lblName4.setFont(new Font("굴림", Font.BOLD, 14));
			lblName4.setBounds(113, 527, 83, 15);
		}
		return lblName4;
	}
	private JLabel getLblName5() {
		if (lblName5 == null) {
			lblName5 = new JLabel("카라멜아끼아또");
			lblName5.setHorizontalAlignment(SwingConstants.CENTER);
			lblName5.setFont(new Font("굴림", Font.BOLD, 14));
			lblName5.setBounds(193, 527, 115, 15);
		}
		return lblName5;
	}
	private JLabel getLblName6() {
		if (lblName6 == null) {
			lblName6 = new JLabel("비엔나 커피");
			lblName6.setHorizontalAlignment(SwingConstants.CENTER);
			lblName6.setFont(new Font("굴림", Font.BOLD, 14));
			lblName6.setBounds(16, 689, 83, 15);
		}
		return lblName6;
	}
	private JLabel getLblName7() {
		if (lblName7 == null) {
			lblName7 = new JLabel("민트초코");
			lblName7.setHorizontalAlignment(SwingConstants.CENTER);
			lblName7.setFont(new Font("굴림", Font.BOLD, 14));
			lblName7.setBounds(112, 688, 83, 15);
		}
		return lblName7;
	}
	private JLabel getLblName8() {
		if (lblName8 == null) {
			lblName8 = new JLabel("맥심커피");
			lblName8.setHorizontalAlignment(SwingConstants.CENTER);
			lblName8.setFont(new Font("굴림", Font.BOLD, 14));
			lblName8.setBounds(211, 689, 83, 15);
		}
		return lblName8;
	}
	private JLabel getLblPrice0() {
		if (lblPrice0 == null) {
			lblPrice0 = new JLabel("4000원");
			lblPrice0.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice0.setBounds(12, 387, 83, 15);
		}
		return lblPrice0;
	}
	private JLabel getLblPrice1() {
		if (lblPrice1 == null) {
			lblPrice1 = new JLabel("4500원");
			lblPrice1.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice1.setBounds(115, 387, 83, 15);
		}
		return lblPrice1;
	}
	private JLabel getLblPrice2() {
		if (lblPrice2 == null) {
			lblPrice2 = new JLabel("5500원");
			lblPrice2.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice2.setBounds(211, 387, 83, 15);
		}
		return lblPrice2;
	}
	private JLabel getLblPrice3() {
		if (lblPrice3 == null) {
			lblPrice3 = new JLabel("5000원");
			lblPrice3.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice3.setBounds(12, 552, 83, 15);
		}
		return lblPrice3;
	}
	private JLabel getLblPrice4() {
		if (lblPrice4 == null) {
			lblPrice4 = new JLabel("6500원");
			lblPrice4.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice4.setBounds(115, 552, 83, 15);
		}
		return lblPrice4;
	}
	private JLabel getLblPrice5() {
		if (lblPrice5 == null) {
			lblPrice5 = new JLabel("7000원");
			lblPrice5.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice5.setBounds(211, 552, 83, 15);
		}
		return lblPrice5;
	}
	private JLabel getLblPrice6() {
		if (lblPrice6 == null) {
			lblPrice6 = new JLabel("7000원");
			lblPrice6.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice6.setBounds(12, 713, 83, 15);
		}
		return lblPrice6;
	}
	private JLabel getLblPrice7() {
		if (lblPrice7 == null) {
			lblPrice7 = new JLabel("5000원");
			lblPrice7.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice7.setBounds(113, 714, 83, 15);
		}
		return lblPrice7;
	}
	private JLabel getLblPrice8() {
		if (lblPrice8 == null) {
			lblPrice8 = new JLabel("3000원");
			lblPrice8.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice8.setBounds(211, 713, 83, 15);
		}
		return lblPrice8;
	}
	private JLabel getLblOrderbtn() {
		if (lblOrderbtn == null) {
			lblOrderbtn = new JLabel("주문하기");
			lblOrderbtn.setVerticalAlignment(SwingConstants.BOTTOM);
			lblOrderbtn.setFont(new Font("굴림", Font.BOLD, 24));
			lblOrderbtn.setForeground(Color.WHITE);
			lblOrderbtn.setHorizontalAlignment(SwingConstants.CENTER);
			lblOrderbtn.setBounds(306, 735, 115, 58);
			lblOrderbtn.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
			lblOrderbtn.setBackground(Color.decode("#979797"));
		}
		return lblOrderbtn;
	}
	private JPanel getPanel1() {
		if (panel1 == null) {
			panel1 = new JPanel();
			panel1.setBackground(Color.WHITE);
			panel1.setBounds(0, 184, 306, 551);
		}
		return panel1;
	}
	private JLabel getLblBeverage() {
		if (lblBeverage == null) {
			lblBeverage = new JLabel("");
			lblBeverage.setBounds(178, 111, 57, 46);
		}
		return lblBeverage;
	}
	private JLabel getLblDecaffeinated() {
		if (lblDecaffeinated == null) {
			lblDecaffeinated = new JLabel("");
			lblDecaffeinated.setBounds(267, 111, 57, 46);
		}
		return lblDecaffeinated;
	}
	private JLabel getLblJuice() {
		if (lblJuice == null) {
			lblJuice = new JLabel("");
			lblJuice.setBounds(337, 111, 57, 44);
		}
		return lblJuice;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setBounds(10, 111, 39, 44);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNew_1() {
		if (lblNew_1 == null) {
			lblNew_1 = new JLabel("");
			lblNew_1.setBounds(41, 111, 46, 44);
		}
		return lblNew_1;
	}
	private JLabel getLblNew_1_1() {
		if (lblNew_1_1 == null) {
			lblNew_1_1 = new JLabel("");
			lblNew_1_1.setBounds(109, 111, 46, 44);
		}
		return lblNew_1_1;
	}
	private JLabel getLblCoffee_1() {
		if (lblCoffee_1 == null) {
			lblCoffee_1 = new JLabel("");
			lblCoffee_1.setBounds(44, 111, 57, 44);
		}
		return lblCoffee_1;
	}
	// M
	
	private void bringMenuname() {
		menuid = dao.selectMenu();
	}
	
	private void insertImage() {

//		for(int i = 0; i < menuid.size(); i++) {
//			DaoMenu.selectmenuid = menuid.get(i);
//			DtoMenu dto = dao.selectMenuInfo();
//			
//			String filePath = Integer.toString(DBConnect.filename);
//			
//			System.out.println(menuLabel.length);
//			
//			menuLabel[i].setIcon(new ImageIcon(filePath));
//			menuLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
//			
//			File file = new File(filePath);
//			file.delete();
//		}
		Style style = new Style();
			for(int i = 0; i < 9; i++) {
			if(i == 0) {
				DaoMenu.selectmenuid = menuid.get(i);
				DtoMenu dto = dao.selectMenuInfo();
				
				String filePath = Integer.toString(DBConnect.filename);
				
				lblMenu0.setIcon(style.imageSize89(filePath));
				lblMenu0.setHorizontalAlignment(SwingConstants.CENTER);
				lblName0.setText(dto.getMenuname());
				lblPrice0.setText(Integer.toString(dto.getMenuprice()));
				
				File file = new File(filePath);
				file.delete();
			}else if(i == 1) {
				DaoMenu.selectmenuid = menuid.get(i);
				DtoMenu dto = dao.selectMenuInfo();
				
				String filePath = Integer.toString(DBConnect.filename);
				
				lblMenu1.setIcon(style.imageSize89(filePath));
				lblMenu1.setHorizontalAlignment(SwingConstants.CENTER);
				lblName1.setText(dto.getMenuname());
				lblPrice1.setText(Integer.toString(dto.getMenuprice()));
				
				File file = new File(filePath);
				file.delete();
			}else if(i == 2){
				DaoMenu.selectmenuid = menuid.get(i);
				DtoMenu dto = dao.selectMenuInfo();
				
				String filePath = Integer.toString(DBConnect.filename);
				
				lblMenu2.setIcon(style.imageSize89(filePath));
				lblMenu2.setHorizontalAlignment(SwingConstants.CENTER);
				lblName2.setText(dto.getMenuname());
				lblPrice2.setText(Integer.toString(dto.getMenuprice()));
				
				File file = new File(filePath);
				file.delete();
			}else if(i == 3){
				DaoMenu.selectmenuid = menuid.get(i);
				DtoMenu dto = dao.selectMenuInfo();
				
				String filePath = Integer.toString(DBConnect.filename);
				
				lblMenu3.setIcon(style.imageSize89(filePath));
				lblMenu3.setHorizontalAlignment(SwingConstants.CENTER);
				lblName3.setText(dto.getMenuname());
				lblPrice3.setText(Integer.toString(dto.getMenuprice()));
				
				File file = new File(filePath);
				file.delete();
			}else if(i == 4){
				DaoMenu.selectmenuid = menuid.get(i);
				DtoMenu dto = dao.selectMenuInfo();
				
				String filePath = Integer.toString(DBConnect.filename);
				
				lblMenu4.setIcon(style.imageSize89(filePath));
				lblMenu4.setHorizontalAlignment(SwingConstants.CENTER);
				lblName4.setText(dto.getMenuname());
				lblPrice4.setText(Integer.toString(dto.getMenuprice()));
				
				File file = new File(filePath);
				file.delete();
			}else if(i == 5){
				DaoMenu.selectmenuid = menuid.get(i);
				DtoMenu dto = dao.selectMenuInfo();
				
				String filePath = Integer.toString(DBConnect.filename);
				
				lblMenu5.setIcon(style.imageSize89(filePath));
				lblMenu5.setHorizontalAlignment(SwingConstants.CENTER);
				lblName5.setText(dto.getMenuname());
				lblPrice5.setText(Integer.toString(dto.getMenuprice()));
				
				File file = new File(filePath);
				file.delete();
			}else if(i == 6){
				DaoMenu.selectmenuid = menuid.get(i);
				DtoMenu dto = dao.selectMenuInfo();
				
				String filePath = Integer.toString(DBConnect.filename);
				
				lblMenu6.setIcon(style.imageSize89(filePath));
				lblMenu6.setHorizontalAlignment(SwingConstants.CENTER);
				lblName6.setText(dto.getMenuname());
				lblPrice6.setText(Integer.toString(dto.getMenuprice()));
				
				File file = new File(filePath);
				file.delete();
			}else if(i == 7){
				DaoMenu.selectmenuid = menuid.get(i);
				DtoMenu dto = dao.selectMenuInfo();
				
				String filePath = Integer.toString(DBConnect.filename);
				
				lblMenu7.setIcon(style.imageSize89(filePath));
				lblMenu7.setHorizontalAlignment(SwingConstants.CENTER);
				lblName7.setText(dto.getMenuname());
				lblPrice7.setText(Integer.toString(dto.getMenuprice()));
				
				File file = new File(filePath);
				file.delete();
			}else if(i == 8){
				DaoMenu.selectmenuid = menuid.get(i);
				DtoMenu dto = dao.selectMenuInfo();
				
				String filePath = Integer.toString(DBConnect.filename);
				
				lblMenu8.setIcon(style.imageSize89(filePath));
				lblMenu8.setHorizontalAlignment(SwingConstants.CENTER);
				lblName8.setText(dto.getMenuname());
				lblPrice8.setText(Integer.toString(dto.getMenuprice()));
				
				File file = new File(filePath);
				file.delete();
			}
		}
	}
	private JLabel getLblCart0() {
		if (lblCart0 == null) {
			lblCart0 = new JLabel("");
			lblCart0.setBounds(319, 169, 89, 89);
		}
		return lblCart0;
	}
	private JLabel getLblCart1() {
		if (lblCart1 == null) {
			lblCart1 = new JLabel("");
			lblCart1.setBounds(319, 313, 89, 89);
		}
		return lblCart1;
	}
	private JLabel getLblCart2() {
		if (lblCart2 == null) {
			lblCart2 = new JLabel("");
			lblCart2.setBounds(320, 463, 89, 89);
		}
		return lblCart2;
	}
	private JLabel getLblCartName0() {
		if (lblCartName0 == null) {
			lblCartName0 = new JLabel("");
			lblCartName0.setBounds(334, 265, 61, 16);
		}
		return lblCartName0;
	}
	private JLabel getLblCartPrice0() {
		if (lblCartPrice0 == null) {
			lblCartPrice0 = new JLabel("");
			lblCartPrice0.setBounds(334, 285, 61, 16);
		}
		return lblCartPrice0;
	}
	private JLabel getLblCartPrice1() {
		if (lblCartPrice1 == null) {
			lblCartPrice1 = new JLabel("");
			lblCartPrice1.setBounds(333, 435, 61, 16);
		}
		return lblCartPrice1;
	}
	private JLabel getLblCartName1() {
		if (lblCartName1 == null) {
			lblCartName1 = new JLabel("");
			lblCartName1.setBounds(333, 415, 61, 16);
		}
		return lblCartName1;
	}
	private JLabel getLblCartPrice2() {
		if (lblCartPrice2 == null) {
			lblCartPrice2 = new JLabel("");
			lblCartPrice2.setBounds(333, 581, 61, 16);
		}
		return lblCartPrice2;
	}
	private JLabel getLblCartName2() {
		if (lblCartName2 == null) {
			lblCartName2 = new JLabel("");
			lblCartName2.setBounds(333, 561, 61, 16);
		}
		return lblCartName2;
	}
} // End
