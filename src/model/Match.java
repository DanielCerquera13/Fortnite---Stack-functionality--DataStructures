package model;

public class Match {

	
	private Player host;
	private Player[] players;

	
	public Match(Player host) {
		
	this.host = host;
		
	players = new Player[100];			
		
	players[0] = host;
	
	}
	
	
	public Player[] getPlayers() {
		
	return players;	
		
		
	}
	
	public Player getHost() {
		
	return host;	
		
	}
	
	
	
	
}
