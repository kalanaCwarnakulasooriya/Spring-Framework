package lk.ijse.config;

import lk.ijse.bean.SpringBeanOne;
import lk.ijse.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
    //Full Mode
   /* @Bean
    public SpringBeanOne springBeanOne() {
        //interBean Dependency
        SpringBeanTwo springBeanTwo = springBeanTwo();
        SpringBeanTwo springBeanTwo1 = springBeanTwo();
        System.out.println(springBeanTwo);
        System.out.println(springBeanTwo1);
        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo springBeanTwo(){
        return new SpringBeanTwo();
    }*/
}