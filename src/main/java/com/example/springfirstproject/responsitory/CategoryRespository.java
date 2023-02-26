package com.example.springfirstproject.responsitory;

import com.example.springfirstproject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRespository extends JpaRepository<Category, Integer> {}
