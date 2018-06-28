package rguioueg.com.objet;

import rguioueg.com.enumeration.MenuActions;

public class Menu {
	protected MenuActions[] menuMain, menuArea, menuCities, menuBuildings, menuEnnemies;
	public Menu() {
		menuMain = new MenuActions[] {
				MenuActions.AREA,
				MenuActions.CITIES,
				MenuActions.BUILDINGS,
				MenuActions.ENEMIES,
				MenuActions.EXIT,
		};
		
	}
	
	
}
