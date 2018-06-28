package rguioueg.com.enumeration;

public enum MenuActions {
	AREA("Area"),
	AREA_SHOW("Area"),
	AREA_SELECT("Area"),
	
	CITIES("Area"),
	CITIES_SHOW("Area"),
	CITIES_CREATE("Area"),
	CITIES_MODIFY("Area"),
	CITIES_DESTROY("Area"),
	CITIES_SELECT("Area"),
	
	BUILDINGS("Area"),
	BUILDINGS_SHOW("Area"),
	BUILDINGS_CREATE("Area"),
	BUILDINGS_MODIFY("Area"),
	BUILDINGS_DESTROY("Area"),
	BUILDINGS_SELECT("Area"),
	
	ENEMIES("Area"),
	ENEMIES_SHOW("Area"),
	ENEMIES_ATTACK("Area"),
	ENEMIES_SELECT(""),
	
	EXIT("Area");
	
	protected int id;
	protected String value;
	
	MenuActions() {
		
	}
	
	MenuActions(String value) {
		this.value = value;
		
	}
	
	MenuActions(int id, String value) {
		this.id = id;
		this.value = value;
		
	}
	
	

}
