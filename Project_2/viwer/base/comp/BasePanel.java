package base.comp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class BasePanel extends JPanel{

	public BasePanel center;
	public BasePanel top;
	public BasePanel bottom;
	public BasePanel left;
	public BasePanel right;

	public BasePanel() {
		super(new BorderLayout());
	}
	
	public BasePanel addChild() {
		center = new BasePanel();
		top = new BasePanel();
		bottom = new BasePanel();
		left = new BasePanel();
		right = new BasePanel();
		
		super.add(center, BorderLayout.CENTER);
		super.add(top, BorderLayout.NORTH);
		super.add(bottom, BorderLayout.SOUTH);
		super.add(left, BorderLayout.WEST);
		super.add(right, BorderLayout.EAST);
		
		return this;
	}

	public BasePanel setTitle(String title, int size) {
		Border line = BorderFactory.createLineBorder(Color.BLACK);
		TitledBorder tb = BorderFactory.createTitledBorder(line, title);
		tb.setTitleFont(new Font("HY헤드라인M", Font.PLAIN, size));
		
		super.setBorder(tb);
		return this;
	}

	public BasePanel setFlowLayoutCenter() {
		super.setLayout(new FlowLayout(FlowLayout.CENTER));
		return this;
	}

	public BasePanel setFlowLayoutLeft() {
		super.setLayout(new FlowLayout(FlowLayout.LEFT));
		return this;
	}

	public BasePanel setGridLayout(int r, int c, int hg, int vg) {
		// TODO Auto-generated method stub
		super.setLayout(new GridLayout(r, c, hg, vg));
		return this;
	}

}
