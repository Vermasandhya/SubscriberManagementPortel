package guide.rservice;

import java.util.List;

import guide.model.ModelClass;

public interface serviceinterface {
	List<ModelClass> getAllData();
	ModelClass createOrUpdate(ModelClass newdata );
	ModelClass getById (Long id);
	void deletenewdata(Long id);
	

}
