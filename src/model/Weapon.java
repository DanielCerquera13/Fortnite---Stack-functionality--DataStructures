package model;

public class Weapon {

	public static final String[] NAMES = { "./images/weapons/AXE.png","./images/weapons/weapon1.png", "./images/weapons/weapon2.png",
			"./images/weapons/weapon3.png", "./images/weapons/weapon4.png", "./images/weapons/weapon5.png",
			"./images/weapons/weapon6.png", "./images/weapons/weapon7.png", "./images/weapons/weapon8.png",
			"./images/weapons/weapon9.png" };

	private String name;
	private int ammo;
	private int x;
	private int y;

	public Weapon(String name) {

		this.name = name;
		ammo = 5;
		x=2000;
		y= 400;

	}
	
	public void shoot() {
		
	ammo--;	
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
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

	public void move() {

		setX(x - 5);

	}

}
