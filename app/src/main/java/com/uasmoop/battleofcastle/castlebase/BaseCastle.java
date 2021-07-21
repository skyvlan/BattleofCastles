package com.uasmoop.battleofcastle.castlebase;
public class BaseCastle {


    protected int CavalryCount;
    protected int InfantryCount;
    protected int ArcherCount;
    protected int CatapultCount;
    protected UnitClass Hero1;
    protected UnitClass Hero2;
    protected int totalRangedATK;
    protected int totalPhysicalATK;
    protected int totalAgi;
    protected int totalSpeed;
    protected int totalSkillATK;
    protected int totalATK;
    protected float archerBonus = 0f;
    protected float cavalryBonus = 0f;
    protected float infantryBonus = 0f;
    protected float catapultBonus = 0f;
    protected int castleHealth = 10000;
    protected int UnitHealth;
    protected int totalHealth;
    public void printTotalStat(){

    }

    public int getTotalATK(){
        return totalATK;
    }
    public int getTotalArmyCount(){
        return CavalryCount + InfantryCount + ArcherCount + CatapultCount;
    }
    public int getCavalryCount() {
        return CavalryCount;
    }

    public int getInfantryCount() {
        return InfantryCount;
    }

    public int getArcherCount() {
        return ArcherCount;
    }

    public int getCatapultCount() {
        return CatapultCount;
    }

    public int hasInfantry(){
        if(InfantryCount > 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int hasArcher(){
        if(ArcherCount > 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int hasCavalry(){
        if(CavalryCount > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}

