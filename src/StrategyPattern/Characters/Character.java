package StrategyPattern.Characters;

import StrategyPattern.WeaponBehavior.WeaponBehavior;

public abstract class Character {
    public WeaponBehavior weaponBehavior;

     public void shout(){
         System.out.println("Come on!!");
     }

     public abstract void fight();

     public void useWeapon(){
         weaponBehavior.useWeapon();
     }

     public void setWeapon(WeaponBehavior weapon){
         this.weaponBehavior = weapon;
     }
}
