package es.oesia.webboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonaController {

	@Autowired
	private PersonaRepository repo;
	
	@RequestMapping("/persona")
	public List<Persona> getPersona() {
		
		return repo.findAll();
	}
	
}
