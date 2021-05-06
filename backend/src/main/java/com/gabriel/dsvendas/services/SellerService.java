package com.gabriel.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.gabriel.dsvendas.dto.SellerDTO;
import com.gabriel.dsvendas.entities.Seller;
import com.gabriel.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    
    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> result = repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
