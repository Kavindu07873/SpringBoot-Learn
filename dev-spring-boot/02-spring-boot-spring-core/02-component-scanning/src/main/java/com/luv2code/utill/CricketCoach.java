package com.luv2code.utill;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "practice fast Ball  15 minute";
    }
}
