package lk.ijse.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanThree {
    //Light Mode
    /*@Bean
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
