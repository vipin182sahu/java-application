package Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;


  

public class ShapesDemo2D extends JApplet {
final static int maxCharHeight = 15;
final static int minFontSize = 6;

final static Color bg = Color.white;
final static Color fg = Color.black;
final static Color red = Color.red;
final static Color white = Color.white;

final static BasicStroke stroke = new BasicStroke(2.0f);
final static BasicStroke wideStroke = new BasicStroke(8.0f);

final static float dash1[] = {10.0f};
final static BasicStroke dashed = new BasicStroke(1.0f,BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash1, 0.0f);
	Dimension totalSize;
	FontMetrics fontMetrics;
	public void init(){
		setBackground(bg);
		setForeground(fg);
	}
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		Dimension d = getSize();
		int gridWidth = d.width/6;
		int gridHeight = d.height/2;
		Color fg3D = Color.green;
		g2.setPaint(fg3D);
		g2.draw3DRect(0,0,d.width-1,d.height-1,true);
		g2.draw3DRect(3,3,d.width-7,d.height-7,true);
	//	g2.draw3DRect(6,6,d.width-13,d.height-13,true);
	//	g2.draw3DRect(9,9,d.width-19,d.height-19,true);
		g2.setPaint(fg);
		
		int x = 5;
		int y = 7;
		int rectWidth = gridWidth -2*x;
		int stringy = gridHeight - 3 - fontMetrics.getDescent();
		int rectHeight = stringy- fontMetrics.getMaxAscent()-y -2;
		
		g2.draw(new Line2D.Double(x,y+rectWidth-1,x+rectHeight,y));
		g2.drawString("Line2D", x, stringy);
		x+=gridWidth;
		
		g2.setStroke(stroke);
		g2.draw(new Rectangle2D.Double(x, y, rectWidth, rectHeight));
		g2.drawString("Rectangle2D", x, stringy);
		x += gridWidth;
	}

 
	public static void main(String[] ss){
		JFrame f = new JFrame("ShapesDemo2D");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){System.exit(0);}
		});
		JApplet applet = new ShapesDemo2D();
		f.getContentPane().add("Center",applet);
		applet.init();
		f.pack();
		f.setSize(400,400);
		//f.setSize(new Dimension(500,100));
		f.setVisible(true);
	}
}