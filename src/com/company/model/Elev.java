package com.company.model;

public class Elev {
    //atribute elev
    private int idElev;
    private String numeElev;
    private String prenumeElev;
    private String email;
    private String password;

    //constructor

    public Elev(int idElev,String prenumeElev,String numeElev,String email,String password){
        this.idElev=idElev;
        this.prenumeElev=prenumeElev;
        this.numeElev=numeElev;
        this.email=email;
        this.password=password;

    }
    //setters

    public void setIdElev(int idElev){this.idElev=idElev;}
    public void setPrenumeElev(String prenumeElev){this.prenumeElev=prenumeElev;}
    public void setNumeElev(String numeElev){this.numeElev=numeElev;}
    public void setEmail(String email){this.email=email;}
    public void setPassword(String password){this.password=password;}

    //getters

    public int getIdElev(){return this.idElev;}
    public String getPrenumeElev(){return this.prenumeElev;}
    public String getNumeElev(){return this.numeElev;}
    public String getEmail(){return this.email;}
    public String getPassword(){return this.password;}

    //descriere elev

    public String descriereElev(){
        String text="";
        text+="id ul este : " + idElev + "\n";
        text+="numele este : " + numeElev + "\n";
        text+="prenumele este :"+ prenumeElev +"\n";
        text+="mailul este : " + email + "\n";
        text+="parola este : " + password + "\n";
        return text;
    }

  public String tosaveElev(){
        String text="";
        text+=idElev+ ","+ numeElev +","+ prenumeElev+ ","+ email+ ","+ password;
        return text;
  }
}
