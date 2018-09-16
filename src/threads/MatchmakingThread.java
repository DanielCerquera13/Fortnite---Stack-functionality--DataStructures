package threads;

import lnterface.MatchmakingPanel;

public class MatchmakingThread extends Thread {

	
	private MatchmakingPanel match;
	
	public MatchmakingThread(MatchmakingPanel match) {
		
		this.match = match;
		
	}
	
	
	@Override
	public void run() {
		
		
	while(match.getTableModel().getRowCount() <=100) {
		
		
	try {
		
	Thread.sleep(500);	
	
	match.justProve();	
	
	
	}catch(InterruptedException ex) {
		
	ex.printStackTrace();	
		
	}
		
		
		
	}
		
		
		
	}
	
	
}
