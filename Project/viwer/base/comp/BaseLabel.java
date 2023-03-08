package base.comp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class BaseLabel extends JLabel{

	public BaseLabel(String text) {
		// TODO Auto-generated constructor stub
		super(text);
	}
	

	public BaseLabel setTextCenter() {
		// TODO Auto-generated method stub
		super.setVerticalTextPosition(JLabel.CENTER);
		super.setHorizontalTextPosition(JLabel.CENTER);
		return this;
	}


	public BaseLabel setTextWhite() {
		// TODO Auto-generated method stub
		super.setForeground(Color.WHITE);
		return this;
	}

	public BaseLabel setTextSize(int size) {
		// TODO Auto-generated method stub
		super.setFont(new Font("HY헤드라인M", Font.PLAIN, size));
		return this;
	}
	
	public BaseLabel setTextBottomCenter() {
		// TODO Auto-generated method stub
		super.setVerticalTextPosition(JLabel.BOTTOM);
		super.setHorizontalTextPosition(JLabel.CENTER);
		return this;
	}


	public BaseLabel setLine() {
		// TODO Auto-generated method stub
		Border line = BorderFactory.createLineBorder(Color.BLACK);
		super.setBorder(line);
		return this;
	}

}
