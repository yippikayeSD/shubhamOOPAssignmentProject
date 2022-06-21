package com.departmentapp.models;

public class AdminDepartment extends SuperDepartment {

    @Override
    public String departmentName(){
        return "Admin Department";   
    }

    @Override
    public String getTodaysWork(){
        return "Complete your document submission";
    }

    @Override
    public String getWorkDeadline(){
        return "Complete by EOD";
    }
}
