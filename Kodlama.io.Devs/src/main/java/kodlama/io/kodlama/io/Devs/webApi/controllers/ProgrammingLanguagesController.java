package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguagesService;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguages;



@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	
	
	private ProgrammingLanguagesService languagesService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguagesService languagesService) {
		super();
		this.languagesService = languagesService;
	}
	
	
	@GetMapping("/program")
	public List<ProgrammingLanguages> getAll(){
		return languagesService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguages language) throws Exception{
		languagesService.add(language);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody ProgrammingLanguages language) throws Exception {
		languagesService.update(language);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody ProgrammingLanguages language) {
		languagesService.delete(language);
	}
	
	@GetMapping("/programminglanguages")
	public ProgrammingLanguages getById(@PathVariable int id) {
		return languagesService.getById(id);
	}
	
}
