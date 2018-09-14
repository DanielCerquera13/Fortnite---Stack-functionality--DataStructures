package lnterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LobbyPanel extends JPanel implements ActionListener {
	

	public static final Image LEVEL = Toolkit.getDefaultToolkit()
			.createImage("./images/logos/level.png");
	
	public static final Image SEASON = Toolkit.getDefaultToolkit()
			.createImage("./images/logos/season1.png");
	public static final Image OPTIONS = Toolkit.getDefaultToolkit()
			.createImage("./images/logos/options.png");
	public static final Image JUGADOR = Toolkit.getDefaultToolkit()
			.createImage("./images/sprites/Skin.png");
	public static final Image LOGO = Toolkit.getDefaultToolkit()
			.createImage("./images/logos/logo1.png");
	public final static Image BACKGROUND = Toolkit.getDefaultToolkit().createImage("./images/backgrounds/lobbyBackground.jpg");
	public final static String PLAY = "PLAY";

	
	private InitialPanel initial;
	private MatchmakingPanel matchmaking;
	private JButton go;
	private JButton play;
	private JLabel logo;
	private JLabel level;
	private JTextField txtLevel; 
	

	public LobbyPanel(InitialPanel initial) {

		setLayout(null);

		
		this.initial = initial;
		
		
		matchmaking = new MatchmakingPanel(this);

		go = new JButton("Go");

		go.setBounds(50, 400, 50, 50);
		go.setActionCommand("go");
		go.addActionListener(this);

		add(go);

	}

	
	public void Components ()
	{
		
		
		
		
	}	
	
	
	
	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawImage(BACKGROUND, 0, 0, null);
		g.drawImage(JUGADOR, 170, 100, null);
		g.drawImage(SEASON, 10, 80, null);
		g.drawImage(OPTIONS, 190, 2, null);
		g.drawImage(LOGO, 90, 140, null);
		g.drawImage(LOGO, 90, 140, null);




		

		repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("go")) {
			
			

		}

	}

}
