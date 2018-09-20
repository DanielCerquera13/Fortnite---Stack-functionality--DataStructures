package lnterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import animation.Animation;
import animation.BufferedImageLoader;
import model.Player;
import threads.PlayerMovementThread;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	public static final String AXE = "./images/weapons/AXE.png";
	public static final String AXE1 = "./images/logos/pc.png";
	public static final String AXE2 = "./images/logos/ps4.jpg";
	public static final String AXE3 = "./images/logos/switch.png";
	public static final String AXE4 = "./images/logos/level.png";
	public static final String AXE5 = "./images/logos/xbox.png";

	public final static String REMOVE = "REMOVE";
	public final static String ADD = "ADD";

	public final static Image BACKGROUND = Toolkit.getDefaultToolkit().createImage("./images/backgrounds/game.jpeg");
	public static final Image BOOM = Toolkit.getDefaultToolkit().createImage("./images/logos/shoot.png");
	public static final Image GUN = Toolkit.getDefaultToolkit().createImage("./images/logos/xbox.png");

	private PlayerMovementThread playerMovement;
	private MatchmakingPanel matchmaking;
	private JPanel panelGame;
	private JPanel panelInfo;
	private JList weapons;
	private JLabel players;
	private JLabel ammo;
	private JLabel aux;
	private JLabel axe;
	private JLabel weapon1;
	private JLabel weapon2;
	private JLabel weapon3;
	private JLabel weapon4;
	private JLabel weapon5;
	DefaultListModel<ImageIcon> listModel;
	private JButton button;
	private JButton button1;
	private Animation stand;
	private Animation running;
	private BufferedImage standSprite;
	private BufferedImage runningSprite;
	private boolean run = false;
	private boolean explode = false;

	public GamePanel(MatchmakingPanel matchmaking) {

		this.matchmaking = matchmaking;

		setLayout(null);

		BufferedImageLoader loader = new BufferedImageLoader();

		try {

			standSprite = loader.loadImage("./images/sprites/stand.png");
			runningSprite = loader.loadImage("./images/sprites/running.png");

		} catch (IOException e) {

			e.printStackTrace();

		}

		stand = new Animation(standSprite, 22, 1, 22, 1);
		running = new Animation(runningSprite, 28, 1, 7, 4);

		Border border = BorderFactory.createRaisedBevelBorder();
		TitledBorder border1 = new TitledBorder("");

		button = new JButton(ADD);
		button.addActionListener(this);
		button.setActionCommand(ADD);

		button1 = new JButton(REMOVE);
		button1.addActionListener(this);
		button1.setActionCommand(REMOVE);

		axe = new JLabel();
		weapon1 = new JLabel();
		weapon2 = new JLabel();
		weapon3 = new JLabel();
		weapon4 = new JLabel();
		weapon5 = new JLabel();

		panelGame = new JPanel();
		panelGame.setSize(500, 600);
		panelGame.setBackground(new Color(0, 0, 0, 0));

		panelGame.setBounds(1, 1, 900, 768);
		panelGame.setBorder(border1);
		panelGame.setOpaque(false);

		panelInfo = new JPanel();
		panelInfo.setBackground(new Color(12, 12, 12, 60));

		panelInfo.setBounds(901, 1, 380, 768);
		panelInfo.setLayout(null);

		panelInfo.setBorder(border1);

		listModel = new DefaultListModel<ImageIcon>();
		weapons = new JList<>(listModel);
		weapons.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		weapons.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		weapons.setVisibleRowCount(-1);
		weapons.setBackground(new Color(12, 12, 12, 60));
		weapons.setBorder(border1);

		JScrollPane listScroller = new JScrollPane(weapons);
		listScroller.setPreferredSize(new Dimension(300, 250));

		aux = new JLabel("---------------------------------------------------");
		aux.setSize(300, 1);
		players = new JLabel("Jugadores restantes: 85", SwingConstants.CENTER);
		players.setHorizontalAlignment(JLabel.CENTER);
		players.setForeground(Color.WHITE);
		players.setFont(new Font("Garamond", 1, 18));

		ammo = new JLabel("CANTIDAD DE MUNICION: 40 ", SwingConstants.CENTER);
		ammo.setHorizontalAlignment(JLabel.CENTER);
		ammo.setForeground(Color.WHITE);
		ammo.setFont(new Font("Garamond", 1, 18));

		Components();

		JList();

		playerMovement = new PlayerMovementThread(this);
		playerMovement.start();

		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

	}

	public void Components() {

		weapons.setBounds(130, 20, 100, 600);
		players.setBounds(0, 550, 400, 200);
		ammo.setBounds(-10, 600, 400, 200);
		button.setBounds(100, 100, 80, 80);
		button1.setBounds(300, 300, 100, 100);

		panelInfo.add(ammo);
		panelInfo.add(players);
		panelInfo.add(weapons);
		// panelInfo.add(axe);

		add(panelGame, BorderLayout.CENTER);
		add(panelInfo, BorderLayout.EAST);

//		add(button);
//		add(button1);
	}

	public void JList() {

		ImageIcon image = new ImageIcon(AXE);

		ImageIcon image1 = new ImageIcon(AXE1);
		ImageIcon image2 = new ImageIcon(AXE2);
		ImageIcon image3 = new ImageIcon(AXE3);
		ImageIcon image4 = new ImageIcon(AXE4);
		ImageIcon image5 = new ImageIcon(AXE5);

		listModel.addElement(image);
		listModel.addElement(image1);
		listModel.addElement(image2);
		listModel.addElement(image3);
		listModel.addElement(image4);
		listModel.addElement(image5);

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawImage(BACKGROUND, 0, 0, null);

		Player player = matchmaking.getLobby().getInitialPanel().getMainWindow().getGame().getUser();

		if (run) {

			running.drawAnimation(g, player.getX(), player.getY() + 30, +5);

		} else if (!run) {

			stand.drawAnimation(g, player.getX(), player.getY(), +5);

		}
		
		if(explode) {
			
			g.drawImage(BOOM, player.getX()+75, player.getY()+80, null);
			
		}

		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String a = e.getActionCommand();

		if (a.equals(REMOVE)) {
			listModel.removeElementAt(0);
		}
		if (a.equals(ADD)) {
			ImageIcon image5 = new ImageIcon(AXE5);
			listModel.add(0, image5);
		}
	}

	@Override
	public void keyPressed(KeyEvent k) {

		int event = k.getKeyCode();

		if (event == KeyEvent.VK_RIGHT) {

			run = true;

			matchmaking.getLobby().getInitialPanel().getMainWindow().getGame().getUser().move();

		}

		if (event == KeyEvent.VK_LEFT) {

			run = true;

			matchmaking.getLobby().getInitialPanel().getMainWindow().getGame().getUser().back();

		}

		if (event == KeyEvent.VK_SPACE) {

			explode = true;

		}

	}

	public Animation getStand() {

		return stand;

	}

	public Animation getRunning() {

		return running;

	}

	@Override
	public void keyReleased(KeyEvent k) {

		int event = k.getKeyCode();

		if (event == KeyEvent.VK_RIGHT) {

			run = false;

			matchmaking.getLobby().getInitialPanel().getMainWindow().getGame().getUser().move();

			repaint();

		}

		if (event == KeyEvent.VK_LEFT) {

			run = false;
			matchmaking.getLobby().getInitialPanel().getMainWindow().getGame().getUser().back();

		}

		if (event == KeyEvent.VK_SPACE) {

			explode = false;

		}

	}

	@Override
	public void keyTyped(KeyEvent k) {

	}

}
