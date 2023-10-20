package com.example.employeservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
