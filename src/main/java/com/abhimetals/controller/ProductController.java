package com.abhimetals.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.abhimetals.entity.Product;
import com.abhimetals.service.ProductService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @ApiOperation(value = "Add Product in the System ", response = Iterable.class, tags = "addProduct")
    @RequestMapping(value = "/addProduct",method = RequestMethod.POST,produces = "application/json")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
    @ApiOperation(value = "Add Multiple Products in the System ", response = Iterable.class, tags = "addProducts")
    @RequestMapping(value = "/addProducts",method = RequestMethod.POST,produces = "application/json")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @ApiOperation(value = "View a list of available products", response = Iterable.class)
    @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Successfully retrieved list"),
    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
    @RequestMapping(value = "/products",method = RequestMethod.GET,produces = "application/json")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }
    @ApiOperation(value = "Get Product from the System By Id ", response = Iterable.class, tags = "getProduct")
    @RequestMapping(value = "/productById/{id}",method = RequestMethod.GET,produces = "application/json")
    public Product findProductById(@PathVariable Integer id) {
        return service.getProductById(id);
    }
    @ApiOperation(value = "Get specific Product in the System ", response = Product.class, tags = "getProduct")
    @RequestMapping(value = "/product/{name}",method = RequestMethod.GET,produces = "application/json")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }
    @ApiOperation(value = "Update Product from the System ", response = Iterable.class, tags = "updateProduct")
    @RequestMapping(value = "/update",method = RequestMethod.PUT,produces = "application/json")
    public Product updateProduct(@RequestBody Product id) {
        return service.updateProductById(id);
    }

    @ApiOperation(value = "Update Product from the System ", response = Iterable.class, tags = "updateProduct")
    @RequestMapping(value = "/updatebyname/{name}",method = RequestMethod.PUT,produces = "application/json")
    public Product updateProductById(@RequestParam(name = "name",required = true) Product name) {
        return service.updateProductByName(name);
    }
    
    @ApiOperation(value = "Delete Product in the System ", response = Iterable.class, tags = "deleteproduct")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json")
    public String deleteProduct(@PathVariable Integer id) {
        return service.deleteProduct(id);
    }

}
