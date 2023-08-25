package com.codepresso.controllerexercise.dto;

import java.util.List;

public class UserDto{
    Integer id;
    String name;
    String email;
    List<SpecialtyDto> specialties;

    public UserDto(Integer id, String name, String email, List<SpecialtyDto> specialties) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.specialties = specialties;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEamil() {
        return email;
    }

    public List<SpecialtyDto> getSpecialties() {
        return specialties;
    }
}