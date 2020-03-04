package com.charakter;

class Charakter implements Playable {
    int level =1;
    int power =10;
    int health = 100;
    int mana = 100;
    int defense = 10;
    String name = "Default";

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPower() {
        return power;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMana() {
        return mana;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    public static void fight()
    {

    }

    @Override
    public void fight(Charakter Player, Charakter enemy) {

    }

    @Override
    public void levelUP(Charakter charakter) {

    }

    @Override
    public void event() {

    }


    public static void printFight(Charakter player, Charakter enemy)
    {
        System.out.print("                ");
        System.out.print(player.name);
        System.out.print("     vs     ");
        System.out.println(enemy.name);
        System.out.println("attack");
        System.out.println("special attack");
        System.out.println("defense");
        System.out.println("run");
    }
}
