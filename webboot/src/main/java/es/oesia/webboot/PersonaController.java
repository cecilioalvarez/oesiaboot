package es.oesia.webboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonaController {

	@RequestMapping("/persona")
	public Persona getPersona() {
		
		return new Persona("antonio");
	}
	
}
