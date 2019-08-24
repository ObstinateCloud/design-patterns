package com.lengedyun.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: Composite
 * @projectName design-patterns
 * @description: 树枝节点
 * @date 2019/8/24 12:57
 */
public class Composite extends Component{

    private List<Component> children = new ArrayList<>();


    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        StringBuilder connectSign = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            connectSign.append("-");
        }
        System.out.println(connectSign.toString()+name);
        for (Component child : children) {
            child.display(depth+2);
        }
    }
}
