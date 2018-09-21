package threads;

import lnterface.GamePanel;
import model.Game;

public class PlayerMovementThread extends Thread {

	private GamePanel game;
	
	private Game gameWeapons;

	public PlayerMovementThread(GamePanel game, Game gameWeapons) {

		this.game = game;
		this.gameWeapons = gameWeapons;

	}

	@Override
	public void run() {

		while (true) {
			try {

				Thread.sleep(15);

				game.getStand().runAnimation();
				game.getRunning().runAnimation();
				game.getAmmo().setText("Ammo: "+ game.getCurrentWeapon().getAmmo()+"");

			} catch (InterruptedException e) {

			}

		}

	}

}
