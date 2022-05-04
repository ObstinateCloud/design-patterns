package com.lengedyun.prototype_tj;

import com.lengedyun.prototype_tj.business.MessageBox;
import com.lengedyun.prototype_tj.business.UnderLinePen;
import com.lengedyun.prototype_tj.framework.Manager;
import com.lengedyun.prototype_tj.framework.Product;


public class ProtoTypeTest {

    public static void main(String[] args) {

        //将创建对象和使用对象的过程分离，避免差异很小的类创建独立的类文件
        //1.准备
        Manager manager = new Manager();
        UnderLinePen pen1 = new UnderLinePen('-');
        UnderLinePen pen2 = new UnderLinePen('~');
        MessageBox messageBox = new MessageBox('*');
        manager.register("pen1",pen1);
        manager.register("pen2",pen2);
        manager.register("messageBox",messageBox);

        //2.生成 使用string来创建对象
        String str = "hello,world";
        Product pen11 = manager.create("pen1");
        pen11.use(str);
        Product pen21 = manager.create("pen2");
        pen21.use(str);
        Product messageBox1 = manager.create("messageBox");
        messageBox1.use(str);

    }
}
