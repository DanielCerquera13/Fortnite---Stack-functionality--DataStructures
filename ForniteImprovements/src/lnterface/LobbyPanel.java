package lnterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LobbyPanel extends JPanel implements ActionListener{

	public final static Image BACKGROUND = Toolkit.getDefaultToolkit().createImage("./images/backgrounds/lobby.jpg");
	
	
	public LobbyPanel() {
		
		
		
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
		
		
	}
	
	
	
	
}
