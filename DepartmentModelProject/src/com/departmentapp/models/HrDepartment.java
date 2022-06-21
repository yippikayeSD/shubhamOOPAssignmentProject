package com.departmentapp.models;

public class HrDepartment extends SuperDepartment {
    //defining overriden methods of SuperDepartment class
    @Override
    public String departmentName(){
        return "HR Department";   
    }

    @Override
    public String getTodaysWork(){
        return "Fill today\'s timesheet and mark your attendance";
    }

    @Override
    public String getWorkDeadline(){
        return "Complete by EOD";
    }
    
    //defining methods original to HrDepartment Class
    public String doActivity(){
        return "Team Lunch";
    }
}
