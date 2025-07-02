package com.gaurav.Hospital.Management.System.service;

import com.gaurav.Hospital.Management.System.models.Bill;
import com.gaurav.Hospital.Management.System.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public List<Bill> getAllBills() {
        try {
            System.out.println("Into service layer");
            return billRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            Optional<Bill> bill = billRepository.findById(id);
            return bill.orElse(null);
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            return billRepository.save(bill);
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id) {
        try {
            billRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public void updateBill(Long id, Bill updatedBill) {
        try {
            Optional<Bill> existingBill = billRepository.findById(id);
            if (existingBill.isPresent()) {
                Bill b = existingBill.get();
                b.setAmount(updatedBill.getAmount());
                b.setStatus(updatedBill.getStatus());
                b.setPatientId(updatedBill.getPatientId());
                billRepository.save(b);
            }
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}
