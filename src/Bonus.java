/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sourov
 */
public class Bonus {
   private double bonus;
   
public void setbonus(double bonus){
this.bonus=bonus;
}
   void calculateBonus(double balance){
bonus=balance*.10;
     
    }
double bonusreturn(){
return bonus;
}
  public double getbonus(){
   return bonus;
   }
 
}

