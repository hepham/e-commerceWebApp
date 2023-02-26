package com.example.springfirstproject.service;

import com.example.springfirstproject.model.Category;
import com.example.springfirstproject.responsitory.CategoryRespository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

  @Autowired
  CategoryRespository categoryRespository;

  public List<Category> getAllCategory() {
    return categoryRespository.findAll();
  }

  public void addCategory(Category category) {
    categoryRespository.save(category);
  }

  public void removeCategoryById(int id) {
    categoryRespository.deleteById(id);
  }

  public Optional<Category> getCategoryById(int id) {
    return categoryRespository.findById(id);
  }
}
