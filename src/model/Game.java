package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Game {

	
	private Player user;
	private ArrayList<Player> playersOnline;
	private ArrayList<Player> playersPlay4;
	private ArrayList<Player> playersXbox;
	private ArrayList<Player> playersPC;
	private ArrayList<Player> playersNintendo;
	 


	public Game() {

		
		user = new Player(null);
		playersOnline = new ArrayList<Player>();
		playersXbox = new ArrayList<Player>();
		playersPC = new ArrayList<Player>();
		playersPlay4 = new ArrayList<Player>();
		playersNintendo = new ArrayList<Player>();
		
		
		playersOnline.add(user);
		
		
		
		try {
			connectingPlayers();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		putPlayersOnAPlatform();
		

	}

	public Player getUser() {
		
	return user;	
		
	}
	
	public void connectingPlayers() throws IOException {

		Random ran = new Random();

		FileReader fr = null;
		BufferedReader br = null;

		fr = new FileReader("./files/players.txt");
		br = new BufferedReader(fr);

		String nick = "";

		while ((nick = br.readLine()) != null) {

			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));
//			playersOnline.add(new Player(nick));

		}

		if (br != null) {

			br.close();

		}

		if (fr != null) {

			fr.close();

		}

	}

	public void putPlayersOnAPlatform() {
		
	for(int i = 0; i<playersOnline.size(); i++) {
		
	if(playersOnline.get(i).getPlatform().equals("PS4")){
		
	playersPlay4.add(playersOnline.get(i));	
		
	}
				
	}
		
		
	}
	
	
	public ArrayList<Player> getPlayersPlay4() {
		return playersPlay4;
	}

	public void setPlayersPlay4(ArrayList<Player> playersPlay4) {
		this.playersPlay4 = playersPlay4;
	}

	public ArrayList<Player> getPlayersOnline() {

		return playersOnline;

	}

}
