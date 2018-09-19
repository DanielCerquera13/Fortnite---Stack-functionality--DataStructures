package threads;

import lnterface.MatchmakingPanel;

public class MatchmakingThread extends Thread {

	
	private MatchmakingPanel match;
	boolean userAdded = false;
	
	public MatchmakingThread(MatchmakingPanel match) {
		
		this.match = match;
		
	}
	
	
	@Override
	public void run() {
		
		
	while(match.getTableModel().getRowCount() < 100) {
		
		
	if(!userAdded) {
		
	match.matchmakingUser();
	userAdded = true;
		
	}
		
	try {
		
	Thread.sleep(150);	
	
	match.matchmaking();	
	
	
	}catch(InterruptedException ex) {
		
	ex.printStackTrace();	
		
	}
		
		
		
	}
		
		
		
	}
	
	
}
