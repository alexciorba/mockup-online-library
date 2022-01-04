package com.company.controller;

import com.company.model.Carte;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllCarte {

    private ArrayList<Carte>listaCarti;

    public ControllCarte(){
        listaCarti=new ArrayList<>();
        load();
    }
    public void load(){
        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\BibliotecaOnline\\src\\com\\company\\resources\\carte.txt");
            Scanner read=new Scanner(file);
            while (read.hasNextLine()){
                String[] proprietati=read.nextLine().split(",");
                Carte carte=new Carte(Integer.parseInt(proprietati[0]),proprietati[1],proprietati[2] );
                listaCarti.add(carte);

            }
        }catch (Exception e){

        }
    }
    public void addCarte(Carte carte){
        listaCarti.add(carte);
    }
    public void afisareCarte(){
        for(Carte c : listaCarti){
            System.out.println(c.descriereCarte());
        }
    }

    //CRUD

    public void updateNumeCarte(int id,String nume){
        for(int i=0;i<listaCarti.size();i++){
            if(listaCarti.get(i).getIdCarte()==id){
                listaCarti.get(i).setNumeCarte(nume);
            }

        }
    }
    public void updateGenCarte(int id,String gen){
        for(int i=0;i<listaCarti.size();i++){
            if(listaCarti.get(i).getIdCarte()==id){
                listaCarti.get(i).setGen(gen);
            }

        }
    }
    public void deleteCarte(int id){
        for(int i=0;i<listaCarti.size();i++){
            if(listaCarti.get(i).getIdCarte()==id){
                listaCarti.remove(i);
            }
        }
    }

    //functie ce primeste idCarte si returneaza Cartea

    public Carte returnareCarte(int id){
        for(Carte c : listaCarti){
            if(c.getIdCarte()==id)
            {
                return c;
            }
        }
        return null;
    }
}
