/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullvalue;

/**
 *
 * @author user3
 */
public class NullValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer tp = null;
        System.out.println(tp);
        System.out.println(tp==null);
        if (tp != null) System.out.println(tp.equals(8));
    }
    
}
