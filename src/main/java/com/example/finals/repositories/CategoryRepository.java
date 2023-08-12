package com.example.finals.repositories;

import com.example.finals.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,String>  {
    List<Category> findCategoriesByCatcode(String catcode);
}
