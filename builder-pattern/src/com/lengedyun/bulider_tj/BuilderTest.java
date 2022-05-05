package com.lengedyun.bulider_tj;

/**
 * @title: BuilderTest
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/5/5 18:24
 */
public class BuilderTest {

//    public static void main(String[] args) {
//        if (args.length != 1) {
//            usage();
//            System.exit(0);
//        }
//        if (args[0].equals("plain")) {
//            TestBuilder testBuilder = new TestBuilder();
//            Director director = new Director(testBuilder);
//            director.construct();
//            String result = testBuilder.getResult();
//            System.out.println(result);
//        } else if (args[0].equals("html")) {
//            HtmlBuilder htmlBuilder = new HtmlBuilder();
//            //把构建的顺序交给
//            Director director =new Director(htmlBuilder);
//            director.construct();
//            String result = htmlBuilder.getResult();
//            System.out.println(result+"文件编写完成");
//        } else {
//            usage();
//            System.exit(0);
//        }
//    }

    public static void main(String[] args) {
        int type = 1;
        if (type ==1) {
            TestBuilder testBuilder = new TestBuilder();
            Director director = new Director(testBuilder);
            director.construct();
            String result = testBuilder.getResult();
            System.out.println(result);
        } else if (type == 2) {
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            //把构建的顺序交给
            Director director = new Director(htmlBuilder);
            director.construct();
            String result = htmlBuilder.getResult();
            System.out.println(result + "文件编写完成");
        }
    }

    public static void usage() {

        System.out.println("Usage: java Main plain 编写纯文本文档");
        System.out.println("Usage: java Main html  编写HTML文档");
    }
}
