package com.uasmoop.battleofcastle.castlebase;
public class StoneCastle extends BaseCastle{
    public StoneCastle(int cavalryCount, int infantryCount, int archerCount, int catapultCount, UnitClass hero1, UnitClass hero2) {
        this.CavalryCount = cavalryCount;
        this.InfantryCount = infantryCount;
        this.ArcherCount = archerCount;
        this.CatapultCount = catapultCount;
        this.Hero1 = hero1;
        this.Hero2 = hero2;
    }

    @Override
    public void printTotalStat() {
        Cavalry cavalryStat = new Cavalry();
        Infantry infantryStat = new Infantry();
        Archer archerStat = new Archer();
        Catapult catapultStat = new Catapult();
        int AHcount = 0, CHcount = 0, CTHcount = 0, IHCount = 0;
        String Hero1String = "";
        String Hero2String = "";
        BaseHero Hero1Stat = new BaseHero();
        BaseHero Hero2Stat = new BaseHero();
        if(Hero1 == UnitClass.ARCHER){
             Hero1Stat = new ArcherHero();
            Hero1String = Hero1Stat.getHeroType();
            archerBonus = 0.4f;
            AHcount += 1;
        }
        if(Hero1 == UnitClass.CATAPULT){
             Hero1Stat = new CatapultHero();
            Hero1String = Hero1Stat.getHeroType();
            catapultBonus = 0.4f;
            CHcount += 1;
        }
        if(Hero1 == UnitClass.CAVALRY){
            Hero1Stat = new CavalryHero();
            Hero1String = Hero1Stat.getHeroType();
            cavalryBonus = 0.4f;
            CTHcount += 1;
        }
        if(Hero1 == UnitClass.INFANTRY){
            Hero1Stat = new InfantryHero();
            Hero1String = Hero1Stat.getHeroType();
            infantryBonus = 0.4f;
            IHCount += 1;
        }
        if(Hero2 == UnitClass.ARCHER){
            Hero2Stat = new ArcherHero();
            Hero2String = Hero2Stat.getHeroType();
            archerBonus = 0.4f;
            AHcount += 1;

        }
        if(Hero2 == UnitClass.CATAPULT){
            Hero2Stat = new CatapultHero();
            Hero2String = Hero2Stat.getHeroType();
            catapultBonus = 0.4f;
            CHcount += 1;

        }
        if(Hero2 == UnitClass.CAVALRY){
            Hero2Stat = new CavalryHero();
            Hero2String = Hero2Stat.getHeroType();
            cavalryBonus = 0.4f;
            CTHcount += 1;

        }
        if(Hero2 == UnitClass.INFANTRY){
            Hero2Stat = new InfantryHero();
            Hero2String = Hero2Stat.getHeroType();
            infantryBonus = 0.4f;
            IHCount += 1;

        }
        totalRangedATK = (archerStat.getAtk() * ArcherCount) + ((cavalryStat.getAtk() * CavalryCount) / 2) + (catapultStat.getAtk() * CatapultCount);
        totalPhysicalATK = (infantryStat.getAtk() * InfantryCount) + ((cavalryStat.getAtk() * CavalryCount) / 2);
        totalSkillATK = (archerStat.getSkill_atk() * ArcherCount) + (cavalryStat.getSkill_atk() * CavalryCount)  + (catapultStat.getSkill_atk() * CatapultCount) + (infantryStat.getSkill_atk() * InfantryCount);
        float totalBonusATK = (float)((archerStat.getAtk() * ArcherCount) * archerBonus)  + (float)(((cavalryStat.getAtk() * CavalryCount)) * cavalryBonus)  + (float)((catapultStat.getAtk() * CatapultCount) * catapultBonus) + (float)((infantryStat.getAtk() * InfantryCount) * infantryBonus);
        int totalHeroRangedATK = Hero1Stat.get_RangedAtk()  + Hero2Stat.get_RangedAtk();
        int totalHeroPhysicalATK = Hero1Stat.get_PhysAtk() + Hero2Stat.get_PhysAtk();
        int totalHeroSkillATK = Hero1Stat.get_SkillAtk() + Hero2Stat.get_SkillAtk();
        totalATK = totalRangedATK + totalPhysicalATK + totalSkillATK + (int)totalBonusATK + totalHeroSkillATK + totalHeroPhysicalATK + totalHeroRangedATK;
        System.out.println("Number of Cavalry: " + CavalryCount);
        System.out.println("Number of Infantry: " + InfantryCount);
        System.out.println("Number of Catapult: " + CatapultCount);
        System.out.println("Number of Archer: " + ArcherCount);
        System.out.println("Total Physical ATK:" + totalPhysicalATK);
        System.out.println("Total Ranged ATK:" + totalRangedATK);
        System.out.println("Total Skill ATK:" + totalSkillATK);
        System.out.println("Total Bonus ATK:" + totalBonusATK);
        System.out.println("Total Hero Physical ATK:" + totalHeroPhysicalATK);
        System.out.println("Total Hero Ranged ATK:" + totalHeroRangedATK);
        System.out.println("Total Hero Skill ATK:" + totalHeroSkillATK);
        System.out.println("Hero 1 Class:" + Hero1String);
        System.out.println("Hero 2 Class:" + Hero2String);
        System.out.println("Total Overall ATK:" + totalATK);



    }
}
