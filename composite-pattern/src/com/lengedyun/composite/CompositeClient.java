package com.lengedyun.composite;

/**
 * @author zjy
 * @title: CompositeClient
 * @projectName design-patterns
 * @description: 组合模式
 * @date 2019/8/24 14:31
 */
public class CompositeClient {

    public static void main(String[] args) {
        System.out.println("--------------组合模式-----------");
        Component root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));
        comp.add(comp2);

        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);
        root.display(1);
    }
}
