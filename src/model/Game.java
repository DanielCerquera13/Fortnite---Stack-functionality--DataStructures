package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import dataStructures.PriorityQueue;

public class Game {

	private Player user;
	private ArrayList<Player> playersOnline;
	private ArrayList<Player> playersPlay4;
	private ArrayList<Player> playersXbox;
	private ArrayList<Player> playersPC;
	private ArrayList<Player> playersNintendo;
	private PriorityQueue<Integer, Player> priorityQueue;
	private Weapon[] weapons;

	public Game() {

		user = new Player(null);
		playersOnline = new ArrayList<Player>();
		playersXbox = new ArrayList<Player>();
		playersPC = new ArrayList<Player>();
		playersPlay4 = new ArrayList<Player>();
		playersNintendo = new ArrayList<Player>();

		playersOnline.add(user);

		weapons = new Weapon[15];

		priorityQueue = new PriorityQueue<Integer, Player>();

		try {
			connectingPlayers();
		} catch (IOException e) {

			e.printStackTrace();
		}

		fillWeapons();
		putPlayersOnAPlatform();

	}

	public void fillWeapons() {

		Random ran = new Random();

		for (int i = 0; i < weapons.length; i++) {

			weapons[i] = new Weapon(Weapon.NAMES[ran.nextInt(Weapon.NAMES.length)]);

		}

	}

	public Weapon[] getWeapons() {

		return weapons;

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
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));
			// playersOnline.add(new Player(nick));

		}

		if (br != null) {

			br.close();

		}

		if (fr != null) {

			fr.close();

		}

	}

	public void putPlayersOnAPlatform() {

		for (int i = 0; i < playersOnline.size(); i++) {

			if (playersOnline.get(i).getPlatform().equals("PS4")) {

				playersPlay4.add(playersOnline.get(i));

			}

			if (playersOnline.get(i).getPlatform().equals("NINTENDO")) {

				playersNintendo.add(playersOnline.get(i));

			}

			if (playersOnline.get(i).getPlatform().equals("XBOX")) {

				playersXbox.add(playersOnline.get(i));

			}

			if (playersOnline.get(i).getPlatform().equals("PC")) {

				playersPC.add(playersOnline.get(i));

			}

		}

	}

	public void stablishPriorityToMatch() {

		if (user.getPlatform().equals("PS4")) {

			for (int i = 0; i < playersPlay4.size(); i++) {

				if (Math.abs(playersPlay4.get(i).getLevel() - user.getLevel()) <= 50) {

					priorityQueue.add(2, playersPlay4.get(i));

				} else {

					priorityQueue.add(1, playersPlay4.get(i));

				}

			}

		}

	}

	public PriorityQueue<Integer, Player> getPriorityQueue() {

		return priorityQueue;

	}

	public ArrayList<Player> getPlayersPlay4() {
		return playersPlay4;
	}

	public void setPlayersPlay4(ArrayList<Player> playersPlay4) {
		this.playersPlay4 = playersPlay4;
	}

	public ArrayList<Player> getPlayersXbox() {
		return playersXbox;
	}

	public void setPlayersXbox(ArrayList<Player> playersXbox) {
		this.playersXbox = playersXbox;
	}

	public ArrayList<Player> getPlayersPC() {
		return playersPC;
	}

	public void setPlayersPC(ArrayList<Player> playersPC) {
		this.playersPC = playersPC;
	}

	public ArrayList<Player> getPlayersNintendo() {
		return playersNintendo;
	}

	public void setPlayersNintendo(ArrayList<Player> playersNintendo) {
		this.playersNintendo = playersNintendo;
	}

	public ArrayList<Player> getPlayersOnline() {

		return playersOnline;

	}

}
