package com.tpe.service;

import com.tpe.domain.Course;
import org.springframework.stereotype.Component;

@Component
public class MeetService implements CourseService{
    @Override
    public void teachCourse(Course course) {
        System.out.println(course.getName() + " dersi Google Meet ile anlatiliyor...");
    }

    @Override
    public void saveCourse(Course course) {

    }
}
