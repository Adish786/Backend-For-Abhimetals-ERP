package com.abhimetals.service;

import com.abhimetals.entity.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> saveProducts(List<Product> products);

    List<Product> getProducts();

    Product getProductById(Integer id);

    Product getProductByName(String name);

    Product updateProductById(Product id);

    Product updateProductByName(Product name);

    String deleteProduct(Integer id);
}
