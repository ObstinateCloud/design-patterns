package com.lengedyun.composite_tj;

/**
 * @title: CompositeTest
 * @description: 组合模式
 * @auther: zhangjianyun
 * @date: 2022/6/30 17:30
 */
public class CompositeTest {

    public static void main(String[] args) {
        System.out.println("make linux file system");
        Directory root = new Directory("root");


        Directory bin = new Directory("bin");
        bin.add(new File("binFile1",200));
        bin.add(new File("binFile2",2650));
        bin.add(new File("binFile3",2005));

        Directory lib = new Directory("lib");
        lib.add(new File("libFile4",4320));
        lib.add(new File("libFile5",432230));
        lib.add(new File("libFile6",43320));
        Directory tmp = new Directory("tmp");
        tmp.add(new File("tmpFile7",620));
        tmp.add(new File("tmpFile8",620));
        tmp.add(new File("tmpFile9",620));

        root.add(bin);
        root.add(lib);
        root.add(tmp);

        root.printList();
    }
}
