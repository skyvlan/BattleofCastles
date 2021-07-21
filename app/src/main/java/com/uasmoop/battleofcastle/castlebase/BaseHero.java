package com.uasmoop.battleofcastle.castlebase;
public class BaseHero extends Army {
    protected int HeroLevel;
    protected UnitClass unitType;

    public String getHeroType(){
            return "";
    }

    public int get_RangedAtk(){
        return 0;
    }
    public int get_PhysAtk(){
        return 0;
    }
    public int get_SkillAtk(){
        return skill_atk;
    }
    public int getHeroLevel(){
        return HeroLevel;
    }

}
