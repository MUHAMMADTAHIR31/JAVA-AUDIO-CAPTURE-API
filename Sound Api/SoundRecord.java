import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class SoundRecord extends JFrame implements ActionListener {
	
	
	// Button 	
	JButton    recordButton     =  new JButton("RECORD");
	JButton    stopButton     =  new JButton("STOP");
	JButton    playButton     =  new JButton("PLAY");
	JButton    saveButton     =  new JButton("SAVE");
	JButton    exitButton     =  new JButton("EXIT");
	
	//Cursor & Container
	Cursor     cur             =  new Cursor(Cursor.HAND_CURSOR);
	Container con;
	
	Capture capture = new Capture();
	Playback playback = new Playback();

	
	SoundRecord()throws Exception{
		
		con=this.getContentPane();
		con.setLayout(null);
		
		setBounds(100,50,400,400);
		setResizable(false);
		setVisible(true);
		setTitle(" Client ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Set Bounds 
		recordButton.setBounds(10,10,100,50);
		stopButton.setBounds(10,80,100,50);
		playButton.setBounds(10,150,100,50);
		saveButton.setBounds(10,220,100,50);
		exitButton.setBounds(10,290,100,50);
		
		// Add In Containers

		con.add(saveButton);
		con.add(recordButton);
		con.add(stopButton);
		con.add(playButton);
		con.add(exitButton);
		
		recordButton.setCursor(cur);	
		playButton.setCursor(cur);	
		stopButton.setCursor(cur);	
		saveButton.setCursor(cur);	
		exitButton.setCursor(cur);	
		
		recordButton.addActionListener(this);
		playButton.addActionListener(this);
		stopButton.addActionListener(this);
		exitButton.addActionListener(this);
		saveButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		try{
			
			if(e.getSource()==saveButton){
				
			}
			
			else if(e.getSource()==recordButton){
				
			}
			
			else if(e.getSource()==playButton){
				
			}
			
			else if(e.getSource()==stopButton){
				
			}
			
			else if(e.getSource()==exitButton){
				
			} 
			
		}catch(Exception ex){
			ex.printStackTrace();
		}	
	}
	
	public static void main(String arg[])throws Exception{
		
		SoundRecord frame = new SoundRecord();
	}
}