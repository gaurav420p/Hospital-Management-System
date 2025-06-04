package com.gaurav.Hospital.Management.System.controllers;

import com.gaurav.Hospital.Management.System.models.Appointment;
import com.gaurav.Hospital.Management.System.models.Patient;
import com.gaurav.Hospital.Management.System.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;
    @GetMapping
    public List<Appointment> getAllAppointments(){
        System.out.println("Fetching all patients....");
        return appointmentService.getAllAppointments();
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment){
        System.out.println("Creating  the Appointment....");
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id){
        System.out.println("Fetching the Appointment By Id..." + id);
        return appointmentService.getAppointmentById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
        System.out.println("Deleting the Appointment By Id..." + id);
        appointmentService.deleteAppointment(id);

    }

    @PutMapping("/{id}")
    public void updateAppointment(@PathVariable Long id){
        System.out.println("Updating the Appointment By Id..." + id);
        appointmentService.updateAppointment(id);

    }
}
