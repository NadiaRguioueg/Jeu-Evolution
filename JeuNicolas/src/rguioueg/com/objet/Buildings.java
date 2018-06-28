package rguioueg.com.objet;

import java.util.ArrayList;
import java.util.Scanner;

import rguioueg.com.enumeration.Ressource;


public class Buildings {
	private byte compteur = 0;
	private byte id;
	private String name;
	private Ressource ressource;
	private int life;
	private short stock;
	private String description;
	private ArrayList<Enemies> enemies;
	
	
	
	public byte getId() {
		return this.id;
	}
	



	public String getName() {
		return this.name;
	}




	public void setName(String nameBuildings) {
		this.name = nameBuildings;
	}




	public Ressource getRessource() {
		return this.ressource;
	}




	public int getLife() {
		return this.life;
	}
	
	public void setLife(int lifeBuildings) {
		this.life = lifeBuildings;
	}
	




	public short getStock() {
		return this.stock;
	}



	public void setStock(short stockBuildings) {
		this.stock = stockBuildings;
	}
	
	

	public ArrayList<Enemies> getEnemies() {
		return enemies;
	}
	
	public Buildings() {
		compteur++;
		this.id = compteur;
		Scanner input = new Scanner(System.in);
		System.out.println("Nom du Batiment: ");
		this.name = input.nextLine();
		this.enemies = new ArrayList<Enemies>();
		this.ressource = Ressource.FUEL;
		this.life = 1000;
		this.stock = 10;
		this.description = "";
	}

	/*
	 * Constructeur
	 */
	
	public Buildings(String nameBuildings, Ressource ressource, int life, short stock,
			String description) {
		
		compteur++;
		this.id = compteur;
		this.name = nameBuildings;
		this.ressource = ressource;
		this.life = life;
		this.stock = stock;
		this.description = description;
		this.enemies = new ArrayList<Enemies>();
	}
	
	

	
}
