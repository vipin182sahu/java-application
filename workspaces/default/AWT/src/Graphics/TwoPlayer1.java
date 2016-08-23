package Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
public class TwoPlayer1 extends JFrame implements ActionListener {
	JButton b[];
	int count =0; 
	Boolean win = false;
	String caption;
	JButton newGame,exit,quit;
	JLabel label, player1,player2;
	JPanel p = new JPanel();
	
	TwoPlayer1(){
		super("Tic Tac Toe");
		
		newGame = new JButton("New Game");
		newGame.addActionListener(this);
		newGame.setBounds(280,50,100,30);
		add(newGame);
		
		quit = new JButton("quit Game");
		quit.addActionListener(this);
		quit.setBounds(280,50,100,30);
		quit.setVisible(false);
		add(quit);
		
		exit = new JButton("Exit");
		exit.addActionListener(this);
		exit.setBounds(280,270,100,30);
		add(exit);
		
		Font font = new Font("serit",Font.PLAIN,50);
		Font labelFont = new Font("serif",Font.BOLD,16);
		
		label = new JLabel("Two Player Game");
		label.setFont(labelFont);
		label.setBounds(15,2,390,20);
		add(label);
		
		player1 = new JLabel("Player 1 = 'O'");
		player1.setFont(labelFont);
		player1.setBounds(15,22,125,30);
		add(player1);
		player2 = new JLabel("Player 2 = 'X'");
		player2.setFont(labelFont);
		player2.setBounds(175,22,125,30);
		add(player1);
		
		 b = new JButton[9];
		 for(int i =0 ; i<9 ; i++){
			 b[i] = new JButton();
			 b[i].setFont(font);
			 b[i].addActionListener(this);
			 p.add(b[i]);
		 }
		 p.setLayout(new GridLayout(3,3,10,10));
		 p.setBounds(15,50,250,250);
		 add(p);
		 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(410,400);
		 setLayout(null);
		 setVisible(true);
		 setLocation(500,100);
		 
		
	}
	public void actionPerformed(ActionEvent e){
		if(count==0 ||count==2 ||count==4 ||count==6 ){
			caption = "O";
		}
		if(count==1 ||count==3 ||count==5 ){
			caption = "X";
		}
		if(e.getSource() == b[0]){
			b[0].setText(caption);
			b[0].setEnabled(false);
		}
		if(e.getSource() == b[1]){
			b[1].setText(caption);
			b[1].setEnabled(false);
		}
		if(e.getSource() == b[2]){
			b[2].setText(caption);
			b[2].setEnabled(false);
		}
		if(e.getSource() == b[3]){
			b[3].setText(caption);
			b[3].setEnabled(false);
		}
		if(e.getSource() == b[4]){
			b[4].setText(caption);
			b[4].setEnabled(false);
		}
		if(e.getSource() == b[5]){
			b[5].setText(caption);
			b[5].setEnabled(false);
		}
		if(e.getSource() == b[6]){
			b[6].setText(caption);
			b[6].setEnabled(false);
		}
		if(e.getSource() == b[7]){
			b[7].setText(caption);
			b[7].setEnabled(false);
		}
		if(e.getSource() == b[8]){
			b[8].setText(caption);
			b[8].setEnabled(false);
		}
		
		if(e.getSource()== exit){
			System.exit(0);
		}
		if(e.getSource()== newGame){
			setVisible(false);
			new TwoPlayer1();
		}
		//horizontal check
		if(b[0].getText()== b[1].getText() &&b[0].getText()== b[2].getText() &&b[0].getText()!=""){
			win = true;
			b[0].setBackground(Color.green);b[1].setBackground(Color.green);b[2].setBackground(Color.green);
		}
		else if(b[3].getText()== b[4].getText() &&b[3].getText()== b[5].getText() &&b[3].getText()!=""){
			win = true;
			b[3].setBackground(Color.green);b[4].setBackground(Color.green);b[5].setBackground(Color.green);
		}
		else if(b[6].getText()== b[7].getText() &&b[6].getText()== b[7].getText() &&b[6].getText()!=""){
			win = true;
			b[6].setBackground(Color.green);b[7].setBackground(Color.green);b[8].setBackground(Color.green);
		}
		//vertical check
		if(b[0].getText()== b[3].getText() &&b[0].getText()== b[6].getText() &&b[0].getText()!=""){
			win = true;
			b[0].setBackground(Color.green);b[3].setBackground(Color.green);b[6].setBackground(Color.green);
		}
		else if(b[1].getText()== b[4].getText() &&b[1].getText()== b[7].getText() &&b[1].getText()!=""){
			win = true;
			b[1].setBackground(Color.green);b[4].setBackground(Color.green);b[7].setBackground(Color.green);
		}
		else if(b[2].getText()== b[5].getText() &&b[2].getText()== b[8].getText() &&b[2].getText()!=""){
			win = true;
			b[2].setBackground(Color.green);b[5].setBackground(Color.green);b[8].setBackground(Color.green);
		}	
		//diagonal check
		else if(b[0].getText()== b[4].getText() &&b[0].getText()== b[8].getText() &&b[0].getText()!=""){
			win = true;
			b[0].setBackground(Color.green);b[4].setBackground(Color.green);b[8].setBackground(Color.green);
		}
		else if(b[2].getText()== b[4].getText() &&b[2].getText()== b[6].getText() &&b[2].getText()!=""){
			win = true;
			b[2].setBackground(Color.green);b[4].setBackground(Color.green);b[6].setBackground(Color.green);
		}
		
		
		if(e.getSource()==b[0] || e.getSource()==b[1] || e.getSource()==b[2] || e.getSource()==b[3] || e.getSource()==b[4] || e.getSource()==b[5] || e.getSource()==b[6] || e.getSource()==b[7] || e.getSource()==b[8]){
			
			if(win == true &&(count == 4 || count ==6 || count == 8)){
			JOptionPane.showMessageDialog(null,"Player 1 Won the game");
			win = false;
			for(int i = 0; i<=8; i++){
				b[i].setEnabled(false);
			}
			}
			else if(win ==true &&(count==5 || count==7)){
				JOptionPane.showMessageDialog(null,"Player 2 Won the game");
				win = false;
				for(int i = 0 ; i< 9 ; i++){
					b[i].setEnabled(false);
				}
			}
			else if(count == 8 && win == false){
				JOptionPane.showMessageDialog(null, "Game Tie");
			}
			count++;
		}
		
		
		 
		
	}
	public static void main(String[] ss){
		new TwoPlayer1();
	}
}
