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
@Table(name = "study")
public class Study {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk")
	private Long id;
	
	@Column(name = "accession_no")
	private String accessionNo;
	
	@Column(name = "created_time")
	private LocalDateTime createdTime;
	
	@Column(name = "study_desc")
	private String studyDesc;
	
	@Column(name = "study_id")
	private String studyId;
	
	@Column(name = "study_iuid")
	private String studyIuid;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "patient_fk")
	@ManyToOne(fetch = FetchType.LAZY)
	private Patient patient;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccessionNo() {
		return accessionNo;
	}

	public void setAccessionNo(String accessionNo) {
		this.accessionNo = accessionNo;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}

	public String getStudyDesc() {
		return studyDesc;
	}

	public void setStudyDesc(String studyDesc) {
		this.studyDesc = studyDesc;
	}

	public String getStudyId() {
		return studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}

	public String getStudyIuid() {
		return studyIuid;
	}

	public void setStudyIuid(String studyIuid) {
		this.studyIuid = studyIuid;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	
}
