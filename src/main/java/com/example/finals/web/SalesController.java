package com.example.finals.web;

import com.example.finals.entities.Category;
import com.example.finals.entities.Items;
import com.example.finals.entities.Sales;
import com.example.finals.repositories.CategoryRepository;
import com.example.finals.repositories.ItemsRepository;
import com.example.finals.repositories.SalesRepository;
import com.example.finals.service.DataService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class SalesController {

    @Autowired
    private DataService ds;

    @GetMapping(path = "/")
    public String listOfSales(Model model) {

        List<Category> category = ds.getCategory();
        List<Items> items = ds.getItems();
        List<Sales> sales = ds.getSales();

        model.addAttribute("categoryList", category);
        model.addAttribute("itemsList", items);
        model.addAttribute("salesList", sales);

        return "listOfSales";
    }
}
