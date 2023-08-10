package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Lazy
public class TennisCoach  implements Coach{
    public  TennisCoach(){
        System.out.println("Tennis :  " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "run Tennis";
    }
}
