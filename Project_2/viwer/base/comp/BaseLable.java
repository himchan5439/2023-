package base.comp;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class BaseLable extends JLabel{

	public BaseLable(String text) {
		// TODO Auto-generated constructor stub
		super(text);
	}
	
	public BaseLable SetFontSize(int size) {
		super.setFont(new Font("HY헤드라인M", Font.PLAIN, 60));
//		super.setFont(new Font("hy헤드라인m", Font.PLAIN, 60));

		return this;
	}

	public BaseLable setTextCenter() {
		super.setVerticalTextPosition(JLabel.CENTER);
		super.setHorizontalTextPosition(JLabel.CENTER);
		return this;
	}


	public BaseLable setTextBottomCenter() {
		// TODO Auto-generated method stub
		super.setHorizontalTextPosition(JLabel.CENTER);
		super.setVerticalTextPosition(JLabel.BOTTOM);
		return this;
	}
	
	public BaseLable setFontWhlie() {
		// TODO Auto-generated method stub
		super.setForeground(Color.WHITE);
		return this;
	}
	
	public BaseLable setLine() {
		// TODO Auto-generated method stub
		Border line = BorderFactory.createLineBorder(Color.BLACK);
		
		super.setBorder(line);
		
		return this;
	}

}
