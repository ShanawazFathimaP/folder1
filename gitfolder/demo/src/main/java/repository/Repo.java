package repository;




import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entity.Entity_example;
import jakarta.persistence.Id;
@Repository
public interface Repo extends CrudRepository< Id ,Integer> {
	
	@Query("Select * from employee where name=:name1")
	List<Entity_example> findid(@Param("name1")String name1);
	@Query(value="Select * from employee order by name")
	public  List<Entity_example> sortbyname();
	
	
}


