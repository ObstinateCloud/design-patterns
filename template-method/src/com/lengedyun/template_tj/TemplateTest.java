package com.lengedyun.template_tj;

public class TemplateTest {

    public static void main(String[] args) {

        AbstractDisplay display1 = new CharDisplay('*');
        display1.display();

        AbstractDisplay display2 = new StringDisplay("hello,world");
        display2.display();

    }
}
