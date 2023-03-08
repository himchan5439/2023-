package base.comp;

import javax.swing.JComboBox;

public class ComboBox extends JComboBox<String>{

	public ComboBox(String...vals) {
		// TODO Auto-generated constructor stub
		for (String val : vals) {
			super.addItem(val);
		}
	}
	
}
