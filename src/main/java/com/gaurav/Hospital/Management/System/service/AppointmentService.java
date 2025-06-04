package com.gaurav.Hospital.Management.System.service;

import com.gaurav.Hospital.Management.System.models.Appointment;
import com.gaurav.Hospital.Management.System.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> getAllAppointments(){
        try {
            System.out.println("into service layer");
            //interact with repo layer
            return null;

        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }
    public Appointment getAppointmentById(Long Id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }


    public Appointment deleteAppointment(Long id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }

    public Appointment updateAppointment(Long id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }

}

