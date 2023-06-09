package com.elxsi.tataelxsi.repository;


import com.elxsi.tataelxsi.entity.HeathProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRepo extends JpaRepository<HeathProducts, Integer> {


}