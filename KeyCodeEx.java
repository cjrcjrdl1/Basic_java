package eventreal;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import eventbeg.ContentPaneEx;

public class KeyCodeEx extends JFrame{
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			Container ContentPane = (Container)e.getSource();
			
			if(e.getKeyChar()=='%') {
				ContentPane.setBackground(Color.yellow);
			}
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				ContentPane.setBackground(Color.green);
		
		}
	}
	
	public static void main(String[] args) {
		new KeyCodeEx();
	}

}

