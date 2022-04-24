package com.lengedyun.adapter_tj.practise;

import java.io.File;
import java.io.IOException;

/**
 * @title: FileTest
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/4/24 19:27
 */
public class FileTest {

    public static void main(String[] args) {
//        System.getProperties().forEach((p,q)->{
//            System.out.print(p);
//            System.out.print("==");
//            System.out.println(q);
//        });
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("adapter-pattern/src/com/lengedyun/adapter_tj/practise/file.txt");
//            fileIO.readFromFile(FileTest.class.getResource("")+"/file.txt");
//            fileIO.readFromFile(new File("").getAbsolutePath()+"/file.txt");
            fileIO.setValue("name","lengedyun");
            fileIO.setValue("age","18");
            fileIO.setValue("work","IT");
            fileIO.writeToFile("adapter-pattern/src/com/lengedyun/adapter_tj/practise/newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
