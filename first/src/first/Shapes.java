package first;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;

import java.awt.color.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Shapes extends JComponent{
	public void Paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle rect1 = new Rectangle(5,5,100,200);
		g2.fill(rect1);
	}

}
