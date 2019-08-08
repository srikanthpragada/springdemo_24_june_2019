package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "departments")
public class Department {
	@Id
	@Column(name = "department_id")
	//@Min(value=10,  message = "Invalid Department Id")
	private int id;

	@Column(name = "department_name")
	// @NotBlank 
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
