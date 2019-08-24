package com.lengedyun.gamestate.version1;

/**
 * @author zjy
 * @title: GameClient_V1
 * @projectName design-patterns
 * @description: 游戏客户端
 * @date 2019/8/24 11:07
 */
public class GameClient_V1 {

    public static void main(String[] args) {
        System.out.println("---------------------游戏客户端启动----------------");
        //初始化游戏人物
        GameRole_V1 roleV1 = new GameRole_V1();
        roleV1.initState();
        roleV1.stateShow();
        //存档
        GameRole_V1 roleV1Bak = new GameRole_V1();
        //直接用对象赋值会存在引用传递
       // roleV1Bak = roleV1;
        roleV1Bak.setVitality(roleV1.getVitality());
        roleV1Bak.setAttack(roleV1.getAttack());
        roleV1Bak.setDefense(roleV1.getDefense());

        roleV1.fight();
        roleV1.stateShow();
        roleV1.setVitality(roleV1Bak.getVitality());
        roleV1.setAttack(roleV1Bak.getAttack());
        roleV1.setDefense(roleV1Bak.getDefense());
        roleV1.stateShow();
    }
}
