package threads;

import lnterface.GamePanel;

public class PlayerMovementThread extends Thread {

	private GamePanel game;

	public PlayerMovementThread(GamePanel game) {

		this.game = game;

	}

	@Override
	public void run() {

		while (true) {
			try {

				Thread.sleep(15);

				game.getStand().runAnimation();
				game.getRunning().runAnimation();

			} catch (InterruptedException e) {

			}

		}

	}

}
