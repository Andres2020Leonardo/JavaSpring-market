package com.marketspring.market.domain.repository;

import com.marketspring.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int category);
    Optional<List<Product>> getByScarceProdutcs(int quantity);
    Optional<Product> getProduct(int id);
    Product save(Product product);
    void update(Product product);
    void delete(int productId);
}
