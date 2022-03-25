/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc.numbers;

/**
 *
 * @author UL0253585
 */
public class Coefficient extends Number {
    
    public Coefficient(String name) {       
        super(name);       
    }
    
    @Override
    public void setValue(double value) throws LinearFunctionException {
        
        if("a".equals(name) && value == 0d)
            throw new LinearFunctionException("Funkcja liniowa");
        else
            this.value = value;
        
    }
    
    @Override
    public String ToString() {        
        return "Wspolczynnik " + name + ": ";
    }
}
