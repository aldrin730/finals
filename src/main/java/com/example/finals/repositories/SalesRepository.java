package com.example.finals.repositories;

import com.example.finals.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalesRepository extends JpaRepository<Sales,Long> {
    List<Sales> findSalesById(long s);
}
