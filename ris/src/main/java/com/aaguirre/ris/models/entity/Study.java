package com.aaguirre.ris.models.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "studies")
public class Study {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "procedure_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Procedure procedure;
	
	private String iuid;
	
	private LocalDateTime finished;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "status_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Status status;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "technician_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Technician technician;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Procedure getProcedure() {
		return procedure;
	}

	public void setProcedure(Procedure procedure) {
		this.procedure = procedure;
	}

	public String getIuid() {
		return iuid;
	}

	public void setIuid(String iuid) {
		this.iuid = iuid;
	}

	public LocalDateTime getFinished() {
		return finished;
	}

	public void setFinished(LocalDateTime finished) {
		this.finished = finished;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Technician getTechnician() {
		return technician;
	}

	public void setTechnician(Technician technician) {
		this.technician = technician;
	}
	
	
}
