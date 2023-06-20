package com.project.blog.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Role {

	@Id	
	private int id;
	
	private String name;
	
}
