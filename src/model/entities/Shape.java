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
public abstract class Shape {
    
    private Color color;  // essa classe shape tem COR
    
    
    
    // classe shape tem construtor recebendo a cor
    public Shape(Color color){
        this.color = color;
    }

    // gets e set
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
    public abstract double area();
    
    
    
    
    
}
