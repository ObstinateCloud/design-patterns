package com.lengedyun.decorator;

/**
 * @author zjy
 * @title: Decorator
 * @projectName design-patterns
 * @description: 装饰抽象类
 * @date 2019/7/7 11:15
 */
public abstract class Decorator extends Component {

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    public void operation() {
        if(component != null){
            component.operation();
            System.out.println("Decorator的operation");
        }
    }
}
