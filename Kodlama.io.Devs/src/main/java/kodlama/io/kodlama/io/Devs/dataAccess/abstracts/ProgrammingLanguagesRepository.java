package kodlama.io.kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

public interface ProgrammingLanguagesRepository {

	List<ProgrammingLanguages> getAll();
	void add(ProgrammingLanguages language);
	void delete(ProgrammingLanguages language);
	void update(ProgrammingLanguages language);
	ProgrammingLanguages getById(int id);
	
	
	
	
}
