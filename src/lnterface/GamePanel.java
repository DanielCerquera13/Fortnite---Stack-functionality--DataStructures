package lnterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.ActivationMonitor;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class GamePanel extends JPanel implements ActionListener {

	public static final String AXE = "./images/weapons/AXE.png";

	public final static Image BACKGROUND = Toolkit.getDefaultToolkit().createImage("./images/backgrounds/game.jpeg");

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

	public GamePanel() {

		setLayout(null);

		Border border = BorderFactory.createRaisedBevelBorder();
		TitledBorder border1 = new TitledBorder("");

		axe = new JLabel();
		weapon1 = new JLabel();
		weapon2 = new JLabel();
		weapon3 = new JLabel();
		weapon4 = new JLabel();
		weapon5 = new JLabel();

		panelGame = new JPanel();
		panelGame.setSize(500, 600);
		// panelGame.setBackground(Color.BLUE);
		// panelGame.setLayout(null);
		panelGame.setBounds(1, 1, 900, 768);
		panelGame.setBorder(border1);
		panelGame.setOpaque(false);

		panelInfo = new JPanel();
		// panelInfo.setBackground(Color.gray);
		panelInfo.setBackground(new Color(12, 12, 12, 60));
		// panelInfo.setOpaque(false);

		// panelInfo.setLayout(null);
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

	}

	public void Components() {

		weapons.setBounds(130, 20, 100, 600);
		players.setBounds(0, 550, 400, 200);
		ammo.setBounds(-10, 600, 400, 200);
		// axe.setBounds(50,300,200,200);
		// aux.setBounds(1, 1, 200, 200);

		// panelInfo.add(aux);

		panelInfo.add(ammo);
		panelInfo.add(players);
		panelInfo.add(weapons);
		// panelInfo.add(axe);

		add(panelGame, BorderLayout.CENTER);
		add(panelInfo, BorderLayout.EAST);
	}

	public void JList() {

		axe.setIcon(new ImageIcon(AXE));
		axe.setOpaque(false);
		ImageIcon image = new ImageIcon(AXE);
		// weapons.add("asd", axe);
		listModel.add(0, image);
		listModel.add(1, image);
		listModel.add(2, image);
		listModel.add(3, image);
		listModel.add(4, image);
		listModel.add(5, image);

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawImage(BACKGROUND, 0, 0, null);

		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
