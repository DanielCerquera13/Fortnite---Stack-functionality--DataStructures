package model;

import java.util.Random;

import dataStructures.Stack;

public class Player {

	private int ping;
	private String nickname;
	private int level;
	private Stack<Weapon> weapons;
	private int x;
	private int y;
	private Random ran = new Random();

	public Player(String nickname) {

		this.nickname = nickname;

		level = ran.nextInt((101 - 1) + 1);
		ping = ran.nextInt((500 - 1) + 1);

		weapons = new Stack<Weapon>(50, true);

		x = 0;
		y= 1110;
		
	}

	public void pickWeapon(Weapon weapon) {
	
	weapons.push(weapon);	
		
	}
	
	public void dropWeapon() {
		
	weapons.pop();	
		
	}
	
	public void move() {
		
	x+=10;	
		
	}
	
	public void back() {
		
	x-=10;	
		
	}
	
	public int getPing() {
		return ping;
	}

	public void setPing(int ping) {
		this.ping = ping;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Stack<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(Stack<Weapon> weapons) {
		this.weapons = weapons;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
