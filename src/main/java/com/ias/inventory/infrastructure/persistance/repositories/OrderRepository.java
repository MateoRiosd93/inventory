package com.ias.inventory.infrastructure.persistance.repositories;

import com.ias.inventory.infrastructure.persistance.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
