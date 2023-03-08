package base.comp;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageLabel extends BaseLabel{

	public ImageLabel(String text, String path, int w, int h) {
		super(text);
		
		ImageIcon icon = new ImageIcon("./datafiles/"+path+".jpg");
		Image img = icon.getImage();
		img = img.getScaledInstance(w, h, img.SCALE_SMOOTH);
		
		super.setIcon(new ImageIcon(img));
	}
	
	public ImageLabel setImgCenter() {
		// TODO Auto-generated method stub
		super.setHorizontalAlignment(JLabel.CENTER);
		return this;
	}

}
