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

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("doMyStartupStuff :  " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("doMyCleanupStuff :  " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "run Tennis";
    }
}
