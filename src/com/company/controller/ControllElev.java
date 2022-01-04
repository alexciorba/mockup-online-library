package com.company.controller;

import com.company.model.Elev;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllElev {

    private ArrayList<Elev> listaElevi;

    public ControllElev() {
        listaElevi = new ArrayList<>();
        load();
    }

    public void load() {

        try {
            File file = new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\BibliotecaOnline\\src\\com\\company\\resources\\elev.txt");
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                String[] proprietati = read.nextLine().split(",");
                Elev elev = new Elev(
                        Integer.parseInt(proprietati[0]),
                        proprietati[1],
                        proprietati[2],
                        proprietati[3],
                        proprietati[4]
                );
                listaElevi.add(elev);

            }


        } catch (Exception e) {

        }
    }

    public void addElevi(Elev elev){
        listaElevi.add(elev);
    }
    public void afisareElevi(){
        for(Elev e : listaElevi){
            e.descriereElev();
        }
    }

    //CRUD

    public void updateNume(int id,String nume){
        for(int i=0;i<listaElevi.size();i++){
            if(listaElevi.get(i).getIdElev()==id){
                listaElevi.get(i).setNumeElev(nume);
            }
        }
    }
    public void updatePrenume(int id,String prenume){
        for(int i=0;i<listaElevi.size();i++){
            if(listaElevi.get(i).getIdElev()==id){
                listaElevi.get(i).setPrenumeElev(prenume);
            }
        }
    }
    public void updateEmail(int id,String email){
        for(int i=0;i<listaElevi.size();i++){
            if(listaElevi.get(i).getIdElev()==id){
                listaElevi.get(i).setEmail(email);
            }
        }
    }
    public void deletElev(int id){
        for(int i=0;i<listaElevi.size();i++){
            if(listaElevi.get(i).getIdElev()==id){
                listaElevi.remove(i);
            }
        }
    }

    public int nextIdVlblElev(){
        if(listaElevi.size() != 0 ) {
            return listaElevi.get(listaElevi.size()-1).getIdElev()+1;
        }
        return 1;
    }

    public Elev loginElev(String mail,String pass){
        for(Elev e : listaElevi){
            if(e.getEmail().equals(mail) && e.getPassword().equals(pass)){
                return e;
            }
        }
        return null;
    }
//functie care primeste id ul si returneaza elevul

    public Elev returnareElev(int id) {
        for (Elev e : listaElevi) {
            if (e.getIdElev() == id) {
                return e;
            }

        }return null;
    }
}
