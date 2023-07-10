package com.example.exotourista;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/hotels")
@CrossOrigin("*")
public class HotelController {

   // @Autowired
   private HotelRepo hotelRep;

   public HotelController(HotelRepo hotelRepo){
    this.hotelRep=hotelRepo;

   }

    @GetMapping(value = "/getAll")
    public List<Hotels> getHotels(){
        return hotelRep.findAll();
    }
    
    @PostMapping(value = "/post")
    public void postData(@RequestBody Hotels hotel){
        hotelRep.save(hotel);
    }
    
    @DeleteMapping(value = "/delete/{id}")
    public void deletePizza(@PathVariable Long id){
        hotelRep.deleteById(id);
    }
}
