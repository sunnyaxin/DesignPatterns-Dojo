package StrategyPattern.Characters;

import StrategyPattern.WeaponBehavior.KnifeBehavior;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm a Knight, I like using knife to fight.");
    }
}
