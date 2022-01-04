package com.company.view;

import com.company.controller.ControllCarte;
import com.company.controller.ControllElev;
import com.company.controller.ControllImprumut;
import com.company.model.Carte;
import com.company.model.Elev;
import com.company.model.Imprumut;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private ControllElev controllElev;
    private ControllImprumut controllImprumut;
    private ControllCarte controllCarte;

    private Elev elev;
    Scanner scanner;
    public View(){
        controllElev=new ControllElev();
        controllImprumut=new ControllImprumut();
        controllCarte=new ControllCarte();
        scanner=new Scanner(System.in);
        elev=new Elev(1,"Alex","Marian","marian@yahoo.com","ugjfgke");
    }

    private void meniu(){
        System.out.println("1 : Afisati toate cartile imprumutate : ");
        System.out.println("2 : Imprumutati o carte :");
        System.out.println("3 : Returnati o carte : ");
    }
    public void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){
                case 1: afisareCarti();
                break;

            }
        }
    }

    public void afisareCarti(){
        int id=elev.getIdElev();

        ArrayList<Imprumut>listaI=controllImprumut.listaImprumuturielev(id);
        for(int i=0;i<listaI.size();i++){
            Carte carte= controllCarte.returnareCarte(listaI.get(i).getIdCarte());
            System.out.println(carte.descriereCarte());

        }
    }


}
