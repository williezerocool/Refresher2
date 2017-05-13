/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refresher2;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class Refresher2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ky = new Scanner(System.in);
        String userInput;
        int a = 10;
        System.out.print("Whats your name? ");
        userInput = ky.next();
        
       if("mitchell".equals(userInput)){
       
           a = 5;
       }
        
       for(int i=1; i <= a; i++){
       
           System.out.println(userInput);
       }
         
    }
    
}
