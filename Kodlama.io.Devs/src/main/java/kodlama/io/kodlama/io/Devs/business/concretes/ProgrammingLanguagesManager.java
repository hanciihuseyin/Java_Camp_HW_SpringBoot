package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguagesService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguages;


@Service
public class ProgrammingLanguagesManager implements ProgrammingLanguagesService{
	
	private ProgrammingLanguagesRepository languagesRepository;
	
	
	
	@Autowired
	public ProgrammingLanguagesManager(ProgrammingLanguagesRepository languagesRepository) {
		super();
		this.languagesRepository = languagesRepository;
	}

	@Override
	public List<ProgrammingLanguages> getAll() {
		
		return languagesRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguages language) throws Exception {
		List<ProgrammingLanguages> existinglaLanguages;
		existinglaLanguages = languagesRepository.getAll();
		
		for (ProgrammingLanguages programmingLanguages : existinglaLanguages) {
			if(programmingLanguages.getName().equalsIgnoreCase(language.getName())) {
				throw new Exception("Please enter a language not "
						+ "available in the system! ");
			}
		}
		if(language.getName().isEmpty()){
			throw new Exception("Programming language cannot be left blank! ");
		}
			
		
		languagesRepository.add(language);
		
	}

	@Override
	public void update(ProgrammingLanguages language) throws Exception {
		if(language.getName().isEmpty())
			throw new Exception("Programming language cannot be left blank! ");
		languagesRepository.update(language);
	}

	@Override
	public void delete(ProgrammingLanguages language) {
		languagesRepository.delete(language);
		
	}

	@Override
	public ProgrammingLanguages getById(int id) {
		
		return languagesRepository.getById(id);
	}

}
