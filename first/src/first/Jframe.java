package first;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import javax.swing.JFrame;



public class Jframe {
		
		static GraphicsConfiguration gc;
		public static void main(String[] args){
			JFrame frame= new JFrame(gc);
			frame.setTitle("Network Monitoring Tool");
			frame.setSize(600,400);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
				
			Shapes DC = new Shapes();
			
			
		}
}

