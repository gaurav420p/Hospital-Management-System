package com.gaurav.Hospital.Management.System.service;

import com.gaurav.Hospital.Management.System.models.Appointment;
import com.gaurav.Hospital.Management.System.models.Doctor;
import com.gaurav.Hospital.Management.System.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors(){
        try {
            System.out.println("into service layer");
            //interact with repo layer
            return null;

        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }
    public Doctor getDoctorById(Long Id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }


    public Doctor deleteDoctor(Long id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }

    public Doctor updateDoctor(Long id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }
}
