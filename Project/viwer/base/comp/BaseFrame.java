package base.comp;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import base.BaseInterFace;

public abstract class BaseFrame extends JFrame implements BaseInterFace{

	private BaseFrame preFrame;
	public BasePanel center;
	public BasePanel top;
	public BasePanel bottom;
	public BasePanel left;
	public BasePanel right;

	public BaseFrame(String title, int w, int h, BaseFrame preFrame) {
		super.setTitle(title);
		super.setSize(w, h);
		
		this.preFrame = preFrame;
		
		center = new BasePanel();
		top = new BasePanel();
		bottom = new BasePanel();
		left = new BasePanel();
		right = new BasePanel();
		
		setComp();
		setDisign();
		setEvent();
		
		super.add(center, BorderLayout.CENTER);
		super.add(top, BorderLayout.NORTH);
		super.add(bottom, BorderLayout.SOUTH);
		super.add(left, BorderLayout.WEST);
		super.add(right, BorderLayout.EAST);
		
		super.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				close();
			}
		});
		
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		super.setVisible(true);
	}
	
	private void close() {
		// TODO Auto-generated method stub
		if(preFrame == null) {
			System.exit(1);
		}
		super.dispose();
	}

	public void refresh() {
		// TODO Auto-generated method stub
		super.repaint();
		super.validate();
	}

}
