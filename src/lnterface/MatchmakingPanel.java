package lnterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class MatchmakingPanel extends JPanel implements ActionListener {

	public final static Image BACKGROUND = Toolkit.getDefaultToolkit()
			.createImage("./images/backgrounds/lobbyBackground.jpg");

	private LobbyPanel lobby;
	private JPanel aux; // JTable here
	private JPanel auxTwo; // Info Player and loading
	private JTable players;
	private JScrollPane scroll;

	public MatchmakingPanel(LobbyPanel lobby) {

		setLayout(new BorderLayout());

		this.lobby = lobby;
		initAux();

	}

	public void initAux() {

		Border border = BorderFactory.createRaisedBevelBorder();

		JLabel match = new JLabel("Matchmaking");

		match.setHorizontalAlignment(JLabel.CENTER);
		match.setForeground(Color.WHITE);
		match.setFont(new Font("Garamond", 1, 46));

		aux = new JPanel();
		aux.setBorder(border);
		aux.setLayout(new BorderLayout());
		aux.setBackground(new Color(0, 0, 0, 85));

		JLabel widthTwo = new JLabel(
				"                                                                                                        ");
		widthTwo.setSize(500, 1);

		auxTwo = new JPanel();
		auxTwo.setBorder(border);
		auxTwo.add(widthTwo);
		auxTwo.setBackground(new Color(0, 0, 0, 60));

		playersTable();

		aux.add(scroll);
		aux.add(match, BorderLayout.NORTH);

		add(aux, BorderLayout.CENTER);
		add(auxTwo, BorderLayout.EAST);

	}

	public void playersTable() {

		String[] columns = { "Nickname", "Level", "Ping" };

		Object[][] data = { { "JuanchoVelezPro", 100, 65 } };

		players = new JTable(data, columns);
		players.setOpaque(false);
		players.setBackground(new Color(0, 0, 0, 85));
		players.setForeground(Color.WHITE.brighter());
		players.setEnabled(false);
		players.getTableHeader().setReorderingAllowed(false);
		players.setFont(new Font("Garamond", 1, 18));

		scroll = new JScrollPane(players);
		scroll.getViewport().setBackground(new Color(0, 0, 0, 0));
		scroll.setOpaque(false);
		scroll.getViewport().setOpaque(false);

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
