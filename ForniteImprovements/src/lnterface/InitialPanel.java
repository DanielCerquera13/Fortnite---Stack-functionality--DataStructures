package lnterface;

import animation.*;
import threads.LoadingThread;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class InitialPanel extends JPanel implements ActionListener {

	public final static Image BACKGROUND = Toolkit.getDefaultToolkit()
			.createImage("./images/backgrounds/background.jpg");

	public final static String PLAY = "PLAY";

	private MainWindow main;
	private JTextField txtNick;
	private JButton butPlay;
	private JLabel labNick;
	private JLabel labLoading;
	private Animation loading;
	private LoadingThread loadingThread;
	private boolean loadingBool;


	public InitialPanel(MainWindow main) {

		this.main = main;
		loadingThread = new LoadingThread(main);
		loadingBool = false;

		setLayout(null);

		initComponents();

	}

	public void initComponents() {

		BufferedImageLoader loader = new BufferedImageLoader();
		BufferedImage spriteLoading = null;

		try {

			spriteLoading = loader.loadImage("./images/sprites/loading.png");

		} catch (IOException ex) {

			ex.printStackTrace();

		}

		loading = new Animation(spriteLoading, 8, 1, 8, 1);

		labNick = new JLabel("Nickname");
		labNick.setBounds(60, 340, 315, 40);
		labNick.setFont(new Font("Garamond", 4, 36));
		labNick.setForeground(Color.WHITE);

		txtNick = new JTextField();
		txtNick.setBounds(60, 380, 315, 40);
		txtNick.setFont(new Font("Garamond", 4, 32));

		butPlay = new JButton("¡PLAY!");
		butPlay.setBounds(135, 470, 165, 65);
		butPlay.setFont(new Font("Garamond", 4, 32));
		butPlay.setBackground(Color.WHITE);
		butPlay.setForeground(Color.BLACK);
		butPlay.setActionCommand(PLAY);
		butPlay.addActionListener(this);

		labLoading = new JLabel("Loading...");
		labLoading.setFont(new Font("Garamond", 4, 40));
		labLoading.setForeground(Color.WHITE);
		labLoading.setBounds(160, 540, 315, 40);

		add(txtNick);
		add(labNick);
		add(butPlay);

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawImage(BACKGROUND, 0, 0, null);

		if (loadingBool) {

			loading.drawAnimation(g, 220, 400, 40);

		}

		repaint();

	}

	public Animation getLoadingAnimation() {

		return loading;

	}

	public MainWindow getMainWindow() {

		return main;

	}

	public LoadingThread getLoadingThread() {

		return loadingThread;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals(PLAY)) {

			this.removeAll();
			loadingBool = true;

			loadingThread.start();

			add(labLoading);

			Timer timer = new Timer();

			timer.schedule(new TimerTask() {

				@Override
				public void run() {

					loadingBool = false;
					labLoading.setText("");

				}
			}, 5000);

		}

	}

}
