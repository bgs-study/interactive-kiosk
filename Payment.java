import java.awt.*;
import javax.swing.*;


class Payment extends JDialog {
	public Payment() {
		setTitle("결제 수단 선택");
		//컨테이너 ------------------------------------------------
		Container c = getContentPane();
		c.setLayout(null);
		


		//JPanner------------------------------------------------
		JPanel p_background = new JPanel();
		p_background.setLayout(null);
		p_background.setBackground(Color.white);
		p_background.setBounds(0, 0, 600, 800);
		c.add(p_background);
		
		//상단 바-------------------------------------------------
		JPanel p_north = new JPanel();
		p_north.setLayout(null);
		p_north.setBackground(new Color(255, 158, 60));
		p_north.setBounds(0, 0, 600, 80);
		p_background.add(p_north);
		
		

		//JLabel-------------------------------------------------
		
		JLabel title_label = new JLabel("결제 수단 선택");
		title_label.setBounds(10, 15, 300, 50); //위치
		title_label.setForeground(Color.white); //글자 색
		title_label.setFont(new Font("Dailog", Font.BOLD, 40)); //글자 폰트, 크기
		p_north.add(title_label);
		
		
		JLabel card_label = new JLabel("카드 결제");
		card_label.setBounds(110, 450, 300, 50); //위치
		card_label.setFont(new Font("Dailog", Font.BOLD, 20)); //글자 폰트, 크기
		p_background.add(card_label);
		
		
		JLabel cash_label = new JLabel("현금 결제");
		cash_label.setBounds(400, 450, 300, 50); //위치
		cash_label.setFont(new Font("Dailog", Font.BOLD, 20)); //글자 폰트, 크기
		p_background.add(cash_label);
		
		
		//Image---------------------------------------------------
		ImageIcon card_icon = new ImageIcon("C:\\workspce_for_os\\img\\card2.png");
		ImageIcon cash_icon = new ImageIcon("C:\\workspce_for_os\\img\\cash.png");
		
	
		JButton card_btn = new JButton(card_icon);
		JButton cash_btn = new JButton(cash_icon);
		
		card_btn.setBorder(BorderFactory.createLineBorder(Color.white));
		card_btn.setBounds(0, 250, 300, 200);
		card_btn.setBackground(Color.white);
		p_background.add(card_btn);
		
		
		cash_btn.setBorder(BorderFactory.createLineBorder(Color.white));
		cash_btn.setBounds(300, 250, 300, 200);
		cash_btn.setBackground(Color.white);
		p_background.add(cash_btn);
		
		// 프레임 크기 ----------------------------------------------
		setSize(600, 800);
		//setVisible(true);
	}
}
