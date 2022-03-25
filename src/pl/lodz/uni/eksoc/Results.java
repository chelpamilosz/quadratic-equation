/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc;
import pl.lodz.uni.eksoc.numbers.Discriminant;
import pl.lodz.uni.eksoc.numbers.Root;

/**
 *
 * @author UL0253585
 */
public class Results {

    String result;
        
    public Results(String result) {
        this.result = result;
    }
    
    public Results(Root x0, Discriminant delta) {
        result = delta.ToString() + "\n" + x0.ToString();
    }
    
    public Results(Root x1, Root x2, Discriminant delta) {
        result = delta.ToString() + "\n" +x1.ToString() + "\n" + x2.ToString();
    }

    public String ToString() {
        return result;
    }
}
