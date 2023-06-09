package com.tpe;


import com.tpe.thirdparty.InstructorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //Bu classta yapilandirma ayarlari var
@ComponentScan("com.tpe") //com.tpe altindaki bilesenleri tarar ve tanimlar
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    @Bean
    public InstructorService instructorService(){
        return new InstructorService();
    }

}
