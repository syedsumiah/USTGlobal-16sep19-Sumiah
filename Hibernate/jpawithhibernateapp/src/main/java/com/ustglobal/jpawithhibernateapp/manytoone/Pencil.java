package com.ustglobal.jpawithhibernateapp.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pencil")
public class Pencil {
	@Id
	@Column
	private int pid;
	@Column
	private String color;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bid",nullable = false) // whenever we using many to one forign key is not null that's why we are using 'nullable'
	private PencilBox pencilBox;
	

}
