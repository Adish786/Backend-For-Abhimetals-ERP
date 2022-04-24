package com.abhimetals.serviceimpl;

import com.abhimetals.entity.Product;
import com.abhimetals.repository.ProductRepository;
import com.abhimetals.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceimpl implements ProductService {


    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByNameIs(name);
    }

    public String deleteProduct(Integer id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Product updateProductById(Product id) {
        Product existingProduct = repository.findById(id.getId()).orElse(null);
        existingProduct.setName(id.getName());
        existingProduct.setCategory(id.getCategory());
        existingProduct.setDescription(id.getDescription());
        existingProduct.setGrossRate(id.getGrossRate());
        existingProduct.setNetwait(id.getNetwait());
        existingProduct.setAttachment(id.getAttachment());
        
        return repository.save(existingProduct);
    }

    public Product updateProductByName(Product name) {
        Product existingProduct = repository.findByNameIs(name.getName());
        existingProduct.setId(name.getId());
        existingProduct.setCategory(name.getCategory());
        existingProduct.setDescription(name.getDescription());
        existingProduct.setGrossRate(name.getGrossRate());
        existingProduct.setNetwait(name.getNetwait());
        existingProduct.setAttachment(name.getAttachment());
        return repository.save(existingProduct);
    }

}
