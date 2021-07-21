package com.uasmoop.battleofcastle.castlebase;
public class CavalryHero extends BaseHero{
    public CavalryHero(){
        HP = 240;
        atk = 1;
        skill_atk = 280;
        agi = 160;
        speed = 300;
        atkType = AttackType.MIXED;
        HeroLevel = 1;
        unitType = UnitClass.CAVALRY;
    }
    @Override
    public String getHeroType(){
        return "Cavalry";
    }
    @Override
    public int get_RangedAtk(){
        return atk/2;
    }
    @Override
    public int get_PhysAtk(){
        return atk/2;
    }
}
