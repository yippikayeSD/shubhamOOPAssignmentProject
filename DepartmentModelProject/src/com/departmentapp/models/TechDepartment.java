package com.departmentapp.models;

public class TechDepartment extends SuperDepartment {
    //defining overriden methods of SuperDepartment class
    @Override
    public String departmentName(){
        return "Tech Department";   
    }

    @Override
    public String getTodaysWork(){
        return "Complete Coding of Module 1";
    }

    @Override
    public String getWorkDeadline(){
        return "Complete by EOD";
    }
    
    //defining methods original to TechDepartment Class
    public String getTechStackInformation(){
        return "Core Java";
    }
}
