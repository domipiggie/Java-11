/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusgyak;

/**
 *
 * @author user3
 */
public class StringMetodusGyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "A Diák osztály objektuma (Vad Alma Körte) a példányosítás útján jön létre.";
        
        String nev = szoveg.substring(szoveg.indexOf("(")+1, szoveg.indexOf(")")).toUpperCase().trim();
        System.out.println(nev.replace("ALMA", "KÖRTE"));
        
        String email = nev.toLowerCase().replaceAll(" ", ".").concat(".2022i@bankitatabanya.hu");
        System.out.println(email);
    }
    
}