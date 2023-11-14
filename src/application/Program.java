/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.Color;

/**
 *
 * @author Ilha Edição
 */
public class Program {
    
    public static void main(String[] args){
        
        Shape s1 = new Circle(Color.BLACK,2.0 );
        Shape s2 = new Rectangle(Color.WHITE, 3.0, 4.0 );
        
        System.out.println("Circle Color: " + s1.getColor()); 
        System.out.println("Circle Area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle Color: " + s2.getColor());
        System.out.println("Rectangle Area: " + String.format("%.3f", s2.area()));
        
    }
    
}
