import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Badday implements ActionListener{
	JFrame f;
	JButton b;
	TextField tf1,tf2,tf3,tf4;
	String t="Your B'day";
	int d1,d2,d3,d8,d9;
	int d4,d5,d6,d7;
	Badday(){
		f = new JFrame();
		b = new JButton("Get");
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		tf4 = new TextField();
		
		tf1.setBounds(100,30,30,30);
		tf2.setBounds(150,30,30,30);
		tf3.setBounds(200,30,60,30);
		tf4.setBounds(100,90,100,30);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		b.setBounds(100,150,100,50);
		b.addActionListener(this);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		int p1,p2,p3;
		if(e.getSource()== b){
			d1 = Integer.parseInt(tf1.getText());
			d2 = Integer.parseInt(tf2.getText());
			d3 = Integer.parseInt(tf3.getText());
			
			d4 = (int)((int)(d1/10) + d1-(int)(d1/10)*10);
			d5 = (int)((int)(d2/10) + d2-(int)(d2/10)*10);
			p1 =  (d3-(d3/1000)*1000)/100;
			p2 = ((d3-(d3/1000)*1000)-((d3-(d3/1000)*1000)/100)*100)/10;
			p3 = ((d3-(d3/1000)*1000)-((d3-(d3/1000)*1000)/100)*100) - (((d3-(d3/1000)*1000)-((d3-(d3/1000)*1000)/100)*100)/10)*10; 
			d6 = ((d3/1000) + p1 +p2 +p3);
			
			d7 = (int)((int)(d6/10) + d6-(int)(d6/10)*10);
			
			d8 = d4 + d5 + d7;
			d9 = (int)((int)(d8/10) + d8-(int)(d8/10)*10);
			tf4.setText(Integer.toString(d9));
		}
	}
	public static void main(String[] ss ){
		new Badday();
	}
}
