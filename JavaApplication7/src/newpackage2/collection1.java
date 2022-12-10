/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pranav
 */
public class collection1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        Scanner input;
        try {
            input = new Scanner(new File("C:/Users/pranav/OneDrive/Desktop/new.txt"));
            while (input.hasNext()) 
            {
                String s=input.next();
                list.add(s);
                if(s.endsWith("s"))
                {
                   list1.add(s.toUpperCase()); 
                }
                if(!s.endsWith("s"))
                {
                    list3.add(s);
                }
            }
            for(int i=list.size()-1;i>-1;i--)
            {
                list2.add(list.get(i));
            }
            System.out.println(list);
            System.out.println(list1);
            System.out.println(list2);
            System.out.println(list3);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(collection1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
