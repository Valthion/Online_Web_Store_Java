/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tas.form;

import com.example.tas.entity.Products;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Mario Wijaya
 */
public class ProductForm {
    private String code;
    private String name;
    private double price;
 
    private boolean newProduct = false;
 
    // Upload file.
    private MultipartFile fileData;
 
    public ProductForm() {
        this.newProduct= true;
    }
 
    public ProductForm(Products product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
    }
 
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public MultipartFile getFileData() {
        return fileData;
    }
 
    public void setFileData(MultipartFile fileData) {
        this.fileData = fileData;
    }
 
    public boolean isNewProduct() {
        return newProduct;
    }
 
    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }
}
