import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;


import javax.imageio.ImageIO;
import javax.swing.*;

class Menu extends JFrame{
	public Menu() {
		setTitle("메뉴창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫으면 프로그램 종료
		
		//컨테이너 ------------------------------------------------
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//JPanner------------------------------------------------
		JPanel p_background = new JPanel();
		p_background.setLayout(new GridLayout(2,2));
		p_background.setBackground(Color.white);
		p_background.setBounds(0, 0, 600, 800);
		c.add(p_background,BorderLayout.CENTER);
		
		JPanel p_north = new JPanel();		
		p_north.setLayout(new FlowLayout());
		p_north.setBackground(new Color(255, 158, 60));
		p_north.setBounds(0, 0, 600, 80);
		c.add(p_north,BorderLayout.NORTH);
		//p_background.add(p_north);
		
		JPanel p_south = new JPanel();	
		p_south.setLayout(new FlowLayout());
		p_south.setBackground(new Color(255, 158, 60));
		p_south.setBounds(0, 0, 600, 80);
		c.add(p_south,BorderLayout.SOUTH);
		

		//JLabel-------------------------------------------------
		
		JLabel title = new JLabel("동국 킹 버거");	
		ImageIcon logo_origin = new ImageIcon("./images/img/logo_transparent.png");		
		JLabel title_logo = new JLabel(logo_origin); 
		
		p_north.add(title_logo);
		
		title.setBounds(10, 15, 300, 50); //위치
		title.setForeground(Color.white); //글자 색
		title.setFont(new Font("Dailog", Font.BOLD, 50)); //글자 폰트, 크기
		p_north.add(title);
		
		
		//주문하기, 취소하기 버튼 ----------------------------------------
		
		JButton order_btn = new JButton("주문하기");
		order_btn.setBounds(0, 665, 300, 100); //위치
		order_btn.setBackground(new Color(255, 158, 60)); //글자 색
		order_btn.setForeground(Color.white); // 배경 색
		order_btn.setBorder(BorderFactory.createLineBorder(Color.white)); //버튼 테두리 색
		order_btn.setFont(new Font("Dialog", Font.BOLD, 40)); // 글자 폰트 및 크기
		p_south.add(order_btn, BorderLayout.WEST);
		
		JButton cancel_btn = new JButton("취소하기");
		cancel_btn.setBounds(300, 665, 300, 100);//위치
		cancel_btn.setBackground(new Color(255, 158, 60));//글자 색
		cancel_btn.setForeground(Color.white); // 배경 색
		cancel_btn.setBorder(BorderFactory.createLineBorder(Color.white));//버튼 테두리 색
		cancel_btn.setFont(new Font("Dialog", Font.BOLD, 40)); // 글자 폰트 및 크기
		p_south.add(cancel_btn,BorderLayout.EAST);
		
		
		//이벤트, 결제 팝업창 다이어로그 생성-------------------------------------------
		
		order_Dialog d = new order_Dialog();
		
		order_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setVisible(true); //결제 팝업창 열고
				setVisible(true); // 메뉴 창은 닫
			}
		});
		
		cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	
		// 프레임 크기 ----------------------------------------------
		setSize(600, 800);
		setVisible(true);
					
	}//Payment
}//JFrame


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menu();
	}
}
