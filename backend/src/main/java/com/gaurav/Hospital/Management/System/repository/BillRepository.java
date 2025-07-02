package com.gaurav.Hospital.Management.System.repository;

import com.gaurav.Hospital.Management.System.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
}
