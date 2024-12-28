package com.kotlinplayground;

import classes.Course;
import classes.CourseCategory;

public class InvokeKotlinFromJava {

    public static void main(String[] args) {
        var course = new Course(1,
                "Reactive Programming in Modern Java using Project Reactor",
                "Luffy",
                CourseCategory.DEVELOPMENT);

        System.out.println("course: " + course);
    }
}
