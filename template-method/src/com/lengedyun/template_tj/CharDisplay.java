package com.lengedyun.template_tj;

public class CharDisplay extends AbstractDisplay{

    private Character character;

    public CharDisplay(Character character) {
        this.character = character;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(character);
    }

    @Override
    protected void close() {
        System.out.println(">>");

    }
}
