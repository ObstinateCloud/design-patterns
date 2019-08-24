package com.lengedyun.gamestate.version2;

import com.lengedyun.gamestate.version1.GameRole_V1;

/**
 * @author zjy
 * @title: GameClient_V2
 * @projectName design-patterns
 * @description: 游戏客户端
 * @date 2019/8/24 11:07
 */
public class GameClient_V2 {

    public static void main(String[] args) {
        System.out.println("---------------------游戏客户端启动2.0----------------");
        //初始化游戏人物
        GameRole_V2 roleV2 = new GameRole_V2();
        roleV2.initState();
        System.out.println("------初始化-----");
        roleV2.stateShow();
        //存档
        GameRoleCareTaker careTaker = new GameRoleCareTaker();
        careTaker.setGameRoleMemento(roleV2.saveState());
        //恢复
        roleV2.fight();
        System.out.println("------战斗后-----");
        roleV2.stateShow();
        System.out.println("------恢复后-----");
        roleV2.recoveryState(careTaker.getGameRoleMemento());
        roleV2.stateShow();
    }
}
