package com.example.springfirstproject.service;

import com.example.springfirstproject.model.Product;
import com.example.springfirstproject.responsitory.ProductResponsitory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  @Autowired
  ProductResponsitory productResponsitory;

  public List<Product> getAllProducts() {
    return productResponsitory.findAll();
  }

  public void addProduct(Product product) {
    productResponsitory.save(product);
  }

  public void removeProductById(int id) {
    productResponsitory.deleteById(id);
  }

  public Optional<Product> getProductById(int id) {
    return productResponsitory.findById(id);
  }
  public List<Product> getAllProductsByCategoryId(int categoryId){
    return productResponsitory.findAllByCategoryId(categoryId);
  }
}
