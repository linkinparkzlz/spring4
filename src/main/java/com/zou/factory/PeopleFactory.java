package com.zou.factory;

import com.zou.entity.People;

public class PeopleFactory {


    public People createFactory() {


        People people = new People();
        people.setId(6);
        people.setName("得到");
        people.setAge(444);

        return people;
    }


    public static People createStaticFactory() {


        People people = new People();
        people.setId(7);
        people.setName("高分");
        people.setAge(999);

        return people;
    }

}

































