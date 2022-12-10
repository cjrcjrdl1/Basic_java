package high_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneEx extends JFrame{
	public TabbedPaneEx() {
		// TODO Auto-generated constructor stub
		setTitle("���� ����� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane();
		c.add(pane, BorderLayout.CENTER);
		setSize(250,250);
		setVisible(true);
	}
	
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane(JTabbedPane.LEFT);
		pane.addTab("tab1", new JLabel(new ImageIcon("src/prac1117/banana.jpg")));
		pane.addTab("tab2", new JLabel(new ImageIcon("src/prac1117/apple.jpg")));
		pane.addTab("tab3", new MyPanel());
		return pane;
	}
	
	class MyPanel extends JPanel{
		public MyPanel() {
			// TODO Auto-generated constructor stub
			this.setBackground(Color.yellow);
		}

		@Override
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.blue);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.black);
			g.drawString("tab 3�� ���� JPanel �Դϴ�.", 30, 50);
		}
		
	}

	public static void main(String[] args) {
		new TabbedPaneEx();
	}

}
