package base.comp;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageLable extends BaseLable{

	public ImageLable(String text, String path, int w, int h) {
		// TODO Auto-generated constructor stub
		super(text); 
		
		ImageIcon icon = new ImageIcon("./datafiles/"+path+".jpg");
		Image img = icon.getImage();
		
		img = img.getScaledInstance(w, h, img.SCALE_SMOOTH);
		
		super.setIcon(new ImageIcon(img));
	}

	public BaseLable setImgCenter() {
		// TODO Auto-generated method stub
		super.setHorizontalAlignment(JLabel.CENTER);
		super.setVerticalAlignment(JLabel.CENTER);
		return this;
	}

}
