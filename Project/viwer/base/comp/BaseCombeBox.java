package base.comp;

import javax.swing.JComboBox;

public class BaseCombeBox extends JComboBox<String>{

	public BaseCombeBox(String...vals) {
		for (String val : vals) {
			super.addItem(val);
		}
	}

}
