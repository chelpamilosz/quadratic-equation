/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc;

import java.util.Scanner;
import pl.lodz.uni.eksoc.numbers.Coefficient;
import pl.lodz.uni.eksoc.numbers.LinearFunctionException;
/**
 *
 * @author UL0253585
 */
public class Input { 
    
    Scanner input = new Scanner(System.in);

    Coefficient a = new Coefficient("a");
    Coefficient b = new Coefficient("b");
    Coefficient c = new Coefficient("c");
    
    Coefficient[] coefficients = new Coefficient[] {       
        a,
        b,
        c
    };
    
    public Input() throws LinearFunctionException {
        
        for(Coefficient coeff : coefficients) {
            
            System.out.println(coeff.ToString());                       
            coeff.setValue(input.nextDouble());
        }
    }
    
    public Coefficient[] getCoefficients() {
        return coefficients;
    }
    
    public Coefficient getA() {
        return a;
    }

    public Coefficient getB() {
        return b;
    }

    public Coefficient getC() {
        return c;
    }
    
}
