package com.example.Commerce.Entites;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_client;
    private String nom_client;
    private int contact;
    private String email;

    @OneToMany (targetEntity = Produit.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "Clientproduit_foreignkey",referencedColumnName = "id_client")
    private List<Produit> produit;
    


    public List<Produit> getProduit() {
        return produit;
    }

    public Client(){

    }

    public Client(String nom_client, int contact, String email) {
        this.nom_client = nom_client;
        this.contact = contact;
        this.email = email;
        
    }


    public Long getId_client() {
        return id_client;
    }


    public void setId_client(Long id_client) {
        this.id_client = id_client;
    }


    public String getNom_client() {
        return nom_client;
    }


    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }


    public int getContact() {
        return contact;
    }


    public void setContact(int contact) {
        this.contact = contact;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Client [contact=" + contact + ", email=" + email + ", id_client=" + id_client + ", nom_client="
                + nom_client + "]";
    }
    
    

    
    
}
