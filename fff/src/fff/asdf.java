package fff;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class asdf {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		JLabel jl = new JLabel("로그인 후  ㄹ");
		
		
		jf.setSize(500, 500);
//		jl.setFont(new Font("hy헤드라인m", Font.BOLD, 22));
		jl.setFont(new Font("", Font.BOLD, 22));
		jf.add(jl);
		jf.setVisible(true);
	}
}
