package com.tallerspringbootmvc.client.service.repository;

import com.tallerspringbootmvc.client.service.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    boolean existsByEmail(String email);
}
