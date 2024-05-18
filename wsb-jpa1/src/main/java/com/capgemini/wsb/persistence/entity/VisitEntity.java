package com.capgemini.wsb.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
@Getter
@Setter
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

	@ManyToOne
	private DoctorEntity doctorEntity;

	@ManyToOne
	private PatientEntity patientEntity;

	@OneToMany(mappedBy = "visitEntity")
	private List<MedicalTreatmentEntity> medicalTreatmentEntities;


}
