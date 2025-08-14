package guide.rservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guide.model.ModelClass;
import guide.repository.RepositoryCls;

@Service
public class ServiceClass implements serviceinterface{
	@Autowired
	private RepositoryCls repository;

	@Override
	public List<ModelClass> getAllData() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	
	@Override
	public ModelClass createOrUpdate(ModelClass newdata) {
		// TODO Auto-generated method stub
		return repository.save(newdata);
	}

	@Override
	public ModelClass getById(Long id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id).orElse(null);

	}

	@Override
	public void deletenewdata(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	

}
