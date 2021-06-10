/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luncher;

import core_lookup.Lookup;
import Gui.Labyrinthe;
import labyrintheService.LabyrintheService;
import robot.Robot;
import timer_service.TimerService;
import timer_service_impl_withdelegation.Timer_service_impl_withdelegation;

/**
 *
 * @author aimen
 */
public class Main {

    static {
        //get service
        Lookup.getInstance().register(TimerService.class, new Timer_service_impl_withdelegation());
        Lookup.getInstance().register(LabyrintheService.class , new Labyrinthe());
       
    }

    public static void main(String[] args) {
   
        testDuTimeService();
        System.out.println("heelleleleleel");
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Gui.Labyrinthe().setVisible(true);
            }
            
            
        });
        
    }


    private static void testDuTimeService() {

        TimerService ts = Lookup.getInstance().getService(TimerService.class);

        ts.addTimeChangeListener(new Robot());


    }

    public static void clearScreen() {
       //System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
