package com.marketspring.market.persistence.crud;

import com.marketspring.market.persistence.entity.ComprasProducto;
import com.marketspring.market.persistence.entity.ComprasProductoPK;
import org.springframework.data.repository.CrudRepository;

public interface ComprasProductoCrudRepository extends CrudRepository<ComprasProducto, ComprasProductoPK> {
}