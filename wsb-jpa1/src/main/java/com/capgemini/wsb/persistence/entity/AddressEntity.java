package com.capgemini.wsb.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ADDRESS")
@Getter
@Setter
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String city;

	private String addressLine1;

	private String addressLine2;

	private String postalCode;

	@ManyToMany(mappedBy = "addressEntity")
	private List<DoctorEntity> doctorEntities;

	@ManyToMany(mappedBy = "addressEntity")
	private List<PatientEntity> patientEntities;


}
