/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.grupo10.app.rents.interfaces;

import com.grupo10.app.rents.model.Quadbike;
import com.grupo10.app.rents.model.Reservation;
import java.util.Locale.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Andrew
 */
public interface IReservationRepository extends CrudRepository<Reservation, Integer>  {
    
}
