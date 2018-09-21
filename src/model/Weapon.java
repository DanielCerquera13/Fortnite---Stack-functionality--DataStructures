package model;

public class Weapon {

	
	private String name;
	private int ammo;
	private int x;
	private int y;
	
	public Weapon(String name) {
		
	this.name = name;
	ammo = 30;
	
		
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
		
	setX(x-5);	
		
	}
	
	
	
	
	
	
}
