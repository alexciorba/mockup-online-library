package com.company.model;

public class Carte {
    //atribute carte

    private int idCarte;
    private String numeCarte;
    private String gen;

    //constructor
    public Carte(int idCarte,String numeCarte,String gen){
        this.idCarte=idCarte;
        this.numeCarte=numeCarte;
        this.gen=gen;
    }
    //setters

    public void setIdCarte(int idCarte){this.idCarte=idCarte;}
    public void setNumeCarte(String numeCarte){this.numeCarte=numeCarte;}
    public void setGen(String gen){this.gen=gen;}

    //getters

    public int getIdCarte(){return this.idCarte;}
    public String getNumeCarte(){return this.numeCarte;}
    public String getGen(){return this.gen;}

    //descriere

    public String descriereCarte(){
        String text="";
        text+="id carte : " + idCarte + "\n";
        text+="nume carte : " + numeCarte + "\n";
        text+="gen carte : " + gen + "\n";
        return text;
    }
    public String tosaveCarte(){
        String text="";
        text+=idCarte+","+numeCarte+","+gen;
        return text;
    }
}
