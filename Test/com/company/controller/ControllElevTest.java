package com.company.controller;

import com.company.model.Elev;
import junit.framework.TestCase;
import org.junit.Test;

public class ControllElevTest extends TestCase {
 @Test
    public void testUpdateNume(){
        ControllElev  controllElev=new ControllElev();
        Elev elev=new Elev(123,"alex","ciorba","alex@yahoo","bbb");
        controllElev.addElevi(elev);
        controllElev.updateNume(123,"dan");
        assertEquals("dan",elev.getNumeElev());
    }
    // se adauga 10 elevi.sa se schimbe prenumele elevilor care au id impar cu ion
   @Test
    public void testUpdatePrenume(){
     ControllElev controllElev=new ControllElev();
     for(int i=0;i<10;i++){
         Elev elev=new Elev(i,"marius","pop","m@yahoo","bb");
         controllElev.addElevi(elev);

     }
     for(int i=0;i<10;i++){
         if(i%2==1){
             controllElev.returnareElev(i).setPrenumeElev("ion");
             assertEquals("ion",controllElev.returnareElev(i).getPrenumeElev());
         }

      }
    }

}