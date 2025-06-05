package com.gaurav.Hospital.Management.System.repository;

import com.gaurav.Hospital.Management.System.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
