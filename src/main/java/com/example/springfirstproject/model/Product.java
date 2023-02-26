package com.example.springfirstproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import javax.persistence.Id;

@Entity
@Data
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String Name;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id", referencedColumnName = "category_id")
  private Category category;

  private double price;
  private double weight;
  private String description;
  private String imageName;
}
