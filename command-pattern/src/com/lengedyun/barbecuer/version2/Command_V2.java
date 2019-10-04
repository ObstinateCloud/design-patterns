package com.lengedyun.barbecuer.version2;

/**
 * @author zjy
 * @title: Command_V2
 * @projectName design-patterns
 * @description: 将请求视为命令 形成抽象命令类
 * @date 2019/9/22 17:29
 */
public abstract class Command_V2 {

    protected Barbecuer_V2 barbecuerV2;

    public Command_V2(Barbecuer_V2 barbecuerV2) {
        this.barbecuerV2 = barbecuerV2;
    }

    public abstract void excuteCommand();
}
