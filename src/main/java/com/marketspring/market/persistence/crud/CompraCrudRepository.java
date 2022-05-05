package com.marketspring.market.persistence.crud;

import com.marketspring.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
}