package com.company.controller;

import com.company.model.Carte;
import junit.framework.TestCase;

public class ControllCarteTest extends TestCase {

    public void testUpdateNumeCarte(){
        ControllCarte controllCarte=new ControllCarte();
        Carte carte=new Carte(636,"carte1","horror");
        controllCarte.addCarte(carte);
        controllCarte.updateNumeCarte(636,"povesti de groaza");
        assertEquals("povesti de groaza",carte.getNumeCarte());
    }

    public void testUpdateGen(){
        ControllCarte controllCarte=new ControllCarte();
        Carte carte=new Carte(636,"carte1","horror");
        controllCarte.addCarte(carte);
        controllCarte.updateGenCarte(636,"drama");
        assertEquals("drama",carte.getGen());
    }

    public void testReturnareCarte(){
        ControllCarte controllCarte=new ControllCarte();
        Carte carte=new Carte(636,"carte1","horror");
        controllCarte.addCarte(carte);
        assertEquals(carte,controllCarte.returnareCarte(636));
    }

}