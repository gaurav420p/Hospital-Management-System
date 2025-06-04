package com.gaurav.Hospital.Management.System.service;

import com.gaurav.Hospital.Management.System.models.Patient;
import com.gaurav.Hospital.Management.System.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        try {
            System.out.println("into service layer");
            return patientRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while fetching all patients: {}", e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(Long id) {
        try {
            Optional<Patient> patient = patientRepository.findById(id);
            return patient.orElse(null);
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while fetching patient with Id {}: {}", id, e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            patientRepository.save(patient);
            return patient;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while creating patient: {}", e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id) {
        try {
            logger.info("Deleting patient with id : {}", id);
            patientRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
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
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while updating patient with Id {}: {}", id, e.getMessage());
        }
    }
}
