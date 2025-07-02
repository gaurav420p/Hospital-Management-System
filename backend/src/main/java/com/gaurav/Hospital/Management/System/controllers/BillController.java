package com.gaurav.Hospital.Management.System.controllers;

import com.gaurav.Hospital.Management.System.models.Bill;
import com.gaurav.Hospital.Management.System.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public List<Bill> getAllBills() {
        System.out.println("Fetching all Bills...");
        return billService.getAllBills();
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        System.out.println("Creating bill...");
        return billService.createBill(bill);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        System.out.println("Fetching the Bill By Id..." + id);
        return billService.getBillById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id) {
        System.out.println("Deleting the Bill By Id..." + id);
        billService.deleteBill(id);
    }

    @PutMapping("/{id}")
    public Bill updateBill(@PathVariable Long id, @RequestBody Bill bill) {
        System.out.println("Updating the Bill By Id..." + id);
        billService.updateBill(id, bill);
        return bill;
    }
}
