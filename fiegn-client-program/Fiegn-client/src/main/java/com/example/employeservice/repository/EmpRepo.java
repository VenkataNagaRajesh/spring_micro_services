package com.example.employeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeservice.entity.Employe;

@Repository
public interface EmpRepo extends JpaRepository<Employe, Integer>{

}
