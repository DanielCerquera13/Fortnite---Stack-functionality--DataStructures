package lnterface;

import javax.swing.*;

import model.Game;

import java.awt.*;

public class MainWindow extends JFrame {

	private InitialPanel initial;
	private Game game;

	public MainWindow() {

		setLayout(new BorderLayout());

		setTitle("Fortnite");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1280, 768);
		setResizable(false);

		initial = new InitialPanel(this);
		game = new Game();

		// Icon Application
		Image icon = Toolkit.getDefaultToolkit().createImage("./images/logos/logo2.jpg");

		setIconImage(icon);

		add(initial, BorderLayout.CENTER);

		setVisible(true);

	}

	public void refresh() {

		invalidate();
		revalidate();
		repaint();

	}

	public Game getGame() {

		return game;

	}

	public InitialPanel getInitialPanel() {

		return initial;

	}

	public static void main(String[] args) {

		MainWindow window = new MainWindow();

	}

}
