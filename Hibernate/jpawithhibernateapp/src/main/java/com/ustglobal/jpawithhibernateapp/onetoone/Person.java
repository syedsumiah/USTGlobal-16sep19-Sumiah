package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person {  // Person is a source entity
	@Id
	@Column
	private int pid;
	@Column
	private String pname;
	@OneToOne(cascade = CascadeType.ALL) // why we using cascade me we perform all operation
	@JoinColumn(name = "vid")  // forign key
	private VoterCard voterCard;
	

}
