 package com.klef.jfsd.exam.repository;  // Adjusted to your correct package structure

import com.klef.jfsd.exam.model.Customer;  // Correct import for the Customer model
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom queries can be added here if needed
}
