package StrategyPattern.Characters;

import StrategyPattern.WeaponBehavior.AxeBehavior;

public class King extends Character{

    public King() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I am a King, I like use Axe to fight!");
    }
}
