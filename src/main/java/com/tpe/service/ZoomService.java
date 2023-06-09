package com.tpe.service;

import com.tpe.domain.Course;
import com.tpe.repository.Repository;
import com.tpe.thirdparty.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component //Spring bu classtan kullanilmak uzere bean uretiyor
public class ZoomService implements CourseService{

    //thirdparty bir methodun classina ihtiyac var
    @Autowired
    private InstructorService instructorService;


//    @Autowired //Repository i injekte etmis oluyoruz.
//    @Qualifier("cloudRepository") //Repository i implement eden hangi classtan oldugunu soyler //camelCase mantigi vardir
//    private Repository repository;

    //3 tane yontem var 1.field olusturarak, 2.setleyerek, 3.Constructor

//    @Autowired
//    @Qualifier("cloudRepository")
//    private Repository repository;
//    public ZoomService(Repository repository) {
//        this.repository = repository;
//    }



    @Autowired //optional keyfi
    @Qualifier("cloudRepository")
    private Repository repository;
    public ZoomService(@Qualifier("cloudRepository") Repository repository) {
        this.repository = repository;
    }

    @Value("${app.code}")
    String code;

    @Override
    public void teachCourse(Course course) {
        //System.out.println(course.getName() + " dersi Zoom ile anlatiliyor...");
        System.out.println(code + "-" + course.getName() + " dersi Zoom ile anlatiliyor...");
        instructorService.teach(course.getName(),"Nesibe H");
    }

    @Override
    public void saveCourse(Course course) {
        repository.save(course);
    }
}
