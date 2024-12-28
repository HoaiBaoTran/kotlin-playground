package com.kotlinplayground;

import classes.Authenticate;
import classes.Course;
import classes.CourseCategory;
//import classes.CourseKt;
import classes.CourseUtils;

public class InvokeKotlinFromJava {

    public static void main(String[] args) {
        var course = new Course(1,
                "Reactive Programming in Modern Java using Project Reactor",
                "Luffy");
//                CourseCategory.DEVELOPMENT);

        course.noOfCourses = 11;

        System.out.println("course: " + course);
        System.out.println("noOfCourses: " + course.noOfCourses);

        CourseUtils.printName1();
        CourseUtils.printName1("Luffy");
        Course.Companion.printName2("Ekko");
        Course.printName2("Jinx");

        Authenticate.INSTANCE.authenticate("Luffy", "Ekko");
        Authenticate.authenticate("Luffy", "Ekko");
    }
}
