package com.example.springfirstproject.global;

import com.example.springfirstproject.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalDara {
    public static List<Product> cart;
    static {
        cart=new ArrayList<>();
    }
}
