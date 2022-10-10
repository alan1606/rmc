package com.diagnocons.microservicios.app.pacs.models.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
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
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk")
	private Long id;
	
	@Column(name = "created_time")
	private LocalDateTime createdTime;
	
	@Column(name = "num_studies")
	private Long numStudies;
	
	@Column(name = "pat_custom1")
	private String patCustom;
	
	@Column(name = "pat_sex")
	private String sex;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "patient_id_fk")
	@ManyToOne(fetch = FetchType.LAZY)
	private PatientId patientId;
	
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "pat_name_fk")
	@ManyToOne(fetch = FetchType.LAZY)
	private PersonName personName;


	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDateTime getCreatedTime() {
		return createdTime;
	}


	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}


	public Long getNumStudies() {
		return numStudies;
	}


	public void setNumStudies(Long numStudies) {
		this.numStudies = numStudies;
	}


	public String getPatCustom() {
		return patCustom;
	}


	public void setPatCustom(String patCustom) {
		this.patCustom = patCustom;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public PatientId getPatientId() {
		return patientId;
	}


	public void setPatientId(PatientId patientId) {
		this.patientId = patientId;
	}


	public PersonName getPersonName() {
		return personName;
	}


	public void setPersonName(PersonName personName) {
		this.personName = personName;
	}
	
	
	
}
