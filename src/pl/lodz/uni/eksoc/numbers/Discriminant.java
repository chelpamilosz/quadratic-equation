/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc.numbers;

/**
 *
 * @author UL0253585
 */
public class Discriminant extends Number {
    
    double a, b, c;
    
    public Discriminant(String name, Coefficient a, Coefficient b, Coefficient c) {
        
        super(name);
        
        this.a = a.getValue();
        this.b = b.getValue();
        this.c = c.getValue();
    }
    
    public void CalculateDelta() {
        value = b * b - 4 * a * c;
    }
    
    @Override
    public String ToString() {
        return "Delta: " + value;
    }
}
