package robot;

import java.beans.PropertyChangeEvent;
import timer_service.TimerChangeListener;
import timer_service.TimerService;
import robot.Robot;
import core_lookup.Lookup;
import java.beans.PropertyChangeSupport;
import labyrintheService.LabyrintheService;


/**
 *
 * @author aimen
 */
public class Robot implements TimerChangeListener {
    
    DirectionRobot direction;
    int position_horizantale;
    int position_verticale;
   
    PropertyChangeSupport pcs = new PropertyChangeSupport(this) ;
   
     
    public void addTimeChangeListener(TimerChangeListener pl) {
        pcs.addPropertyChangeListener(pl);
        
    }
    
    
    public void removeTimeChangeListener(TimerChangeListener pl) {
        
        pcs.removePropertyChangeListener(pl);
        
        }
    
    public Robot(int h, int v){
        this.direction = new Right(this);
        this.position_horizantale = h;
        this.position_verticale = v;
        
        
   
    }
    public Robot(){
        this.direction = new Right(this);
        this.position_horizantale = 0;
        this.position_verticale = 0;
        
        //labyrinthe

    }
    public int get_position_horizantale(){
        return this.position_horizantale;
    }
    
    public int get_position_verticale(){
        return this.position_verticale;
    }
    
    public void move(){
        int oldvalue_horizantale = this.position_horizantale;
        int oldvalue_verticale = this.position_verticale;
        direction.move();
        pcs.firePropertyChange("position_horizantale",
                   oldvalue_horizantale, this.position_horizantale);
        pcs.firePropertyChange("position_horizantale",
                   oldvalue_verticale, this.position_verticale);
        
    }
    
    public void goUp(){
        //Direction oldlValue 
    }
    
    public void changeDirection(DirectionRobot direction){
        this.direction = direction;
    }
    
    public DirectionRobot getDirection(){
        return this.direction;
    }
    
      public void propertyChange (PropertyChangeEvent pce) {
        
          
                 
       
        TimerService ts = Lookup.getInstance().getService(TimerService.class);
        LabyrintheService labyrinthe = Lookup.getInstance().getService(LabyrintheService.class);
         
         Integer s = ts.getSecondes();
         Integer ms = ts.getDixiemeDeSeconde();

        String S = s.toString();
        String MS = ms.toString();
         
        switch (pce.getPropertyName()){


            case TimerChangeListener.SECONDE_PROP:
                 //System.out.println(s);
               
        
        int old_pos1 = position_horizantale;
        int old_pos2 = position_verticale;
        
       
        if(position_horizantale >= 9 || position_verticale >= 9 || position_horizantale < 0 || position_verticale < 0
                        || labyrinthe.get_matrice_obstacle()[position_horizantale][position_verticale]==1){
                    
                    position_horizantale = old_pos1;
                    position_verticale = old_pos2;
        }
        else{
                    this.move();
        }        
            
                System.out.println("position horizantale : "+this.get_position_horizantale());
                System.out.println("position verticale : "+this.get_position_verticale());
//                System.out.println(" labyrinthe : "+labyrinthe[0][4]);
//                System.out.println(" labyrinthe bbbbb : "+labyrinthe[this.position_horizantale][this.position_verticale]);
                
                break;

               
        }
   
    }
}
