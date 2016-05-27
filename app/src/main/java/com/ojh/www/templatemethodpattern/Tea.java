package com.ojh.www.templatemethodpattern;

/**
 * Created by JaeHwan Oh on 2016-05-27.
 */
public class Tea extends CaffeineBeverage {
    @Override
    String brew() {
        return "차를 우려내는 중";
    }

    @Override
    String addCondiments() {
        return "레몬을 추가하는 중";
    }

    @Override
    boolean customerWantsCondiments() {
        return false;
    }
}
