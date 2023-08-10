package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CricketCoach implements Coach {

    public  CricketCoach(){
        System.out.println("Cricket :  " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("Cricket :  " + getClass().getSimpleName());

        return "practice fast Ball  15 minute";
    }
}
