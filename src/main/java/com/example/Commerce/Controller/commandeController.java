package com.example.Commerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Commerce.DTO.commendeRequest;
import com.example.Commerce.Entites.Client;
import com.example.Commerce.Repository.ClientRepository;
import com.example.Commerce.Repository.ProduitRepository;

@RestController
public class commandeController {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ProduitRepository produitRepository;

    @PostMapping("/client")
    public Client EnregisterCommande(@RequestBody commendeRequest com){
        return clientRepository.save(com.getClient());
        
        
    }
    @GetMapping("/tousclient")
    public List<Client> ListerClient(){
        return clientRepository.findAll();
    }
    
    
}
