package com.example.Greek.controller;

import com.example.Greek.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/meals")
public class MealController {

    @Autowired
    private MealService mealService;

    @PostMapping("/assign")
    public String assignBrotherToMember(@RequestParam Long brotherId, @RequestParam Long memberId) {
        mealService.assignBrotherToMember(brotherId, memberId);
        return "Brother assigned to grab a meal with member!";
    }
}
