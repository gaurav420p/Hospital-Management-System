package com.gaurav.Hospital.Management.System.controllers;

import com.gaurav.Hospital.Management.System.models.Doctor;
import com.gaurav.Hospital.Management.System.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors(){
        System.out.println("Fetching all Doctors....");
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("Creating Doctor....");
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id){
        System.out.println("Fetching the Doctor By Id..." + id);
        return doctorService.getDoctorById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id){
        System.out.println("Deleting theDoctor By Id..." + id);
        doctorService.deleteDoctor(id);


    }

    @PutMapping("/{id}")
    public void updateDoctor(@PathVariable Long id){
        System.out.println("Updating the Doctor By Id..." + id);
        doctorService.updateDoctor(id);

    }
}
