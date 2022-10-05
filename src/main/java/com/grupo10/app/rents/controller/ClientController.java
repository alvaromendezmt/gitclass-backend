/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo10.app.rents.controller;

import com.grupo10.app.rents.interfaces.IQuadbikeRepository;
import com.grupo10.app.rents.model.Quadbike;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andrew
 */

@RestController
@RequestMapping("/api/Client")
public class ClientController {
 @Autowired
 IQuadbikeRepository repository;
        @GetMapping("/all")
        public Iterable<Quadbike> getQuadbikes(){
         Iterable<Quadbike> response = repository.findAll();
            return response;
        }
            
         @PostMapping("/save")
    public String createQuadbike(@RequestBody Quadbike request){
        
        repository.save(request);
                return "created";
       
    }
}
    /*
    @Autowired
    QuadbikeService service;

    @GetMapping("/all")
    public Iterable<Quadbike> get() {
        return service.get();
    }
    
    @GetMapping("/{id}")
    public Optional<Quadbike> get(@PathVariable("id") Integer id) {
        return service.get(id);
    }

    @PostMapping("/save")
    public String create(@RequestBody Quadbike request) {
        return service.create(request);
    }
    
    @PutMapping("/update")
    public Quadbike update(@RequestBody Quadbike request) {
        return service.update(request);
    }
    
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Integer id) {
        return service.delete(id);
    }

}
*/