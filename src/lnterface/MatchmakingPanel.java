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
	private JPanel aux;
	private JPanel auxTwo;

	public MatchmakingPanel(LobbyPanel lobby) {

		setLayout(new BorderLayout());

		this.lobby = lobby;
		initAux();

	}

	public void initAux() {

		Border border = BorderFactory.createRaisedBevelBorder();
	
		Border matchBorder = BorderFactory.createEtchedBorder();
		
		JLabel match = new JLabel("Matchmaking");
		match.setBorder(matchBorder);
		match.setHorizontalAlignment(JLabel.CENTER);
		match.setForeground(Color.WHITE);
		match.setFont(new Font("Garamond",1, 46));
		
		
		aux = new JPanel();
		aux.setBorder(border);
		aux.setLayout(new BorderLayout());
		aux.setBackground(new Color(67, 103, 177));
		aux.add(match, BorderLayout.NORTH);		
		
	
		
		JLabel widthTwo = new JLabel("                                                                                                        ");
		widthTwo.setSize(500,1);
		
		auxTwo = new JPanel();
		auxTwo.setBorder(border);
		auxTwo.add(widthTwo);
		auxTwo.setBackground(new Color(67, 103, 177));
		
		
		add(aux, BorderLayout.CENTER);
		add(auxTwo, BorderLayout.EAST);

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
