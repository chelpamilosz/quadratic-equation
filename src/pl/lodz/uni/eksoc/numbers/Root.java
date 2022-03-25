/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc.numbers;

/**
 *
 * @author UL0253585
 */
public class Root extends Number {
    
    double a, b, delta;
    
    public Root(String name, Coefficient a, Coefficient b, Discriminant delta) {
        
        super(name);
        this.a = a.getValue();
        this.b = b.getValue();
        this.delta = delta.getValue();
    }
    
    public void CalculateX1() {   
        value = (-b - Math.sqrt(delta)) / (2 * a);
    }
          
    public void CalculateX2() {    
        value = (-b + Math.sqrt(delta)) / (2 * a);
    }
    
    public void CalculateX0() { 
        value = (-b) / (2 * a);
    }
}
