package com.lengedyun.gamestate.version2;

/**
 * @author zjy
 * @title: GameRoleCareTaker
 * @projectName design-patterns
 * @description: 游戏角色管理者
 * @date 2019/8/24 11:43
 */
public class GameRoleCareTaker {

    private GameRoleMemento gameRoleMemento;

    public GameRoleMemento getGameRoleMemento() {
        return gameRoleMemento;
    }

    public void setGameRoleMemento(GameRoleMemento gameRoleMemento) {
        this.gameRoleMemento = gameRoleMemento;
    }
}
