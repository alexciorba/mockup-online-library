package com.company.model;

public class Imprumut {
    //atribute imprumut

    private int idElev;
    private int idCarte;

    //constructor

    public Imprumut(int idElev,int idCarte){
        this.idCarte=idCarte;
        this.idElev=idElev;
    }

    //setters
    public void setIdElev(int idElev){
        this.idElev=idElev;
    }
    public void setIdCarte(int idCarte){
        this.idCarte=idCarte;
    }

    //getters

    public int getIdElev(){return this.idElev;}
    public int getIdCarte(){return this.idCarte;}

    //descriere imprumut

    public String descriereImprumut(){
        String text="";
        text+="id elev : " + idElev + "\n";
        text+="id carte :"  + idCarte + "\n";
        return  text;
    }

    public String tosaveEnrl(){
        String text="";
        text+=idElev+","+ idCarte;
        return text;
    }
}
