package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Course;
import com.tpe.service.CourseService;
import com.tpe.service.ZoomService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Course course = new Course();
        course.setName("Spring MVC");

        CourseService service = context.getBean("zoomService", CourseService.class);
        service.teachCourse(course);
        service.saveCourse(course);
        //zoomService i new lemedik
        //zoomService te repoyu kullandik ama new lemedik
        //bu isleri spring bizim yerimize halletti

        System.out.println("----------------------------------------------------");

        String[] beanName = context.getBeanDefinitionNames();
        for (String name : beanName) {
            System.out.println("Bean name : " + name);
        }

    }
}
