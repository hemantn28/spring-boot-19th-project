package com.example.demo.controller;

import com.example.demo.model.College;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CollegeController {

    ArrayList<College> collegeArrayList=new ArrayList<>();


    //1. Create => Add

    @RequestMapping("/add_college")
    public String add(@RequestBody College college){
        //College college=new College("RBS","Agra","Agra University");
        collegeArrayList.add(college);
        return "college added successfully";
    }

    //2. Read => Get

    @RequestMapping("/get_college")
    public ArrayList<College> getCollegeArrayList() {
        return collegeArrayList;
    }

    //3.Update

    @RequestMapping("/update_college")
    public String update(){
        collegeArrayList.get(1).setName("Agra College");
        return "college updated successfully";
    }


    //4. Delete

    @RequestMapping("/delete_college")
    public String delete(){
        collegeArrayList.remove(0);
        return "college deleted successfully";
    }
}
