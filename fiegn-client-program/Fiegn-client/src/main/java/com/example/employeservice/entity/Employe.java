package com.example.employeservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "employe")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="eid")
	private int id;
	@Column(name="ename")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="blood_group")
	private String bloodGroup;
}
