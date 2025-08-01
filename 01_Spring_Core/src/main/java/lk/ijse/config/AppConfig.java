package lk.ijse.config;

import lk.ijse.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
//@ComponentScan(basePackageClasses = TestBean1.class)
public class AppConfig {
    @Bean("san")
    MyConnection getConnection(){
        return new MyConnection();
    }
}