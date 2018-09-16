package lnterface;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LobbyPanel extends JPanel implements ActionListener {

	public static final String XBOX = "./images/logos/xbox.png";
	public static final String PLAY4 = "./images/logos/ps4.jpg";
	public static final String PC = "./images/logos/pc.png";
	public static final String NINTENDO = "./images/logos/switch.png";
	public static final Image PING = Toolkit.getDefaultToolkit().createImage("./images/logos/greenbutton.png");
	public static final Image FOLDER = Toolkit.getDefaultToolkit().createImage("./images/logos/folder.png");
	public static final Image SEASON = Toolkit.getDefaultToolkit().createImage("./images/logos/season1.png");
	public static final Image OPTIONS = Toolkit.getDefaultToolkit().createImage("./images/logos/options.png");
	public static final Image PLAYER = Toolkit.getDefaultToolkit().createImage("./images/sprites/Skin.png");
	public static final Image LOGO = Toolkit.getDefaultToolkit().createImage("./images/logos/logo1.png");
	public final static Image BACKGROUND = Toolkit.getDefaultToolkit().createImage("./images/backgrounds/lobby2.jpg");
	public final static String PLAY = "PLAY";

	private InitialPanel initial;
	private MatchmakingPanel matchmaking;
	private JButton play;
	private JLabel name;
	private JLabel level;
	private JLabel iLevel;
	private JLabel ping;
	private JLabel online;
	private JLabel players;
	private JRadioButton xbox, play4, pc, nintendo;
	private JPanel buttons;
	private JPanel radioPanel;
	private JLabel image;

	public LobbyPanel(InitialPanel initial) {

		setLayout(null);

		this.initial = initial;

		matchmaking = new MatchmakingPanel(this);

		Components();

	}

	public void Components() {

		radioPanel = new JPanel();
		radioPanel.setLayout(new GridLayout(0, 1));
		radioPanel.setBackground(new Color(0, 0, 0, 0));

		buttons = new JPanel();
		buttons.setSize(500, 600);
		buttons.setLayout(new BorderLayout());
		buttons.setBackground(new Color(0, 0, 0, 0));
		buttons.setForeground(Color.WHITE);

		xbox = new JRadioButton("Xbox");
		xbox.setActionCommand(XBOX);
		xbox.setBackground(new Color(0, 0, 0, 0));
		xbox.setFont(new Font("Garamond", 1, 18));
		xbox.setForeground(Color.WHITE);

		play4 = new JRadioButton("Play 4");
		play4.setActionCommand(PLAY4);
		play4.setBackground(new Color(0, 0, 0, 0));
		play4.setFont(new Font("Garamond", 1, 18));
		play4.setForeground(Color.WHITE);

		pc = new JRadioButton("PC");
		pc.setActionCommand(PC);
		pc.setBackground(new Color(0, 0, 0, 0));
		pc.setFont(new Font("Garamond", 1, 18));
		pc.setForeground(Color.WHITE);

		nintendo = new JRadioButton("Nintendo");
		nintendo.setActionCommand(NINTENDO);
		nintendo.setBackground(new Color(0, 0, 0, 0));
		nintendo.setFont(new Font("Garamond", 1, 18));
		nintendo.setForeground(Color.WHITE);

		xbox.addActionListener(this);
		play4.addActionListener(this);
		pc.addActionListener(this);
		nintendo.addActionListener(this);

		image = new JLabel();

		players = new JLabel("60");
		players.setFont(new Font("Garamond", 1, 16));
		players.setForeground((Color.WHITE));

		online = new JLabel("Now playing");
		online.setFont(new Font("Garamond", 1, 16));
		online.setForeground((Color.WHITE));

		play = new JButton("PLAY");
		play.addActionListener(this);
		play.setActionCommand(PLAY);
		play.setBackground(new Color(243, 229, 60, 200));
		play.setFont(new Font("Garamond", 1, 24));

		ping = new JLabel("100");
		ping.setFont(new Font("Garamond", 1, 16));
		ping.setForeground((Color.GREEN.brighter()));

		name = new JLabel("JUANCHOTAGRANDE", SwingConstants.CENTER);
		name.setLayout(null);
		name.setFont(new Font("Garamond", 4, 24));
		name.setForeground(Color.WHITE);

		level = new JLabel("LEVEL");
		level.setLayout(null);
		level.setFont(new Font("Garamond", 4, 44));
		level.setForeground((Color.WHITE));

		iLevel = new JLabel("40");
		iLevel.setLayout(null);
		iLevel.setFont(new Font("Garamond", 4, 44));
		iLevel.setForeground((Color.WHITE));

		level.setBounds(80, 200, 200, 200);
		iLevel.setBounds(125, 250, 200, 200);
		name.setBounds(5, 280, 300, 250);
		play.setBounds(1000, 600, 180, 70);
		ping.setBounds(1240, 10, 40, 40);
		online.setBounds(10, 710, 100, 20);
		players.setBounds(115, 710, 80, 20);
		buttons.setBounds(990, 170, 200, 200);
		radioPanel.setBounds(1000, 100, 200, 200);

		add(level);
		add(iLevel);
		add(name);
		add(play);
		add(ping);
		add(online);
		add(players);
		radioPanel.add(play4);
		radioPanel.add(xbox);
		radioPanel.add(pc);
		radioPanel.add(nintendo);

		buttons.add(image, BorderLayout.EAST);
		buttons.add(radioPanel, BorderLayout.WEST);

		add(buttons);

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawImage(BACKGROUND, 0, 0, null);
		g.drawImage(PLAYER, 170, 100, null);
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

		if (command.equals(NINTENDO)) {
			image.setIcon(new ImageIcon(NINTENDO));
			xbox.setSelected(false);
			play4.setSelected(false);
			pc.setSelected(false);
		}
		if (command.equals(XBOX)) {
			image.setIcon(new ImageIcon(XBOX));
			play4.setSelected(false);
			pc.setSelected(false);
			nintendo.setSelected(false);
		}
		if (command.equals(PC)) {
			image.setIcon(new ImageIcon(PC));
			xbox.setSelected(false);
			play4.setSelected(false);
			nintendo.setSelected(false);

		}
		if (command.equals(PLAY4)) {
			image.setIcon(new ImageIcon(PLAY4));
			pc.setSelected(false);
			nintendo.setSelected(false);
			xbox.setSelected(false);

		}

		if (command.equals(PLAY)) {

			initial.getMainWindow().remove(this);
			initial.getMainWindow().add(matchmaking);
			initial.getMainWindow().refresh();

		}

		if (!pc.isSelected() && !nintendo.isSelected() && !xbox.isSelected() && !play4.isSelected()) {

			image.setIcon(null);
		}

	}

}
