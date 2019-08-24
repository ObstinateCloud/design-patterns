package com.lengedyun.gamestate.version2;

/**
 * @author zjy
 * @title: GameRole_V2
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/8/24 11:41
 */
public class GameRole_V2 {

    //生命力
    private int vitality;
    //攻击力
    private int attack;
    //防御力
    private int defense;

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public GameRoleMemento saveState(){

        return new GameRoleMemento(vitality,attack,defense);
    }

    public void recoveryState(GameRoleMemento gameRoleMemento){

        this.vitality = gameRoleMemento.getVitality();
        this.attack = gameRoleMemento.getAttack();
        this.defense = gameRoleMemento.getDefense();
    }

    public void stateShow() {
        System.out.println("当前状态:");
        System.out.println("生命力:" + vitality);
        System.out.println("攻击力:" + attack);
        System.out.println("防御力:" + defense);
    }

    //初始化状态
    public void initState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    //战斗
    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }
}
