package com.gaurav.Hospital.Management.System.controllers;

import com.gaurav.Hospital.Management.System.models.Appointment;
import com.gaurav.Hospital.Management.System.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAllAppointments() {
        System.out.println("Fetching all Appointments...");
        return appointmentService.getAllAppointments();
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        System.out.println("Creating the Appointment...");
        return appointmentService.createAppointment(appointment);
    }
//    @PostMapping
//    public Appointment createAppointment(@RequestBody Appointment appointmentRequest) {
//        System.out.println("Creating the Appointment...");
//
//        // 1. Create the appointment using the service layer
//        Appointment appointment = appointmentService.createAppointment(appointmentRequest);
//
//        // 2. Prepare the webhook payload
//        Map<String, Object> payload = new HashMap<>();
//        payload.put("appointmentId", appointment.getId());
//        payload.put("patientId", appointment.getPatientId());
//        payload.put("doctorId", appointment.getDoctorId());
//        payload.put("appointmentDate", appointment.getDate());
//
//        // 3. Send the webhook
//        String webhookUrl = "http://localhost:8081/webhook"; // Replace with your actual webhook endpoint
//        webhookService.sendWebhook(webhookUrl, payload);
//
//        return appointment;
//    }


    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        System.out.println("Fetching the Appointment By Id..." + id);
        return appointmentService.getAppointmentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        System.out.println("Deleting the Appointment By Id..." + id);
        appointmentService.deleteAppointment(id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
        System.out.println("Updating the Appointment By Id..." + id);
        appointmentService.updateAppointment(id, appointment);
        return appointment;
    }
}
