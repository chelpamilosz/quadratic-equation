/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pl.lodz.uni.eksoc;

import pl.lodz.uni.eksoc.numbers.LinearFunctionException;
import java.util.InputMismatchException;

/**
 *
 * @author UL0253585
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Input input;
        Calculation calculation;
        Results result;
        Output output;
        
        try {
            input = new Input();
        }
        catch(LinearFunctionException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        catch(InputMismatchException ex) {
            System.out.println("Wprowadz liczbe");
            return;
        }

        calculation = new Calculation(input.getCoefficients());
        
        calculation.Calculate();
        result = calculation.getResult();
        
        output = new Output(result);
        output.Print();
    }
    
}
