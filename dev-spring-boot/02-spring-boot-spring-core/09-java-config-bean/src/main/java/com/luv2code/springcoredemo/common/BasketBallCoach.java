package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BasketBallCoach implements Coach{

    public BasketBallCoach(){
        System.out.println("Basket :  " + getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkout(){
          return "run BasketBall";
    }
}
