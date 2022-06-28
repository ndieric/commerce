package com.example.Commerce.Entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
    @Id
    //@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_produit;
    private String nom_produit;
    private int quantite;
    private double prix;

    public Produit(){

    }

    public Produit(String nom_produit, int quantite, double prix) {
        this.nom_produit = nom_produit;
        this.quantite = quantite;
        this.prix = prix;
    }

    public Long getId_produit() {
        return id_produit;
    }

    public void setId_produit(Long id_produit) {
        this.id_produit = id_produit;
    }

    public String getNom_produit() {
        return nom_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit [id_produit=" + id_produit + ", nom_produit=" + nom_produit + ", prix=" + prix + ", quantite="
                + quantite + "]";
    }
    
    
    
    
}
