/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc;
import pl.lodz.uni.eksoc.numbers.Coefficient;
import pl.lodz.uni.eksoc.numbers.Discriminant;
import pl.lodz.uni.eksoc.numbers.Root;

/**
 *
 * @author UL0253585
 */
public class Calculation {
    
    Coefficient a;
    Coefficient b;
    Coefficient c;
    Discriminant delta;
    Root x0;
    Root x1;
    Root x2;
    Results result;

    public Calculation(Coefficient[] coefficients) {
        
        for(Coefficient coeff : coefficients) {
            
            switch (coeff.getName()) {
                case "a" -> a = coeff;
                case "b" -> b = coeff;
                case "c" -> c = coeff;
                default -> System.out.println("Nie znaleziono wspolczynnikow");
            }            
        }
        
        delta = new Discriminant("delta", a, b, c);
    }
    
    public void Calculate() 
    {
        delta.CalculateDelta();
        
        if(delta.getValue() > 0d) {
            
            x1 = new Root("x1", a, b, delta);
            x1.CalculateX1();
            
            x2 = new Root("x2", a, b, delta);
            x2.CalculateX2();
            
            result = new Results(x1, x2, delta);
            
        } 
        else if (delta.getValue() == 0d) {
            
            x0 = new Root("x0", a, b, delta);
            x0.CalculateX0();
            
            result = new Results(x0, delta);
            
        } 
        else { 
            result = new Results("Nie ma pierwiastkow");
        }     
    }
    
    public Results getResult() {
        return result;
    } 
}
