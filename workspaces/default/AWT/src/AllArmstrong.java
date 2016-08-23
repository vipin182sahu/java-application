import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AllArmstrong implements ActionListener{

	JFrame f;
	JButton b;
	TextField tf,tf1;
	int t1,t2,t3,t4;
	AllArmstrong(){
		f = new JFrame();
		b = new JButton("Get");
		tf = new TextField();
		tf.setBounds(30,30,60,30);
		f.add(tf);
		tf1 = new TextField();
		tf1.setBounds(30,150,200,300);
		tf1.setColumns(10);
		tf1.setName("Armstrong no.");
		f.add(tf1);
		b.setBounds(30,70,100,50);
		b.addActionListener(this);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		int p1,p2,p3,p4;
		if(e.getSource()== b){
			t1 = Integer.parseInt(tf.getText());
			for(int i =1; i<=t1; i++){
				p4 = i/1000;
				p1 =  (i-(i/1000)*1000)/100;
				p2 = ((i-(i/1000)*1000)-((i-(i/1000)*1000)/100)*100)/10;
				p3 = ((i-(i/1000)*1000)-((i-(i/1000)*1000)/100)*100) - (((i-(i/1000)*1000)-((i-(i/1000)*1000)/100)*100)/10)*10; 
				t2 = p1*p1*p1 + p2*p2*p2 +p3*p3*p3 +p4*p4*p4;
				if(t2 == i){
				
					tf1.setText(Integer.toString(t2));
					//tf1.setText(t);
				}
			}
		}
	}
	public static void main(String[] ss){
		new AllArmstrong();
	}
}
