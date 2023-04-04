package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

public interface ProgrammingLanguagesService {
	
	List<ProgrammingLanguages> getAll();

	void add(ProgrammingLanguages language) throws Exception;

	void update(ProgrammingLanguages language) throws Exception;

	void delete(ProgrammingLanguages language);

	ProgrammingLanguages getById(int id);

}
