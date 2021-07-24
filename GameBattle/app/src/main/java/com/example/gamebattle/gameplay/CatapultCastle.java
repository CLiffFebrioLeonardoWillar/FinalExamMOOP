package com.example.gamebattle.gameplay;

public class CatapultCastle extends Castle {

    public CatapultCastle() {this.CastleType = Castle.CATAPULT; }

      @Override
        public int calculatePower() {
            double power = 0;
            for (Army arm : this.ArmiesToBattle) {
                if (arm.ArmyType == Army.CATAPULT) {
                    power += arm.numbers + arm.numbers * Army.CATAPULT_BOOST;
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
