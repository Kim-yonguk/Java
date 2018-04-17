package naverTest;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame() {
		setTitle("네이버 접속 프로그램");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn =new JButton("접 속");
		JButton btn1=new JButton("종 료");
		add(btn);
		add(btn1);
		
		MyActionListener listener=new MyActionListener();
		btn.addActionListener(listener);
		
		MyActionListener1 listener1=new MyActionListener1();
		btn1.addActionListener(listener1);
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b=(JButton) e.getSource();
		
		if(b.getText().equals("네이버 접속")) {
			b.setText("돌아가기");
			try {	
				Runtime runtime=Runtime.getRuntime();
				///open -a Safari 'http://www.nate.com'
				runtime.exec( new String[] { "open" , "-a", "Safari", "http://www.naver.com" }) ;

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else {
			b.setText("네이버 접속");
		}
	}
	
}

class MyActionListener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Runtime runtime=Runtime.getRuntime();
		runtime.exit(0);
	}

	
	
}
