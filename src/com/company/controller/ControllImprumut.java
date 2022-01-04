package com.company.controller;

import com.company.model.Imprumut;


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllImprumut {

    private ArrayList<Imprumut>listaImprumuturi;

    public ControllImprumut(){
        listaImprumuturi=new ArrayList<>();
        load();
    }
    public void load(){
        try {
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\BibliotecaOnline\\src\\com\\company\\resources\\imprumut.txt");
            Scanner read= new Scanner(file);
            while (read.hasNextLine()){
                String[] proprietati=read.nextLine().split(",");
                Imprumut imprumut=new Imprumut(Integer.parseInt(proprietati[0]),Integer.parseInt(proprietati[1]));
                listaImprumuturi.add(imprumut);
            }

        }catch (Exception e){

        }

    }
    public void afisareImprumut(){
        for(Imprumut i : listaImprumuturi){
            System.out.println(i.descriereImprumut());
        }
    }
    public void addImprumut(Imprumut imprumut){
        listaImprumuturi.add(imprumut);

    }

    //CRUD

    public void updateIdElev(int id,int idElev){
        for(int i=0;i<listaImprumuturi.size();i++){
            if(listaImprumuturi.get(i).getIdElev()==id){
                listaImprumuturi.get(i).setIdElev(idElev);
            }
        }
    }
    public void updateIdCarte(int id,int idCarte){
        for(int i=0;i<listaImprumuturi.size();i++){
            if(listaImprumuturi.get(i).getIdCarte()==id){
                listaImprumuturi.get(i).setIdCarte(idCarte);
            }
        }
    }

    //O FUNCTIE CE PRIMESTE ID UL UNUI STUDENT SI RETURNEAZA O LISTA CU TOATE IMPRUMUTURILE


    public ArrayList<Imprumut> listaImprumuturielev(int idElev) {
        ArrayList<Imprumut> imprumuturi = new ArrayList<>();
        for(int i=0;i<listaImprumuturi.size();i++){
            if(listaImprumuturi.get(i).getIdElev()==idElev){
                imprumuturi.add(listaImprumuturi.get(i));
            }
        }
        return imprumuturi;
    }

    public void saveElev(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\BibliotecaOnline\\src\\com\\company\\resources\\elev.txt");
        try {
            FileWriter fw=new FileWriter(file);
            PrintWriter pw=new PrintWriter(file);

            pw.close();
        }catch (Exception e){

        }
    }
}
