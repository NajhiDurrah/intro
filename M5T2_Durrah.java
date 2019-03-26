/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5t2_durrah;

import java.util.Scanner;

/**
 *
 * @author durrahn6154
 */
public class M5T2_Durrah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This prgram will say heloo to the user
        System.out.println("hello!");
        
        //then ask for their name
        String name;
        Scanner Keyb = new Scanner (System.in);
        System.out.println("What's your name? ");
        name = Keyb.next();
       
        //then ask for their age
        int age = Keyb.nextint();
        
        //finally it will repeat those back
        System.out.println("Nice to meet you " + name);
        
        System.out.println("I'm much younger than " + age)
       
        
        
    }
    
}
