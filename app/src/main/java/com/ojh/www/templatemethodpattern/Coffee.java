package com.ojh.www.templatemethodpattern;

/**
 * Created by JaeHwan Oh on 2016-05-27.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    String brew() {
        return "필터로 커피를 우려내는 중";
    }

    @Override
    String addCondiments() {
        return "설탕과 커피를 추가하는 중";
    }

    @Override
    boolean customerWantsCondiments() {

        return super.customerWantsCondiments();
    }
}
