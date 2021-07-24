package com.example.gamebattle.gameplay;

public class CavalryCastle extends Castle {

    public CavalryCastle() {this.CastleType = Castle.CAVALRY; }

    @Override
    public int calculatePower() {
        double power = 0;
        for (Army arm : this.ArmiesToBattle) {
            if (arm.ArmyType == Army.CAVALRY) {
                power += arm.numbers + arm.numbers * Army.CAVALRY_BOOST;
            } else {
                power += arm.numbers;
            }
        }
        return (int) power;
    }
    @Override
    public Castle battleTo(Castle ct2){
return this;
    }
    @Override
    public void setArmy(Army[] armies) {

    }

}
