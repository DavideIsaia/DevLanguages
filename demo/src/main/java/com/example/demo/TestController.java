package com.example.demo;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin( "*" )
@RestController
public class TestController {
	
	@RequestMapping("/benvenuto")
	public String benvenuto() {
		return "Ciao Davide!";
	}
	
	@RequestMapping("/dashboard")
	public ArrayList<String> getLanguages() {
		
		ArrayList<String> languages = new ArrayList<String>(); 
		languages.add("HTML-5");
		languages.add("CSS-3");
		languages.add("JavaScript-ES6");
		languages.add("Boostrap-5");
		languages.add("PHP-7");
		languages.add("Java");
		languages.add("Angular-2");
		languages.add("MySQL");
		languages.add("Python");
		languages.add("Vue-2");
		languages.add("Laravel-7");
		languages.add("Docker");
		
		return languages;
	}
}
	/* struttura dell'oggetto da creare e passare ad angular dto/dao	 dashboard response dto 
	  export interface DevLanguage {
		  id: number;
		  name: string;
		  symbol: string;
		  color: string,
		  description: string;
		  links: {
		    docs: string;
		    video: string;
		  };
		  exercises: {
		    beginner: string;
		    intermediate: string;
		    advanced: string;
		    expert: string;
		  };
		}
	*/