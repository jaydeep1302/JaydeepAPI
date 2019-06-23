package io.Jaydeep.SpringBootProject.Hello;

public class Add {
	
	//Variables
	private String id;
	private String Name;
	private String Description;
	

	//Constructors-No Args
	public Add() {
	
	}

	//Constructors-with Args	
	public Add(String id, String name, String description) {
		super();
		this.id = id;
		Name = name;
		Description = description;
	}	
	
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	
}
