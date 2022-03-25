/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc;

/**
 *
 * @author UL0253585
 */
public class Output {
    
    String result;
    
    public Output(Results result) {
        this.result = result.ToString();
    }
    
    public void Print() {
        System.out.println(result);
    }
}
