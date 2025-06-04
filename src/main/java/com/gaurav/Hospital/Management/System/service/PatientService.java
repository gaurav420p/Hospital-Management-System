package com.gaurav.Hospital.Management.System.service;

import com.gaurav.Hospital.Management.System.models.Patient;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatients(){
        try {
            System.out.println("into service layer");
            //interact with repo layer
            return null;

        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }
    public Patient getPatientById(Long Id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }


    public Patient deletePatient(Long id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }

    public Patient updatePatient(Long id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }

}
