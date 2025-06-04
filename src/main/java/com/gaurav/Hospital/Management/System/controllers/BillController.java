package com.gaurav.Hospital.Management.System.controllers;

import com.gaurav.Hospital.Management.System.models.Appointment;
import com.gaurav.Hospital.Management.System.models.Bill;
import com.gaurav.Hospital.Management.System.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BillController {

    @Autowired
    BillService billService;

    @GetMapping
    public List<Bill> getAllBills(){
        System.out.println("Fetching all Bills....");
        return billService.getAllBills();
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        System.out.println("Creating  bill....");
        return billService.createBill(bill);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id){
        System.out.println("Fetching the Bill By Id..." + id);
        return billService.getBillById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id){
        System.out.println("Deleting the Bill By Id..." + id);
        billService.deleteBill(id);

    }

    @PutMapping("/{id}")
    public void updateBill(@PathVariable Long id){
        System.out.println("Updating the Bill By Id..." + id);
        billService.updateBill(id);

    }
}
