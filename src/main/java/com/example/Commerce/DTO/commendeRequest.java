package com.example.Commerce.DTO;

import com.example.Commerce.Entites.Client;
import com.example.Commerce.Entites.Produit;

public class commendeRequest {


    private Client client;
    private Produit produit;

    public commendeRequest(){

    }

    public commendeRequest(Client client) {
        this.client = client;
    }
    public commendeRequest(Produit produit){
        this.produit = produit;
    }
    

    public commendeRequest(Client client, Produit produit) {
        this.client = client;
        this.produit = produit;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "commendeRequest [client=" + client + ", produit=" + produit + "]";
    }
    
    
    
    
}
