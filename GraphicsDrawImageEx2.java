package graphics;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx2 extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx2() {
		setTitle("패널의 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200,300);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("src/graphics/apple.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
		
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}

}
