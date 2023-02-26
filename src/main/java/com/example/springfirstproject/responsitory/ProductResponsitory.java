package com.example.springfirstproject.responsitory;

import com.example.springfirstproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductResponsitory extends JpaRepository<Product, Integer> {
    List<Product> findAllByCategoryId(int id);
}
