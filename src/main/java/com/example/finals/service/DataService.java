package com.example.finals.service;

import com.example.finals.entities.Category;
import com.example.finals.entities.Items;
import com.example.finals.entities.Sales;
import com.example.finals.repositories.CategoryRepository;
import com.example.finals.repositories.ItemsRepository;
import com.example.finals.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class DataService {
    @Autowired
    private CategoryRepository cr;
    @Autowired
    private ItemsRepository ir;
    @Autowired
    private SalesRepository sr;

    public List<Category> getCategory() {
        return cr.findAll();
    }
    public List<Items> getItems() {
        return ir.findAll();
    }
    public List<Sales> getSales() {
        return sr.findAll();
    }

}
