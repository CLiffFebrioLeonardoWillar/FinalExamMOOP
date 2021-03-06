package com.example.gamebattle.gameplay;

public abstract class Army {

    public static final String ARCHER = "ARCHER";
    public static final String CAVALRY = "CAVALRY";
    public static final String INFANTRY = "INFANTRY";
    public static final String CATAPULT = "CATAPULT";

    public static final double ARCHER_BOOST = 0.4;
    public static final double CAVALRY_BOOST = 0.4;
    public static final double INFANTRY_BOOST = 0.4;
    public static final double CATAPULT_BOOST = 0.4;

    public String ArmyType;
    public int numbers;

}
