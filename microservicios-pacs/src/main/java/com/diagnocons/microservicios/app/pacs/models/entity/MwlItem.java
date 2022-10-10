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
@Table(name = "mwl_item")
public class MwlItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk")
	private Long id;
	
	@Column(name = "accession_no")
	private String accessionNo;
	
	@Column(name = "created_time")
	private LocalDateTime createdTime;
	
	private String modality;
	
	@Column(name = "req_proc_id")
	private String reqProcId;
	
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

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public String getReqProcId() {
		return reqProcId;
	}

	public void setReqProcId(String reqProcId) {
		this.reqProcId = reqProcId;
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
