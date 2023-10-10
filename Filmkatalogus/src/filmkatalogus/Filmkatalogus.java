/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filmkatalogus;

/**
 *
 * @author domi
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Filmkatalogus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Üdvözlöm.");
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Film> filmek = new ArrayList<>();
        String vegsoValasz = "";
        
        while (!vegsoValasz.equals("nem")){
            String filmCim;
            String filmRendezoNev;
            Integer filmKiadasiEv = null;
            Integer filmErtekeles = null;
            
            System.out.print("Kérem adja meg a film címét: ");
            filmCim = scanner.nextLine();
            
            System.out.print("Kérem adja meg a rendező nevét: ");
            filmRendezoNev = scanner.nextLine();
            
            while (filmKiadasiEv == null){
                System.out.print("Kérem adja meg a film kiadási évét: ");
                
                try{
                    filmKiadasiEv = Integer.parseInt(scanner.nextLine());
                }catch(NumberFormatException e){
                    System.out.println("Kérem számot adjon meg");
                }
            }
            
            while (filmErtekeles == null){
                System.out.print("Kérem adja meg az értékelést (1-10): ");
                
                try{
                    Integer ertekeles = Integer.parseInt(scanner.nextLine());
                    if (ertekeles > 0 && ertekeles < 11){
                        filmErtekeles = ertekeles;
                    }
                }catch(NumberFormatException e){
                    System.out.println("Kérem számot adjon meg");
                }
            }
            
            System.out.print("Szeretne-e még egy filmet hozzáadni? (igen/nem): ");
            vegsoValasz = scanner.nextLine();
            while (!vegsoValasz.equals("igen") && !vegsoValasz.equals("nem")){
                System.out.print("Szeretne-e még egy filmet hozzáadni? (igen/nem): ");
                vegsoValasz = scanner.nextLine();
                System.out.println(vegsoValasz);
            }
            
            filmek.add(new Film(filmCim, filmRendezoNev, filmKiadasiEv, filmErtekeles));
        }
        
        for (Film i:filmek){
            System.out.println("Film címe: "+i.cim+". Film rendező neve: "+i.RendezoNeve+". Film kiadási éve: "+i.KiadasiEv+". Film értékelése: "+i.Ertekeles+".");
        }
    }
    
}

class Film {
    String cim;
    String RendezoNeve;
    Integer KiadasiEv;
    Integer Ertekeles;
    
    Film(String filmCim, String filmRendezoNev, Integer filmKiadasiEv, Integer filmErtekeles){
        this.cim = filmCim;
        this.RendezoNeve = filmRendezoNev;
        this.KiadasiEv = filmKiadasiEv;
        this.Ertekeles = filmErtekeles;
    }
}