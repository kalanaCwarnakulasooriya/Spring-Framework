package lk.ijse.config;

import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("lk.ijse.di")
public class AppConfig {
    @Bean
//    @Scope("prototype")
    public SpringBean getSpringBean() {
        return new SpringBean();
    }
}
