package lnterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LobbyPanel extends JPanel implements ActionListener {

	public final static Image BACKGROUND = Toolkit.getDefaultToolkit().createImage("./images/backgrounds/lobbyBackground.jpg");

	
	private InitialPanel initial;
	private MatchmakingPanel matchmaking;
	private JButton go;

	public LobbyPanel(InitialPanel initial) {

		setLayout(null);

		
		this.initial = initial;
		
		
		matchmaking = new MatchmakingPanel(this);

		go = new JButton("Go");

		go.setBounds(50, 50, 50, 50);
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

		if (command.equals("go")) {
			
			

		}

	}

}
