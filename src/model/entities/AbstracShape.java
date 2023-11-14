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
// agora tenho uma classe abstract e implementa interface Shape

public abstract class AbstracShape implements Shape {
    
    
    // essa classe abstracShape vai ter 
    private Color color;
    
    
    // vou criar um construtor

    public AbstracShape(Color color) {
        super();
        this.color = color;
    }

    // get e set
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
    
    
    
    
}
