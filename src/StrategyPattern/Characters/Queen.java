package StrategyPattern.Characters;

import StrategyPattern.WeaponBehavior.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm Queen, I like using bow to fight.");
    }
}
