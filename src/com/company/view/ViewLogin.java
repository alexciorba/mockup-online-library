package com.company.view;

import com.company.controller.ControllElev;
import com.company.model.Elev;

import java.util.Scanner;

public class ViewLogin {

    private ControllElev controllElev;
    Scanner scanner;

    public ViewLogin(){
        controllElev= new ControllElev();
        scanner=new Scanner(System.in);

    }
    private void meniu(){
        System.out.println("apasati tasta 1 : login");
        System.out.println("apasati tasta 2: inregistrare");
    }

    public void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){
                case 1:login();
                break;
            }
        }
    }

    public void login(){
        System.out.println("Introduceti mailul");
        String mail=scanner.nextLine();
        System.out.println("Introduceti parola");
        String pass=scanner.nextLine();
        Elev elev=controllElev.loginElev(mail,pass);
        if(elev != null){
            View view=new View();
            view.play();
        }else{
            System.out.println("Contul nu exista sau ati gresit datele");
        }
    }

    public void inregistrare(){
        System.out.println("Introduceti mailul");
        String mail=scanner.nextLine();
        System.out.println("Introduceti prenumele ");
        String prenume=scanner.nextLine();
        System.out.println("Introduceti numele");
        String nume=scanner.nextLine();
        System.out.println("Introduceti parola");
        String parola=scanner.nextLine();
    }


}
