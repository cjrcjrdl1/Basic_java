package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawLineEx() {
		setTitle("darwLine 사용 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200,170);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.setColor(Color.red);
//			g.drawLine(20, 20, 100, 100);
			g.drawRoundRect(20, 20, 120, 80, 40, 60);
		}
		
	}

	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}

}
