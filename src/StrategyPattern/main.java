package StrategyPattern;

import StrategyPattern.Characters.Character;
import StrategyPattern.Characters.Knight;
import StrategyPattern.WeaponBehavior.SwordBehavior;

public class main {
    public static void main(String[] args) {
        Character character = new Knight();
        character.useWeapon();
        character.setWeapon(new SwordBehavior());
        character.useWeapon();
        character.shout();
        character.fight();
    }
}
