/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import model.enums.Color;

/**
 *
 * @author Ilha Edição
 */

// agora circle herda do AbstracShape e nao mais do Shape

public class Circle extends AbstracShape {
    
    private Double radius;   // raio

    //construtor 
    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    
    
    
    
    
    // essa classe vai sobrescrever operacao 
    // 

    @Override
    public double area() {
        return Math.PI * radius * radius;   // pi * raio quadrado
    }
    
    
    
}
