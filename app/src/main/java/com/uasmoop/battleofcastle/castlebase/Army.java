package com.uasmoop.battleofcastle.castlebase;
public class Army extends BaseCastle {
    protected int HP;
    protected int atk;
    protected int skill_atk;
    protected int agi;
    protected int speed;
    protected AttackType atkType;

    public AttackType getAtkType() {
        return atkType;
    }

    public int getHP() {
        return HP;
    }

    public int getAtk() {
        return atk;
    }

    public int getSkill_atk() {
        return skill_atk;
    }

    public int getAgi() {
        return agi;
    }

    public int getSpeed() {
        return speed;
    }
}
