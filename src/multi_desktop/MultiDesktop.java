package multi_desktop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiDesktop{

	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static int width = (int) screenSize.getWidth();
	static int height = (int) screenSize.getHeight();
	
	static GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
	static GraphicsDevice[] devices = g.getScreenDevices();

	static String mainframe_title = "Multi-Desktop";
	static JFrame mainframe = new JFrame(mainframe_title);
	static JPanel mainpanel = new JPanel();
	
	static Color bgcolor = Color.DARK_GRAY;
	
	public static void main(String args[]){
		JFrame.setDefaultLookAndFeelDecorated(true);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setLocation(width / 4, height / 4);
		mainframe.setSize(new Dimension(width / 2, height / 2));
		mainframe.setVisible(true);
		mainframe.add(mainpanel);
		mainpanel.setBackground(bgcolor);

	}
}
