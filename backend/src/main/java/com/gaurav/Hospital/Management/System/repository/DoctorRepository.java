package com.gaurav.Hospital.Management.System.repository;

import com.gaurav.Hospital.Management.System.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
