package com.departmentapp.models;
public class SuperDepartment{

    /*
    defining behaviours of Super Department
     */
    public String departmentName(){
        return "Super Department";
    }
    public String getTodaysWork(){
        return "No work as of now";
    }
    public String getWorkDeadline(){
        return "Nil";
    }
    public String isTodayAHoliday(){
        return "Today is not a holiday";
    }
}