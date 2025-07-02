package com.gaurav.Hospital.Management.System.service;

import com.gaurav.Hospital.Management.System.models.Patient;
import com.gaurav.Hospital.Management.System.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    @Autowired
    private PatientRepository patientRepository;

    public Page<Patient> getAllPatients(int page, int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            return patientRepository.findAll(pageable);
        } catch (Exception e) {
            logger.error("An error occurred while fetching all patients: {}", e.getMessage());
            return Page.empty(); // Return empty page on error
        }
    }

    public Patient getPatientById(Long id) {
        try {
            return patientRepository.findById(id).orElse(null);
        } catch (Exception e) {
            logger.error("An error occurred while fetching patient with Id {}: {}", id, e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            return patientRepository.save(patient);
        } catch (Exception e) {
            logger.error("An error occurred while creating patient: {}", e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id) {
        try {
            logger.info("Deleting patient with id : {}", id);
            patientRepository.deleteById(id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting patient with Id {}: {}", id, e.getMessage());
        }
    }

    public void updatePatient(Long id, Patient updatedPatient) {
        try {
            Optional<Patient> existingPatient = patientRepository.findById(id);
            if (existingPatient.isPresent()) {
                Patient p = existingPatient.get();
                p.setName(updatedPatient.getName());
                p.setAge(updatedPatient.getAge());
                p.setGender(updatedPatient.getGender());
                patientRepository.save(p);
            }
        } catch (Exception e) {
            logger.error("An error occurred while updating patient with Id {}: {}", id, e.getMessage());
        }
    }
}
