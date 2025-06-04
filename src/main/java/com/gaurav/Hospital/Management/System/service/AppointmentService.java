package com.gaurav.Hospital.Management.System.service;

import com.gaurav.Hospital.Management.System.models.Appointment;
import com.gaurav.Hospital.Management.System.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        try {
            System.out.println("Into service layer");
            return appointmentRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            Optional<Appointment> appointment = appointmentRepository.findById(id);
            return appointment.orElse(null);
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            return appointmentRepository.save(appointment);
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id) {
        try {
            appointmentRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public void updateAppointment(Long id, Appointment updatedAppointment) {
        try {
            Optional<Appointment> existingAppointment = appointmentRepository.findById(id);
            if (existingAppointment.isPresent()) {
                Appointment a = existingAppointment.get();
                a.setDoctorId(updatedAppointment.getDoctorId());
                a.setPatientId(updatedAppointment.getPatientId());
                a.setDate(updatedAppointment.getDate());
                appointmentRepository.save(a);
            }
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}
