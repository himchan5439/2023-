package windows;

import javax.swing.JButton;

import base.comp.BaseCombeBox;
import base.comp.BaseFrame;
import base.comp.BaseLabel;
import base.comp.ImageLabel;

public class MainFrame extends BaseFrame{

	private BaseLabel mainImg;
	private BaseCombeBox cbBox;
	private JButton loginB;
	private JButton joinB;
	private JButton bookListB;
	private JButton myPageB;
	private JButton bookReadB;
	private JButton exitB;
	private JButton logoutB;
	private JButton bookMB;
	private JButton bookAddMB;
	private JButton rantelMB;

	public MainFrame() {
		super("메인", 1000, 850, null);
	}

	@Override
	public void setComp() {
		// TODO Auto-generated method stub
		mainImg = new ImageLabel("로그인 후 이용해주세요", "메인1", 1000, 500)
				.SetFontSize(40)
				.setTextCenter()
				.setFontWhlie();
		cbBox = new BaseCombeBox("전체", "과학", "인문학");
		
		loginB = new JButton("로그인");
		joinB = new JButton("회원가입");
		bookListB = new JButton("도서 목록");
		myPageB = new JButton("마이페이지");
		bookReadB = new JButton("책 읽기");
		exitB = new JButton("종료");
		
		logoutB = new JButton("로그아웃");

		bookMB = new JButton("도서관리");
		bookAddMB = new JButton("도서등록");
		rantelMB = new JButton("대출통계");
	}

	@Override
	public void setDisign() {
		// TODO Auto-generated method stub
		top.add(mainImg);
		center.addCild();
		center.setTitle("인기 도서", 20);
		center.top.setFlowLayoutLeft();
		center.top.add(cbBox);
		center.center.setGridLayout(1, 5, 10, 10);
		for (int i = 1; i <= 5; i++) {
			center.center.add(new ImageLabel("산책이 그리운 이유", "book/" + i, 160, 190)
					.setImgCenter()
					.setLine()
					.setTextBottomCenter()
					);
		}
		
		bottom.setFlowLayoutCenter();
		
		reset();
		
	}

	@Override
	public void setEvent() {
		loginB.addActionListener(e -> {
			user();
		});
		logoutB.addActionListener(e -> {
			reset();
		});
		joinB.addActionListener(e -> {
			admin();
		});
	}
	
	private void reset() {
		// TODO Auto-generated method stub
		bottom.removeAll();
		
		mainImg.setText("로그인 후 이용해주세요");
		
		bottom.add(loginB);
		bottom.add(joinB);
		bottom.add(bookListB);
		bottom.add(myPageB);
		bottom.add(bookReadB);
		bottom.add(exitB);
		
		joinB.setEnabled(true);
		
		bookListB.setEnabled(false);
		myPageB.setEnabled(false);
		bookReadB.setEnabled(false);
		
		refresh();
	}

	private void user() {
		// TODO Auto-generated method stub
		bottom.removeAll();
		
		mainImg.setText("박소희님 환영합니다");
		
		bottom.add(logoutB);
		bottom.add(joinB);
		bottom.add(bookListB);
		bottom.add(myPageB);
		bottom.add(bookReadB);
		bottom.add(exitB);
		
		joinB.setEnabled(false);
		
		bookListB.setEnabled(true);
		myPageB.setEnabled(true);
		bookReadB.setEnabled(true);
		
		refresh();
	}

	private void admin() {
		// TODO Auto-generated method stub
		bottom.removeAll();
		
		mainImg.setText("관리자님 환영합니다");
		
		bottom.add(logoutB);
		bottom.add(bookMB);
		bottom.add(bookAddMB);
		bottom.add(rantelMB);
		bottom.add(exitB);
		
		refresh();
	}

}
