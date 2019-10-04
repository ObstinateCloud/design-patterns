package com.lengedyun.barbecuer.version2;

/**
 * @author zjy
 * @title: BakeMuttonCommand
 * @projectName design-patterns
 * @description: 烤肉请求
 * @date 2019/9/22 17:32
 */
public class BakeMuttonCommand extends Command_V2{


    public BakeMuttonCommand(Barbecuer_V2 barbecuerV2) {
        super(barbecuerV2);
    }

    @Override
    public void excuteCommand() {
        barbecuerV2.bakeMutton(9);
    }
}
