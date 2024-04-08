package com.example.valasztasok;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.RandomAccessFile;
import java.util.ArrayList;

public class HelloController {
    @FXML
    public TextField valasztoker;
    @FXML
    public TextField szavazatok;
    @FXML
    public TextField veznev;
    @FXML
    public TextField utonev;
    @FXML
    public TextField part;
    @FXML
    public TextField searchname;
    @FXML
    public TextField searchpart;
    @FXML
    public Label snameresult;
    @FXML
    public Label spartresult;
    ArrayList<Jelolt> jeloltek = new ArrayList<>();

    @FXML
    protected void readFile(){
        try{
            RandomAccessFile raf = new RandomAccessFile("szavazatok.txt", "r");
            String line = raf.readLine();
            while (line != null){
                String[] split = line.split(" ");
                jeloltek.add(new Jelolt(Integer.parseInt(split[0]), Integer.parseInt(split[1]), split[2], split[3], split[4]));
                line = raf.readLine();
            }
            raf.close();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(jeloltek.toString());
    }

    @FXML
    protected void addJelolt(){
        String[] data = {valasztoker.getText(), szavazatok.getText(), veznev.getText(), utonev.getText(), part.getText()};
        for (String s: data){
            if (s.equals(" ")){
                return;
            }
        }
        try{
            Integer.parseInt(data[0]);
            Integer.parseInt(data[1]);
        } catch (Exception e){
            return;
        }
        try{
            RandomAccessFile raf = new RandomAccessFile("szavazatok.txt", "rw");
            String line = "\n"+String.join(" ", data);
            raf.seek(raf.length());
            raf.writeBytes(line);
            jeloltek.add(new Jelolt(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2], data[3], data[4]));
            raf.close();
            System.out.println(jeloltek.toString());
        } catch (Exception e){
            return;
        }
    }

    @FXML
    protected void search(){
        if (!searchname.getText().equals("")) nameSearch();
        if (!searchpart.getText().equals("")) partSearch();
    }

    @FXML
    protected void nameSearch(){
        Jelolt j = null;
        int i = 0;
        while (j==null && i < jeloltek.size()){
            if ((jeloltek.get(i).getVezeteknev() + " " + jeloltek.get(i).getUtonev()).equals(searchname.getText())){
                j = jeloltek.get(i);
            }
            i++;
        }
        if (j == null){
            snameresult.setText("Nincs találat");
            return;
        }
        snameresult.setText(j.toString());
    }

    @FXML
    protected void partSearch(){
        int szavazatok = 0;
        for (Jelolt j:jeloltek){
            if (j.getPart().equals(searchpart.getText())){
                szavazatok+=j.getSzavazatok();
            }
        }
        spartresult.setText("A párt "+szavazatok+" db szavazatot kapott.");
    }
}