package com.example.gamebattle.gameplay;

public abstract class Castle {
    public static final String INFANTRY = "INFANTRY";
    public static final String CAVALRY = "CAVALRY";
    public static final String ARCHER = "ARCHER";
    public static final String CATAPULT = "CATAPULT";

    public String CastleType;
    public Heroes[] Heroes;
    public Army[] Armies;

    public Army[] ArmiesToBattle;

    public String getsCastleType() { return this.CastleType; }

    public abstract int calculatePower();

    public abstract Castle battleTo(Castle ct2);

    public abstract void setArmy(Army[] armies);

}
