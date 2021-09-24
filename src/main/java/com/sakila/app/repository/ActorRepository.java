/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sakila.app.repository;

import com.sakila.app.modelo.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author RICARDO
 */
public interface ActorRepository extends JpaRepository<Actor, Short> {
    
}
