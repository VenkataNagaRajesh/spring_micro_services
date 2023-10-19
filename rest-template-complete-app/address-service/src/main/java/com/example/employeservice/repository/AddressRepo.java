package com.example.employeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.employeservice.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

	@Query(nativeQuery = true, value = "select ea.eid,ea.line1,ea.line2,ea.line3 from "
									+ "micro_services.address ea  left join "
									+ "micro_services.employe e on "
									+ "e.eid=ea.eid where e.eid=:empId")
	Address findAddressByEmployeId(@Param("empId") int empId);
}
