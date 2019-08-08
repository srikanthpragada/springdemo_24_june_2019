package jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class DeptList{

	@Autowired
	private DeptRepo repo;
	
	public void list()  {
		for (Department d : repo.findAll())
			System.out.println(d.getName());
	}
	
	public void recentDepartments(int id)  {
		List<Department> depts = repo.getRecentDepartments(id);
		for(Department d : depts)
			System.out.println(d);
		
		//depts.forEach(System.out::println);
	}

}
