package rguioueg.com;

import rguioueg.com.enumeration.Ressource;
import rguioueg.com.objet.Area;
import rguioueg.com.objet.Buildings;
import rguioueg.com.objet.Cities;
import rguioueg.com.objet.Menu;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area[] areas = generateAreas();
		Menu menu = new Menu();
		menu.showBanner();
		System.out.println(areas[2].getCities()[1].getBuildings().get(0).getName());
		//we are on GitHub!!!
	}

	private static Area[] generateAreas() {
		// TODO Auto-generated method stub
		byte totalArea = 3;
		Area[] areas = new Area[totalArea];
		
		areas[0] = new Area("Dead Zone");
		areas[0].addCity(0, new Cities("Toulon"));
		areas[0].addCity(1, new Cities("Marseille"));
		areas[0].addCity(2, new Cities("Nimes"));
		areas[0].addCity(3, new Cities("Montpellier"));
		
		areas[1] = new Area("Zone 1");
		areas[1].addCity(0, new Cities("Grenoble"));
		areas[1].addCity(1, new Cities("Lyon"));
		areas[1].addCity(2, new Cities("Gap"));
		areas[1].addCity(3, new Cities("Annecy"));
		
		areas[2] = new Area("Zone 2");
		areas[2].addCity(0, new Cities("Paris"));
		areas[2].addCity(1, new Cities("Avignon"));
		areas[2].addCity(2, new Cities("Lille"));
		areas[2].addCity(3, new Cities("Nantes"));
		
		
		areas[0].getCities()[0].addBuildings(new Buildings("Building 0A", Ressource.FUEL, 100, "Station Avia #0", (short) 5, null));
		areas[0].getCities()[0].addBuildings(new Buildings("Building 0B", Ressource.MUNITIONS, 200, "Armunation LOW #0", (short) 10, null));
		areas[0].getCities()[0].addBuildings(new Buildings("Building 0C", Ressource.FOOD, 400, "Lidl #0", (short) 50, null));
		areas[0].getCities()[0].addBuildings(new Buildings("Building 0D", Ressource.FOOD, 800, "SuboMacDo #0", (short) 100, null));
		
		areas[0].getCities()[1].addBuildings(new Buildings("Building 0E", Ressource.FUEL, 100, "Station Avia #0", (short) 5, null));
		areas[0].getCities()[1].addBuildings(new Buildings("Building 0F", Ressource.MUNITIONS, 200, "Armunation LOW #0", (short) 10, null));
		areas[0].getCities()[1].addBuildings(new Buildings("Building 0G", Ressource.FOOD, 400, "Lidl #0", (short) 50, null));
		areas[0].getCities()[1].addBuildings(new Buildings("Building 0H", Ressource.FOOD, 800, "SuboMacDo #0", (short) 100, null));
		
		
		areas[1].getCities()[0].addBuildings(new Buildings("Building 1A", Ressource.FUEL, 100, "Station Avia #0", (short) 5, null));
		areas[1].getCities()[0].addBuildings(new Buildings("Building 1B", Ressource.MUNITIONS, 200, "Armunation LOW #0", (short) 10, null));
		areas[1].getCities()[0].addBuildings(new Buildings("Building 1C", Ressource.FOOD, 400, "Lidl #0", (short) 50, null));
		areas[1].getCities()[0].addBuildings(new Buildings("Building 1D", Ressource.FOOD, 800, "SuboMacDo #0", (short) 100, null));
		
		areas[1].getCities()[1].addBuildings(new Buildings("Building 1E", Ressource.FUEL, 100, "Station Avia #0", (short) 5, null));
		areas[1].getCities()[1].addBuildings(new Buildings("Building 1F", Ressource.MUNITIONS, 200, "Armunation LOW #0", (short) 10, null));
		areas[1].getCities()[1].addBuildings(new Buildings("Building 1G", Ressource.FOOD, 400, "Lidl #0", (short) 50, null));
		areas[1].getCities()[1].addBuildings(new Buildings("Building 1H", Ressource.FOOD, 800, "SuboMacDo #0", (short) 100, null));
		
		
		areas[2].getCities()[0].addBuildings(new Buildings("Building 2A", Ressource.FUEL, 100, "Station Avia #0", (short) 5, null));
		areas[2].getCities()[0].addBuildings(new Buildings("Building 2B", Ressource.MUNITIONS, 200, "Armunation LOW #0", (short) 10, null));
		areas[2].getCities()[0].addBuildings(new Buildings("Building 2C", Ressource.FOOD, 400, "Lidl #0", (short) 50, null));
		areas[2].getCities()[0].addBuildings(new Buildings("Building 2D", Ressource.FOOD, 800, "SuboMacDo #0", (short) 100, null));
		
		areas[2].getCities()[1].addBuildings(new Buildings("Building 2E", Ressource.FUEL, 100, "Station Avia #0", (short) 5, null));
		areas[2].getCities()[1].addBuildings(new Buildings("Building 2F", Ressource.MUNITIONS, 200, "Armunation LOW #0", (short) 10, null));
		areas[2].getCities()[1].addBuildings(new Buildings("Building 2G", Ressource.FOOD, 400, "Lidl #0", (short) 50, null));
		areas[2].getCities()[1].addBuildings(new Buildings("Building 2H", Ressource.FOOD, 800, "SuboMacDo #0", (short) 100, null));
		return areas;
	}
	
	
	

}
