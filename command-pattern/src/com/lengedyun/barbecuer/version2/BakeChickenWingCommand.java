package com.lengedyun.barbecuer.version2;

/**
 * @author zjy
 * @title: BakeChickenWingCommand
 * @projectName design-patterns
 * @description: 烤鸡翅请求
 * @date 2019/9/22 17:35
 */
public class BakeChickenWingCommand extends Command_V2{

    public BakeChickenWingCommand(Barbecuer_V2 barbecuerV2) {
        super(barbecuerV2);
    }

    @Override
    public void excuteCommand() {
        barbecuerV2.bakeChickenWing(5);
    }
}
