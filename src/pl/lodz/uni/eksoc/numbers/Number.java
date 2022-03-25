/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc.numbers;

/**
 *
 * @author UL0253585
 */
public abstract class Number {
    String name;
    double value;
    
    public Number(String name) {
        this.name = name;
    }
    
    public void setValue(double value) throws LinearFunctionException {
        this.value = value;
    }
    
    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
    
    public String ToString() {
        return name + " = " + value;
    }
}
