package io.Jaydeep.SpringBootProject.Hello;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	//calling hello class
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	//calling AddService service class -> using member variable using @Autoeired annotation.
	@Autowired
	private AddService addService;
	
	@RequestMapping("/List")
	public List<Add> getList(){
		return addService.getAllAddition(); 
	}
	
	
	//Get Method : Calling list from service class using path Veriable.
	@RequestMapping("/List/{id}")
	public Add getAdd(@PathVariable String id) {
		return addService.getAdding(id);
	}
	
	
	@RequestMapping("/other")
	public String other() {
		return "part-3";
	}
	
	
	//---------------------------POST Methods Starts Here--------------------------//
	
	@RequestMapping(method=RequestMethod.POST, value="/List")
	public void insertValue(@RequestBody Add add2) {
		addService.addValue(add2);
	}

}
