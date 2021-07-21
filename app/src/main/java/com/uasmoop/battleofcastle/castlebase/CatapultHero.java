package com.uasmoop.battleofcastle.castlebase;
public class CatapultHero extends BaseHero{
        public CatapultHero(){
            HP = 30;
            atk = 800;
            skill_atk = 1400;
            agi = 10;
            speed = 0;
            atkType = AttackType.RANGED;
            HeroLevel = 1;
            unitType = UnitClass.CATAPULT;
        }
        @Override
        public String getHeroType(){
            return "Catapult";
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
