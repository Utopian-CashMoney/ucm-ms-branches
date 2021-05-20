package com.ucm.ms.branches.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "banker")
public class Banker implements Serializable {
	private static final long serialVersionUID = -481881399599301147L;

	// Data
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	// Relationships
	@ManyToOne
	@JoinColumn(name = "branch_location_number", referencedColumnName = "location_number")
	private Branch branch;

	// Methods
	public Banker() {
	}

	public Banker(String name, Branch branch) {
		super();
		this.name = name;
		this.branch = branch;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Banker banker = (Banker) o;
		return Objects.equals(id, banker.id) && Objects.equals(name, banker.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

}
