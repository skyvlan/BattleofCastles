package com.uasmoop.battleofcastle;
import com.uasmoop.battleofcastle.castlebase.*;

public class BattleManager {

    BaseCastle Castle1;
    BaseCastle Castle2;

    public int getC1KillCount() {
        return C1KillCount;
    }

    public int getC1Casualties() {
        return C1Casualties;
    }

    public int getC2KillCount() {
        return C2KillCount;
    }

    public int getC2Casualties() {
        return C2Casualties;
    }

    private int C1KillCount;
    private int C1Casualties;
    private int C2KillCount;
    private int C2Casualties;

    public BattleManager(UnitClass castleClass1, UnitClass castleClass2) {
        if (castleClass1 == UnitClass.INFANTRY) {
            Castle1 = new SteelCastle(0, 100000, 0, 0, UnitClass.INFANTRY, UnitClass.INFANTRY);
        }
        else if (castleClass1 == UnitClass.ARCHER) {
            Castle1 = new WoodCastle(0, 0, 100000, 0, UnitClass.ARCHER, UnitClass.ARCHER);
        }
        else if (castleClass1 == UnitClass.CATAPULT) {
            Castle1 = new StoneCastle(0, 0, 0, 100000, UnitClass.CATAPULT, UnitClass.CATAPULT);
        }
        else if (castleClass1 == UnitClass.CAVALRY) {
            Castle1 = new HorseCastle(100000, 0, 0, 0, UnitClass.CAVALRY, UnitClass.CAVALRY);
        }
        else if (castleClass1 == UnitClass.MIXCAV) {
            Castle1 = new SteelCastle(50000, 0, 50000, 0, UnitClass.CAVALRY, UnitClass.ARCHER);
        }

        if (castleClass2 == UnitClass.INFANTRY) {
            Castle2 = new SteelCastle(0, 100000, 0, 0, UnitClass.INFANTRY, UnitClass.INFANTRY);
        }
        else  if (castleClass2 == UnitClass.ARCHER) {
            Castle2 = new WoodCastle(0, 0, 100000, 0, UnitClass.ARCHER, UnitClass.ARCHER);
        }
        else if (castleClass2 == UnitClass.CATAPULT) {
            Castle2 = new StoneCastle(0, 0, 0, 100000, UnitClass.CATAPULT, UnitClass.CATAPULT);
        }
        else if (castleClass2 == UnitClass.CAVALRY) {
            Castle2 = new HorseCastle(100000, 0, 0, 0, UnitClass.CAVALRY, UnitClass.CAVALRY);
        }
        else if (castleClass2 == UnitClass.MIXCAV) {
            Castle2 = new SteelCastle(50000, 0, 50000, 0, UnitClass.CAVALRY, UnitClass.ARCHER);
        }

    }
    public int fight(){

        int C1InfantryKill = Castle1.hasInfantry() * (int) ((Castle2.getCavalryCount() * 0.1) +  (Castle2.getArcherCount() * 0.4));
        int C1CavalryKill = Castle1.hasCavalry() * (int) ((Castle2.getInfantryCount() * 0.4) +  (Castle2.getArcherCount() * 0.1));
        int C1ArcherKill =  Castle1.hasArcher() * (int) ((Castle2.getCavalryCount() * 0.4) +  (Castle2.getInfantryCount() * 0.1));
        int C1TotalKill = C1InfantryKill + C1CavalryKill + C1ArcherKill;
        int C2InfantryKill = Castle2.hasInfantry() * (int) ((Castle1.getCavalryCount() * 0.1) +  (Castle1.getArcherCount() * 0.4));
        int C2CavalryKill = Castle2.hasCavalry() * (int) ((Castle1.getInfantryCount() * 0.4) + (Castle1.getArcherCount() * 0.1));
        int C2ArcherKill = Castle2.hasArcher() * (int) ((Castle1.getCavalryCount() * 0.4) + (Castle1.getInfantryCount() * 0.1));
        int C2TotalKill = C2InfantryKill + C2CavalryKill + C2ArcherKill;
        C2KillCount = C2TotalKill;
        C2Casualties = Castle2.getTotalArmyCount() - C1TotalKill;
        C1KillCount = C1TotalKill;
        C1Casualties = Castle1.getTotalArmyCount() - C2TotalKill;
        if(C1TotalKill > C2TotalKill){
            return 1;
        }
        else if(C2TotalKill > C1TotalKill){
            return 2;
        }
        else{
            return 0;
        }
    }
}
