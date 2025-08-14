package guide.repository;

import guide.model.ModelClass;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCls extends JpaRepository<ModelClass,Long>{

}
