/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package humansi;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Humansi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DIT di= new DIT();
        ComputerStudies co= new ComputerStudies();
        Scanner sc= new Scanner(System.in);
        boolean running=true;
        while(running){
        System.out.println("Enter first number\n");
        di.a=sc.nextInt();
        System.out.println("Enter second number\n");
        di.b=sc.nextInt();
        int number;
        System.out.println("Enter your choice\n");
        number=sc.nextInt();
        switch(number){
            case 1 -> di.add();
            case 2 -> di.sub();   
            case 3 -> co.module();
            case 4 -> co.display();
            default -> System.out.println("Invalid Input");
                     
        }
        
    }
}
    
}
