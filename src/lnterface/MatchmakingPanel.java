package lnterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MatchmakingPanel extends JPanel implements ActionListener {

	
	public final static Image BACKGROUND = Toolkit.getDefaultToolkit().createImage("./images/backgrounds/lobbyBackground.jpg");
	
	private LobbyPanel lobby;
	private JButton go;
	
	
	public MatchmakingPanel(LobbyPanel lobby) {
	
	setLayout(null);
		
	this.lobby = lobby;	
		
	go = new JButton("go");	
	go.setBounds(200, 200, 50, 50);	
	go.setActionCommand("go");
	go.addActionListener(this);
	
	add(go);
	
	
		
	}
	
	
	
	
	@Override
	public void paintComponent(Graphics g) {
		
	super.paintComponent(g);	
	
	g.drawImage(BACKGROUND, 0, 0, null);
		
	repaint();
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if(command.equals("go")) {
			
			
			
		}
		
	}
	
}
