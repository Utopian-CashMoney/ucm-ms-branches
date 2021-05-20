package com.ucm.ms.branches.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "appointment")
public class Appointment implements Serializable {
	private static final long serialVersionUID = -2548083122650649843L;

	// Data
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "scheduled_time")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
	private LocalDateTime scheduledTime;

	@Column(name = "service")
	private String service;

	// Relationships
	@ManyToOne
	@JoinColumn(name = "branch_location_number", referencedColumnName = "location_number")
	private Branch branch;

	@ManyToOne
	@JoinColumn(name = "banker_id", referencedColumnName = "id")
	private Banker banker;

	// Methods
	public Appointment(LocalDateTime scheduledTime, String service, Branch branch, Banker banker) {
		super();
		this.scheduledTime = scheduledTime;
		this.service = service;
		this.branch = branch;
		this.banker = banker;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getScheduledTime() {
		return scheduledTime;
	}

	public void setScheduledTime(LocalDateTime scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Banker getBanker() {
		return banker;
	}

	public void setBanker(Banker banker) {
		this.banker = banker;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Appointment appointment = (Appointment) o;
		return Objects.equals(id, appointment.id) && Objects.equals(scheduledTime, appointment.scheduledTime)
				&& Objects.equals(service, appointment.service);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, scheduledTime, service);
	}

}
