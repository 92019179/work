/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayabc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 92019179
 */
public class ArrayABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] numA = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(numA);
    System.out.println(Arrays.toString(numA));
  
    Integer[] numB = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(numB, Collections.reverseOrder());
    System.out.println(Arrays.toString(numB));
    
    List list = new ArrayList(Arrays.asList(numA));
      list.addAll(Arrays.asList(numB));
      Object[] numC = list.toArray();
      Arrays.sort(numC);
      System.out.println(Arrays.toString(numC));
}
}