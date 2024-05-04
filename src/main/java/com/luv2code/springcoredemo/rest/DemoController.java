package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    // コンストラクターインジェクション
//    @Autowired
//    public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
//        myCoach = theCoach;
//    }
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

//    @Autowired
//    public void setCoach(Coach theCoach) {
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkout();
    }
}
