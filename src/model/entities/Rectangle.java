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
public class Rectangle extends Shape {
    private Double width; // largura 
    private Double height;  // altura

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    
    
    
    
    
    @Override
    public double area() {
        return width * height;  // retorna largura * altura
        
    }
    
    
    
    
}
