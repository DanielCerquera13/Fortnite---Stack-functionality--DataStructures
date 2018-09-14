package lnterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LobbyPanel extends JPanel implements ActionListener {
	

	public static final Image FOLDER = Toolkit.getDefaultToolkit()
			.createImage("./images/logos/folder.png");
	
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
	private JLabel name;
	private JLabel level;
	private JLabel iLevel; 
	

	public LobbyPanel(InitialPanel initial) {

		setLayout(null);

		
		this.initial = initial;
		
		
		
		matchmaking = new MatchmakingPanel(this);
		
		play = new JButton("PLAY");
		play.addActionListener(this);
		play.setActionCommand(PLAY);
		//play.setBackground(new Color(243,229,60));
		play.setBackground(Color.BLUE);

		
		
		
		
		name = new JLabel("JUANCHOTAGRANDE", SwingConstants.CENTER);
		name.setLayout(null);
		name.setFont(new Font("Broadway", 1, 24));
		name.setForeground(Color.WHITE);
		
		level = new JLabel("LEVEL");
		level.setLayout(null);
		level.setFont(new Font("Broadway", 1, 36));
		level.setForeground((Color.WHITE));
		
		iLevel = new JLabel("40");
	    iLevel.setLayout(null);
		iLevel.setFont(new Font("Broadway", 1, 36));
		iLevel.setForeground((Color.WHITE));

		

		


		
		Components();

	}

	
	public void Components ()
	{
		level.setBounds(95, 200, 200, 200);
		iLevel.setBounds(125,250,200,200);
		name.setBounds(5,280,300,250);
		play.setBounds(1000, 600, 150, 80);

		
		
		add(level);
		add(iLevel);
		add(name);
		add(play);
		
		
	}	
	
	
	
	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawImage(BACKGROUND, 0, 0, null);
		g.drawImage(JUGADOR, 170, 100, null);
		g.drawImage(SEASON, 10, 80, null);
		g.drawImage(OPTIONS, 190, 2, null);
		g.drawImage(LOGO, 90, 140, null);
		g.drawImage(FOLDER, 5, 450, null);





		

		repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("go")) {
			
			

		}

	}

}
