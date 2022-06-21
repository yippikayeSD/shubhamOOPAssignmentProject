package com.departmentapp.driver;
import com.departmentapp.models.AdminDepartment;
import com.departmentapp.models.HrDepartment;
import com.departmentapp.models.TechDepartment;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();
        

        //calling allmethods on object of  AdminDepartment Class
        System.out.printf("----Welcome to %s----\n",adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());
        System.out.println();
        
        
        //calling allmethods on object of  HrDepartment Class
        System.out.printf("----Welcome to %s----\n",hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday());
        System.out.println();
        
       
        //calling allmethods on object of  TechDepartment Class
        System.out.printf("----Welcome to %s----\n",techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());
        System.out.println();
        System.out.println("------------------------------------");
        
        

        
        
    }
}
