package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BasketBallCoach implements Coach{

    public BasketBallCoach(){
        System.out.println("Basket :  " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
          return "run BasketBall";
    }
}
