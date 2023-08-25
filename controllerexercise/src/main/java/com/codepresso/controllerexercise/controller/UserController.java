package com.codepresso.controllerexercise.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codepresso.controllerexercise.dto.SpecialtyDto;
import com.codepresso.controllerexercise.dto.UserDto;

@RestController
//@RequestMapping(value = "/user")
public class UserController {

    // UserDto객체를 반환하는 메소드
    // 객체를 반환하면 JSON형식의 데이터가 응답 됨.
    @RequestMapping(value = "/user")
    public UserDto getUser() {
        List<SpecialtyDto> specialties = new ArrayList<>();
        specialties.add(new SpecialtyDto("Java", "Advanced"));
        specialties.add(new SpecialtyDto("Spring Boot", "Intermediate"));

        return new UserDto(1, "Jin", "jin@codepresso.kr", specialties);
    }

    @RequestMapping(value = "/paid")
    public String getPaindUser() {
        return "I'm a paid user.";
    }

    @RequestMapping(value = "/enterprise")
    public String getEnterpriseUser() {
        return "I'm a enterprise user.";
    }
}

    /*
     * {
     *  "id": 1,
     *  "name": "Jin",
     *  "email": "Jin@codepresso.com",
     *  "specialties": [
     *      {
     *          "name": "Java",
     *          "level": "Advanced"
     *      },
     *      {
     *          "name": "Spring Boot",
     *          "level": "Intermediate"
     *      }
     *  ]
     * }
     * 
     */


     // Spring Boot에서는 객체를 반환하면 적절한 JSON형식으로 변환하여 Client로 최종 응답해줌
