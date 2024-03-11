package com.example.autokjavafx;

public class Auto {
    private String marka, tipus, rendszam;
    private int hengerurtartalom, szallithatoSzemelyek;

    public Auto(String marka, String tipus, String rendszam, int hengerurtartalom, int szallithatoSzemelyek) {
        this.setMarka(marka);
        this.setTipus(tipus);
        this.setRendszam(rendszam);
        this.setHengerurtartalom(hengerurtartalom);
        this.setSzallithatoSzemelyek(szallithatoSzemelyek);
    }

    public String getMarka() {
        return marka;
    }

    private void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTipus() {
        return tipus;
    }

    private void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getHengerurtartalom() {
        return hengerurtartalom;
    }

    public void setHengerurtartalom(int hengerurtartalom) {
        this.hengerurtartalom = hengerurtartalom;
    }

    public int getSzallithatoSzemelyek() {
        return szallithatoSzemelyek;
    }

    private void setSzallithatoSzemelyek(int szallithatoSzemelyek) {
        this.szallithatoSzemelyek = szallithatoSzemelyek;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", tipus='" + tipus + '\'' +
                ", rendszam='" + rendszam + '\'' +
                ", hengerurtartalom=" + hengerurtartalom +
                ", szallithatoSzemelyek=" + szallithatoSzemelyek +
                '}';
    }
}