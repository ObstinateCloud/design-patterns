package com.lengedyun.template_tj;

public class StringDisplay extends AbstractDisplay{

    private String string;

    private int length;

    public StringDisplay(String string) {
        this.string = string;
        this.length = string.length();
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.print("|"+string+"|");
    }

    @Override
    protected void close() {
        printLine();
    }

    private void printLine(){
        for (int i = 0; i < length; i++) {
            System.out.print("+");
        }
    }
}
