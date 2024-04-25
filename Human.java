/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package human;

import java.util.Scanner;

/**
 *
 * @author D-LUCAS
 */
public class Human {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Male ma= new Male();
       Female Fe = new Female();
       ma.display();
       Fe.display();
       
       Scanner sc = new Scanner(System.in);
        System.out.print("Choose btn female and male\n "
                +"1:Male\n"
                +"2:Female\n");
       
    }
    
}

