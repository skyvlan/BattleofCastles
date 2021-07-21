package com.uasmoop.battleofcastle.castlebase;
public class Player {
    private String playerName;

    private UnitClass castleType;
    private HorseCastle hCastle;
    private WoodCastle wCastle;
    private SteelCastle sCastle;
    private StoneCastle stCastle;


    public Player(String playerName, HorseCastle hCastle) {
        this.playerName = playerName;
        this.castleType = UnitClass.CAVALRY;
        this.hCastle = hCastle;
    }
    public Player(String playerName, WoodCastle wCastle) {
        this.playerName = playerName;
        this.castleType = UnitClass.ARCHER;
        this.wCastle = wCastle;
    }
    public Player(String playerName, SteelCastle sCastle) {
        this.playerName = playerName;
        this.castleType = UnitClass.INFANTRY;
        this.sCastle = sCastle;
    }
    public Player(String playerName, StoneCastle stCastle) {
        this.playerName = playerName;
        this.castleType = UnitClass.CATAPULT;
        this.stCastle = stCastle;
    }

    public void printFullPlayerStat(){
    System.out.println("\n------------------------------------------\nPlayer Name: " + playerName);
        if(castleType == UnitClass.ARCHER){
            wCastle.printTotalStat();
        }
        if(castleType == UnitClass.CAVALRY){
            hCastle.printTotalStat();
        }
        if(castleType == UnitClass.CATAPULT){
            stCastle.printTotalStat();
        }
        if(castleType == UnitClass.INFANTRY){
            sCastle.printTotalStat();
        }
        System.out.println("\n------------------------------------------\n");
    }






}
