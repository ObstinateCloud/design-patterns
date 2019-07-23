package com.lengedyun.drawpeople.version3;

/**
 * @title: PersonDirector
 * @description: 指挥者 控制建造过程
 * @auther: zjyun
 * @date: 2019/7/24 6:40
 */
public class PersonDirector {

    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
