package javaapplication115;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class homegames extends JPanel{
        private ImageIcon feild = new ImageIcon(this.getClass().getResource("home.jpg"));
	private ImageIcon imgkot = new ImageIcon(this.getClass().getResource("mon.png"));
	private ImageIcon exit = new ImageIcon(this.getClass().getResource("exit.png"));
        private ImageIcon starts = new ImageIcon(this.getClass().getResource("start.png"));
	public JButton BStart = new JButton(starts);
	public JButton BExit1  = new JButton(exit);
	homegames(){
            setLayout(null);
            BExit1.setBounds(200, 650, 150,60);
            add(BExit1);
            add(BStart);
            BStart.setBounds(450,650,150,60);
           
	}
	public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(feild.getImage(),0,0,1000,800,this);
            g.drawImage(imgkot.getImage(), 580, 380, 400, 400, this);
            g.setColor(Color.BLACK);
            g.setFont(new Font("2005_iannnnnTKO",Font.CENTER_BASELINE,80));		
            g.drawString("MONSTER SHOOTING",70,200);	
	}
}