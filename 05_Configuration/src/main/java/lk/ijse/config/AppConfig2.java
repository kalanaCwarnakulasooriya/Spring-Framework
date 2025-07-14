package lk.ijse.config;

import lk.ijse.bean.SpringBeanC;
import lk.ijse.bean.SpringBeanD;
import lk.ijse.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    /*@Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }*/

    @Bean
    public SpringBeanC springBeanC() {
        return new SpringBeanC();
    }

    @Bean
    public SpringBeanD springBeanD() {
        return new SpringBeanD();
    }
}