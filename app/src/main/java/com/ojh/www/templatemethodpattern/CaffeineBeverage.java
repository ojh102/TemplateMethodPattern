package com.ojh.www.templatemethodpattern;

/**
 * Created by JaeHwan Oh on 2016-05-27.
 */
public abstract class CaffeineBeverage {

    final String prepareRecipe() {
        String recipe =
        boilWater()
        +"\n"+
        brew()
        +"\n"+
        pourInCup()
        +"\n";
        if(customerWantsCondiments()) {
            recipe+=addCondiments();
        }

        return recipe;
    }

    abstract String brew();

    abstract String addCondiments();

    String boilWater() {
        return "물 끓이는 중";
    }

    String pourInCup() {
        return "컵에 따르는 중";
    }

    //hook
    boolean customerWantsCondiments() {
        return true;
    }
}
