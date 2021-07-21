package com.uasmoop.battleofcastle.castlebase;
public class InfantryHero extends BaseHero{
    public InfantryHero(){
        HP = 400;
        atk = 1;
        skill_atk = 500;
        agi = 125;
        speed = 150;
        atkType = AttackType.PHYSICAL;
        HeroLevel = 1;
        unitType = UnitClass.INFANTRY;
    }
    @Override
    public String getHeroType(){
        return "Infantry";
    }
    @Override
    public int get_RangedAtk(){
        return 0;
    }
    @Override
    public int get_PhysAtk(){
        return atk;
    }
}
