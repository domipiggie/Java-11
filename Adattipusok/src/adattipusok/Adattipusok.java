/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adattipusok;

/**
 *
 * @author user3
 */
public class Adattipusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // egész számok
        byte homerseklet = 19;
        short magassag = 125;
        int fizetes = 850000;
        long nyeremeny = 25000000000L;
        
        // valós számok
        float tomeg = 44333.569874521F;
        double ezEgyValosSzam = 22255641.013461876;
        
        // karakter
        char egyBetu = 'k';
        char masikBetu = '\u0041'; //a karakter unicode kódja hexadecimálisan
        
        // logikai
        boolean vane = false;
        
        // változók értékeinek kiíratása
        System.out.println(homerseklet);
        System.out.println(magassag);
        System.out.println(fizetes);
        System.out.println(nyeremeny);
        System.out.println(tomeg);
        System.out.println(ezEgyValosSzam);
        System.out.println(egyBetu);
        System.out.println(masikBetu);
        System.out.println(vane);
        System.out.println((int)masikBetu);
        
        // adattipusok tartománya
        
        // byte
        int byteAlja = Byte.MIN_VALUE;
        int byteTeteje = Byte.MAX_VALUE;
        
        System.out.println("A byte adattípus tartománya " + byteAlja + " értéktől " + byteTeteje + " értékig terjed");
        
        // short
        System.out.println("A short adattípus tartománya " + Short.MIN_VALUE + " értéktől " + Short.MAX_VALUE + " értékig terjed");
        
        // int
        System.out.println("Az integer adattípus tartománya " + Integer.MIN_VALUE + " értéktől " + Integer.MAX_VALUE + " értékig terjed");
        
        // long
        System.out.println("A long adattípus tartománya " + Long.MIN_VALUE + " értéktől " + Long.MAX_VALUE + " értékig terjed");
        
        // float
        System.out.println("A float adattípus tartománya " + Float.MIN_VALUE + " értéktől " + Float.MAX_VALUE + " értékig terjed");
        
        // double
        System.out.println("A double adattípus tartománya " + Double.MIN_VALUE + " értéktől " + Double.MAX_VALUE + " értékig terjed");
    }
    
}
