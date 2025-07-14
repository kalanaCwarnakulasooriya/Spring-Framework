package lk.ijse.config;

import lk.ijse.bean.SpringBean;
import lk.ijse.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "lk.ijse.bean") // Scanning the package for Spring Beans
@Import({AppConfig1.class , AppConfig2.class}) // Importing AppConfig1 and AppConfig2 to use their beans
/*//if config file in the root folder
@ImportResource("classpath:hibernate.cfg.xml") // Importing Hibernate configuration file
@ImportResource("file:absolute-path-of-hibernate.cfg.xml") // Importing Hibernate configuration file from an absolute path*/
public class AppConfig {
    @Bean
    public SpringBean springBean() {
        return new SpringBean();
    }
}