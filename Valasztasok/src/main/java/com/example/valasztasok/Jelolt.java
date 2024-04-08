package com.example.valasztasok;

public class Jelolt {
    private int valasztoker, szavazatok;
    private String vezeteknev, utonev, part;

    public Jelolt(int valasztoker, int szavazatok, String vezeteknev, String utonev, String part) {
        this.valasztoker = valasztoker;
        this.szavazatok = szavazatok;
        this.vezeteknev = vezeteknev;
        this.utonev = utonev;
        this.part = part;
    }

    public int getValasztoker() {
        return valasztoker;
    }

    public void setValasztoker(int valasztoker) {
        this.valasztoker = valasztoker;
    }

    public int getSzavazatok() {
        return szavazatok;
    }

    public void setSzavazatok(int szavazatok) {
        this.szavazatok = szavazatok;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public String getUtonev() {
        return utonev;
    }

    public void setUtonev(String utonev) {
        this.utonev = utonev;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String toString(){
        return getValasztoker() + " " + getSzavazatok() + " " + getVezeteknev() + " " + getUtonev() + " " + getPart();
    }
}