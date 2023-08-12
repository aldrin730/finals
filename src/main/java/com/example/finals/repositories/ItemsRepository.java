package com.example.finals.repositories;

import com.example.finals.entities.Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemsRepository extends JpaRepository<Items,String> {
    List<Items> findItemsByIcode(String icode);
}

