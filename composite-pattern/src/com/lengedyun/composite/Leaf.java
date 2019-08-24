package com.lengedyun.composite;

/**
 * @author zjy
 * @title: Leaf
 * @projectName design-patterns
 * @description: 叶子节点
 * @date 2019/8/24 12:28
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("cannot add to leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove from  leaf");
    }

    @Override
    public void display(int depth) {
        StringBuilder connectSign = new StringBuilder();
        for (int i = 0; i < depth; i++) {
             connectSign.append("-");
        }
        System.out.println(connectSign.toString()+name);
    }
}
