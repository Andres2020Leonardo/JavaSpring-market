package com.marketspring.market.persistence;

import com.marketspring.market.persistence.crud.ProductoCrudRepository;
import com.marketspring.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }


    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public void delete(Producto producto) {
        productoCrudRepository.delete(producto);
    }

    public void deleteById(Integer id) {
        productoCrudRepository.deleteById(id);
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }

    public List<Producto> getByCategoriaOrderByNombre(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLeesThanAndEstado(cantidad, true);
    }

    public Optional<Producto> getProducto(int id) {
        return productoCrudRepository.findById(id);
    }
}



