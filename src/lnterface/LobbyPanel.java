package lnterface;

import javax.swing.*;

import com.sun.glass.events.KeyEvent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LobbyPanel extends JPanel implements ActionListener {
	


	public static final String XBOX = "./images/logos/greenbutton.png";
	public static final String PLAY4 = "./images/logos/greenbutton.png";
	public static final String  PC= "./images/logos/greenbutton.png";
	public static final String NINTENDO = "./images/logos/greenbutton.png";


	public static final Image PING = Toolkit.getDefaultToolkit()
			.createImage("./images/logos/greenbutton.png");
	
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
	private JLabel ping;
	private JLabel online;
	private JLabel players;
	private JRadioButton xbox, play4, pc, nintendo;
	private ButtonGroup plataforms;
	private JPanel buttons;
	private JPanel radioPanel;
	private JLabel image;

	

	

	

	public LobbyPanel(InitialPanel initial) {

		setLayout(null);

		
		this.initial = initial;
		
		
		
		matchmaking = new MatchmakingPanel(this);
		
		radioPanel = new JPanel();
		radioPanel.setLayout(new GridLayout(0, 1));
		
		buttons = new JPanel();
		buttons.setSize(300,400);
		buttons.setLayout(new BorderLayout());
		plataforms = new ButtonGroup();
		
	     xbox = new JRadioButton("Xbox");
	     xbox.setMnemonic (KeyEvent.VK_B);
	     xbox.setActionCommand (XBOX);
	     xbox.setSelected (true);
	     

	     play4 = new JRadioButton("Play 4");
	     play4.setMnemonic (KeyEvent.VK_B);
	     play4.setActionCommand (XBOX);
	     play4.setSelected (true);
	     

	     pc = new JRadioButton("PC");
	     pc.setMnemonic (KeyEvent.VK_B);
	     pc.setActionCommand (XBOX);
	     pc.setSelected (true);
	     
	     
	     

	     nintendo = new JRadioButton("NINTENDO");
	     nintendo.setMnemonic (KeyEvent.VK_B);
	     nintendo.setActionCommand (XBOX);
	     nintendo.setSelected (true);
	     
	     plataforms.add(xbox);
	     plataforms.add(play);
	     plataforms.add(nintendo);
	     plataforms.add(pc);
	     
	     xbox.addActionListener(this);
	     play4.addActionListener(this);
	     pc.addActionListener(this);
	     nintendo.addActionListener(this);
	     
	    

	     image= new JLabel();
		
		players = new JLabel("60");
		players.setFont(new Font("Garamond", 1, 12));
		players.setForeground((Color.WHITE));

		
		online = new JLabel("Now playing");
		online.setFont(new Font("Garamond", 1,12));
		online.setForeground((Color.WHITE));

	
		
		play = new JButton("PLAY");
		play.addActionListener(this);
		play.setActionCommand(PLAY);
		play.setBackground(new Color(243,229,60));
		play.setFont(new Font("Garamond", 1,24));

		
		ping = new JLabel("100");
		ping.setFont(new Font("Garamond", 1, 12));
		ping.setForeground((Color.GREEN.brighter()));
		
		
		
		
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
		level.setBounds(90, 200, 200, 200);
		iLevel.setBounds(125,250,200,200);
		name.setBounds(5,280,300,250);
		play.setBounds(1000, 520, 180, 70);
		ping.setBounds(1240, 10, 40, 40);
		online.setBounds(1, 760, 100, 20);
		players.setBounds(100, 760, 80, 20);
		buttons.setBounds(1000, 600, 200, 200);

		
		
		add(level);
		add(iLevel);
		add(name);
		add(play);
		add(ping);
		add(online);
		add(players);
		radioPanel.add(xbox);
		radioPanel.add(play4);
		radioPanel.add(pc);
		radioPanel.add(nintendo);
		
		buttons.add(radioPanel);
		buttons.add(image);

		;
		
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
		g.drawImage(PING, 1220, 22, null);






		

		repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("go")) {
			
			

		}

	}

}
