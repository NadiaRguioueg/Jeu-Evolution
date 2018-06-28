package rguioueg.com.objet;

import rguioueg.com.enumeration.Ressource;

public class Humanbeing {
	protected byte id;
	protected String name;
	protected byte damages;
	protected byte life;
	protected Ressource ressource;
	
	protected Humanbeing(byte id, String name, byte damages, byte life, Ressource ressource) {
		super();
		this.id = id;
		this.name = name;
		this.damages = damages;
		this.life = life;
		this.ressource = ressource;
	}
	
	
}
