package com.gaurav.Hospital.Management.System.service;

import com.gaurav.Hospital.Management.System.models.Bill;
import com.gaurav.Hospital.Management.System.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    public List<Bill> getAllBills(){
        try {
            System.out.println("into service layer");
            //interact with repo layer
            return null;

        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }
    public Bill getBillById(Long Id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }


    public Bill deleteBill(Long id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }

    public Bill updateBill(Long id){
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message"+ e.getMessage());
            return null;
        }
    }
}
