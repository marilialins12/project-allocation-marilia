package com.projetc.professor.allocation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Departament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "departament")
	private List<Professor> professors;
	// MAPEAMENTO BIDIRECIONAL(a volta), qdo pede o departamento ja mostra 
	//a lista dos professores
		
	
	public Departament() {
		super();
	}

	public Departament(Long id, String name, List<Professor> professors) {
		super();
		this.id = id;
		this.name = name;
		this.professors = professors;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Professor> getProfessors() {
		return professors;
	}



	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}
	

}
	
	
	

	
