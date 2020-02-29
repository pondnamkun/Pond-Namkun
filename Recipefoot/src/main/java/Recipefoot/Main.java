/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recipefoot;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pondx
 */
public class Main {
    
    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try {
            ArrayList<Maincourse> product = Readflie.load("Maincourse.bin");
            for (int i = 0; i < product.size(); i++) {
            Maincourse sa = product.get(i);
            sa.getNames();
        }
            

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /*Readflie ca = new Readflie();
        try {
            ca.save();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();}

        ArrayList<Maincourse> productList = Readflie.load();
        for (int i = 0; i < productList.size(); i++) {
        Maincourse sa =productList.get(i);
        System.out.println(sa.getName());}*/
    }
    
}
