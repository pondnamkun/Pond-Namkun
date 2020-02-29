/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recipefoot;

import java.io.*;
import java.util.ArrayList;


/**
 *
 * @author pondx
 */
public class Readflie {
  public static ArrayList<Maincourse> load(String flie) throws IOException {
    
    ArrayList<Maincourse> productList = new ArrayList<Maincourse>();
    try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(flie)))) {
      while (true) {
        Maincourse p = new Maincourse();
        p.setNames(input.readUTF());
        p.setFoot(input.readUTF());
        p.setRecipe(input.readUTF());
        p.setfilename(input.readUTF());
        System.out.println(p);
        productList.add(p);
      }
    } catch (EOFException ex) {
      ex.printStackTrace();
    }
    return productList;
  }

}