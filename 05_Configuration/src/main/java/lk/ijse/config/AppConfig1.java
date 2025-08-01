package lk.ijse.config;

import lk.ijse.bean.A;
import lk.ijse.bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class AppConfig1 {
    @Bean
    public A a() {
        return new A();
    }
    @Bean
    public B b() {
        return new B();
    }

}