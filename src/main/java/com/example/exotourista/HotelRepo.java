package com.example.exotourista;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelRepo extends JpaRepository<Hotels, Long>{

    void deleteById(Long id);

    List<Hotels> findAll();
    
}
