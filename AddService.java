package io.Jaydeep.SpringBootProject.Hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


//Creating Service Class , intanciacing this class to controller before calling
//Mapping this class with Add.java Class to get the object.

@Service
public class AddService {
	
	
	private List<Add> add=new ArrayList<>(Arrays.asList(
			new Add("001","Jaydeep","Senior Software Architect || Director"),
			new Add("002","Jayashree","Education Minister"),
			new Add("003","Kalpana","Love you Maa.!")
						
			));
	
	//Returning all List data to controller
	public List<Add> getAllAddition(){
		return add;
	}
	
	
	//Returning single id from list of Id's into Controller Class
	
	public Add getAdding(String id) {
		return add.stream().filter(a->a.getId().equals(id)).findFirst().get();
	}


	public void addValue(Add add2) {
		add.add(add2);
		
	}
	
	

}
