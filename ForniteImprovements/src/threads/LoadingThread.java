package threads;

import lnterface.MainWindow;

public class LoadingThread extends Thread {

	private MainWindow main;

	public LoadingThread(MainWindow main) {

		this.main = main;

	}

	@Override
	public void run() {

		while (true) {

			try {

				Thread.sleep(15);
				main.getInitialPanel().getLoadingAnimation().runAnimation();
				

			} catch (InterruptedException ex) {

				ex.printStackTrace();

			}

		}

	}

}
