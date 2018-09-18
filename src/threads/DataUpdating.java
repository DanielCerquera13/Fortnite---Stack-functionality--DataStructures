package threads;

import java.util.Random;

import lnterface.LobbyPanel;

public class DataUpdating extends Thread{

	
	private LobbyPanel lobby;
	private Random ran = new Random();
	
	
	public DataUpdating(LobbyPanel lobby) {
		
	this.lobby = lobby;	
		
	}
	
	
	@Override
	public void run() {
		
		
	while(true) {
		

		
	try {
		
		
	Thread.sleep(1500);
	lobby.getPing().setText(ran.nextInt(5)+60+"");
	lobby.getPlayers().setText(ran.nextInt(10)+2820600+"");
	
	
	
		
	}catch(InterruptedException ex) {
		
	ex.printStackTrace();	
		
	}
		
		
		
		
	}
		
		
		
	}
	
}
