package szigetek;

import java.util.ArrayList;
import java.util.Collections;

public class Szigetek {

    public static void main(String[] args) {
        int[] meresek = new int[] {0,0,200,548,20,0,0,0,310,980,1280,650,102,0,0,45,0,21,65,0,0};
        
        ArrayList<Island> szigetek = new ArrayList<>();
        
        int latestIslandStart = 0;
        int i = 0;
        while(i < meresek.length){
            if (meresek[i] > 0 && meresek[Math.max(0, i-1)] == 0){
                latestIslandStart = i;
            }
            else if (meresek[i] == 0 && meresek[Math.max(0, i-1)] != 0){
                szigetek.add(new Island(latestIslandStart, i-1));
            }
            i++;
        }
        
        // legnagyobb sziget
        Island largestIsland = szigetek.get(0);
        for (i = 1; i < szigetek.size(); i++){
            Island currentIsland = szigetek.get(i);
            
            if ((currentIsland.endPos - currentIsland.startPos) > (largestIsland.endPos - largestIsland.startPos)){
                largestIsland = currentIsland;
            }
        }
        System.out.println("Legnagyobb sziget " + largestIsland.startPos + "-" + largestIsland.endPos + " indexeken fekszik.");
        
        // van-e két egyenlő méretű sziget
        boolean anyEqualSizeIslands = false;
        i = 0;
        while (i < szigetek.size() && !anyEqualSizeIslands){
            Island currentlyChecking = szigetek.get(i);
            int j = 0;
            while (j < szigetek.size() && !anyEqualSizeIslands){
                Island checkAgainst = szigetek.get(j);
                if(i == j){}
                else if (currentlyChecking.endPos - currentlyChecking.startPos == checkAgainst.endPos - checkAgainst.startPos){
                    anyEqualSizeIslands = true;
                }
                j++;
            }
            i++;
        }
        System.out.println(anyEqualSizeIslands);
        
        // egymáshoz legközelebb lévő két sziget
        int closestFirstIndex = 0;
        for (i = 1; i < szigetek.size()-1; i++){
            if (szigetek.get(i+1).startPos - szigetek.get(i).endPos < szigetek.get(closestFirstIndex+1).startPos - szigetek.get(closestFirstIndex).endPos){
                closestFirstIndex = i;
            }
        }
        Island closestFirstIsland = szigetek.get(closestFirstIndex);
        Island closestSecondIsland = szigetek.get(closestFirstIndex+1);
        System.out.println("A két legközelebbi sziget a(z) " + closestFirstIsland.startPos + "-" + closestFirstIsland.endPos + " indexeken fekvő és a(z) " + closestSecondIsland.startPos + "-" + closestSecondIsland.endPos + " indexeken fekvő sziget.");
        
        // legmeredekebb sziget két partja
        int legmeredekebbIndex = 0;
        for (i = 1; i < meresek.length-1; i++){
            if (Math.abs(meresek[i]-meresek[i+1]) > Math.abs(meresek[legmeredekebbIndex] - meresek[legmeredekebbIndex+1])){
                legmeredekebbIndex = i;
            }
        }
        Island legmeredekebbSziget = null;
        i = 0;
        while (legmeredekebbSziget == null && i < szigetek.size()){
            Island currentIsland = szigetek.get(i);
            
            if (currentIsland.startPos <= legmeredekebbIndex && legmeredekebbIndex <= currentIsland.endPos){
                legmeredekebbSziget = currentIsland;
            }
            
            i++;
        }
        System.out.println("A legmeredekebb sziget a(z) " + legmeredekebbSziget.startPos + "-" + legmeredekebbSziget.endPos + " indexeken fekszik.");
        
        // 200m-nél magasabb pontok átlagos magassága
        int osszeg = 0;
        int megfelelt = 0;
        for (i = 0; i < meresek.length; i++){
            if (meresek[i] > 200){
                osszeg += meresek[i];
                megfelelt++;
            }
        }
        float atlagMagassag = (float)osszeg/(float)megfelelt;
        System.out.println(atlagMagassag);
        
        // a szigetek átlagmagassága növekszik-e
        ArrayList<Float> szigetAtlagMagassagok = new ArrayList<>();
        for (i = 0; i < szigetek.size(); i++){
            float currentIslandTotalHeight = 0;
            float islandLenght = 0;
            for (int j = szigetek.get(i).startPos; j < szigetek.get(i).endPos+1; j++){
                currentIslandTotalHeight += (float)meresek[j];
                islandLenght++;
            }
            szigetAtlagMagassagok.add(currentIslandTotalHeight/islandLenght);
        }
        ArrayList<Float> szigetAtlagRendezett = new ArrayList<>(szigetAtlagMagassagok);
        Collections.sort(szigetAtlagRendezett);
        if (szigetAtlagMagassagok.equals(szigetAtlagRendezett)){
            System.out.println("A szigetek átlag magassága növekszik");
        }
        else {
            System.out.println("A szigetek átlag magassága nem növekszik.");
        }
        // a szigetek átlagmagassága csökken
        Collections.reverse(szigetAtlagRendezett);
        if (szigetAtlagMagassagok.equals(szigetAtlagRendezett)){
            System.out.println("A szigetek átlag magassága csökken");
        }
        else {
            System.out.println("A szigetek átlag magassága nem csökken.");
        }
        
        // tengerszakaszok átlagos hossza
        int tengerMeresOsszeg = 0;
        for (i = 0; i < meresek.length; i++){
            if (meresek[i] == 0){
                tengerMeresOsszeg++;
            }
        }
        System.out.println("Tengerszakaszok átlagos hossza: "+(float)tengerMeresOsszeg/(float)(szigetek.size()+1));
        
        // van-e völgy
        i = 1;
        while (i < meresek.length-1 && !(meresek[i] < meresek[i-1] && meresek[i] < meresek[i+1] && meresek[i] != 0)){
            i++;
        }
        System.out.println(meresek.length + " " + i);
        if (i == meresek.length){
            System.out.println("Nincs völgy");
        }
        else{
            System.out.println("Van völgy");
        }
    }
    
}

class Island{
    int startPos;
    int endPos;
    
    Island(int a, int b){
        startPos = a;
        endPos = b;
    }
}