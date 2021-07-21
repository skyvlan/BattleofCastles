package com.uasmoop.battleofcastle.castlebase;
public class ArcherHero extends BaseHero
{
    public ArcherHero(){
        HP = 160;
        atk = 1;
        skill_atk = 200;
        agi = 100;
        speed = 100;
        atkType = AttackType.RANGED;
        HeroLevel = 1;
        unitType = UnitClass.ARCHER;
    }
    @Override
    public String getHeroType(){
        return "Archer";
    }
    @Override
    public int get_RangedAtk(){
        return atk;
    }
    @Override
    public int get_PhysAtk(){
        return 0;
    }
}
