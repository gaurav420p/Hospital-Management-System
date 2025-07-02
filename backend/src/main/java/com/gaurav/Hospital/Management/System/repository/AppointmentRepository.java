package com.gaurav.Hospital.Management.System.repository;

import com.gaurav.Hospital.Management.System.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
