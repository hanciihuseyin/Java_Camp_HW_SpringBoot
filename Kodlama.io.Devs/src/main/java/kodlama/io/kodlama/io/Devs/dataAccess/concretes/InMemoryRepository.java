package kodlama.io.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@Repository
public class InMemoryRepository implements ProgrammingLanguagesRepository {

	List<ProgrammingLanguages> languages;
	
	
	@Autowired
	public InMemoryRepository() {
		languages = new ArrayList<ProgrammingLanguages>();
		languages.add(new ProgrammingLanguages(1, "C"));
		languages.add(new ProgrammingLanguages(2, "C#"));
		languages.add(new ProgrammingLanguages(3, "Java"));
		languages.add(new ProgrammingLanguages(4, "Python"));		
	}

	@Override
	public List<ProgrammingLanguages> getAll() {
		
		return languages;
	}

	@Override
	public void add(ProgrammingLanguages language) {
		languages.add(language);
		
	}

	@Override
	public void delete(ProgrammingLanguages language) {
		languages.remove(language.getId() - 1);
		
	}

	@Override
	public void update(ProgrammingLanguages language) {
		languages.set(language.getId() - 1 , language);
		
	}

	@Override
	public ProgrammingLanguages getById(int id) {
		
		return languages.get(id - 1);
	}
	
	
	
	
	
}
