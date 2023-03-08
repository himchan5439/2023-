package test1;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		
		JLabel jl = new JLabel("Ff");
		
		jl.setFont(new Font("hy헤드라인m", Font.BOLD, 22));
		
		jf.add(jl);
		
		jf.setSize(500, 500);
		jf.setVisible(true);;
	}

}
