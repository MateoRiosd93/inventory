package com.ias.inventory.infrastructure.persistance.repositories;

import com.ias.inventory.infrastructure.persistance.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
