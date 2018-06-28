package rguioueg.com.objet;

import java.util.ArrayList;
import java.util.Scanner;


public class Cities {
	protected byte compteur = 0;
	protected byte id;
	protected String name;
	protected ArrayList<Buildings> buildings;
	
	
	public byte getId() {
		return this.id;
	}
	
	public void setName(String nameCities) {
		this.name = nameCities;
	}
	

	public String getName() {
		return name;
	}

	public ArrayList<Buildings> getBuildings() {
		return buildings;
	}
	
	public void addBuilidings(Buildings building) {
		this.buildings.add(building);
	}
	
	/*
	 * Constructeur
	 */

	public Cities() {
		compteur++;
		this.id = compteur;
		Scanner input = new Scanner(System.in);
		System.out.println("Nom de la ville: ");
		this.name = input.nextLine();
		this.buildings = new ArrayList<Buildings>();
		
	}

	public Cities(String nameCities) {
		compteur++;
		this.id = compteur;
		this.name = nameCities;
		this.buildings = new ArrayList<Buildings>();
	}
	
	private int recupererfirstBuilding(int valeurARecuperer) {
		if ((valeurARecuperer < 0) || (valeurARecuperer > 2)) {
			return -1;
		}
		else {
			return 0;
		}
		
		
	}

}

	

