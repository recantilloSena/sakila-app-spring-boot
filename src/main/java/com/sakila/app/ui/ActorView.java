/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sakila.app.ui;

import com.sakila.app.modelo.Actor;
import com.sakila.app.repository.ActorRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author RICARDO
 */
@Route("actor")
@Theme(value = Lumo.class, variant = Lumo.DARK)
public class ActorView extends VerticalLayout{

    private Button cargar = new Button("Cargar Datos");
    private Grid<Actor> gridActor = new Grid<>(Actor.class);
    
    @Autowired
    public ActorView(ActorRepository actorService ) {
        
        add(cargar, gridActor);
        
        cargar.addClickListener(event->{
            gridActor.setItems(actorService.findAll());
        });
        
        
        
        
    }
    
    
    
    
}
