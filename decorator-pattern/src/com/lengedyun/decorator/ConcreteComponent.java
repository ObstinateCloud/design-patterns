package com.lengedyun.decorator;

/**
 * @author zjy
 * @title: ConcreteComponent
 * @projectName design-patterns
 * @description: Component的一个实现
 * @date 2019/7/7 11:14
 */
public class ConcreteComponent extends Component{

    @Override
    public void operation() {
        System.out.println("ConcreteComponent的操作");
    }
}
