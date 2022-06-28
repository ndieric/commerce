package com.example.Commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Commerce.Entites.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    
}
