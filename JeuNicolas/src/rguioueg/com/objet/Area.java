package rguioueg.com.objet;

import java.util.Scanner;

public class Area {
	
	protected byte compteur = 0;
	protected byte id;
	protected String name;
	protected Cities[] Cities;
	private rguioueg.com.objet.Cities[] cities;
	
	/*
	 * On récupère l'identité du secteur:
	 */
	public byte getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Cities[] getCities() {
		return Cities;
	}
	
	public void addCity (int index, Cities city) 
	{
		this.cities[index] = city;
	}
	
	protected Area() {
		compteur++; 
		this.id = compteur;
		Scanner input = new Scanner (System.in);
		this.name = input.nextLine();
		this.cities = new Cities[5];
	}
	public Area(String areaName) {
		compteur++; 
		this.id = compteur;
		this.name = areaName;
		this.cities = new Cities[5];
	}
	
}
	
	
	
	

