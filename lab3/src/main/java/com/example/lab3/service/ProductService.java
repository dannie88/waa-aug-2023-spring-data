package com.example.lab3.service;

import com.example.lab3.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto>getAll();
    ProductDto getById(int id);

    void save(ProductDto dto);
    void delete(int id);
    List<ProductDto> getByPriceGreater(int minPrice);
    List<ProductDto> getByNameContains(String keyword);
}