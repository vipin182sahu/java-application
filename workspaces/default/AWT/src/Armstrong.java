import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Armstrong implements ActionListener{
	JFrame f;
	JButton b;
	TextField tf1,tf2;
	int d1,d2,d3;
	Armstrong(){
		f = new JFrame();
		b = new JButton("Check");
		tf1 = new TextField();
		tf2 = new TextField();
		 
		tf1.setBounds(100,30,90,30);
		tf2.setBounds(100,90,90,30);
		
		f.add(tf1);
		f.add(tf2);
		 
		b.setBounds(100,150,100,50);
		b.addActionListener(this);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		int p1,p2,p3,p4;
		if(e.getSource()== b){
			d3 = Integer.parseInt(tf1.getText());
			 
			
			p4 = d3/1000;
			p1 =  (d3-(d3/1000)*1000)/100;
			p2 = ((d3-(d3/1000)*1000)-((d3-(d3/1000)*1000)/100)*100)/10;
			p3 = ((d3-(d3/1000)*1000)-((d3-(d3/1000)*1000)/100)*100) - (((d3-(d3/1000)*1000)-((d3-(d3/1000)*1000)/100)*100)/10)*10; 
			d1 = p1*p1*p1 + p2*p2*p2 +p3*p3*p3 +p4*p4*p4;
			if(d1 == d3){tf2.setText("Yes");}
			else{tf2.setText("No");}
		}
	}
	public static void main(String[] ss ){
		new Armstrong();
	}
}

