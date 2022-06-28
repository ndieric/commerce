package com.example.Commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Commerce.Entites.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
    
}
