package lk.ijse.config;

import lk.ijse.bean.SpringBeanA;
import lk.ijse.bean.SpringBeanB;
import lk.ijse.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import({AppConfig2.class}) // Importing AppConfig2 to use its beans
public class AppConfig1 {
    /*@Bean
    public SpringBeanOne springBeanOne() {
        return new SpringBeanOne();
    }*/

    @Bean
    public SpringBeanA springBeanA() {
        return new SpringBeanA();
    }

    @Bean
    public SpringBeanB springBeanB() {
        return new SpringBeanB();
    }
}
