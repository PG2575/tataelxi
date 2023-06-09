package com.elxsi.tataelxsi.controller;

import com.elxsi.tataelxsi.entity.HeathProducts;
import com.elxsi.tataelxsi.repository.HealthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Rest end point methods ......

@RestController
@RequestMapping("/elxsi")
public class HealthController {

    @Autowired
    private HealthRepo healthRepo; // Dependency Injection applied


    @GetMapping("/getHealthproducts")  // retrieve products
    public List<HeathProducts> getAllProducts() {
        System.out.println("getting all products Health data from the database");
        return healthRepo.findAll();

    }

    @PostMapping("/addHealthproducts")  // create or add new products
    public List<HeathProducts> addProducts(@RequestBody List<HeathProducts> products) {
        return healthRepo.saveAll(products);
    }

    @PutMapping("/updateHealthStatus")  // modiify all fields
    public HeathProducts updateProduct(@RequestBody HeathProducts products) {
        healthRepo.save(products);
        return products;

    }



    @DeleteMapping("/delete/{id}")
    public String deleteIndividual(@PathVariable int id) {
        healthRepo.deleteById(id);
        return "deleted successfully";


    }
}